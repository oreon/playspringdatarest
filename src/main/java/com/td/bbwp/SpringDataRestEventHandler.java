package com.td.bbwp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.witchcraft.base.entity.BaseEntity;

import com.td.bbwp.commerce.Customer;
import com.td.bbwp.commerce.Employee;
import com.td.bbwp.users.AppUser;
import com.td.bbwp.web.action.users.AppUserRepository;

@Component
@RepositoryEventHandler(Customer.class)
public class SpringDataRestEventHandler {

	private final AppUserRepository appUserRepository;

	@Autowired
	public SpringDataRestEventHandler(AppUserRepository appUserRepository) {
		this.appUserRepository = appUserRepository;
	}

	@HandleBeforeCreate
	public void applyUserInformationUsingSecurityContext(Customer entity) {

		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		AppUser appUser = this.appUserRepository.findByUserName(name);
		/*
		if (appUser == null) {
			Manager newManager = new Manager();
			newManager.setName(name);
			newManager.setRoles(new String[]{"ROLE_MANAGER"});
			appUser = this.appUserRepository.save(newManager);
		}*/
		entity.setCreatedByUser(appUser);
	}
}
package com.td.bbwp.web.action.users;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

import com.td.bbwp.users.AppUser;

@RepositoryRestResource
public interface AppUserRepository extends AppUserRepositoryBase {

	@Override
	//	@PreAuthorize("@appUserRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	public AppUser findOne(@Param("id") Long id);

	@Override
	//	@PreAuthorize("#appUser?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	public AppUser save(@Param("appUser") AppUser appUser);

	@Override
	//@PreAuthorize("@appUserRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void delete(@Param("appUser") AppUser appUser);

	@Override
	//	@PreAuthorize("@appUserRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	void delete(@Param("id") Long id);

}

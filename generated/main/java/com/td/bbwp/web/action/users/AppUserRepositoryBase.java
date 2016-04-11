package com.td.bbwp.web.action.users;

import com.td.bbwp.users.AppUser;

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

//@RepositoryRestResource(exported=false)
public interface AppUserRepositoryBase
		extends
			PagingAndSortingRepository<AppUser, Long> {

	Page<AppUser> findByUserNameContainingAllIgnoringCase(
			@Param("userName") String userName, Pageable pageable);

	AppUser findByUserName(@Param("userName") String userName);

	AppUser findByUserNameIgnoringCase(@Param("userName") String userName);

	Page<AppUser> findByPasswordContainingAllIgnoringCase(
			@Param("password") String password, Pageable pageable);

	AppUser findByPassword(@Param("password") String password);

	AppUser findByPasswordIgnoringCase(@Param("password") String password);

	Page<AppUser> findByEnabled(@Param("enabled") Boolean enabled,
			Pageable pageable);

}

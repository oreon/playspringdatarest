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

import com.td.bbwp.users.AppRole;

@RepositoryRestResource
public interface AppRoleRepository extends AppRoleRepositoryBase {

	@Override
	//	@PreAuthorize("@appRoleRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	public AppRole findOne(@Param("id") Long id);

	@Override
	//	@PreAuthorize("#appRole?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	public AppRole save(@Param("appRole") AppRole appRole);

	@Override
	//@PreAuthorize("@appRoleRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void delete(@Param("appRole") AppRole appRole);

	@Override
	//	@PreAuthorize("@appRoleRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	void delete(@Param("id") Long id);

}

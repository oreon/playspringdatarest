package com.td.bbwp.web.action.commerce;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

import com.td.bbwp.commerce.CustomerOrder;

@RepositoryRestResource
public interface CustomerOrderRepository extends CustomerOrderRepositoryBase {

	@Override
	//	@PreAuthorize("@customerOrderRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	public CustomerOrder findOne(@Param("id") Long id);

	@Override
	//	@PreAuthorize("#customerOrder?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	public CustomerOrder save(
			@Param("customerOrder") CustomerOrder customerOrder);

	@Override
	//@PreAuthorize("@customerOrderRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void delete(@Param("customerOrder") CustomerOrder customerOrder);

	@Override
	//	@PreAuthorize("@customerOrderRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	void delete(@Param("id") Long id);

}

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

import com.td.bbwp.commerce.OrderItem;

@RepositoryRestResource
public interface OrderItemRepository extends OrderItemRepositoryBase {

	@Override
	//	@PreAuthorize("@orderItemRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	public OrderItem findOne(@Param("id") Long id);

	@Override
	//	@PreAuthorize("#orderItem?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	public OrderItem save(@Param("orderItem") OrderItem orderItem);

	@Override
	//@PreAuthorize("@orderItemRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void delete(@Param("orderItem") OrderItem orderItem);

	@Override
	//	@PreAuthorize("@orderItemRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	void delete(@Param("id") Long id);

}

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

import com.td.bbwp.commerce.CreditCard;

@RepositoryRestResource
public interface CreditCardRepository extends CreditCardRepositoryBase {

	@Override
	//	@PreAuthorize("@creditCardRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	public CreditCard findOne(@Param("id") Long id);

	@Override
	//	@PreAuthorize("#creditCard?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	public CreditCard save(@Param("creditCard") CreditCard creditCard);

	@Override
	//@PreAuthorize("@creditCardRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public void delete(@Param("creditCard") CreditCard creditCard);

	@Override
	//	@PreAuthorize("@creditCardRepository.findOne(#id)?.createdByUser.userName == authentication?.name  ||  hasRole('admin')")         
	void delete(@Param("id") Long id);

}

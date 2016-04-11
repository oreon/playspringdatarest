package com.td.bbwp.web.action.commerce;

import com.td.bbwp.commerce.CreditCard;

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

//@RepositoryRestResource(exported=false)
public interface CreditCardRepositoryBase
		extends
			PagingAndSortingRepository<CreditCard, Long> {

	Page<CreditCard> findByAccountAddressContainingAllIgnoringCase(
			@Param("accountAddress") String accountAddress, Pageable pageable);

	CreditCard findByAccountAddress(
			@Param("accountAddress") String accountAddress);

	CreditCard findByAccountAddressIgnoringCase(
			@Param("accountAddress") String accountAddress);

	Page<CreditCard> findByCcNumberContainingAllIgnoringCase(
			@Param("ccNumber") String ccNumber, Pageable pageable);

	CreditCard findByCcNumber(@Param("ccNumber") String ccNumber);

	CreditCard findByCcNumberIgnoringCase(@Param("ccNumber") String ccNumber);

	Page<CreditCard> findByExpiry(@Param("expiry") Date expiry,
			Pageable pageable);

}

package com.td.bbwp.web.action.commerce;

import com.td.bbwp.commerce.CustomerOrder;

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

import com.td.bbwp.commerce.OrderItem;

//@RepositoryRestResource(exported=false)
public interface CustomerOrderRepositoryBase
		extends
			PagingAndSortingRepository<CustomerOrder, Long> {

	Page<CustomerOrder> findByNotesContainingAllIgnoringCase(
			@Param("notes") String notes, Pageable pageable);

	CustomerOrder findByNotes(@Param("notes") String notes);

	CustomerOrder findByNotesIgnoringCase(@Param("notes") String notes);

	Page<CustomerOrder> findByCustomer(
			@Param("customer") com.td.bbwp.commerce.Customer customer,
			Pageable pageable);

	Page<CustomerOrder> findByShipDate(@Param("shipDate") Date shipDate,
			Pageable pageable);

	Page<CustomerOrder> findByPaymentMethod(
			@Param("paymentMethod") com.td.bbwp.commerce.PaymentMethod paymentMethod,
			Pageable pageable);

}

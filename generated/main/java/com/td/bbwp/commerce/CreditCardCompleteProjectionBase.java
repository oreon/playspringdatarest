package com.td.bbwp.commerce;

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

import java.util.List;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "complete", types = {CreditCard.class})
interface CreditCardCompleteProjectionBase {

	String getAccountAddress();

	String getCcNumber();

	Date getExpiry();

}

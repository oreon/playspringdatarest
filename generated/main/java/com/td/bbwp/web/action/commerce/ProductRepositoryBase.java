package com.td.bbwp.web.action.commerce;

import com.td.bbwp.commerce.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

import com.td.bbwp.commerce.Product;

//@RepositoryRestResource(exported=false)
public interface ProductRepositoryBase
		extends
			PagingAndSortingRepository<Product, Long> {

	Page<Product> findByNameContainingAllIgnoringCase(
			@Param("name") String name, Pageable pageable);

	Product findByName(@Param("name") String name);

	Product findByNameIgnoringCase(@Param("name") String name);

}

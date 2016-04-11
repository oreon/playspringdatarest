package com.td.bbwp.web.action.commerce;

import com.td.bbwp.commerce.Department;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.repository.query.Param;
import org.springframework.security.access.prepost.PreAuthorize;

import com.td.bbwp.commerce.Department;

import com.td.bbwp.commerce.Employee;

//@RepositoryRestResource(exported=false)
public interface DepartmentRepositoryBase
		extends
			PagingAndSortingRepository<Department, Long> {

	Page<Department> findByNameContainingAllIgnoringCase(
			@Param("name") String name, Pageable pageable);

	Department findByName(@Param("name") String name);

	Department findByNameIgnoringCase(@Param("name") String name);

}

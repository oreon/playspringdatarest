
/**
 *  WARN -  DO NOT MODIFY  - This file is generated by Witchcraftmda. Change Person.java instead
 *  Any changes will be overwritten by the next run of the code generator.
 */

package com.td.bbwp.commerce;

import javax.persistence.*;
import org.witchcraft.base.entity.FileAttachment;
import org.witchcraft.base.entity.BaseEntity;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.IndexColumn;

import javax.validation.constraints.*;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@MappedSuperclass
public class PersonBase extends BaseEntity {

	@Column(name = "GENDER", unique = false)
	protected Gender gender

	;

	@Column(name = "DOB", unique = false)
	protected Date dob

	;

	@Embedded
	@AttributeOverrides({

			@AttributeOverride(name = "street", column = @Column(name = "ADDRESS_STREET")),

			@AttributeOverride(name = "city", column = @Column(name = "ADDRESS_CITY")),

			@AttributeOverride(name = "province", column = @Column(name = "ADDRESS_PROVINCE"))

	})
	protected Address address

	;

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Gender getGender() {

		return gender;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDob() {

		return dob;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {

		if (address == null) {
			address = new com.td.bbwp.commerce.Address();
		}

		return address;
	}

	@Transient
	//Display name
	public String getDisplayName() {
		try {
			return gender + "";
		} catch (Exception e) {
			return "Exception - " + e.getMessage();
		}
	}

}

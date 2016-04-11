
/**
 *  WARN -  DO NOT MODIFY  - This file is generated by Witchcraftmda. Change PaymentMethod.java instead
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
//@Indexed
//@Analyzer(definition = "entityAnalyzer")
public class PaymentMethodBase extends BaseEntity {

	@Column(name = "ACCOUNT_ADDRESS", unique = false)
	protected String accountAddress

	;

	public void setAccountAddress(String accountAddress) {
		this.accountAddress = accountAddress;
	}

	public String getAccountAddress() {

		return accountAddress;
	}

	@Transient
	//Display name
	public String getDisplayName() {
		try {
			return accountAddress;
		} catch (Exception e) {
			return "Exception - " + e.getMessage();
		}
	}

}

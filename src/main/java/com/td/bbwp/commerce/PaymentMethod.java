
/**
 * This file is created by Witchcraftmda only once .
 * It is OK to make changes as they will not be overwritten by subseuent re runs of the generator.
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

@Entity
@Table(name = "PAYMENT_METHOD")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//inherit
public class PaymentMethod extends PaymentMethodBase
		implements
			java.io.Serializable {
	private static final long serialVersionUID = -2005913728L;
}

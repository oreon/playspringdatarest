
/**
 * This file is created by Witchcraftmda only once .
 * It is OK to make changes as they will not be overwritten by subseuent re runs of the generator.
 */

package com.td.bbwp.users;

import javax.persistence.*;

import org.springframework.security.core.GrantedAuthority;
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
@Table(name = "APP_ROLE")
@Inheritance(strategy = InheritanceType.JOINED)
//inherit
public class AppRole extends AppRoleBase implements java.io.Serializable, GrantedAuthority {
	private static final long serialVersionUID = -1618836781L;

	@Override
	public String getAuthority() {
		return getName();
	}
}

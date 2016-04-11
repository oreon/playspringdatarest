
/**
 *  WARN -  DO NOT MODIFY  - This file is generated by Witchcraftmda. Change AppUser.java instead
 *  Any changes will be overwritten by the next run of the code generator.
 */

package com.td.bbwp.users;

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
public class AppUserBase extends BaseEntity {

	@NotNull
	@Size(min = 3)
	//@Unique(entityName = "com.td.bbwp.users.AppUser", fieldName = "USER_NAME")
	@Column(name = "USER_NAME", unique = true)
	protected String userName

	;

	@NotNull
	/*@com.fasterxml.jackson.annotation.JsonIgnore*/
	@Column(name = "PASSWORD", unique = false)
	protected String password

	;

	@Column(name = "ENABLED", unique = false)
	protected Boolean enabled

	;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
	@JoinTable(name = "appUsers_appRoles", joinColumns = @JoinColumn(name = "APP_USERS_ID"), inverseJoinColumns = @JoinColumn(name = "APP_ROLES_ID"))
	@IndexColumn(name = "appUsers_order")
	protected List<AppRole> appRoles

	= new ArrayList<AppRole>()

	;

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {

		return userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {

		return password;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Boolean getEnabled() {

		return enabled;
	}

	public void setAppRoles(List<AppRole> appRoles) {
		this.appRoles = appRoles;
	}

	public List<AppRole> getAppRoles() {

		return appRoles;
	}

	public void addAppRole(AppRole appRole) {

		if (this.appRoles == null) {
			this.appRoles = new ArrayList<com.td.bbwp.users.AppRole>();
		}

		this.appRoles.add(appRole);
	}

	@Transient
	public String createListAppRolesAsString() {
		return listAsString(appRoles);
	}

	@Transient
	//Display name
	public String getDisplayName() {
		try {
			return userName;
		} catch (Exception e) {
			return "Exception - " + e.getMessage();
		}
	}

}

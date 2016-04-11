package org.witchcraft.base.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

@Entity
@RevisionEntity(CustomRevisionListener.class)
public class Revision extends DefaultRevisionEntity {

    @Getter @Setter
    private String userName;
    
    public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	private String ssn = "AAA";
    

    
}
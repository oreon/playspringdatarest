package org.witchcraft.base.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.td.bbwp.users.AppUser;






@MappedSuperclass
@EntityListeners({EntityListener.class})
public class BaseEntity implements Serializable{
	private static final long serialVersionUID = -2225862673125944610L;

    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID")
    private Long id;
    
	@Transient
	//@Field(index = Index.YES)
	//@Analyzer(definition = "entityAnalyzer")
	@JsonIgnore
	private String searchData;
    
	@JsonIgnore
    private boolean archived = false;
    
    @Version
    @Column(name="version")
    private Integer version;
    
    @ManyToOne(optional=true, fetch=FetchType.LAZY)
    @JoinColumn(name="created_by_user_id", nullable=true)
    private AppUser createdByUser;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_created")
    private Date dateCreated;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_updated")
    private Date dateUpdated;
    
    @Transient
    private String higlightedFragment;
    
    
    @JsonIgnore
    private Long tenant;
    
    
    public AppUser getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(AppUser createdByUser) {
		this.createdByUser = createdByUser;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isArchived() {
		return archived;
	}

	public void setArchived(boolean archived) {
		this.archived = archived;
	}

	

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Long getTenant() {
		return tenant;
	}

	public void setTenant(Long tenant) {
		this.tenant = tenant;
	}


	
    
    
    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }
    
    @Transient
    public String getDisplayName(){
    	return toString();
    }
    
    
    protected <T extends BaseEntity> String listAsString(List<T> listItems) {
		StringBuilder result = new StringBuilder();
		int count = 0;
		
		for (T t: listItems) {
			++count;
			result.append(t.getDisplayName() );
			if(count < listItems.size()){
				result.append(", ");
			}
			if(count > 10 ){
				result.append("...."); 
				break; 
			}
		}
		
		return result.toString();
	}
	
    
	
}

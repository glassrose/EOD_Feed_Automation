package com.perpule.EOD_Automation.RestAPIs;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="companyData")
public class Company {

	@Id
	private Integer companyID;
	private Integer subCompanyID;
	private String companyName;
	private String subCompanyName;
	
	public Integer getCompanyID() {
		return companyID;
	}
	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}
	public Integer getSubCompanyID() {
		return subCompanyID;
	}
	public void setSubCompanyID(Integer subCompanyID) {
		this.subCompanyID = subCompanyID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getSubCompanyName() {
		return subCompanyName;
	}
	public void setSubCompanyName(String subCompanyName) {
		this.subCompanyName = subCompanyName;
	}
	
}

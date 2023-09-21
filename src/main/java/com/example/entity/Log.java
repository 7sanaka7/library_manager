package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Logs")
public class Log {

	@Id
	@SequenceGenerator(name = "LOG_ID_GENERATOR",sequenceName = "LOG_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_ID_GENERATOR")
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "LIBRARY_ID")
	private Integer libraryid;
	
	@Column(name = "USER_ID")
	private Integer userid;
	
	@Column(name = "RENT_DATE")
	private String rentdate;
	
	@Column(name = "RETURN_DATE")
	private String returndate;
	
	@Column(name = "RETURN_DUE_DATE")
	private String returnduedate;
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getLibraryId() {
		return this.libraryid;
	}
	
	public void setLibraryId(Integer id) {
		this.libraryid = libraryid;
	}
	
	public Integer getUserId() {
		return this.userid;
	}
	
	public void setUserId(Integer id) {
		this.userid = userid;
	}
	
	public String getRentdate() {
		return this.rentdate;
	}
	
	public void setRentdate(String rentdate) {
		this.rentdate = rentdate;
	}
	
	public String getReturndate() {
		return this.returndate;
	}
	
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	
	public String getReturnduedate() {
		return this.returnduedate;
	}
	
	public void setReturnduedate(String returnduedate) {
		this.returnduedate = returnduedate;
	}
}

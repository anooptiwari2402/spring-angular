package com.tech.about.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class About implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String emailID;
	private String contactNumber;
	private String address;
	private String degree;
	private String college;
	private String jobPost;
	private String company;
	public About() {
	}
	public About(String name, String emailID, String contactNumber, String address, String degree, String college,
			String jobPost, String company) {
		this.name = name;
		this.emailID = emailID;
		this.contactNumber = contactNumber;
		this.address = address;
		this.degree = degree;
		this.college = college;
		this.jobPost = jobPost;
		this.company = company;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getJobPost() {
		return jobPost;
	}
	public void setJobPost(String jobPost) {
		this.jobPost = jobPost;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	

}

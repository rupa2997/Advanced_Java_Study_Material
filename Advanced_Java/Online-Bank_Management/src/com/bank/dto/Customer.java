package com.bank.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer1")
public class Customer {
	@Id
	@GeneratedValue
	@Column(name="acc_no")
	private int accNo;
	
	@Column(name="cust_name")
	private String custName;
	
	@Column(name="cust_pass")
	private String custPass;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="acc_type")
	private String accType;
	
	@Column(name="city")
	private String city;
	
	@Column(name="amount")
	private double amt;
	
	
	public Customer() {
		super();
	}
	
	
	
	public double getAmt() {
		return amt;
	}



	public void setAmt(double amt) {
		this.amt = amt;
	}



	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustPass() {
		return custPass;
	}
	public void setCustPass(String custPass) {
		this.custPass = custPass;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}

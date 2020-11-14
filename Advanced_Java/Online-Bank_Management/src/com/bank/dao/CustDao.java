package com.bank.dao;

import com.bank.dto.Customer;

public interface CustDao {
	
	void insertCust(Customer cust);
	boolean checkCust(Customer cust);
	void withdrawAmt (Customer cust);
	void depositeAmt(Customer cust);

}

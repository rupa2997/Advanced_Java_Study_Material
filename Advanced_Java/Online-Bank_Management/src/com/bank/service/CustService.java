package com.bank.service;

import com.bank.dto.Customer;

public interface CustService {
	
	void addCust(Customer cust);
	boolean findCust(Customer cust);

}

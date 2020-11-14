package com.bank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.dao.CustDao;
import com.bank.dto.Customer;

@Service
public class CustServiceImple implements CustService {
	@Autowired
	private CustDao custDao;
	
	@Override
	public void addCust(Customer cust) {
		custDao.insertCust(cust);
		
	}

	@Override
	public boolean findCust(Customer cust) {
		// TODO Auto-generated method stub
		return custDao.checkCust(cust);
	}

	
}

package com.bank.dao;

import java.nio.channels.SeekableByteChannel;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.bank.dto.Customer;


@Repository
public class CustDaoImple implements CustDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public void insertCust(Customer cust) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.save(cust);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
	}

	@Override
	public boolean checkCust(Customer cust) {
		boolean b=hibernateTemplate.execute(new HibernateCallback<Boolean>() {

			@Override
			public Boolean doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				Query q= session.createQuery("from Customer where custName = ? and custPass = ? ");
				
				q.setString(0, cust.getCustName());
				q.setString(1, cust.getCustPass());
				
				List<Customer> li =q.list();
				boolean flag = ! li.isEmpty();
			
				session.save(cust);
				tr.commit();
				session.flush();
				session.close();
				return flag;
			}
		});
		return b;
	}

	@Override
	public void withdrawAmt(Customer cust) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(cust);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
		
		
	}

	@Override
	public void depositeAmt(Customer cust) {
		hibernateTemplate.execute(new HibernateCallback<Void>() {

			@Override
			public Void doInHibernate(Session session) throws HibernateException {
				Transaction tr = session.beginTransaction();
				session.update(cust);
				tr.commit();
				session.flush();
				session.close();
				return null;
			}
			
		});
	}

	

	

}

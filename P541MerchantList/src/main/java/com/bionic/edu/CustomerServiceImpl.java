package com.bionic.edu;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Named
public class CustomerServiceImpl implements CustomerService {

	@Inject
	private CustomerDao customerDao;

	public Customer findById(int id) {
		return customerDao.findById(id);
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public void save(Customer customer) {
		customerDao.save(customer);
	}

	@Transactional
	@Override
	public void remove(int id) {
		customerDao.remove(id);
	}

	@Transactional
	@Override
	public void updateCcNo(int id, String ccNo) {
		customerDao.updateCcNo(id, ccNo);
	}

	@Override
	public List<String> getNames(double sumPayed) {
		return customerDao.getNames(sumPayed);
	}

}

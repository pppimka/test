package com.bionic.edu;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.transaction.annotation.Transactional;

@Named
public class MerchantServiceImp implements MerchantService {

	@Inject
	private MerchantDao merchantDao;

	public Merchant findById(int id) {
		return merchantDao.findById(id);
	}

	public List<Merchant> findAll() {
		return merchantDao.findAll();
	}

	@Override
	public List<Merchant> getSortedByNeedToPay() {
		return merchantDao.getSortedByNeedToPay();
	}

	@Override
	public List<Result> getTotalReport() {
		return merchantDao.getTotalReport();
	}
	
	@Transactional
	@Override
	public void save(Merchant m) {
		merchantDao.save(m);
	}

}

package com.bionic.edu;

import java.util.List;

public interface MerchantService {
	
	public Merchant findById(int id);
	
	public List<Merchant> findAll();
	
	public List<Merchant> getSortedByNeedToPay();
	
	public List<Result> getTotalReport();
	
	public void save(Merchant m);
}

package com.bionic.edu;

import java.util.List;

public interface PaymentDao {

	public List<Payment> findByMerchantId(int id);

	public double getPaymentSum();

	public List<Payment> getLargePayments(double limit);

	public Payment findById(int id);

	public void save(Payment p);

	public List<Result> getTotalReport();

}

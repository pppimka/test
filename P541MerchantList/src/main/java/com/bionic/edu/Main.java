package com.bionic.edu;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");

		CustomerService customerService = context
				.getBean(CustomerService.class);

		PaymentService paymentService = context.getBean(PaymentService.class);

		MerchantService merchantService = context
				.getBean(MerchantService.class);

		Customer customer = new Customer();
		customer.setAddress("Independence st. 21, Malaga, 	Spane");

		customer.setCcNo("11122233344488");
		customer.setCcType("Master Card");
		customer.seteMail("vera@s.com");
		LocalDate dt = LocalDate.of(2017, Month.FEBRUARY, 28);
		customer.setMaturity(java.sql.Date.valueOf(dt));
		customer.setName("Vera Po");

		Payment p = new Payment();
		p.setChargePayed(3);
		p.setGoods("Phone");
		p.setSumPayed(123);
		p.setMerchant(merchantService.findById(1));
		p.setDt(new Timestamp(new java.util.Date().getTime()));
		ArrayList<Payment> list = new ArrayList<Payment>();

		list.add(p);
		p.setCustomer(customer);
		customerService.save(customer);
	}
}

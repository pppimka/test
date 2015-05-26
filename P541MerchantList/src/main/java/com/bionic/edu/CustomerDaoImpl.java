package com.bionic.edu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@PersistenceContext
	private EntityManager em;

	public Customer findById(int id) {
		Customer customer = null;
		customer = em.find(Customer.class, id);
		return customer;
	}

	@Override
	public void save(Customer customer) {
		em.persist(customer);
	}

	@Override
	public void remove(int id) {
		Customer customer = em.find(Customer.class, id);
		if (customer != null) {
			em.remove(customer);
		}

	}

	@Override
	public void updateCcNo(int id, String ccNo) {
		Customer customer = em.find(Customer.class, id);
		if (customer != null) {
			customer.setCcNo(ccNo);
		}
	}

	@Override
	public List<String> getNames(double sumPayed) {
		String txt = "SELECT DISTINCT c.name FROM ";
		txt += "Payment p, Customer c ";
		txt += "WHERE c.id = p.customerId AND p.sumPayed > 	" + sumPayed;
		TypedQuery<String> query = em.createQuery(txt, String.class);
		return query.getResultList();
	}

}

package com.bionic.edu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

@Repository
public class PaymentDaoImpl implements PaymentDao {

	@PersistenceContext
	private EntityManager em;

	public List<Payment> findByMerchantId(int id) {
		TypedQuery<Payment> query = em.createQuery(
				"SELECT p FROM Payment p WHERE" + " p.merchantId = " + id,
				Payment.class);
		return query.getResultList();
	}

	@Override
	public double getPaymentSum() {
		TypedQuery<Double> query = em.createQuery(
				"SELECT SUM(p.sumPayed) FROM 	Payment p", Double.class);
		return query.getSingleResult();

	}

	@Override
	public List<Payment> getLargePayments(double limit) {
		TypedQuery<Payment> query = em
				.createQuery("SELECT p FROM Payment p WHERE 	p.sumPayed > ?1",
						Payment.class);
		query.setParameter(1, limit);
		return query.getResultList();
	}

	@Override
	public Payment findById(int id) {
		return em.find(Payment.class, id);
	}

	@Override
	public List<Result> getTotalReport() {
		String txt = "SELECT new com.bionic.edu.Result    "
				+ " (p.merchant.name, count(p), SUM(p.chargePayed))";
		txt += "FROM Payment p GROUP BY p.merchant.name";
		TypedQuery<Result> query = em.createQuery(txt, Result.class);
		return query.getResultList();

	}

	@Override
	public void save(Payment p) {
		em.persist(p);

	}
}

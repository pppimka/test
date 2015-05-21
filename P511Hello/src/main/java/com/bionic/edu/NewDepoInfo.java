package com.bionic.edu;

import java.io.Serializable;
import java.util.Date;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@Scope("request")
public class NewDepoInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private String depoType = "1";

	private Date startDate;

	private int dayLong;

	private double sum;

	private double interestRate;
	
	
	public NewDepoInfo() {
	}

	public String getDepoType() {
		return depoType;
	}

	public void setDepoType(String depoType) {
		this.depoType = depoType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getDayLong() {
		return dayLong;
	}

	public void setDayLong(int dayLong) {
		this.dayLong = dayLong;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}

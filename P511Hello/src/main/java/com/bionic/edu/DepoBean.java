package com.bionic.edu;

import java.io.Serializable;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@Scope("request")
public class DepoBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String depoType = "1";

	private String startDate = "";

	private String dayLong = "";

	private String sum = "";

	private String interestRate = "";

	public String getDepoType() {
		return depoType;
	}

	public void setDepoType(String depoType) {
		this.depoType = depoType;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getDayLong() {
		return dayLong;
	}

	public void setDayLong(String dayLong) {
		this.dayLong = dayLong;
	}

	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}

	public String getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}

}

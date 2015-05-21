package com.bionic.edu;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named("msgs")
@Scope("request")
public class MessageBean {
	private final String startRequired = "Start date field could not be empty";
	private final String dayLongRequired = "Day long field could not be empty";
	private final String dayLongRange = "Day long field is not between the expected 	  	      values of 1 and 370";
	private final String startConverter = "Start date has wrong date format";
	private final String dayLongConverter = "Day long field does not contain integer";
	public String getStartRequired() {
		return startRequired;
	}
	public String getDayLongRequired() {
		return dayLongRequired;
	}
	public String getDayLongRange() {
		return dayLongRange;
	}
	public String getStartConverter() {
		return startConverter;
	}
	public String getDayLongConverter() {
		return dayLongConverter;
	}

}

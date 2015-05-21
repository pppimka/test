package com.bionic.edu;

import java.io.Serializable;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;
@Named
@Scope("request")
public class CheckedBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public String[] data = { "1", "2", "3" };

	public String[] getData() {
		return data;
	}

	public void setData(String[] data) {
		this.data = data;
	}

}

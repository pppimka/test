package com.bionic.edu;

import javax.inject.Named;
import org.springframework.context.annotation.Scope;

@Named
@Scope("request")
public class HelloWorldBean {

	public String getMessage() {
		return "Hello World!";
	}

}

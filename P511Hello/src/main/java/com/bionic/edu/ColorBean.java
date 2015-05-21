package com.bionic.edu;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@Scope("request")
public class ColorBean implements Serializable {

	private static final long serialVersionUID = 1L;

	public String favColor2;

	private Map<String, String> colorValues;

	public ColorBean() {
		colorValues = new LinkedHashMap<String, String>();
		colorValues.put("Color1 - Red", "Red");
		colorValues.put("Color2 - Green", "Green");
		colorValues.put("Color3 - Blue", "Blue");
	}

	public String getFavColor2() {
		return favColor2;
	}

	public void setFavColor2(String favColor2) {
		this.favColor2 = favColor2;
	}

	public Map<String, String> getColorValues() {
		return colorValues;
	}

	public void setColorValues(Map<String, String> colorValues) {
		this.colorValues = colorValues;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

package com.paypal.svcs.types.aa;

/**
 *  Government ID Types 
 *   
 */
public enum  GovernmentIDTypes {

	SIN("SIN");

	private String value;

	private GovernmentIDTypes (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static GovernmentIDTypes fromValue(String v) {
		for (GovernmentIDTypes c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
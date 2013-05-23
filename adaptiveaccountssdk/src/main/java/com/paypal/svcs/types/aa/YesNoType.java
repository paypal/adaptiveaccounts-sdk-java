package com.paypal.svcs.types.aa;

/**
 * Generic Yes or No input validation type.
 *  
 */
public enum  YesNoType {

	YES("YES"),

	NO("NO");

	private String value;

	private YesNoType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static YesNoType fromValue(String v) {
		for (YesNoType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
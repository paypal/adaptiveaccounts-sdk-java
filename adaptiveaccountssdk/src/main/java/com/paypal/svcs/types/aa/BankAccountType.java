package com.paypal.svcs.types.aa;

/**
 * 
 *  Bank account type should be CHECKING,
 *  SAVINGS,BUSINESS_CHECKING,
 *  BUSINESS_SAVINGS,NORMAL, or UNKNOWN.
 * 
 */
public enum  BankAccountType {

	CHECKING("CHECKING"),

	SAVINGS("SAVINGS"),

	BUSINESSCHECKING("BUSINESS_CHECKING"),

	BUSINESSSAVINGS("BUSINESS_SAVINGS"),

	NORMAL("NORMAL"),

	UNKNOWN("UNKNOWN");

	private String value;

	private BankAccountType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static BankAccountType fromValue(String v) {
		for (BankAccountType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
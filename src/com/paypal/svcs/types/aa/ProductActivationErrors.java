package com.paypal.svcs.types.aa;

/**
 * 
 */
public enum  ProductActivationErrors {

	MISSINGPIN("MISSING_PIN"),

	MISSINGCC("MISSING_CC"),

	MISSINGMOBILEPHONE("MISSING_MOBILE_PHONE"),

	NOTALLOWED("NOT_ALLOWED"),

	MOBILEPHONENOTACTIVATED("MOBILE_PHONE_NOT_ACTIVATED"),

	INTERNALERROR("INTERNAL_ERROR"),

	PRODUCTEXISTS("PRODUCT_EXISTS");

	private String value;

	private ProductActivationErrors (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static ProductActivationErrors fromValue(String v) {
		for (ProductActivationErrors c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
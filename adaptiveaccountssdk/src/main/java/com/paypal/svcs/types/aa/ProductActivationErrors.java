package com.paypal.svcs.types.aa;

/**
 *  
 */
public enum  ProductActivationErrors {

	NOTALLOWED("NOT_ALLOWED"),

	MISSINGCC("MISSING_CC"),

	MISSINGMOBILEPHONE("MISSING_MOBILE_PHONE"),

	MISSINGPIN("MISSING_PIN"),

	MOBILEPHONENOTACTIVATED("MOBILE_PHONE_NOT_ACTIVATED"),

	PRODUCTEXISTS("PRODUCT_EXISTS"),

	UNCONFIRMEDMOBILE("UNCONFIRMED_MOBILE"),

	INTERNALERROR("INTERNAL_ERROR");

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
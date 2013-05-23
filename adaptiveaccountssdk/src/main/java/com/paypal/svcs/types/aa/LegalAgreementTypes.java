package com.paypal.svcs.types.aa;

/**
 * Legal Agreement Types 
 *  
 */
public enum  LegalAgreementTypes {

	FINANCIALBINDINGAUTHORITY("FINANCIAL_BINDING_AUTHORITY");

	private String value;

	private LegalAgreementTypes (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static LegalAgreementTypes fromValue(String v) {
		for (LegalAgreementTypes c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
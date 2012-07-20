package com.paypal.svcs.types.aa;

/**
 * 
 *  Sales venue / store front type
 * 
 */
public enum  SalesVenueType {

	WEB("WEB"),

	EBAY("EBAY"),

	OTHERMARKETPLACE("OTHER_MARKETPLACE"),

	OTHER("OTHER");

	private String value;

	private SalesVenueType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static SalesVenueType fromValue(String v) {
		for (SalesVenueType c : values())
			if (c.value.equals(v))
				return c;
		throw new IllegalArgumentException(v);
	}

}
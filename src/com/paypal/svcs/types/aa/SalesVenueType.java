/**
 * Auto generated code
 * Sales venue / store front type
 */
package com.paypal.svcs.types.aa;

public enum SalesVenueType {

 		WEB("WEB"),
 		EBAY("EBAY"),
 		OTHERMARKETPLACE("OTHER_MARKETPLACE"),
 		OTHER("OTHER"),
		;
		private String value;
		SalesVenueType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static SalesVenueType fromValue(String v) {
			for (SalesVenueType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}

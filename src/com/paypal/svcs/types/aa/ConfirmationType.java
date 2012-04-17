/**
 * Auto generated code
 * API confirmation type currently
 * Valid values are: NONE, MOBILE and
 * WEB. WEB: Returns a URL to complete the
 * registration.
 */
package com.paypal.svcs.types.aa;

public enum ConfirmationType {

 		WEB("WEB"),
 		MOBILE("MOBILE"),
 		NONE("NONE"),
		;
		private String value;
		ConfirmationType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static ConfirmationType fromValue(String v) {
			for (ConfirmationType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}

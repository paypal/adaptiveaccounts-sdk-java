/**
 * Auto generated code
 * Stake holder role 
 */
package com.paypal.svcs.types.aa;

public enum StakeholderRoleType {

 		CHAIRMAN("CHAIRMAN"),
 		SECRETARY("SECRETARY"),
 		TREASURER("TREASURER"),
 		BENEFICIALOWNER("BENEFICIAL_OWNER"),
 		PRIMARYCONTACT("PRIMARY_CONTACT"),
 		INDIVIDUALPARTNER("INDIVIDUAL_PARTNER"),
 		NONINDIVIDUALPARTNER("NON_INDIVIDUAL_PARTNER"),
 		PRIMARYINDIVIDUALPARTNER("PRIMARY_INDIVIDUAL_PARTNER"),
 		DIRECTOR("DIRECTOR"),
 		NOBENEFICIALOWNER("NO_BENEFICIAL_OWNER"),
		;
		private String value;
		StakeholderRoleType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static StakeholderRoleType fromValue(String v) {
			for (StakeholderRoleType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}

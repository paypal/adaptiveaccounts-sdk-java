package com.paypal.svcs.types.aa;

/**
 * 
 *         Stake holder role 
 * 
 */
public enum  StakeholderRoleType {

	CHAIRMAN("CHAIRMAN"),

	SECRETARY("SECRETARY"),

	TREASURER("TREASURER"),

	BENEFICIALOWNER("BENEFICIAL_OWNER"),

	PRIMARYCONTACT("PRIMARY_CONTACT"),

	INDIVIDUALPARTNER("INDIVIDUAL_PARTNER"),

	NONINDIVIDUALPARTNER("NON_INDIVIDUAL_PARTNER"),

	PRIMARYINDIVIDUALPARTNER("PRIMARY_INDIVIDUAL_PARTNER"),

	DIRECTOR("DIRECTOR"),

	NOBENEFICIALOWNER("NO_BENEFICIAL_OWNER");

	private String value;

	private StakeholderRoleType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static StakeholderRoleType fromValue(String v) {
		for (StakeholderRoleType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
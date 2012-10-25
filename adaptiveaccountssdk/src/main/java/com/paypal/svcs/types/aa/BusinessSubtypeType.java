package com.paypal.svcs.types.aa;

/**
 * 
 *  Subtype required only for Business Type GOVERNMENT and
 * ASSOCIATION 
 *  GOVERNMENT: ENTITY, EMANATION,ESTD_COMMONWEALTH,
 * ESTD_UNDER_STATE_TERRITORY, 
 *  ESTD_UNDER_FOREIGN_COUNTRY 
 *  ASSOCIATION: INCORPORATED, NON_INCORPORATED
 * 
 */
public enum  BusinessSubtypeType {

	ENTITY("ENTITY"),

	EMANATION("EMANATION"),

	ESTDCOMMONWEALTH("ESTD_COMMONWEALTH"),

	ESTDUNDERSTATETERRITORY("ESTD_UNDER_STATE_TERRITORY"),

	ESTDUNDERFOREIGNCOUNTRY("ESTD_UNDER_FOREIGN_COUNTRY"),

	INCORPORATED("INCORPORATED"),

	NONINCORPORATED("NON_INCORPORATED");

	private String value;

	private BusinessSubtypeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static BusinessSubtypeType fromValue(String v) {
		for (BusinessSubtypeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
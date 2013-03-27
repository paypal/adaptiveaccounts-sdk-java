package com.paypal.svcs.types.aa;

/**
 *  SwitchMaestro, deprecated card type, use UKMaestro instead
 *               
 */
public enum  CardTypeType {

	VISA("Visa"),

	MASTERCARD("MasterCard"),

	AMERICANEXPRESS("AmericanExpress"),

	DISCOVER("Discover"),

	SWITCHMAESTRO("SwitchMaestro"),

	UKMAESTRO("UKMaestro"),

	CARTEAURORE("CarteAurore"),

	CARTEBLEUE("CarteBleue"),

	COFINOGA("Cofinoga"),

	ETOILES("4etoiles"),

	CARTAAURA("CartaAura"),

	TARJETAAURORA("TarjetaAurora"),

	JCB("JCB"),

	MAESTRO("Maestro");

	private String value;

	private CardTypeType (String value) {
		this.value = value;
	}

	public String getValue(){
		return value;
	}
	
	public static CardTypeType fromValue(String v) {
		for (CardTypeType c : values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
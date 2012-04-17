/**
 * Auto generated code
 */
package com.paypal.svcs.types.aa;

public enum CardTypeType {

 		VISA("Visa"),
 		MASTERCARD("MasterCard"),
 		AMERICANEXPRESS("AmericanExpress"),
 		DISCOVER("Discover"),
 		SWITCHMAESTRO("SwitchMaestro"),
 		SOLO("Solo"),
 		CARTEAURORE("CarteAurore"),
 		CARTEBLEUE("CarteBleue"),
 		COFINOGA("Cofinoga"),
 		ETOILES("4etoiles"),
 		CARTAAURA("CartaAura"),
 		TARJETAAURORA("TarjetaAurora"),
 		JCB("JCB"),
		;
		private String value;
		CardTypeType(String val){
			value=val;
		}		public String getValue(){
			return value;
		}
		public static CardTypeType fromValue(String v) {
			for (CardTypeType c : values())
				if (c.value.equals(v))
					return c;
			throw new IllegalArgumentException(v);
		}
}

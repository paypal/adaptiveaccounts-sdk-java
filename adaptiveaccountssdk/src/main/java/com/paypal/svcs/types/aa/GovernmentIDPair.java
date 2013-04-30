package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.aa.GovernmentIDTypes;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 *  
 */
public class GovernmentIDPair{


	/**
	*  	 
	 */ 
	private String value;

	/**
	*  	 
	 */ 
	private GovernmentIDTypes type;

	

	/**
	 * Default Constructor
	 */
	public GovernmentIDPair (){
	}	

	/**
	 * Getter for value
	 */
	 public String getValue() {
	 	return value;
	 }
	 
	/**
	 * Setter for value
	 */
	 public void setValue(String value) {
	 	this.value = value;
	 }
	 
	/**
	 * Getter for type
	 */
	 public GovernmentIDTypes getType() {
	 	return type;
	 }
	 
	/**
	 * Setter for type
	 */
	 public void setType(GovernmentIDTypes type) {
	 	this.type = type;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.value != null) {
			sb.append(prefix).append("value=").append(NVPUtil.encodeUrl(this.value));
			sb.append("&");
		}
		if (this.type != null) {
			sb.append(prefix).append("type=").append(this.type.getValue());
			sb.append("&");
		}
		return sb.toString();
	}

}
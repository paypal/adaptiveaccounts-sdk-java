package com.paypal.svcs.types.aa;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * 
 */
public class AddressType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private String line1;

	/**
	 * 	 
	 */ 
	private String line2;

	/**
	 * 	 
	 */ 
	private String city;

	/**
	 * 	 
	 */ 
	private String state;

	/**
	 * 	 
	 */ 
	private String postalCode;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String countryCode;

	

	/**
	 * Constructor with arguments
	 */
	public AddressType (String line1, String countryCode){
		this.line1 = line1;
		this.countryCode = countryCode;
	}	

	/**
	 * Default Constructor
	 */
	public AddressType (){
	}	

	/**
	 * Getter for line1
	 */
	 public String getLine1() {
	 	return line1;
	 }
	 
	/**
	 * Setter for line1
	 */
	 public void setLine1(String line1) {
	 	this.line1 = line1;
	 }
	 
	/**
	 * Getter for line2
	 */
	 public String getLine2() {
	 	return line2;
	 }
	 
	/**
	 * Setter for line2
	 */
	 public void setLine2(String line2) {
	 	this.line2 = line2;
	 }
	 
	/**
	 * Getter for city
	 */
	 public String getCity() {
	 	return city;
	 }
	 
	/**
	 * Setter for city
	 */
	 public void setCity(String city) {
	 	this.city = city;
	 }
	 
	/**
	 * Getter for state
	 */
	 public String getState() {
	 	return state;
	 }
	 
	/**
	 * Setter for state
	 */
	 public void setState(String state) {
	 	this.state = state;
	 }
	 
	/**
	 * Getter for postalCode
	 */
	 public String getPostalCode() {
	 	return postalCode;
	 }
	 
	/**
	 * Setter for postalCode
	 */
	 public void setPostalCode(String postalCode) {
	 	this.postalCode = postalCode;
	 }
	 
	/**
	 * Getter for countryCode
	 */
	 public String getCountryCode() {
	 	return countryCode;
	 }
	 
	/**
	 * Setter for countryCode
	 */
	 public void setCountryCode(String countryCode) {
	 	this.countryCode = countryCode;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.line1 != null) {
			sb.append(prefix).append("line1=").append(NVPUtil.encodeUrl(this.line1));
			sb.append("&");
		}
		if (this.line2 != null) {
			sb.append(prefix).append("line2=").append(NVPUtil.encodeUrl(this.line2));
			sb.append("&");
		}
		if (this.city != null) {
			sb.append(prefix).append("city=").append(NVPUtil.encodeUrl(this.city));
			sb.append("&");
		}
		if (this.state != null) {
			sb.append(prefix).append("state=").append(NVPUtil.encodeUrl(this.state));
			sb.append("&");
		}
		if (this.postalCode != null) {
			sb.append(prefix).append("postalCode=").append(NVPUtil.encodeUrl(this.postalCode));
			sb.append("&");
		}
		if (this.countryCode != null) {
			sb.append(prefix).append("countryCode=").append(NVPUtil.encodeUrl(this.countryCode));
			sb.append("&");
		}
		return sb.toString();
	}

}
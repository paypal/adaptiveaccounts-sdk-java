package com.paypal.svcs.types.aa;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * 
 */
public class WebOptionsType{

	private static final String nameSpace="com.paypal.svcs.types.aa";
	private static final String preferredPrefix="";

	/**
	 * 	 
	 */ 
	private String returnUrl;

	/**
	 * 	 
	 */ 
	private String cancelUrl;

	/**
	 * 	 
	 */ 
	private String returnUrlDescription;

	/**
	 * 	 
	 */ 
	private String cancelUrlDescription;

	

	/**
	 * Default Constructor
	 */
	public WebOptionsType (){
	}	

	/**
	 * Getter for returnUrl
	 */
	 public String getReturnUrl() {
	 	return returnUrl;
	 }
	 
	/**
	 * Setter for returnUrl
	 */
	 public void setReturnUrl(String returnUrl) {
	 	this.returnUrl = returnUrl;
	 }
	 
	/**
	 * Getter for cancelUrl
	 */
	 public String getCancelUrl() {
	 	return cancelUrl;
	 }
	 
	/**
	 * Setter for cancelUrl
	 */
	 public void setCancelUrl(String cancelUrl) {
	 	this.cancelUrl = cancelUrl;
	 }
	 
	/**
	 * Getter for returnUrlDescription
	 */
	 public String getReturnUrlDescription() {
	 	return returnUrlDescription;
	 }
	 
	/**
	 * Setter for returnUrlDescription
	 */
	 public void setReturnUrlDescription(String returnUrlDescription) {
	 	this.returnUrlDescription = returnUrlDescription;
	 }
	 
	/**
	 * Getter for cancelUrlDescription
	 */
	 public String getCancelUrlDescription() {
	 	return cancelUrlDescription;
	 }
	 
	/**
	 * Setter for cancelUrlDescription
	 */
	 public void setCancelUrlDescription(String cancelUrlDescription) {
	 	this.cancelUrlDescription = cancelUrlDescription;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (returnUrl != null) {
			sb.append(prefix).append("returnUrl=").append(NVPUtil.encodeUrl(returnUrl));
			sb.append("&");
		}
		if (cancelUrl != null) {
			sb.append(prefix).append("cancelUrl=").append(NVPUtil.encodeUrl(cancelUrl));
			sb.append("&");
		}
		if (returnUrlDescription != null) {
			sb.append(prefix).append("returnUrlDescription=").append(NVPUtil.encodeUrl(returnUrlDescription));
			sb.append("&");
		}
		if (cancelUrlDescription != null) {
			sb.append(prefix).append("cancelUrlDescription=").append(NVPUtil.encodeUrl(cancelUrlDescription));
			sb.append("&");
		}
		return sb.toString();
	}

}
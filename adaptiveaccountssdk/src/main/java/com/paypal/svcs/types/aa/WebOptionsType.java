package com.paypal.svcs.types.aa;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 *  
 */
public class WebOptionsType{


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
		if (this.returnUrl != null) {
			sb.append(prefix).append("returnUrl=").append(NVPUtil.encodeUrl(this.returnUrl));
			sb.append("&");
		}
		if (this.cancelUrl != null) {
			sb.append(prefix).append("cancelUrl=").append(NVPUtil.encodeUrl(this.cancelUrl));
			sb.append("&");
		}
		if (this.returnUrlDescription != null) {
			sb.append(prefix).append("returnUrlDescription=").append(NVPUtil.encodeUrl(this.returnUrlDescription));
			sb.append("&");
		}
		if (this.cancelUrlDescription != null) {
			sb.append(prefix).append("cancelUrlDescription=").append(NVPUtil.encodeUrl(this.cancelUrlDescription));
			sb.append("&");
		}
		return sb.toString();
	}

}
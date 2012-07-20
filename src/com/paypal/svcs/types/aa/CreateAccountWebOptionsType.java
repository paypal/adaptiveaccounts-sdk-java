package com.paypal.svcs.types.aa;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * Ask end-user to also initiate confirmation of their mobile
 * phone. This number must be supplied by the API caller (using
 * mobilePhoneNumber) Default=false. 
 */
public class CreateAccountWebOptionsType{


	/**
	 * No Document Comments	 
	 */ 
	private String returnUrl;

	/**
	 * No Document Comments	 
	 */ 
	private Boolean showAddCreditCard;

	/**
	 * Ask end-user to also initiate confirmation of their mobile
	 * phone. This number must be supplied by the API caller (using
	 * mobilePhoneNumber) Default=false. 	 
	 */ 
	private Boolean showMobileConfirm;

	/**
	 * No Document Comments	 
	 */ 
	private String returnUrlDescription;

	/**
	 * If provided, end user will go through a single page sign-up
	 * flow on a Mini Browser. If not provided, flow defaults to
	 * the Multi-page flow that is full size. 	 
	 */ 
	private Boolean useMiniBrowser;

	

	/**
	 * Default Constructor
	 */
	public CreateAccountWebOptionsType (){
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
	 * Getter for showAddCreditCard
	 */
	 public Boolean getShowAddCreditCard() {
	 	return showAddCreditCard;
	 }
	 
	/**
	 * Setter for showAddCreditCard
	 */
	 public void setShowAddCreditCard(Boolean showAddCreditCard) {
	 	this.showAddCreditCard = showAddCreditCard;
	 }
	 
	/**
	 * Getter for showMobileConfirm
	 */
	 public Boolean getShowMobileConfirm() {
	 	return showMobileConfirm;
	 }
	 
	/**
	 * Setter for showMobileConfirm
	 */
	 public void setShowMobileConfirm(Boolean showMobileConfirm) {
	 	this.showMobileConfirm = showMobileConfirm;
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
	 * Getter for useMiniBrowser
	 */
	 public Boolean getUseMiniBrowser() {
	 	return useMiniBrowser;
	 }
	 
	/**
	 * Setter for useMiniBrowser
	 */
	 public void setUseMiniBrowser(Boolean useMiniBrowser) {
	 	this.useMiniBrowser = useMiniBrowser;
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
		if (showAddCreditCard != null) {
			sb.append(prefix).append("showAddCreditCard=").append(showAddCreditCard);
			sb.append("&");
		}
		if (showMobileConfirm != null) {
			sb.append(prefix).append("showMobileConfirm=").append(showMobileConfirm);
			sb.append("&");
		}
		if (returnUrlDescription != null) {
			sb.append(prefix).append("returnUrlDescription=").append(NVPUtil.encodeUrl(returnUrlDescription));
			sb.append("&");
		}
		if (useMiniBrowser != null) {
			sb.append(prefix).append("useMiniBrowser=").append(useMiniBrowser);
			sb.append("&");
		}
		return sb.toString();
	}

}
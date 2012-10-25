package com.paypal.svcs.types.aa;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * Ask end-user to also initiate confirmation of their mobile
 * phone. This number must be supplied by the API caller (using
 * mobilePhoneNumber) Default=false. 
 */
public class CreateAccountWebOptionsType{

	private static final String nameSpace="com.paypal.svcs.types.aa";
	private static final String preferredPrefix="";

	/**
	 * 	 
	 */ 
	private String returnUrl;

	/**
	 * 	 
	 */ 
	private Boolean showAddCreditCard;

	/**
	 * Ask end-user to also initiate confirmation of their mobile
	 * phone. This number must be supplied by the API caller (using
	 * mobilePhoneNumber) Default=false. 	 
	 */ 
	private Boolean showMobileConfirm;

	/**
	 * 	 
	 */ 
	private String returnUrlDescription;

	/**
	 * If provided, end user will go through a single page sign-up
	 * flow on a Mini Browser. If not provided, flow defaults to
	 * the Multi-page flow that is full size. 	 
	 */ 
	private Boolean useMiniBrowser;

	/**
	 * Indicates the frequency of the reminder emails sent to the
	 * PayPal user after CreateAccount. Used only when
	 * registrationType is Web. Valid values: DEFAULT: All reminder
	 * emails will be sent (same behaviour as when this paramter is
	 * not present) NONE: No reminder emails will be sent (More
	 * values to be added in future) 	 
	 */ 
	private String reminderEmailFrequency;

	/**
	 * Indicates if the Return URL is used to confirm email. On
	 * accessing the Return URL successfully, confirm the email if
	 * this parameter is true, otherwise, do not confirm the email.
	 * Used only when registrationType is Web. Valid values (mixed
	 * case): true: Append the Email Confirmation Code to the
	 * Return URL. false: Do not append the Email Confirmation Code
	 * to the Return URL. 	 
	 */ 
	private String confirmEmail;

	

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
	 
	/**
	 * Getter for reminderEmailFrequency
	 */
	 public String getReminderEmailFrequency() {
	 	return reminderEmailFrequency;
	 }
	 
	/**
	 * Setter for reminderEmailFrequency
	 */
	 public void setReminderEmailFrequency(String reminderEmailFrequency) {
	 	this.reminderEmailFrequency = reminderEmailFrequency;
	 }
	 
	/**
	 * Getter for confirmEmail
	 */
	 public String getConfirmEmail() {
	 	return confirmEmail;
	 }
	 
	/**
	 * Setter for confirmEmail
	 */
	 public void setConfirmEmail(String confirmEmail) {
	 	this.confirmEmail = confirmEmail;
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
		if (reminderEmailFrequency != null) {
			sb.append(prefix).append("reminderEmailFrequency=").append(NVPUtil.encodeUrl(reminderEmailFrequency));
			sb.append("&");
		}
		if (confirmEmail != null) {
			sb.append(prefix).append("confirmEmail=").append(NVPUtil.encodeUrl(confirmEmail));
			sb.append("&");
		}
		return sb.toString();
	}

}
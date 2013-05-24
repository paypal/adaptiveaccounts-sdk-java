package com.paypal.svcs.types.aa;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * Identifies a PayPal account to which this request is
 * targeted. Caller of this API has to provide ONLY one of
 * these inputs: emailAddress, accountId or phoneNumber. 
 */
public class AccountIdentifierType{


	/**
	 * Identifies the PayPal account based on the emailAddress. 	  
	 *@Required	 
	 */ 
	private String emailAddress;

	/**
	 * Identifies the PayPal account based on the phoneNumber. 	  
	 *@Required	 
	 */ 
	private String mobilePhoneNumber;

	/**
	 * Identifies the PayPal account based on the accountId. 	  
	 *@Required	 
	 */ 
	private String accountId;

	

	/**
	 * Constructor with arguments
	 */
	public AccountIdentifierType (String emailAddress, String mobilePhoneNumber, String accountId){
		this.emailAddress = emailAddress;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.accountId = accountId;
	}	

	/**
	 * Default Constructor
	 */
	public AccountIdentifierType (){
	}	

	/**
	 * Getter for emailAddress
	 */
	 public String getEmailAddress() {
	 	return emailAddress;
	 }
	 
	/**
	 * Setter for emailAddress
	 */
	 public void setEmailAddress(String emailAddress) {
	 	this.emailAddress = emailAddress;
	 }
	 
	/**
	 * Getter for mobilePhoneNumber
	 */
	 public String getMobilePhoneNumber() {
	 	return mobilePhoneNumber;
	 }
	 
	/**
	 * Setter for mobilePhoneNumber
	 */
	 public void setMobilePhoneNumber(String mobilePhoneNumber) {
	 	this.mobilePhoneNumber = mobilePhoneNumber;
	 }
	 
	/**
	 * Getter for accountId
	 */
	 public String getAccountId() {
	 	return accountId;
	 }
	 
	/**
	 * Setter for accountId
	 */
	 public void setAccountId(String accountId) {
	 	this.accountId = accountId;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.emailAddress != null) {
			sb.append(prefix).append("emailAddress=").append(NVPUtil.encodeUrl(this.emailAddress));
			sb.append("&");
		}
		if (this.mobilePhoneNumber != null) {
			sb.append(prefix).append("mobilePhoneNumber=").append(NVPUtil.encodeUrl(this.mobilePhoneNumber));
			sb.append("&");
		}
		if (this.accountId != null) {
			sb.append(prefix).append("accountId=").append(NVPUtil.encodeUrl(this.accountId));
			sb.append("&");
		}
		return sb.toString();
	}

}
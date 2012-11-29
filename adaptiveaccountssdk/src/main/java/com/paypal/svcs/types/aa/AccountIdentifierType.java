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
	private String phoneNumber;

	/**
	 * Identifies the PayPal account based on the accountId. 	  
	 *@Required	 
	 */ 
	private String accountId;

	

	/**
	 * Constructor with arguments
	 */
	public AccountIdentifierType (String emailAddress, String phoneNumber, String accountId){
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
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
	 * Getter for phoneNumber
	 */
	 public String getPhoneNumber() {
	 	return phoneNumber;
	 }
	 
	/**
	 * Setter for phoneNumber
	 */
	 public void setPhoneNumber(String phoneNumber) {
	 	this.phoneNumber = phoneNumber;
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
		if (emailAddress != null) {
			sb.append(prefix).append("emailAddress=").append(NVPUtil.encodeUrl(emailAddress));
			sb.append("&");
		}
		if (phoneNumber != null) {
			sb.append(prefix).append("phoneNumber=").append(NVPUtil.encodeUrl(phoneNumber));
			sb.append("&");
		}
		if (accountId != null) {
			sb.append(prefix).append("accountId=").append(NVPUtil.encodeUrl(accountId));
			sb.append("&");
		}
		return sb.toString();
	}

}
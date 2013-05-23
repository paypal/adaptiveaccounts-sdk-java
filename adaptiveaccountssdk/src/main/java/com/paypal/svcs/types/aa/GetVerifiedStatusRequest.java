package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.aa.AccountIdentifierType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * Deprecated, use accountIdentifier.emailAddress instead 
 */
public class GetVerifiedStatusRequest{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * Deprecated, use accountIdentifier.emailAddress instead 	 
	 */ 
	private String emailAddress;

	/**
	 * Identifies a PayPal account to which this request is
	 * targeted. Caller of this API has to provide ONLY one of
	 * these inputs: emailAddress, accountId or mobilePhoneNumber. 	 
	 */ 
	private AccountIdentifierType accountIdentifier;

	/**
	 * matchCriteria determines which field(s) in addition to
	 * emailAddress is used to locate the account. Currently, we
	 * support matchCriteria of 'NAME' and 'NONE'. 	  
	 *@Required	 
	 */ 
	private String matchCriteria;

	/**
	 * Required if matchCriteria is NAME Optional if matchCriteria
	 * is NONE 	 
	 */ 
	private String firstName;

	/**
	 * Required if matchCriteria is NAME Optional if matchCriteria
	 * is NONE 	 
	 */ 
	private String lastName;

	

	/**
	 * Constructor with arguments
	 */
	public GetVerifiedStatusRequest (RequestEnvelope requestEnvelope, String matchCriteria){
		this.requestEnvelope = requestEnvelope;
		this.matchCriteria = matchCriteria;
	}	

	/**
	 * Default Constructor
	 */
	public GetVerifiedStatusRequest (){
	}	

	/**
	 * Getter for requestEnvelope
	 */
	 public RequestEnvelope getRequestEnvelope() {
	 	return requestEnvelope;
	 }
	 
	/**
	 * Setter for requestEnvelope
	 */
	 public void setRequestEnvelope(RequestEnvelope requestEnvelope) {
	 	this.requestEnvelope = requestEnvelope;
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
	 * Getter for accountIdentifier
	 */
	 public AccountIdentifierType getAccountIdentifier() {
	 	return accountIdentifier;
	 }
	 
	/**
	 * Setter for accountIdentifier
	 */
	 public void setAccountIdentifier(AccountIdentifierType accountIdentifier) {
	 	this.accountIdentifier = accountIdentifier;
	 }
	 
	/**
	 * Getter for matchCriteria
	 */
	 public String getMatchCriteria() {
	 	return matchCriteria;
	 }
	 
	/**
	 * Setter for matchCriteria
	 */
	 public void setMatchCriteria(String matchCriteria) {
	 	this.matchCriteria = matchCriteria;
	 }
	 
	/**
	 * Getter for firstName
	 */
	 public String getFirstName() {
	 	return firstName;
	 }
	 
	/**
	 * Setter for firstName
	 */
	 public void setFirstName(String firstName) {
	 	this.firstName = firstName;
	 }
	 
	/**
	 * Getter for lastName
	 */
	 public String getLastName() {
	 	return lastName;
	 }
	 
	/**
	 * Setter for lastName
	 */
	 public void setLastName(String lastName) {
	 	this.lastName = lastName;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(this.requestEnvelope.toNVPString(newPrefix));
		}
		if (this.emailAddress != null) {
			sb.append(prefix).append("emailAddress=").append(NVPUtil.encodeUrl(this.emailAddress));
			sb.append("&");
		}
		if (this.accountIdentifier != null) {
			String newPrefix = prefix + "accountIdentifier.";
			sb.append(this.accountIdentifier.toNVPString(newPrefix));
		}
		if (this.matchCriteria != null) {
			sb.append(prefix).append("matchCriteria=").append(NVPUtil.encodeUrl(this.matchCriteria));
			sb.append("&");
		}
		if (this.firstName != null) {
			sb.append(prefix).append("firstName=").append(NVPUtil.encodeUrl(this.firstName));
			sb.append("&");
		}
		if (this.lastName != null) {
			sb.append(prefix).append("lastName=").append(NVPUtil.encodeUrl(this.lastName));
			sb.append("&");
		}
		return sb.toString();
	}

}
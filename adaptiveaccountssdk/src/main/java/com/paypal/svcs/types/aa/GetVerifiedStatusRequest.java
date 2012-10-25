package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * matchCriteria determines which field(s) in addition to
 * emailAddress is used to locate the account. Currently, we
 * support matchCriteria of 'NAME' and 'NONE'. 
 */
public class GetVerifiedStatusRequest{

	private static final String nameSpace="com.paypal.svcs.types.aa";
	private static final String preferredPrefix="";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String emailAddress;

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
	public GetVerifiedStatusRequest (RequestEnvelope requestEnvelope, String emailAddress, String matchCriteria){
		this.requestEnvelope = requestEnvelope;
		this.emailAddress = emailAddress;
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
		if (requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(requestEnvelope.toNVPString(newPrefix));
		}
		if (emailAddress != null) {
			sb.append(prefix).append("emailAddress=").append(NVPUtil.encodeUrl(emailAddress));
			sb.append("&");
		}
		if (matchCriteria != null) {
			sb.append(prefix).append("matchCriteria=").append(NVPUtil.encodeUrl(matchCriteria));
			sb.append("&");
		}
		if (firstName != null) {
			sb.append(prefix).append("firstName=").append(NVPUtil.encodeUrl(firstName));
			sb.append("&");
		}
		if (lastName != null) {
			sb.append(prefix).append("lastName=").append(NVPUtil.encodeUrl(lastName));
			sb.append("&");
		}
		return sb.toString();
	}

}
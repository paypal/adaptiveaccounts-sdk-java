package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * Identifying the PayPal account to which this request is
 * targetted to. Caller of this API has to either provided an
 * emailAddress or an accountId. 
 */
public class SetFundingSourceConfirmedRequest{

	private static final String nameSpace="com.paypal.svcs.types.aa";
	private static final String preferredPrefix="";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * Identifying the PayPal account to which this request is
	 * targetted to. Caller of this API has to either provided an
	 * emailAddress or an accountId. 	 
	 */ 
	private String emailAddress;

	/**
	 * Identifying the PayPal account to which this request is
	 * targetted to. Caller of this API has to either provided an
	 * emailAddress or an accountId. 	 
	 */ 
	private String accountId;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String fundingSourceKey;

	

	/**
	 * Constructor with arguments
	 */
	public SetFundingSourceConfirmedRequest (RequestEnvelope requestEnvelope, String fundingSourceKey){
		this.requestEnvelope = requestEnvelope;
		this.fundingSourceKey = fundingSourceKey;
	}	

	/**
	 * Default Constructor
	 */
	public SetFundingSourceConfirmedRequest (){
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
	 
	/**
	 * Getter for fundingSourceKey
	 */
	 public String getFundingSourceKey() {
	 	return fundingSourceKey;
	 }
	 
	/**
	 * Setter for fundingSourceKey
	 */
	 public void setFundingSourceKey(String fundingSourceKey) {
	 	this.fundingSourceKey = fundingSourceKey;
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
		if (accountId != null) {
			sb.append(prefix).append("accountId=").append(NVPUtil.encodeUrl(accountId));
			sb.append("&");
		}
		if (fundingSourceKey != null) {
			sb.append(prefix).append("fundingSourceKey=").append(NVPUtil.encodeUrl(fundingSourceKey));
			sb.append("&");
		}
		return sb.toString();
	}

}
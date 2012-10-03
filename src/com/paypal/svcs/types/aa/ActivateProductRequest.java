package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.aa.AccountIdentifierType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * This operation is for internal purposes developed for a POC.
 * 
 */
public class ActivateProductRequest{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * Identifies a PayPal account to which this request is
	 * targeted. Caller of this API has to provide ONLY one of
	 * these inputs: emailAddress or accountId. 	  
	 *@Required	 
	 */ 
	private AccountIdentifierType accountIdentifier;

	

	/**
	 * Constructor with arguments
	 */
	public ActivateProductRequest (RequestEnvelope requestEnvelope, AccountIdentifierType accountIdentifier){
		this.requestEnvelope = requestEnvelope;
		this.accountIdentifier = accountIdentifier;
	}	

	/**
	 * Default Constructor
	 */
	public ActivateProductRequest (){
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
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(requestEnvelope.toNVPString(newPrefix));
		}
		if (accountIdentifier != null) {
			String newPrefix = prefix + "accountIdentifier.";
			sb.append(accountIdentifier.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}
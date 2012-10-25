package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * 
 */
public class GetUserAgreementRequest{

	private static final String nameSpace="com.paypal.svcs.types.aa";
	private static final String preferredPrefix="";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * 	 
	 */ 
	private String createAccountKey;

	/**
	 * 	 
	 */ 
	private String countryCode;

	/**
	 * 	 
	 */ 
	private String languageCode;

	

	/**
	 * Constructor with arguments
	 */
	public GetUserAgreementRequest (RequestEnvelope requestEnvelope){
		this.requestEnvelope = requestEnvelope;
	}	

	/**
	 * Default Constructor
	 */
	public GetUserAgreementRequest (){
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
	 * Getter for createAccountKey
	 */
	 public String getCreateAccountKey() {
	 	return createAccountKey;
	 }
	 
	/**
	 * Setter for createAccountKey
	 */
	 public void setCreateAccountKey(String createAccountKey) {
	 	this.createAccountKey = createAccountKey;
	 }
	 
	/**
	 * Getter for countryCode
	 */
	 public String getCountryCode() {
	 	return countryCode;
	 }
	 
	/**
	 * Setter for countryCode
	 */
	 public void setCountryCode(String countryCode) {
	 	this.countryCode = countryCode;
	 }
	 
	/**
	 * Getter for languageCode
	 */
	 public String getLanguageCode() {
	 	return languageCode;
	 }
	 
	/**
	 * Setter for languageCode
	 */
	 public void setLanguageCode(String languageCode) {
	 	this.languageCode = languageCode;
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
		if (createAccountKey != null) {
			sb.append(prefix).append("createAccountKey=").append(NVPUtil.encodeUrl(createAccountKey));
			sb.append("&");
		}
		if (countryCode != null) {
			sb.append(prefix).append("countryCode=").append(NVPUtil.encodeUrl(countryCode));
			sb.append("&");
		}
		if (languageCode != null) {
			sb.append(prefix).append("languageCode=").append(NVPUtil.encodeUrl(languageCode));
			sb.append("&");
		}
		return sb.toString();
	}

}
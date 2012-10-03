package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * Valid values are: FUNDING_SOURCE_ADDED,
 * WEB_URL_VERIFICATION_NEEDED 
 */
public class AddPaymentCardResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * Valid values are: FUNDING_SOURCE_ADDED,
	 * WEB_URL_VERIFICATION_NEEDED 	  
	 *@Required	 
	 */ 
	private String execStatus;

	/**
	 * 	 
	 */ 
	private String redirectURL;

	/**
	 * 	 
	 */ 
	private String fundingSourceKey;

	/**
	 * 	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public AddPaymentCardResponse (){
	}	

	/**
	 * Getter for responseEnvelope
	 */
	 public ResponseEnvelope getResponseEnvelope() {
	 	return responseEnvelope;
	 }
	 
	/**
	 * Setter for responseEnvelope
	 */
	 public void setResponseEnvelope(ResponseEnvelope responseEnvelope) {
	 	this.responseEnvelope = responseEnvelope;
	 }
	 
	/**
	 * Getter for execStatus
	 */
	 public String getExecStatus() {
	 	return execStatus;
	 }
	 
	/**
	 * Setter for execStatus
	 */
	 public void setExecStatus(String execStatus) {
	 	this.execStatus = execStatus;
	 }
	 
	/**
	 * Getter for redirectURL
	 */
	 public String getRedirectURL() {
	 	return redirectURL;
	 }
	 
	/**
	 * Setter for redirectURL
	 */
	 public void setRedirectURL(String redirectURL) {
	 	this.redirectURL = redirectURL;
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
	 
	/**
	 * Getter for error
	 */
	 public List<ErrorData> getError() {
	 	return error;
	 }
	 
	/**
	 * Setter for error
	 */
	 public void setError(List<ErrorData> error) {
	 	this.error = error;
	 }
	 


	
	public static AddPaymentCardResponse createInstance(Map<String, String> map, String prefix, int index) {
		AddPaymentCardResponse addPaymentCardResponse = null;
		int i = 0;
		if (index != -1) {
				if (prefix != null && prefix.length() != 0 && !prefix.endsWith(".")) {
					prefix = prefix + "(" + index + ").";
				}
		} else {
			if (prefix != null && prefix.length() != 0 && !prefix.endsWith(".")) {
				prefix = prefix + ".";
			}
		}
			
		ResponseEnvelope responseEnvelope =  ResponseEnvelope.createInstance(map, prefix + "responseEnvelope", -1);
		if (responseEnvelope != null) {
			addPaymentCardResponse = (addPaymentCardResponse == null) ? new AddPaymentCardResponse() : addPaymentCardResponse;
			addPaymentCardResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "execStatus")) {
				addPaymentCardResponse = (addPaymentCardResponse == null) ? new AddPaymentCardResponse() : addPaymentCardResponse;
				addPaymentCardResponse.setExecStatus(map.get(prefix + "execStatus"));
		}
		if (map.containsKey(prefix + "redirectURL")) {
				addPaymentCardResponse = (addPaymentCardResponse == null) ? new AddPaymentCardResponse() : addPaymentCardResponse;
				addPaymentCardResponse.setRedirectURL(map.get(prefix + "redirectURL"));
		}
		if (map.containsKey(prefix + "fundingSourceKey")) {
				addPaymentCardResponse = (addPaymentCardResponse == null) ? new AddPaymentCardResponse() : addPaymentCardResponse;
				addPaymentCardResponse.setFundingSourceKey(map.get(prefix + "fundingSourceKey"));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				addPaymentCardResponse = (addPaymentCardResponse == null) ? new AddPaymentCardResponse() : addPaymentCardResponse;
				addPaymentCardResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return addPaymentCardResponse;
	}
 
}
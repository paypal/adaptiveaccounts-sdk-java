package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * 
 */
public class GetUserAgreementResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String agreement;

	/**
	 * 	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public GetUserAgreementResponse (){
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
	 * Getter for agreement
	 */
	 public String getAgreement() {
	 	return agreement;
	 }
	 
	/**
	 * Setter for agreement
	 */
	 public void setAgreement(String agreement) {
	 	this.agreement = agreement;
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
	 


	
	public static GetUserAgreementResponse createInstance(Map<String, String> map, String prefix, int index) {
		GetUserAgreementResponse getUserAgreementResponse = null;
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
			getUserAgreementResponse = (getUserAgreementResponse == null) ? new GetUserAgreementResponse() : getUserAgreementResponse;
			getUserAgreementResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "agreement")) {
				getUserAgreementResponse = (getUserAgreementResponse == null) ? new GetUserAgreementResponse() : getUserAgreementResponse;
				getUserAgreementResponse.setAgreement(map.get(prefix + "agreement"));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				getUserAgreementResponse = (getUserAgreementResponse == null) ? new GetUserAgreementResponse() : getUserAgreementResponse;
				getUserAgreementResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return getUserAgreementResponse;
	}
 
}
package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * Returned values are: ALLOW|DENY 
 */
public class CheckComplianceStatusResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * Returned values are: ALLOW|DENY 	  
	 *@Required	 
	 */ 
	private String execStatus;

	/**
	 * Returned values are: CLIENT_NOT_SUPPORTED,
	 * COUNTRY_NOT_SUPPORTED, VERIFICATION_NOT_COMPLETED,
	 * DOCUMENTS_UNDER_REVIEW, DENIED 	 
	 */ 
	private String denialReason;

	/**
	 * 	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public CheckComplianceStatusResponse (){
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
	 * Getter for denialReason
	 */
	 public String getDenialReason() {
	 	return denialReason;
	 }
	 
	/**
	 * Setter for denialReason
	 */
	 public void setDenialReason(String denialReason) {
	 	this.denialReason = denialReason;
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
	 


	
	public static CheckComplianceStatusResponse createInstance(Map<String, String> map, String prefix, int index) {
		CheckComplianceStatusResponse checkComplianceStatusResponse = null;
		int i = 0;
		if (index != -1) {
				if (!prefix.isEmpty() && !prefix.endsWith(".")) {
					prefix = prefix + "(" + index + ").";
				}
		} else {
			if (!prefix.isEmpty() && !prefix.endsWith(".")) {
				prefix = prefix + ".";
			}
		}
			
		ResponseEnvelope responseEnvelope =  ResponseEnvelope.createInstance(map, prefix + "responseEnvelope", -1);
		if (responseEnvelope != null) {
			checkComplianceStatusResponse = (checkComplianceStatusResponse == null) ? new CheckComplianceStatusResponse() : checkComplianceStatusResponse;
			checkComplianceStatusResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "execStatus")) {
				checkComplianceStatusResponse = (checkComplianceStatusResponse == null) ? new CheckComplianceStatusResponse() : checkComplianceStatusResponse;
				checkComplianceStatusResponse.setExecStatus(map.get(prefix + "execStatus"));
		}
		if (map.containsKey(prefix + "denialReason")) {
				checkComplianceStatusResponse = (checkComplianceStatusResponse == null) ? new CheckComplianceStatusResponse() : checkComplianceStatusResponse;
				checkComplianceStatusResponse.setDenialReason(map.get(prefix + "denialReason"));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				checkComplianceStatusResponse = (checkComplianceStatusResponse == null) ? new CheckComplianceStatusResponse() : checkComplianceStatusResponse;
				checkComplianceStatusResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return checkComplianceStatusResponse;
	}
 
}
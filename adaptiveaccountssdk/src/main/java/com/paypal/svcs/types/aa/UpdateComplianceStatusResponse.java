package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 *  
 */
public class UpdateComplianceStatusResponse{


	/**
	*  	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	*  	  
	 *@Required	 
	 */ 
	private String execStatus;

	/**
	*  	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public UpdateComplianceStatusResponse (){
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
	 


	
	public static UpdateComplianceStatusResponse createInstance(Map<String, String> map, String prefix, int index) {
		UpdateComplianceStatusResponse updateComplianceStatusResponse = null;
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
			updateComplianceStatusResponse = (updateComplianceStatusResponse == null) ? new UpdateComplianceStatusResponse() : updateComplianceStatusResponse;
			updateComplianceStatusResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "execStatus")) {
				updateComplianceStatusResponse = (updateComplianceStatusResponse == null) ? new UpdateComplianceStatusResponse() : updateComplianceStatusResponse;
				updateComplianceStatusResponse.setExecStatus(map.get(prefix + "execStatus"));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				updateComplianceStatusResponse = (updateComplianceStatusResponse == null) ? new UpdateComplianceStatusResponse() : updateComplianceStatusResponse;
				updateComplianceStatusResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return updateComplianceStatusResponse;
	}
 
}
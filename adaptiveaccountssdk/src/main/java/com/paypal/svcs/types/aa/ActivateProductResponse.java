package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.aa.ProductActivationErrors;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * Valid values are: SUCCESS, FAILED 
 */
public class ActivateProductResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * Valid values are: SUCCESS, FAILED 	  
	 *@Required	 
	 */ 
	private String execStatus;

	/**
	 * 	 
	 */ 
	private List<ProductActivationErrors> productActivationErrors = new ArrayList<ProductActivationErrors>();

	/**
	 * 	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public ActivateProductResponse (){
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
	 * Getter for productActivationErrors
	 */
	 public List<ProductActivationErrors> getProductActivationErrors() {
	 	return productActivationErrors;
	 }
	 
	/**
	 * Setter for productActivationErrors
	 */
	 public void setProductActivationErrors(List<ProductActivationErrors> productActivationErrors) {
	 	this.productActivationErrors = productActivationErrors;
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
	 


	
	public static ActivateProductResponse createInstance(Map<String, String> map, String prefix, int index) {
		ActivateProductResponse activateProductResponse = null;
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
			activateProductResponse = (activateProductResponse == null) ? new ActivateProductResponse() : activateProductResponse;
			activateProductResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "execStatus")) {
				activateProductResponse = (activateProductResponse == null) ? new ActivateProductResponse() : activateProductResponse;
				activateProductResponse.setExecStatus(map.get(prefix + "execStatus"));
		}
		i = 0;
		while(true) {
			if (map.containsKey(prefix + "productActivationErrors" + "(" + i + ")")) {
				activateProductResponse = (activateProductResponse == null) ? new ActivateProductResponse() : activateProductResponse;
				activateProductResponse.getProductActivationErrors().add(ProductActivationErrors.fromValue(map.get(prefix + "productActivationErrors" + "(" + i + ")")));
				i++;
			} else {
				break;
			}
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				activateProductResponse = (activateProductResponse == null) ? new ActivateProductResponse() : activateProductResponse;
				activateProductResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return activateProductResponse;
	}
 
}
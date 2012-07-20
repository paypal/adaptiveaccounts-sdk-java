package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * No Document Comments
 */
public class GetUserAgreementResponse{


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private String agreement;

	/**
	 * No Document Comments	 
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
	 


	public GetUserAgreementResponse(Map<String, String> map, String prefix) {
		int i = 0;
		if(map.containsKey(prefix + "responseEnvelope" + ".timestamp")){
			String newPrefix = prefix + "responseEnvelope" + ".";
			this.responseEnvelope =  new ResponseEnvelope(map, newPrefix);
		}
		if(map.containsKey(prefix + "agreement")){
			this.agreement = map.get(prefix + "agreement");
		}
		i = 0;
		while(true) {
			if(map.containsKey(prefix + "error" + "(" + i + ")" + ".parameter(0)")){
				String newPrefix = prefix + "error" + "(" + i + ")" + ".";
				this.error.add(new ErrorData(map, newPrefix));
			} else {
				break;
			}
			i++;
		}
	}

}
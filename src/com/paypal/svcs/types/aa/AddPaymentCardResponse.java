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
	 * No Document Comments	  
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
	 * No Document Comments	 
	 */ 
	private String redirectURL;

	/**
	 * No Document Comments	 
	 */ 
	private String fundingSourceKey;

	/**
	 * No Document Comments	 
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
	 


	public AddPaymentCardResponse(Map<String, String> map, String prefix) {
		int i = 0;
		if(map.containsKey(prefix + "responseEnvelope" + ".timestamp")){
			String newPrefix = prefix + "responseEnvelope" + ".";
			this.responseEnvelope =  new ResponseEnvelope(map, newPrefix);
		}
		if(map.containsKey(prefix + "execStatus")){
			this.execStatus = map.get(prefix + "execStatus");
		}
		if(map.containsKey(prefix + "redirectURL")){
			this.redirectURL = map.get(prefix + "redirectURL");
		}
		if(map.containsKey(prefix + "fundingSourceKey")){
			this.fundingSourceKey = map.get(prefix + "fundingSourceKey");
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
package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * Valid values are: COMPLETED,
 * COMPLETED:MERCHANT_REFERRAL_BONUS_ID_ASSOCIATION_FAILED 
 */
public class CreateAccountResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * 	 
	 */ 
	private String createAccountKey;

	/**
	 * Valid values are: COMPLETED,
	 * COMPLETED:MERCHANT_REFERRAL_BONUS_ID_ASSOCIATION_FAILED 	  
	 *@Required	 
	 */ 
	private String execStatus;

	/**
	 * 	 
	 */ 
	private String redirectURL;

	/**
	 * Identifies a PayPal account. Only premier and business
	 * accounts have an accountId 	 
	 */ 
	private String accountId;

	/**
	 * 	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public CreateAccountResponse (){
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
	 


	
	public static CreateAccountResponse createInstance(Map<String, String> map, String prefix, int index) {
		CreateAccountResponse createAccountResponse = null;
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
			createAccountResponse = (createAccountResponse == null) ? new CreateAccountResponse() : createAccountResponse;
			createAccountResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "createAccountKey")) {
				createAccountResponse = (createAccountResponse == null) ? new CreateAccountResponse() : createAccountResponse;
				createAccountResponse.setCreateAccountKey(map.get(prefix + "createAccountKey"));
		}
		if (map.containsKey(prefix + "execStatus")) {
				createAccountResponse = (createAccountResponse == null) ? new CreateAccountResponse() : createAccountResponse;
				createAccountResponse.setExecStatus(map.get(prefix + "execStatus"));
		}
		if (map.containsKey(prefix + "redirectURL")) {
				createAccountResponse = (createAccountResponse == null) ? new CreateAccountResponse() : createAccountResponse;
				createAccountResponse.setRedirectURL(map.get(prefix + "redirectURL"));
		}
		if (map.containsKey(prefix + "accountId")) {
				createAccountResponse = (createAccountResponse == null) ? new CreateAccountResponse() : createAccountResponse;
				createAccountResponse.setAccountId(map.get(prefix + "accountId"));
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				createAccountResponse = (createAccountResponse == null) ? new CreateAccountResponse() : createAccountResponse;
				createAccountResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return createAccountResponse;
	}
 
}
package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.ResponseEnvelope;
import com.paypal.svcs.types.aa.UserInfoType;
import java.util.List;
import java.util.ArrayList;
import com.paypal.svcs.types.common.ErrorData;
import java.util.Map;

/**
 * Returned values are: VERIFIED|UNVERIFIED. 
 */
public class GetVerifiedStatusResponse{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private ResponseEnvelope responseEnvelope;

	/**
	 * Returned values are: VERIFIED|UNVERIFIED. 	  
	 *@Required	 
	 */ 
	private String accountStatus;

	/**
	 * Returns countryCode belonging to PayPal account. 	 
	 */ 
	private String countryCode;

	/**
	 * Info about PayPal user such as emailAddress, accountId,
	 * firstName, lastName etc. 	 
	 */ 
	private UserInfoType userInfo;

	/**
	 * 	 
	 */ 
	private List<ErrorData> error = new ArrayList<ErrorData>();

	

	/**
	 * Default Constructor
	 */
	public GetVerifiedStatusResponse (){
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
	 * Getter for accountStatus
	 */
	 public String getAccountStatus() {
	 	return accountStatus;
	 }
	 
	/**
	 * Setter for accountStatus
	 */
	 public void setAccountStatus(String accountStatus) {
	 	this.accountStatus = accountStatus;
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
	 * Getter for userInfo
	 */
	 public UserInfoType getUserInfo() {
	 	return userInfo;
	 }
	 
	/**
	 * Setter for userInfo
	 */
	 public void setUserInfo(UserInfoType userInfo) {
	 	this.userInfo = userInfo;
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
	 


	
	public static GetVerifiedStatusResponse createInstance(Map<String, String> map, String prefix, int index) {
		GetVerifiedStatusResponse getVerifiedStatusResponse = null;
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
			getVerifiedStatusResponse = (getVerifiedStatusResponse == null) ? new GetVerifiedStatusResponse() : getVerifiedStatusResponse;
			getVerifiedStatusResponse.setResponseEnvelope(responseEnvelope);
		}
		if (map.containsKey(prefix + "accountStatus")) {
				getVerifiedStatusResponse = (getVerifiedStatusResponse == null) ? new GetVerifiedStatusResponse() : getVerifiedStatusResponse;
				getVerifiedStatusResponse.setAccountStatus(map.get(prefix + "accountStatus"));
		}
		if (map.containsKey(prefix + "countryCode")) {
				getVerifiedStatusResponse = (getVerifiedStatusResponse == null) ? new GetVerifiedStatusResponse() : getVerifiedStatusResponse;
				getVerifiedStatusResponse.setCountryCode(map.get(prefix + "countryCode"));
		}
		UserInfoType userInfo =  UserInfoType.createInstance(map, prefix + "userInfo", -1);
		if (userInfo != null) {
			getVerifiedStatusResponse = (getVerifiedStatusResponse == null) ? new GetVerifiedStatusResponse() : getVerifiedStatusResponse;
			getVerifiedStatusResponse.setUserInfo(userInfo);
		}
		i = 0;
		while(true) {
			ErrorData error =  ErrorData.createInstance(map, prefix + "error", i);
			if (error != null) {
				getVerifiedStatusResponse = (getVerifiedStatusResponse == null) ? new GetVerifiedStatusResponse() : getVerifiedStatusResponse;
				getVerifiedStatusResponse.getError().add(error);
				i++;
			} else {
				break;
			}
		}
		return getVerifiedStatusResponse;
	}
 
}
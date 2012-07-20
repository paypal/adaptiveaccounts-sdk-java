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
	 * No Document Comments	  
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
	 * No Document Comments	 
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
	 


	public GetVerifiedStatusResponse(Map<String, String> map, String prefix) {
		int i = 0;
		if(map.containsKey(prefix + "responseEnvelope" + ".timestamp")){
			String newPrefix = prefix + "responseEnvelope" + ".";
			this.responseEnvelope =  new ResponseEnvelope(map, newPrefix);
		}
		if(map.containsKey(prefix + "accountStatus")){
			this.accountStatus = map.get(prefix + "accountStatus");
		}
		if(map.containsKey(prefix + "countryCode")){
			this.countryCode = map.get(prefix + "countryCode");
		}
		if(map.containsKey(prefix + "userInfo" + ".name.firstName")){
			String newPrefix = prefix + "userInfo" + ".";
			this.userInfo =  new UserInfoType(map, newPrefix);
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
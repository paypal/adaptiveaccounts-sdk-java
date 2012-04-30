
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.svcs.types.aa.UserInfoType;
import com.paypal.svcs.types.common.ErrorData;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Returned values are:
 * VERIFIED|UNVERIFIED.
 */
public class GetVerifiedStatusResponse {

	/**
	 *
	 * @Required
	 */
	private ResponseEnvelope responseEnvelope;
	public ResponseEnvelope getResponseEnvelope() {
		return responseEnvelope;
	}
	public void setResponseEnvelope(ResponseEnvelope value) {
		this.responseEnvelope = value;
	}

	/**
	 * Returned values are:
	 * VERIFIED|UNVERIFIED.
	 *
	 * @Required
	 */
	private String accountStatus;
	public String getAccountStatus() {
		return accountStatus;
	}
	public void setAccountStatus(String value) {
		this.accountStatus = value;
	}

	/**
	 * Returns countryCode belonging to PayPal account.
	 */
	private String countryCode;
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	/**
	 * Info about PayPal user such as emailAddress,
	 * accountId, firstName, lastName etc. 
	 */
	private UserInfoType userInfo;
	public UserInfoType getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfoType value) {
		this.userInfo = value;
	}

	/**
	 */
	private List<ErrorData> error = new ArrayList<ErrorData>();
	public List<ErrorData> getError() {
		return error;
	}
	public void setError(List<ErrorData> value) {
		this.error = value;
	}


	public GetVerifiedStatusResponse() {
	}
	public GetVerifiedStatusResponse(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "responseEnvelope" + ".timestamp") ) {
			String newPrefix = prefix + "responseEnvelope" + '.';
			this.responseEnvelope =  new ResponseEnvelope(map, newPrefix);
		}
		if( map.containsKey(prefix + "accountStatus") ) {
			this.accountStatus = map.get(prefix + "accountStatus");
		}
		if( map.containsKey(prefix + "countryCode") ) {
			this.countryCode = map.get(prefix + "countryCode");
		}
		if( map.containsKey(prefix + "userInfo" + ".emailAddress") ) {
			String newPrefix = prefix + "userInfo" + '.';
			this.userInfo =  new UserInfoType(map, newPrefix);
		}
		 i=0; 
		 while(true) {
			if( map.containsKey(prefix + "error" + '(' + i + ')'+ ".errorId") ) {
				String newPrefix = prefix + "error" + '(' + i + ')' + '.';
				this.error.add(new ErrorData(map, newPrefix));
			}
			else break;
			i++;
		}
	}
}

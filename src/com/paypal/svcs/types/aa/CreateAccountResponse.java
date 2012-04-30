
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.svcs.types.common.ErrorData;
import com.paypal.svcs.types.common.ResponseEnvelope;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * Valid values are: COMPLETED, 
 * COMPLETED:MERCHANT_REFERRAL_BONUS_ID_ASSOCIATION_FAILED
 */
public class CreateAccountResponse {

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
	 */
	private String createAccountKey;
	public String getCreateAccountKey() {
		return createAccountKey;
	}
	public void setCreateAccountKey(String value) {
		this.createAccountKey = value;
	}

	/**
	 * Valid values are: COMPLETED, 
	 * COMPLETED:MERCHANT_REFERRAL_BONUS_ID_ASSOCIATION_FAILED
	 *
	 * @Required
	 */
	private String execStatus;
	public String getExecStatus() {
		return execStatus;
	}
	public void setExecStatus(String value) {
		this.execStatus = value;
	}

	/**
	 */
	private String redirectURL;
	public String getRedirectURL() {
		return redirectURL;
	}
	public void setRedirectURL(String value) {
		this.redirectURL = value;
	}

	/**
	 * Identifies a PayPal account. Only premier and business accounts have an accountId
	 */
	private String accountId;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String value) {
		this.accountId = value;
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


	public CreateAccountResponse() {
	}
	public CreateAccountResponse(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "responseEnvelope" + ".timestamp") ) {
			String newPrefix = prefix + "responseEnvelope" + '.';
			this.responseEnvelope =  new ResponseEnvelope(map, newPrefix);
		}
		if( map.containsKey(prefix + "createAccountKey") ) {
			this.createAccountKey = map.get(prefix + "createAccountKey");
		}
		if( map.containsKey(prefix + "execStatus") ) {
			this.execStatus = map.get(prefix + "execStatus");
		}
		if( map.containsKey(prefix + "redirectURL") ) {
			this.redirectURL = map.get(prefix + "redirectURL");
		}
		if( map.containsKey(prefix + "accountId") ) {
			this.accountId = map.get(prefix + "accountId");
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

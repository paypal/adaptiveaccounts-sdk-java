
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
 * Valid values are: FUNDING_SOURCE_ADDED,
 * WEB_URL_VERIFICATION_NEEDED
 */
public class AddBankAccountResponse {

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
	 * Valid values are: FUNDING_SOURCE_ADDED,
	 * WEB_URL_VERIFICATION_NEEDED
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
	 */
	private String fundingSourceKey;
	public String getFundingSourceKey() {
		return fundingSourceKey;
	}
	public void setFundingSourceKey(String value) {
		this.fundingSourceKey = value;
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


	public AddBankAccountResponse() {
	}
	public AddBankAccountResponse(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "responseEnvelope" + ".timestamp") ) {
			String newPrefix = prefix + "responseEnvelope" + '.';
			this.responseEnvelope =  new ResponseEnvelope(map, newPrefix);
		}
		if( map.containsKey(prefix + "execStatus") ) {
			this.execStatus = map.get(prefix + "execStatus");
		}
		if( map.containsKey(prefix + "redirectURL") ) {
			this.redirectURL = map.get(prefix + "redirectURL");
		}
		if( map.containsKey(prefix + "fundingSourceKey") ) {
			this.fundingSourceKey = map.get(prefix + "fundingSourceKey");
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

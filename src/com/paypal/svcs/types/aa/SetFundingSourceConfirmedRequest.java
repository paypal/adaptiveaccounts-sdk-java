
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;


/**
 * Identifying the PayPal account to which this request is targetted to.
 * Caller of this API has to either provided an emailAddress or an accountId.
 */
public class SetFundingSourceConfirmedRequest {

	/**
	 *
	 * @Required
	 */
	private RequestEnvelope requestEnvelope;
	public RequestEnvelope getRequestEnvelope() {
		return requestEnvelope;
	}
	public void setRequestEnvelope(RequestEnvelope value) {
		this.requestEnvelope = value;
	}

	/**
	 * Identifying the PayPal account to which this request is targetted to.
	 * Caller of this API has to either provided an emailAddress or an accountId.
	 */
	private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String value) {
		this.emailAddress = value;
	}

	/**
	 * Identifying the PayPal account to which this request is targetted to.
	 * Caller of this API has to either provided an emailAddress or an accountId.
	 */
	private String accountId;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String value) {
		this.accountId = value;
	}

	/**
	 *
	 * @Required
	 */
	private String fundingSourceKey;
	public String getFundingSourceKey() {
		return fundingSourceKey;
	}
	public void setFundingSourceKey(String value) {
		this.fundingSourceKey = value;
	}


	public SetFundingSourceConfirmedRequest(RequestEnvelope requestEnvelope, String fundingSourceKey) {
		this.requestEnvelope = requestEnvelope;
		this.fundingSourceKey = fundingSourceKey;
	}
	public SetFundingSourceConfirmedRequest() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( requestEnvelope != null ) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(requestEnvelope.toNVPString(newPrefix));
		}
		if( emailAddress != null ) {
			sb.append(prefix).append("emailAddress=").append(NVPUtil.encodeUrl(emailAddress));
			sb.append('&');
		}
		if( accountId != null ) {
			sb.append(prefix).append("accountId=").append(NVPUtil.encodeUrl(accountId));
			sb.append('&');
		}
		if( fundingSourceKey != null ) {
			sb.append(prefix).append("fundingSourceKey=").append(NVPUtil.encodeUrl(fundingSourceKey));
			sb.append('&');
		}
		return sb.toString();
	}

}

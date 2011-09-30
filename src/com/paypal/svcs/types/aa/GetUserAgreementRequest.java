
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;


/**
 */
public class GetUserAgreementRequest {

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
	 */
	private String createAccountKey;
	public String getCreateAccountKey() {
		return createAccountKey;
	}
	public void setCreateAccountKey(String value) {
		this.createAccountKey = value;
	}

	/**
	 */
	private String countryCode;
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String value) {
		this.countryCode = value;
	}

	/**
	 */
	private String languageCode;
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String value) {
		this.languageCode = value;
	}


	public GetUserAgreementRequest(RequestEnvelope requestEnvelope) {
		this.requestEnvelope = requestEnvelope;
	}
	public GetUserAgreementRequest() {
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
		if( createAccountKey != null ) {
			sb.append(prefix).append("createAccountKey=").append(NVPUtil.encodeUrl(createAccountKey));
			sb.append('&');
		}
		if( countryCode != null ) {
			sb.append(prefix).append("countryCode=").append(NVPUtil.encodeUrl(countryCode));
			sb.append('&');
		}
		if( languageCode != null ) {
			sb.append(prefix).append("languageCode=").append(NVPUtil.encodeUrl(languageCode));
			sb.append('&');
		}
		return sb.toString();
	}

}


/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;


/**
 * matchCriteria determines which field(s)
 * in addition to emailAddress is used to
 * locate the account. Currently, we support 
 * matchCriteria of 'NAME' and 'NONE'.
 */
public class GetVerifiedStatusRequest {

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
	 *
	 * @Required
	 */
	private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String value) {
		this.emailAddress = value;
	}

	/**
	 * matchCriteria determines which field(s)
	 * in addition to emailAddress is used to
	 * locate the account. Currently, we support 
	 * matchCriteria of 'NAME' and 'NONE'.
	 *
	 * @Required
	 */
	private String matchCriteria;
	public String getMatchCriteria() {
		return matchCriteria;
	}
	public void setMatchCriteria(String value) {
		this.matchCriteria = value;
	}

	/**
	 * Required if matchCriteria is NAME
	 * Optional if matchCriteria is NONE
	 */
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 * Required if matchCriteria is NAME
	 * Optional if matchCriteria is NONE
	 */
	private String lastName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String value) {
		this.lastName = value;
	}


	public GetVerifiedStatusRequest(RequestEnvelope requestEnvelope, String emailAddress, String matchCriteria) {
		this.requestEnvelope = requestEnvelope;
		this.emailAddress = emailAddress;
		this.matchCriteria = matchCriteria;
	}
	public GetVerifiedStatusRequest() {
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
		if( matchCriteria != null ) {
			sb.append(prefix).append("matchCriteria=").append(NVPUtil.encodeUrl(matchCriteria));
			sb.append('&');
		}
		if( firstName != null ) {
			sb.append(prefix).append("firstName=").append(NVPUtil.encodeUrl(firstName));
			sb.append('&');
		}
		if( lastName != null ) {
			sb.append(prefix).append("lastName=").append(NVPUtil.encodeUrl(lastName));
			sb.append('&');
		}
		return sb.toString();
	}

}

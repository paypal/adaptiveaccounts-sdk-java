
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.core.NVPUtil;
import java.io.UnsupportedEncodingException;


/**
 */
public class WebOptionsType {

	/**
	 */
	private String returnUrl;
	public String getReturnUrl() {
		return returnUrl;
	}
	public void setReturnUrl(String value) {
		this.returnUrl = value;
	}

	/**
	 */
	private String cancelUrl;
	public String getCancelUrl() {
		return cancelUrl;
	}
	public void setCancelUrl(String value) {
		this.cancelUrl = value;
	}

	/**
	 */
	private String returnUrlDescription;
	public String getReturnUrlDescription() {
		return returnUrlDescription;
	}
	public void setReturnUrlDescription(String value) {
		this.returnUrlDescription = value;
	}

	/**
	 */
	private String cancelUrlDescription;
	public String getCancelUrlDescription() {
		return cancelUrlDescription;
	}
	public void setCancelUrlDescription(String value) {
		this.cancelUrlDescription = value;
	}



	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( returnUrl != null ) {
			sb.append(prefix).append("returnUrl=").append(NVPUtil.encodeUrl(returnUrl));
			sb.append('&');
		}
		if( cancelUrl != null ) {
			sb.append(prefix).append("cancelUrl=").append(NVPUtil.encodeUrl(cancelUrl));
			sb.append('&');
		}
		if( returnUrlDescription != null ) {
			sb.append(prefix).append("returnUrlDescription=").append(NVPUtil.encodeUrl(returnUrlDescription));
			sb.append('&');
		}
		if( cancelUrlDescription != null ) {
			sb.append(prefix).append("cancelUrlDescription=").append(NVPUtil.encodeUrl(cancelUrlDescription));
			sb.append('&');
		}
		return sb.toString();
	}

}

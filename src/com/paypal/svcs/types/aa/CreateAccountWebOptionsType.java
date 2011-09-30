
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.core.NVPUtil;
import java.io.UnsupportedEncodingException;


/**
 * Ask end-user to also initiate confirmation of their mobile phone. 
 * This number must be supplied by the API caller (using mobilePhoneNumber)
 * Default=false.
 */
public class CreateAccountWebOptionsType {

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
	private Boolean showAddCreditCard;
	public Boolean getShowAddCreditCard() {
		return showAddCreditCard;
	}
	public void setShowAddCreditCard(Boolean value) {
		this.showAddCreditCard = value;
	}

	/**
	 * Ask end-user to also initiate confirmation of their mobile phone. 
	 * This number must be supplied by the API caller (using mobilePhoneNumber)
	 * Default=false.
	 */
	private Boolean showMobileConfirm;
	public Boolean getShowMobileConfirm() {
		return showMobileConfirm;
	}
	public void setShowMobileConfirm(Boolean value) {
		this.showMobileConfirm = value;
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
	 * If provided, end user will go through a  
	 * single page sign-up flow on a Mini Browser.
	 * If not provided, flow defaults to the 
	 * Multi-page flow that is full size.
	 */
	private Boolean useMiniBrowser;
	public Boolean getUseMiniBrowser() {
		return useMiniBrowser;
	}
	public void setUseMiniBrowser(Boolean value) {
		this.useMiniBrowser = value;
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
		if( showAddCreditCard != null ) {
			sb.append(prefix).append("showAddCreditCard=").append(showAddCreditCard);
			sb.append('&');
		}
		if( showMobileConfirm != null ) {
			sb.append(prefix).append("showMobileConfirm=").append(showMobileConfirm);
			sb.append('&');
		}
		if( returnUrlDescription != null ) {
			sb.append(prefix).append("returnUrlDescription=").append(NVPUtil.encodeUrl(returnUrlDescription));
			sb.append('&');
		}
		if( useMiniBrowser != null ) {
			sb.append(prefix).append("useMiniBrowser=").append(useMiniBrowser);
			sb.append('&');
		}
		return sb.toString();
	}

}

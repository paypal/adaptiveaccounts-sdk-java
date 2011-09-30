
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.core.NVPUtil;
import java.io.UnsupportedEncodingException;


/**
 */
public class AddressType {

	/**
	 *
	 * @Required
	 */
	private String line1;
	public String getLine1() {
		return line1;
	}
	public void setLine1(String value) {
		this.line1 = value;
	}

	/**
	 */
	private String line2;
	public String getLine2() {
		return line2;
	}
	public void setLine2(String value) {
		this.line2 = value;
	}

	/**
	 */
	private String city;
	public String getCity() {
		return city;
	}
	public void setCity(String value) {
		this.city = value;
	}

	/**
	 */
	private String state;
	public String getState() {
		return state;
	}
	public void setState(String value) {
		this.state = value;
	}

	/**
	 */
	private String postalCode;
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String value) {
		this.postalCode = value;
	}

	/**
	 *
	 * @Required
	 */
	private String countryCode;
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String value) {
		this.countryCode = value;
	}


	public AddressType(String line1, String countryCode) {
		this.line1 = line1;
		this.countryCode = countryCode;
	}
	public AddressType() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( line1 != null ) {
			sb.append(prefix).append("line1=").append(NVPUtil.encodeUrl(line1));
			sb.append('&');
		}
		if( line2 != null ) {
			sb.append(prefix).append("line2=").append(NVPUtil.encodeUrl(line2));
			sb.append('&');
		}
		if( city != null ) {
			sb.append(prefix).append("city=").append(NVPUtil.encodeUrl(city));
			sb.append('&');
		}
		if( state != null ) {
			sb.append(prefix).append("state=").append(NVPUtil.encodeUrl(state));
			sb.append('&');
		}
		if( postalCode != null ) {
			sb.append(prefix).append("postalCode=").append(NVPUtil.encodeUrl(postalCode));
			sb.append('&');
		}
		if( countryCode != null ) {
			sb.append(prefix).append("countryCode=").append(NVPUtil.encodeUrl(countryCode));
			sb.append('&');
		}
		return sb.toString();
	}

}

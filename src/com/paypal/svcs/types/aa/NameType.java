
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.core.NVPUtil;
import java.io.UnsupportedEncodingException;
import java.util.Map;


/**
 */
public class NameType {

	/**
	 */
	private String salutation;
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String value) {
		this.salutation = value;
	}

	/**
	 *
	 * @Required
	 */
	private String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 */
	private String middleName;
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String value) {
		this.middleName = value;
	}

	/**
	 *
	 * @Required
	 */
	private String lastName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String value) {
		this.lastName = value;
	}

	/**
	 */
	private String suffix;
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String value) {
		this.suffix = value;
	}


	public NameType(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public NameType() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( salutation != null ) {
			sb.append(prefix).append("salutation=").append(NVPUtil.encodeUrl(salutation));
			sb.append('&');
		}
		if( firstName != null ) {
			sb.append(prefix).append("firstName=").append(NVPUtil.encodeUrl(firstName));
			sb.append('&');
		}
		if( middleName != null ) {
			sb.append(prefix).append("middleName=").append(NVPUtil.encodeUrl(middleName));
			sb.append('&');
		}
		if( lastName != null ) {
			sb.append(prefix).append("lastName=").append(NVPUtil.encodeUrl(lastName));
			sb.append('&');
		}
		if( suffix != null ) {
			sb.append(prefix).append("suffix=").append(NVPUtil.encodeUrl(suffix));
			sb.append('&');
		}
		return sb.toString();
	}

	public NameType(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "salutation") ) {
			this.salutation = map.get(prefix + "salutation");
		}
		if( map.containsKey(prefix + "firstName") ) {
			this.firstName = map.get(prefix + "firstName");
		}
		if( map.containsKey(prefix + "middleName") ) {
			this.middleName = map.get(prefix + "middleName");
		}
		if( map.containsKey(prefix + "lastName") ) {
			this.lastName = map.get(prefix + "lastName");
		}
		if( map.containsKey(prefix + "suffix") ) {
			this.suffix = map.get(prefix + "suffix");
		}
	}
}

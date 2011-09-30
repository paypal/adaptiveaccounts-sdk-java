
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.aa.AddressType;
import com.paypal.svcs.types.aa.NameType;
import com.paypal.svcs.types.aa.StakeholderRoleType;
import java.io.UnsupportedEncodingException;


/**
 * Info about Stakeholders such as partner,
 * beneficial, owner, director etc. 
 */
public class BusinessStakeholderType {

	/**
	 *
	 * @Required
	 */
	private StakeholderRoleType role;
	public StakeholderRoleType getRole() {
		return role;
	}
	public void setRole(StakeholderRoleType value) {
		this.role = value;
	}

	/**
	 */
	private NameType name;
	public NameType getName() {
		return name;
	}
	public void setName(NameType value) {
		this.name = value;
	}

	/**
	 */
	private String fullLegalName;
	public String getFullLegalName() {
		return fullLegalName;
	}
	public void setFullLegalName(String value) {
		this.fullLegalName = value;
	}

	/**
	 */
	private AddressType address;
	public AddressType getAddress() {
		return address;
	}
	public void setAddress(AddressType value) {
		this.address = value;
	}

	/**
	 */
	private String dateOfBirth;
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String value) {
		this.dateOfBirth = value;
	}


	public BusinessStakeholderType(StakeholderRoleType role) {
		this.role = role;
	}
	public BusinessStakeholderType() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( role != null ) {
			sb.append(prefix).append("role=").append(role.getValue());
			sb.append('&');
		}
		if( name != null ) {
			String newPrefix = prefix + "name.";
			sb.append(name.toNVPString(newPrefix));
		}
		if( fullLegalName != null ) {
			sb.append(prefix).append("fullLegalName=").append(NVPUtil.encodeUrl(fullLegalName));
			sb.append('&');
		}
		if( address != null ) {
			String newPrefix = prefix + "address.";
			sb.append(address.toNVPString(newPrefix));
		}
		if( dateOfBirth != null ) {
			sb.append(prefix).append("dateOfBirth=").append(NVPUtil.encodeUrl(dateOfBirth));
			sb.append('&');
		}
		return sb.toString();
	}

}

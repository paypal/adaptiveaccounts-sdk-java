
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.svcs.types.aa.NameType;
import java.util.Map;


/**
 * Info about PayPal user such as emailAddress,
 * accountId, firstName, lastName etc. 
 */
public class UserInfoType {

	/**
	 * Returns emailAddress belonging to PayPal account.
	 */
	private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String value) {
		this.emailAddress = value;
	}

	/**
	 * Valid values are: Personal, Premier, and
	 * Business (not case-sensitive).
	 */
	private String accountType;
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String value) {
		this.accountType = value;
	}

	/**
	 * Identifies a PayPal account. Only premier and business 
	 * accounts have an accountId
	 */
	private String accountId;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String value) {
		this.accountId = value;
	}

	/**
	 * Identifies a PayPal user, like firstName, lastName.
	 */
	private NameType name;
	public NameType getName() {
		return name;
	}
	public void setName(NameType value) {
		this.name = value;
	}

	/**
	 * Business Name of the PayPal account holder.
	 */
	private String businessName;
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String value) {
		this.businessName = value;
	}


	public UserInfoType() {
	}
	public UserInfoType(Map<String, String> map, String prefix) {
		int i=0; 
		if( map.containsKey(prefix + "emailAddress") ) {
			this.emailAddress = map.get(prefix + "emailAddress");
		}
		if( map.containsKey(prefix + "accountType") ) {
			this.accountType = map.get(prefix + "accountType");
		}
		if( map.containsKey(prefix + "accountId") ) {
			this.accountId = map.get(prefix + "accountId");
		}
		if( map.containsKey(prefix + "name" + ".salutation") ) {
			String newPrefix = prefix + "name" + '.';
			this.name =  new NameType(map, newPrefix);
		}
		if( map.containsKey(prefix + "businessName") ) {
			this.businessName = map.get(prefix + "businessName");
		}
	}
}

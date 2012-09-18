package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.aa.NameType;
import java.util.Map;

/**
 * Info about PayPal user such as emailAddress, accountId,
 * firstName, lastName etc. 
 */
public class UserInfoType{


	/**
	 * Returns emailAddress belonging to PayPal account. 	 
	 */ 
	private String emailAddress;

	/**
	 * Valid values are: Personal, Premier, and Business (not
	 * case-sensitive). 	 
	 */ 
	private String accountType;

	/**
	 * Identifies a PayPal account. Only premier and business
	 * accounts have an accountId 	 
	 */ 
	private String accountId;

	/**
	 * Identifies a PayPal user, like firstName, lastName. 	 
	 */ 
	private NameType name;

	/**
	 * Business Name of the PayPal account holder. 	 
	 */ 
	private String businessName;

	

	/**
	 * Default Constructor
	 */
	public UserInfoType (){
	}	

	/**
	 * Getter for emailAddress
	 */
	 public String getEmailAddress() {
	 	return emailAddress;
	 }
	 
	/**
	 * Setter for emailAddress
	 */
	 public void setEmailAddress(String emailAddress) {
	 	this.emailAddress = emailAddress;
	 }
	 
	/**
	 * Getter for accountType
	 */
	 public String getAccountType() {
	 	return accountType;
	 }
	 
	/**
	 * Setter for accountType
	 */
	 public void setAccountType(String accountType) {
	 	this.accountType = accountType;
	 }
	 
	/**
	 * Getter for accountId
	 */
	 public String getAccountId() {
	 	return accountId;
	 }
	 
	/**
	 * Setter for accountId
	 */
	 public void setAccountId(String accountId) {
	 	this.accountId = accountId;
	 }
	 
	/**
	 * Getter for name
	 */
	 public NameType getName() {
	 	return name;
	 }
	 
	/**
	 * Setter for name
	 */
	 public void setName(NameType name) {
	 	this.name = name;
	 }
	 
	/**
	 * Getter for businessName
	 */
	 public String getBusinessName() {
	 	return businessName;
	 }
	 
	/**
	 * Setter for businessName
	 */
	 public void setBusinessName(String businessName) {
	 	this.businessName = businessName;
	 }
	 


	
	public static UserInfoType createInstance(Map<String, String> map, String prefix, int index) {
		UserInfoType userInfoType = null;
		int i = 0;
		if (index != -1) {
				if (!prefix.isEmpty() && !prefix.endsWith(".")) {
					prefix = prefix + "(" + index + ").";
				}
		} else {
			if (!prefix.isEmpty() && !prefix.endsWith(".")) {
				prefix = prefix + ".";
			}
		}
			
		if (map.containsKey(prefix + "emailAddress")) {
				userInfoType = (userInfoType == null) ? new UserInfoType() : userInfoType;
				userInfoType.setEmailAddress(map.get(prefix + "emailAddress"));
		}
		if (map.containsKey(prefix + "accountType")) {
				userInfoType = (userInfoType == null) ? new UserInfoType() : userInfoType;
				userInfoType.setAccountType(map.get(prefix + "accountType"));
		}
		if (map.containsKey(prefix + "accountId")) {
				userInfoType = (userInfoType == null) ? new UserInfoType() : userInfoType;
				userInfoType.setAccountId(map.get(prefix + "accountId"));
		}
		NameType name =  NameType.createInstance(map, prefix + "name", -1);
		if (name != null) {
			userInfoType = (userInfoType == null) ? new UserInfoType() : userInfoType;
			userInfoType.setName(name);
		}
		if (map.containsKey(prefix + "businessName")) {
				userInfoType = (userInfoType == null) ? new UserInfoType() : userInfoType;
				userInfoType.setBusinessName(map.get(prefix + "businessName"));
		}
		return userInfoType;
	}
 
}
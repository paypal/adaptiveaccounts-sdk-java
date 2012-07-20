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
	 


	public UserInfoType(Map<String, String> map, String prefix) {
		int i = 0;
		if(map.containsKey(prefix + "emailAddress")){
			this.emailAddress = map.get(prefix + "emailAddress");
		}
		if(map.containsKey(prefix + "accountType")){
			this.accountType = map.get(prefix + "accountType");
		}
		if(map.containsKey(prefix + "accountId")){
			this.accountId = map.get(prefix + "accountId");
		}
		if(map.containsKey(prefix + "name" + ".firstName")){
			String newPrefix = prefix + "name" + ".";
			this.name =  new NameType(map, newPrefix);
		}
		if(map.containsKey(prefix + "businessName")){
			this.businessName = map.get(prefix + "businessName");
		}
	}

}
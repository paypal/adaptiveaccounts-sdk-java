package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.aa.StakeholderRoleType;
import com.paypal.svcs.types.aa.NameType;
import com.paypal.svcs.types.aa.AddressType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * Info about Stakeholders such as partner, beneficial, owner,
 * director etc. 
 */
public class BusinessStakeholderType{


	/**
	 * 	  
	 *@Required	 
	 */ 
	private StakeholderRoleType role;

	/**
	 * 	 
	 */ 
	private NameType name;

	/**
	 * 	 
	 */ 
	private String fullLegalName;

	/**
	 * 	 
	 */ 
	private AddressType address;

	/**
	 * 	 
	 */ 
	private String dateOfBirth;

	

	/**
	 * Constructor with arguments
	 */
	public BusinessStakeholderType (StakeholderRoleType role){
		this.role = role;
	}	

	/**
	 * Default Constructor
	 */
	public BusinessStakeholderType (){
	}	

	/**
	 * Getter for role
	 */
	 public StakeholderRoleType getRole() {
	 	return role;
	 }
	 
	/**
	 * Setter for role
	 */
	 public void setRole(StakeholderRoleType role) {
	 	this.role = role;
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
	 * Getter for fullLegalName
	 */
	 public String getFullLegalName() {
	 	return fullLegalName;
	 }
	 
	/**
	 * Setter for fullLegalName
	 */
	 public void setFullLegalName(String fullLegalName) {
	 	this.fullLegalName = fullLegalName;
	 }
	 
	/**
	 * Getter for address
	 */
	 public AddressType getAddress() {
	 	return address;
	 }
	 
	/**
	 * Setter for address
	 */
	 public void setAddress(AddressType address) {
	 	this.address = address;
	 }
	 
	/**
	 * Getter for dateOfBirth
	 */
	 public String getDateOfBirth() {
	 	return dateOfBirth;
	 }
	 
	/**
	 * Setter for dateOfBirth
	 */
	 public void setDateOfBirth(String dateOfBirth) {
	 	this.dateOfBirth = dateOfBirth;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (role != null) {
			sb.append(prefix).append("role=").append(role.getValue());
			sb.append("&");
		}
		if (name != null) {
			String newPrefix = prefix + "name.";
			sb.append(name.toNVPString(newPrefix));
		}
		if (fullLegalName != null) {
			sb.append(prefix).append("fullLegalName=").append(NVPUtil.encodeUrl(fullLegalName));
			sb.append("&");
		}
		if (address != null) {
			String newPrefix = prefix + "address.";
			sb.append(address.toNVPString(newPrefix));
		}
		if (dateOfBirth != null) {
			sb.append(prefix).append("dateOfBirth=").append(NVPUtil.encodeUrl(dateOfBirth));
			sb.append("&");
		}
		return sb.toString();
	}

}
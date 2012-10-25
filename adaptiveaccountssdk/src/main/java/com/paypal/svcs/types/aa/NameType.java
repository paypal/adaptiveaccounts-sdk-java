package com.paypal.svcs.types.aa;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;
import java.util.Map;

/**
 * 
 */
public class NameType{


	/**
	 * 	 
	 */ 
	private String salutation;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String firstName;

	/**
	 * 	 
	 */ 
	private String middleName;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String lastName;

	/**
	 * 	 
	 */ 
	private String suffix;

	

	/**
	 * Constructor with arguments
	 */
	public NameType (String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}	

	/**
	 * Default Constructor
	 */
	public NameType (){
	}	

	/**
	 * Getter for salutation
	 */
	 public String getSalutation() {
	 	return salutation;
	 }
	 
	/**
	 * Setter for salutation
	 */
	 public void setSalutation(String salutation) {
	 	this.salutation = salutation;
	 }
	 
	/**
	 * Getter for firstName
	 */
	 public String getFirstName() {
	 	return firstName;
	 }
	 
	/**
	 * Setter for firstName
	 */
	 public void setFirstName(String firstName) {
	 	this.firstName = firstName;
	 }
	 
	/**
	 * Getter for middleName
	 */
	 public String getMiddleName() {
	 	return middleName;
	 }
	 
	/**
	 * Setter for middleName
	 */
	 public void setMiddleName(String middleName) {
	 	this.middleName = middleName;
	 }
	 
	/**
	 * Getter for lastName
	 */
	 public String getLastName() {
	 	return lastName;
	 }
	 
	/**
	 * Setter for lastName
	 */
	 public void setLastName(String lastName) {
	 	this.lastName = lastName;
	 }
	 
	/**
	 * Getter for suffix
	 */
	 public String getSuffix() {
	 	return suffix;
	 }
	 
	/**
	 * Setter for suffix
	 */
	 public void setSuffix(String suffix) {
	 	this.suffix = suffix;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (salutation != null) {
			sb.append(prefix).append("salutation=").append(NVPUtil.encodeUrl(salutation));
			sb.append("&");
		}
		if (firstName != null) {
			sb.append(prefix).append("firstName=").append(NVPUtil.encodeUrl(firstName));
			sb.append("&");
		}
		if (middleName != null) {
			sb.append(prefix).append("middleName=").append(NVPUtil.encodeUrl(middleName));
			sb.append("&");
		}
		if (lastName != null) {
			sb.append(prefix).append("lastName=").append(NVPUtil.encodeUrl(lastName));
			sb.append("&");
		}
		if (suffix != null) {
			sb.append(prefix).append("suffix=").append(NVPUtil.encodeUrl(suffix));
			sb.append("&");
		}
		return sb.toString();
	}
	
	public static NameType createInstance(Map<String, String> map, String prefix, int index) {
		NameType nameType = null;
		int i = 0;
		if (index != -1) {
				if (prefix != null && prefix.length() != 0 && !prefix.endsWith(".")) {
					prefix = prefix + "(" + index + ").";
				}
		} else {
			if (prefix != null && prefix.length() != 0 && !prefix.endsWith(".")) {
				prefix = prefix + ".";
			}
		}
			
		if (map.containsKey(prefix + "salutation")) {
				nameType = (nameType == null) ? new NameType() : nameType;
				nameType.setSalutation(map.get(prefix + "salutation"));
		}
		if (map.containsKey(prefix + "firstName")) {
				nameType = (nameType == null) ? new NameType() : nameType;
				nameType.setFirstName(map.get(prefix + "firstName"));
		}
		if (map.containsKey(prefix + "middleName")) {
				nameType = (nameType == null) ? new NameType() : nameType;
				nameType.setMiddleName(map.get(prefix + "middleName"));
		}
		if (map.containsKey(prefix + "lastName")) {
				nameType = (nameType == null) ? new NameType() : nameType;
				nameType.setLastName(map.get(prefix + "lastName"));
		}
		if (map.containsKey(prefix + "suffix")) {
				nameType = (nameType == null) ? new NameType() : nameType;
				nameType.setSuffix(map.get(prefix + "suffix"));
		}
		return nameType;
	}
 
}
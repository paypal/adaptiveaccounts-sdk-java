package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.aa.NameType;
import com.paypal.svcs.types.aa.AddressType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * Third party type: Individual or Business. 
 */
public class BusinessEntityForThirdPartyType{


	/**
	 * Third party type: Individual or Business. 	 
	 */ 
	private String thirdPartyType;

	/**
	 * If third party is individual, name of the individual. 	 
	 */ 
	private NameType name;

	/**
	 * If third party is individual, date of birth of the
	 * individual. 	 
	 */ 
	private String dateOfBirth;

	/**
	 * Address of third party collecting the data. 	 
	 */ 
	private AddressType address;

	/**
	 * If third party is individual, profession of the individual
	 * representing third party. 	 
	 */ 
	private String profession;

	/**
	 * Relationship with third party, of the individual or the
	 * business. 	 
	 */ 
	private String relationshipWithThirdParty;

	/**
	 * Nature of Business, if third party is a business. 	 
	 */ 
	private String natureOfBusiness;

	/**
	 * Name of Business, if third party is a business. 	 
	 */ 
	private String nameOfBusiness;

	/**
	 * If third party is a business, collect the businessType.
	 * Values: Corporation, Private Company, Public Company,
	 * Partnership, Government Entity, Non-Profit Organization 	 
	 */ 
	private String businessType;

	/**
	 * If third party is a business, collect Incorporation ID. 	 
	 */ 
	private String incorporationId;

	/**
	 * If third party is business, collect place of issue of
	 * Incorporation. 	 
	 */ 
	private String incorporationCountry;

	/**
	 * If third party is business, collect place of issue of
	 * Incorporation. 	 
	 */ 
	private String incorporationState;

	

	/**
	 * Default Constructor
	 */
	public BusinessEntityForThirdPartyType (){
	}	

	/**
	 * Getter for thirdPartyType
	 */
	 public String getThirdPartyType() {
	 	return thirdPartyType;
	 }
	 
	/**
	 * Setter for thirdPartyType
	 */
	 public void setThirdPartyType(String thirdPartyType) {
	 	this.thirdPartyType = thirdPartyType;
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
	 * Getter for profession
	 */
	 public String getProfession() {
	 	return profession;
	 }
	 
	/**
	 * Setter for profession
	 */
	 public void setProfession(String profession) {
	 	this.profession = profession;
	 }
	 
	/**
	 * Getter for relationshipWithThirdParty
	 */
	 public String getRelationshipWithThirdParty() {
	 	return relationshipWithThirdParty;
	 }
	 
	/**
	 * Setter for relationshipWithThirdParty
	 */
	 public void setRelationshipWithThirdParty(String relationshipWithThirdParty) {
	 	this.relationshipWithThirdParty = relationshipWithThirdParty;
	 }
	 
	/**
	 * Getter for natureOfBusiness
	 */
	 public String getNatureOfBusiness() {
	 	return natureOfBusiness;
	 }
	 
	/**
	 * Setter for natureOfBusiness
	 */
	 public void setNatureOfBusiness(String natureOfBusiness) {
	 	this.natureOfBusiness = natureOfBusiness;
	 }
	 
	/**
	 * Getter for nameOfBusiness
	 */
	 public String getNameOfBusiness() {
	 	return nameOfBusiness;
	 }
	 
	/**
	 * Setter for nameOfBusiness
	 */
	 public void setNameOfBusiness(String nameOfBusiness) {
	 	this.nameOfBusiness = nameOfBusiness;
	 }
	 
	/**
	 * Getter for businessType
	 */
	 public String getBusinessType() {
	 	return businessType;
	 }
	 
	/**
	 * Setter for businessType
	 */
	 public void setBusinessType(String businessType) {
	 	this.businessType = businessType;
	 }
	 
	/**
	 * Getter for incorporationId
	 */
	 public String getIncorporationId() {
	 	return incorporationId;
	 }
	 
	/**
	 * Setter for incorporationId
	 */
	 public void setIncorporationId(String incorporationId) {
	 	this.incorporationId = incorporationId;
	 }
	 
	/**
	 * Getter for incorporationCountry
	 */
	 public String getIncorporationCountry() {
	 	return incorporationCountry;
	 }
	 
	/**
	 * Setter for incorporationCountry
	 */
	 public void setIncorporationCountry(String incorporationCountry) {
	 	this.incorporationCountry = incorporationCountry;
	 }
	 
	/**
	 * Getter for incorporationState
	 */
	 public String getIncorporationState() {
	 	return incorporationState;
	 }
	 
	/**
	 * Setter for incorporationState
	 */
	 public void setIncorporationState(String incorporationState) {
	 	this.incorporationState = incorporationState;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (this.thirdPartyType != null) {
			sb.append(prefix).append("thirdPartyType=").append(NVPUtil.encodeUrl(this.thirdPartyType));
			sb.append("&");
		}
		if (this.name != null) {
			String newPrefix = prefix + "name.";
			sb.append(this.name.toNVPString(newPrefix));
		}
		if (this.dateOfBirth != null) {
			sb.append(prefix).append("dateOfBirth=").append(NVPUtil.encodeUrl(this.dateOfBirth));
			sb.append("&");
		}
		if (this.address != null) {
			String newPrefix = prefix + "address.";
			sb.append(this.address.toNVPString(newPrefix));
		}
		if (this.profession != null) {
			sb.append(prefix).append("profession=").append(NVPUtil.encodeUrl(this.profession));
			sb.append("&");
		}
		if (this.relationshipWithThirdParty != null) {
			sb.append(prefix).append("relationshipWithThirdParty=").append(NVPUtil.encodeUrl(this.relationshipWithThirdParty));
			sb.append("&");
		}
		if (this.natureOfBusiness != null) {
			sb.append(prefix).append("natureOfBusiness=").append(NVPUtil.encodeUrl(this.natureOfBusiness));
			sb.append("&");
		}
		if (this.nameOfBusiness != null) {
			sb.append(prefix).append("nameOfBusiness=").append(NVPUtil.encodeUrl(this.nameOfBusiness));
			sb.append("&");
		}
		if (this.businessType != null) {
			sb.append(prefix).append("businessType=").append(NVPUtil.encodeUrl(this.businessType));
			sb.append("&");
		}
		if (this.incorporationId != null) {
			sb.append(prefix).append("incorporationId=").append(NVPUtil.encodeUrl(this.incorporationId));
			sb.append("&");
		}
		if (this.incorporationCountry != null) {
			sb.append(prefix).append("incorporationCountry=").append(NVPUtil.encodeUrl(this.incorporationCountry));
			sb.append("&");
		}
		if (this.incorporationState != null) {
			sb.append(prefix).append("incorporationState=").append(NVPUtil.encodeUrl(this.incorporationState));
			sb.append("&");
		}
		return sb.toString();
	}

}
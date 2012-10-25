package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.common.ClientDetailsType;
import com.paypal.svcs.types.aa.NameType;
import com.paypal.svcs.types.aa.AddressType;
import com.paypal.svcs.types.aa.CreateAccountWebOptionsType;
import com.paypal.svcs.types.aa.BusinessInfoType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * Valid values are: Personal, Premier, and Business. Flag="2"
 * corresponds to java.util.regex.Pattern.CASE_INSENSITIVE,
 * meaning the strings are not case-sensitive 
 */
public class CreateAccountRequest{

	private static final String nameSpace="com.paypal.svcs.types.aa";
	private static final String preferredPrefix="";

	/**
	 * 	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * 	 
	 */ 
	private ClientDetailsType clientDetails;

	/**
	 * Valid values are: Personal, Premier, and Business. Flag="2"
	 * corresponds to java.util.regex.Pattern.CASE_INSENSITIVE,
	 * meaning the strings are not case-sensitive 	 
	 */ 
	private String accountType;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private NameType name;

	/**
	 * 	 
	 */ 
	private String dateOfBirth;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private AddressType address;

	/**
	 * Must provide at least one of contactPhoneNumber,
	 * homePhoneNumber, or mobilePhoneNumber 	 
	 */ 
	private String contactPhoneNumber;

	/**
	 * Must provide at least one of contactPhoneNumber,
	 * homePhoneNumber, or mobilePhoneNumber 	 
	 */ 
	private String homePhoneNumber;

	/**
	 * Must provide at least one of contactPhoneNumber,
	 * homePhoneNumber, or mobilePhoneNumber 	 
	 */ 
	private String mobilePhoneNumber;

	/**
	 * 	 
	 */ 
	private String currencyCode;

	/**
	 * 	 
	 */ 
	private String citizenshipCountryCode;

	/**
	 * 	  
	 *@Required	 
	 */ 
	private String preferredLanguageCode;

	/**
	 * 	 
	 */ 
	private String notificationURL;

	/**
	 * 	 
	 */ 
	private String emailAddress;

	/**
	 * Valid values are: Mobile and Web. Mobile: Returns a key to
	 * complete the registration. Web: Returns a URL to complete
	 * the registration. 	 
	 */ 
	private String registrationType;

	/**
	 * 	 
	 */ 
	private CreateAccountWebOptionsType createAccountWebOptions;

	/**
	 * 	 
	 */ 
	private Boolean suppressWelcomeEmail;

	/**
	 * Set to true if you want this account to undergo extra
	 * vetting by PayPal before becoming usable. 	 
	 */ 
	private Boolean performExtraVettingOnThisAccount;

	/**
	 * tax id, ssn, itin, pan, cpf, acn, abn, etc. 	 
	 */ 
	private String taxId;

	/**
	 * 	 
	 */ 
	private String partnerField1;

	/**
	 * 	 
	 */ 
	private String partnerField2;

	/**
	 * 	 
	 */ 
	private String partnerField3;

	/**
	 * 	 
	 */ 
	private String partnerField4;

	/**
	 * 	 
	 */ 
	private String partnerField5;

	/**
	 * Required for business account creation 	 
	 */ 
	private BusinessInfoType businessInfo;

	

	/**
	 * Constructor with arguments
	 */
	public CreateAccountRequest (RequestEnvelope requestEnvelope, NameType name, AddressType address, String preferredLanguageCode){
		this.requestEnvelope = requestEnvelope;
		this.name = name;
		this.address = address;
		this.preferredLanguageCode = preferredLanguageCode;
	}	

	/**
	 * Default Constructor
	 */
	public CreateAccountRequest (){
	}	

	/**
	 * Getter for requestEnvelope
	 */
	 public RequestEnvelope getRequestEnvelope() {
	 	return requestEnvelope;
	 }
	 
	/**
	 * Setter for requestEnvelope
	 */
	 public void setRequestEnvelope(RequestEnvelope requestEnvelope) {
	 	this.requestEnvelope = requestEnvelope;
	 }
	 
	/**
	 * Getter for clientDetails
	 */
	 public ClientDetailsType getClientDetails() {
	 	return clientDetails;
	 }
	 
	/**
	 * Setter for clientDetails
	 */
	 public void setClientDetails(ClientDetailsType clientDetails) {
	 	this.clientDetails = clientDetails;
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
	 * Getter for contactPhoneNumber
	 */
	 public String getContactPhoneNumber() {
	 	return contactPhoneNumber;
	 }
	 
	/**
	 * Setter for contactPhoneNumber
	 */
	 public void setContactPhoneNumber(String contactPhoneNumber) {
	 	this.contactPhoneNumber = contactPhoneNumber;
	 }
	 
	/**
	 * Getter for homePhoneNumber
	 */
	 public String getHomePhoneNumber() {
	 	return homePhoneNumber;
	 }
	 
	/**
	 * Setter for homePhoneNumber
	 */
	 public void setHomePhoneNumber(String homePhoneNumber) {
	 	this.homePhoneNumber = homePhoneNumber;
	 }
	 
	/**
	 * Getter for mobilePhoneNumber
	 */
	 public String getMobilePhoneNumber() {
	 	return mobilePhoneNumber;
	 }
	 
	/**
	 * Setter for mobilePhoneNumber
	 */
	 public void setMobilePhoneNumber(String mobilePhoneNumber) {
	 	this.mobilePhoneNumber = mobilePhoneNumber;
	 }
	 
	/**
	 * Getter for currencyCode
	 */
	 public String getCurrencyCode() {
	 	return currencyCode;
	 }
	 
	/**
	 * Setter for currencyCode
	 */
	 public void setCurrencyCode(String currencyCode) {
	 	this.currencyCode = currencyCode;
	 }
	 
	/**
	 * Getter for citizenshipCountryCode
	 */
	 public String getCitizenshipCountryCode() {
	 	return citizenshipCountryCode;
	 }
	 
	/**
	 * Setter for citizenshipCountryCode
	 */
	 public void setCitizenshipCountryCode(String citizenshipCountryCode) {
	 	this.citizenshipCountryCode = citizenshipCountryCode;
	 }
	 
	/**
	 * Getter for preferredLanguageCode
	 */
	 public String getPreferredLanguageCode() {
	 	return preferredLanguageCode;
	 }
	 
	/**
	 * Setter for preferredLanguageCode
	 */
	 public void setPreferredLanguageCode(String preferredLanguageCode) {
	 	this.preferredLanguageCode = preferredLanguageCode;
	 }
	 
	/**
	 * Getter for notificationURL
	 */
	 public String getNotificationURL() {
	 	return notificationURL;
	 }
	 
	/**
	 * Setter for notificationURL
	 */
	 public void setNotificationURL(String notificationURL) {
	 	this.notificationURL = notificationURL;
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
	 * Getter for registrationType
	 */
	 public String getRegistrationType() {
	 	return registrationType;
	 }
	 
	/**
	 * Setter for registrationType
	 */
	 public void setRegistrationType(String registrationType) {
	 	this.registrationType = registrationType;
	 }
	 
	/**
	 * Getter for createAccountWebOptions
	 */
	 public CreateAccountWebOptionsType getCreateAccountWebOptions() {
	 	return createAccountWebOptions;
	 }
	 
	/**
	 * Setter for createAccountWebOptions
	 */
	 public void setCreateAccountWebOptions(CreateAccountWebOptionsType createAccountWebOptions) {
	 	this.createAccountWebOptions = createAccountWebOptions;
	 }
	 
	/**
	 * Getter for suppressWelcomeEmail
	 */
	 public Boolean getSuppressWelcomeEmail() {
	 	return suppressWelcomeEmail;
	 }
	 
	/**
	 * Setter for suppressWelcomeEmail
	 */
	 public void setSuppressWelcomeEmail(Boolean suppressWelcomeEmail) {
	 	this.suppressWelcomeEmail = suppressWelcomeEmail;
	 }
	 
	/**
	 * Getter for performExtraVettingOnThisAccount
	 */
	 public Boolean getPerformExtraVettingOnThisAccount() {
	 	return performExtraVettingOnThisAccount;
	 }
	 
	/**
	 * Setter for performExtraVettingOnThisAccount
	 */
	 public void setPerformExtraVettingOnThisAccount(Boolean performExtraVettingOnThisAccount) {
	 	this.performExtraVettingOnThisAccount = performExtraVettingOnThisAccount;
	 }
	 
	/**
	 * Getter for taxId
	 */
	 public String getTaxId() {
	 	return taxId;
	 }
	 
	/**
	 * Setter for taxId
	 */
	 public void setTaxId(String taxId) {
	 	this.taxId = taxId;
	 }
	 
	/**
	 * Getter for partnerField1
	 */
	 public String getPartnerField1() {
	 	return partnerField1;
	 }
	 
	/**
	 * Setter for partnerField1
	 */
	 public void setPartnerField1(String partnerField1) {
	 	this.partnerField1 = partnerField1;
	 }
	 
	/**
	 * Getter for partnerField2
	 */
	 public String getPartnerField2() {
	 	return partnerField2;
	 }
	 
	/**
	 * Setter for partnerField2
	 */
	 public void setPartnerField2(String partnerField2) {
	 	this.partnerField2 = partnerField2;
	 }
	 
	/**
	 * Getter for partnerField3
	 */
	 public String getPartnerField3() {
	 	return partnerField3;
	 }
	 
	/**
	 * Setter for partnerField3
	 */
	 public void setPartnerField3(String partnerField3) {
	 	this.partnerField3 = partnerField3;
	 }
	 
	/**
	 * Getter for partnerField4
	 */
	 public String getPartnerField4() {
	 	return partnerField4;
	 }
	 
	/**
	 * Setter for partnerField4
	 */
	 public void setPartnerField4(String partnerField4) {
	 	this.partnerField4 = partnerField4;
	 }
	 
	/**
	 * Getter for partnerField5
	 */
	 public String getPartnerField5() {
	 	return partnerField5;
	 }
	 
	/**
	 * Setter for partnerField5
	 */
	 public void setPartnerField5(String partnerField5) {
	 	this.partnerField5 = partnerField5;
	 }
	 
	/**
	 * Getter for businessInfo
	 */
	 public BusinessInfoType getBusinessInfo() {
	 	return businessInfo;
	 }
	 
	/**
	 * Setter for businessInfo
	 */
	 public void setBusinessInfo(BusinessInfoType businessInfo) {
	 	this.businessInfo = businessInfo;
	 }
	 


	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}
	
	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if (requestEnvelope != null) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(requestEnvelope.toNVPString(newPrefix));
		}
		if (clientDetails != null) {
			String newPrefix = prefix + "clientDetails.";
			sb.append(clientDetails.toNVPString(newPrefix));
		}
		if (accountType != null) {
			sb.append(prefix).append("accountType=").append(NVPUtil.encodeUrl(accountType));
			sb.append("&");
		}
		if (name != null) {
			String newPrefix = prefix + "name.";
			sb.append(name.toNVPString(newPrefix));
		}
		if (dateOfBirth != null) {
			sb.append(prefix).append("dateOfBirth=").append(NVPUtil.encodeUrl(dateOfBirth));
			sb.append("&");
		}
		if (address != null) {
			String newPrefix = prefix + "address.";
			sb.append(address.toNVPString(newPrefix));
		}
		if (contactPhoneNumber != null) {
			sb.append(prefix).append("contactPhoneNumber=").append(NVPUtil.encodeUrl(contactPhoneNumber));
			sb.append("&");
		}
		if (homePhoneNumber != null) {
			sb.append(prefix).append("homePhoneNumber=").append(NVPUtil.encodeUrl(homePhoneNumber));
			sb.append("&");
		}
		if (mobilePhoneNumber != null) {
			sb.append(prefix).append("mobilePhoneNumber=").append(NVPUtil.encodeUrl(mobilePhoneNumber));
			sb.append("&");
		}
		if (currencyCode != null) {
			sb.append(prefix).append("currencyCode=").append(NVPUtil.encodeUrl(currencyCode));
			sb.append("&");
		}
		if (citizenshipCountryCode != null) {
			sb.append(prefix).append("citizenshipCountryCode=").append(NVPUtil.encodeUrl(citizenshipCountryCode));
			sb.append("&");
		}
		if (preferredLanguageCode != null) {
			sb.append(prefix).append("preferredLanguageCode=").append(NVPUtil.encodeUrl(preferredLanguageCode));
			sb.append("&");
		}
		if (notificationURL != null) {
			sb.append(prefix).append("notificationURL=").append(NVPUtil.encodeUrl(notificationURL));
			sb.append("&");
		}
		if (emailAddress != null) {
			sb.append(prefix).append("emailAddress=").append(NVPUtil.encodeUrl(emailAddress));
			sb.append("&");
		}
		if (registrationType != null) {
			sb.append(prefix).append("registrationType=").append(NVPUtil.encodeUrl(registrationType));
			sb.append("&");
		}
		if (createAccountWebOptions != null) {
			String newPrefix = prefix + "createAccountWebOptions.";
			sb.append(createAccountWebOptions.toNVPString(newPrefix));
		}
		if (suppressWelcomeEmail != null) {
			sb.append(prefix).append("suppressWelcomeEmail=").append(suppressWelcomeEmail);
			sb.append("&");
		}
		if (performExtraVettingOnThisAccount != null) {
			sb.append(prefix).append("performExtraVettingOnThisAccount=").append(performExtraVettingOnThisAccount);
			sb.append("&");
		}
		if (taxId != null) {
			sb.append(prefix).append("taxId=").append(NVPUtil.encodeUrl(taxId));
			sb.append("&");
		}
		if (partnerField1 != null) {
			sb.append(prefix).append("partnerField1=").append(NVPUtil.encodeUrl(partnerField1));
			sb.append("&");
		}
		if (partnerField2 != null) {
			sb.append(prefix).append("partnerField2=").append(NVPUtil.encodeUrl(partnerField2));
			sb.append("&");
		}
		if (partnerField3 != null) {
			sb.append(prefix).append("partnerField3=").append(NVPUtil.encodeUrl(partnerField3));
			sb.append("&");
		}
		if (partnerField4 != null) {
			sb.append(prefix).append("partnerField4=").append(NVPUtil.encodeUrl(partnerField4));
			sb.append("&");
		}
		if (partnerField5 != null) {
			sb.append(prefix).append("partnerField5=").append(NVPUtil.encodeUrl(partnerField5));
			sb.append("&");
		}
		if (businessInfo != null) {
			String newPrefix = prefix + "businessInfo.";
			sb.append(businessInfo.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}
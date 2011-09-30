
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.aa.AddressType;
import com.paypal.svcs.types.aa.BusinessInfoType;
import com.paypal.svcs.types.aa.CreateAccountWebOptionsType;
import com.paypal.svcs.types.aa.NameType;
import com.paypal.svcs.types.common.ClientDetailsType;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;


/**
 * Valid values are: Personal, Premier, and
 * Business. Flag="2" corresponds to
 * java.util.regex.Pattern.CASE_INSENSITIVE,
 * meaning the strings are not
 * case-sensitive
 */
public class CreateAccountRequest {

	/**
	 *
	 * @Required
	 */
	private RequestEnvelope requestEnvelope;
	public RequestEnvelope getRequestEnvelope() {
		return requestEnvelope;
	}
	public void setRequestEnvelope(RequestEnvelope value) {
		this.requestEnvelope = value;
	}

	/**
	 */
	private ClientDetailsType clientDetails;
	public ClientDetailsType getClientDetails() {
		return clientDetails;
	}
	public void setClientDetails(ClientDetailsType value) {
		this.clientDetails = value;
	}

	/**
	 * Valid values are: Personal, Premier, and
	 * Business. Flag="2" corresponds to
	 * java.util.regex.Pattern.CASE_INSENSITIVE,
	 * meaning the strings are not
	 * case-sensitive
	 */
	private String accountType;
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String value) {
		this.accountType = value;
	}

	/**
	 *
	 * @Required
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
	private String dateOfBirth;
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String value) {
		this.dateOfBirth = value;
	}

	/**
	 *
	 * @Required
	 */
	private AddressType address;
	public AddressType getAddress() {
		return address;
	}
	public void setAddress(AddressType value) {
		this.address = value;
	}

	/**
	 * Must provide at least one of contactPhoneNumber, homePhoneNumber, or mobilePhoneNumber
	 */
	private String contactPhoneNumber;
	public String getContactPhoneNumber() {
		return contactPhoneNumber;
	}
	public void setContactPhoneNumber(String value) {
		this.contactPhoneNumber = value;
	}

	/**
	 * Must provide at least one of contactPhoneNumber, homePhoneNumber, or mobilePhoneNumber
	 */
	private String homePhoneNumber;
	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}
	public void setHomePhoneNumber(String value) {
		this.homePhoneNumber = value;
	}

	/**
	 * Must provide at least one of contactPhoneNumber, homePhoneNumber, or mobilePhoneNumber
	 */
	private String mobilePhoneNumber;
	public String getMobilePhoneNumber() {
		return mobilePhoneNumber;
	}
	public void setMobilePhoneNumber(String value) {
		this.mobilePhoneNumber = value;
	}

	/**
	 */
	private String currencyCode;
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String value) {
		this.currencyCode = value;
	}

	/**
	 */
	private String citizenshipCountryCode;
	public String getCitizenshipCountryCode() {
		return citizenshipCountryCode;
	}
	public void setCitizenshipCountryCode(String value) {
		this.citizenshipCountryCode = value;
	}

	/**
	 *
	 * @Required
	 */
	private String preferredLanguageCode;
	public String getPreferredLanguageCode() {
		return preferredLanguageCode;
	}
	public void setPreferredLanguageCode(String value) {
		this.preferredLanguageCode = value;
	}

	/**
	 */
	private String notificationURL;
	public String getNotificationURL() {
		return notificationURL;
	}
	public void setNotificationURL(String value) {
		this.notificationURL = value;
	}

	/**
	 */
	private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String value) {
		this.emailAddress = value;
	}

	/**
	 * Valid values are: Mobile and Web.
	 * Mobile: Returns a key to complete the
	 * registration. Web: Returns a URL to
	 * complete the registration.
	 */
	private String registrationType;
	public String getRegistrationType() {
		return registrationType;
	}
	public void setRegistrationType(String value) {
		this.registrationType = value;
	}

	/**
	 */
	private CreateAccountWebOptionsType createAccountWebOptions;
	public CreateAccountWebOptionsType getCreateAccountWebOptions() {
		return createAccountWebOptions;
	}
	public void setCreateAccountWebOptions(CreateAccountWebOptionsType value) {
		this.createAccountWebOptions = value;
	}

	/**
	 */
	private Boolean suppressWelcomeEmail;
	public Boolean getSuppressWelcomeEmail() {
		return suppressWelcomeEmail;
	}
	public void setSuppressWelcomeEmail(Boolean value) {
		this.suppressWelcomeEmail = value;
	}

	/**
	 * Set to true if you want this account to undergo extra vetting by PayPal
	 * before becoming usable. 
	 */
	private Boolean performExtraVettingOnThisAccount;
	public Boolean getPerformExtraVettingOnThisAccount() {
		return performExtraVettingOnThisAccount;
	}
	public void setPerformExtraVettingOnThisAccount(Boolean value) {
		this.performExtraVettingOnThisAccount = value;
	}

	/**
	 */
	private String partnerField1;
	public String getPartnerField1() {
		return partnerField1;
	}
	public void setPartnerField1(String value) {
		this.partnerField1 = value;
	}

	/**
	 */
	private String partnerField2;
	public String getPartnerField2() {
		return partnerField2;
	}
	public void setPartnerField2(String value) {
		this.partnerField2 = value;
	}

	/**
	 */
	private String partnerField3;
	public String getPartnerField3() {
		return partnerField3;
	}
	public void setPartnerField3(String value) {
		this.partnerField3 = value;
	}

	/**
	 */
	private String partnerField4;
	public String getPartnerField4() {
		return partnerField4;
	}
	public void setPartnerField4(String value) {
		this.partnerField4 = value;
	}

	/**
	 */
	private String partnerField5;
	public String getPartnerField5() {
		return partnerField5;
	}
	public void setPartnerField5(String value) {
		this.partnerField5 = value;
	}

	/**
	 * Required for business account creation
	 */
	private BusinessInfoType businessInfo;
	public BusinessInfoType getBusinessInfo() {
		return businessInfo;
	}
	public void setBusinessInfo(BusinessInfoType value) {
		this.businessInfo = value;
	}


	public CreateAccountRequest(RequestEnvelope requestEnvelope, NameType name, AddressType address, String preferredLanguageCode) {
		this.requestEnvelope = requestEnvelope;
		this.name = name;
		this.address = address;
		this.preferredLanguageCode = preferredLanguageCode;
	}
	public CreateAccountRequest() {
	}

	public String toNVPString() throws UnsupportedEncodingException {
		return toNVPString("");
	}

	public String toNVPString(String prefix) throws UnsupportedEncodingException {
		StringBuilder sb = new StringBuilder();
		if( requestEnvelope != null ) {
			String newPrefix = prefix + "requestEnvelope.";
			sb.append(requestEnvelope.toNVPString(newPrefix));
		}
		if( clientDetails != null ) {
			String newPrefix = prefix + "clientDetails.";
			sb.append(clientDetails.toNVPString(newPrefix));
		}
		if( accountType != null ) {
			sb.append(prefix).append("accountType=").append(NVPUtil.encodeUrl(accountType));
			sb.append('&');
		}
		if( name != null ) {
			String newPrefix = prefix + "name.";
			sb.append(name.toNVPString(newPrefix));
		}
		if( dateOfBirth != null ) {
			sb.append(prefix).append("dateOfBirth=").append(NVPUtil.encodeUrl(dateOfBirth));
			sb.append('&');
		}
		if( address != null ) {
			String newPrefix = prefix + "address.";
			sb.append(address.toNVPString(newPrefix));
		}
		if( contactPhoneNumber != null ) {
			sb.append(prefix).append("contactPhoneNumber=").append(NVPUtil.encodeUrl(contactPhoneNumber));
			sb.append('&');
		}
		if( homePhoneNumber != null ) {
			sb.append(prefix).append("homePhoneNumber=").append(NVPUtil.encodeUrl(homePhoneNumber));
			sb.append('&');
		}
		if( mobilePhoneNumber != null ) {
			sb.append(prefix).append("mobilePhoneNumber=").append(NVPUtil.encodeUrl(mobilePhoneNumber));
			sb.append('&');
		}
		if( currencyCode != null ) {
			sb.append(prefix).append("currencyCode=").append(NVPUtil.encodeUrl(currencyCode));
			sb.append('&');
		}
		if( citizenshipCountryCode != null ) {
			sb.append(prefix).append("citizenshipCountryCode=").append(NVPUtil.encodeUrl(citizenshipCountryCode));
			sb.append('&');
		}
		if( preferredLanguageCode != null ) {
			sb.append(prefix).append("preferredLanguageCode=").append(NVPUtil.encodeUrl(preferredLanguageCode));
			sb.append('&');
		}
		if( notificationURL != null ) {
			sb.append(prefix).append("notificationURL=").append(NVPUtil.encodeUrl(notificationURL));
			sb.append('&');
		}
		if( emailAddress != null ) {
			sb.append(prefix).append("emailAddress=").append(NVPUtil.encodeUrl(emailAddress));
			sb.append('&');
		}
		if( registrationType != null ) {
			sb.append(prefix).append("registrationType=").append(NVPUtil.encodeUrl(registrationType));
			sb.append('&');
		}
		if( createAccountWebOptions != null ) {
			String newPrefix = prefix + "createAccountWebOptions.";
			sb.append(createAccountWebOptions.toNVPString(newPrefix));
		}
		if( suppressWelcomeEmail != null ) {
			sb.append(prefix).append("suppressWelcomeEmail=").append(suppressWelcomeEmail);
			sb.append('&');
		}
		if( performExtraVettingOnThisAccount != null ) {
			sb.append(prefix).append("performExtraVettingOnThisAccount=").append(performExtraVettingOnThisAccount);
			sb.append('&');
		}
		if( partnerField1 != null ) {
			sb.append(prefix).append("partnerField1=").append(NVPUtil.encodeUrl(partnerField1));
			sb.append('&');
		}
		if( partnerField2 != null ) {
			sb.append(prefix).append("partnerField2=").append(NVPUtil.encodeUrl(partnerField2));
			sb.append('&');
		}
		if( partnerField3 != null ) {
			sb.append(prefix).append("partnerField3=").append(NVPUtil.encodeUrl(partnerField3));
			sb.append('&');
		}
		if( partnerField4 != null ) {
			sb.append(prefix).append("partnerField4=").append(NVPUtil.encodeUrl(partnerField4));
			sb.append('&');
		}
		if( partnerField5 != null ) {
			sb.append(prefix).append("partnerField5=").append(NVPUtil.encodeUrl(partnerField5));
			sb.append('&');
		}
		if( businessInfo != null ) {
			String newPrefix = prefix + "businessInfo.";
			sb.append(businessInfo.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}

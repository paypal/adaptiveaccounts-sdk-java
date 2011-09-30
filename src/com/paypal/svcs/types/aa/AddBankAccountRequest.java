
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.aa.BankAccountType;
import com.paypal.svcs.types.aa.ConfirmationType;
import com.paypal.svcs.types.aa.WebOptionsType;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;


/**
 * Identifying the PayPal account to which this request is targetted to.
 * Caller of this API has to either provided an emailAddress or an accountId.
 */
public class AddBankAccountRequest {

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
	 * Identifying the PayPal account to which this request is targetted to.
	 * Caller of this API has to either provided an emailAddress or an accountId.
	 */
	private String emailAddress;
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String value) {
		this.emailAddress = value;
	}

	/**
	 * Identifying the PayPal account to which this request is targetted to.
	 * Caller of this API has to either provided an emailAddress or an accountId.
	 */
	private String accountId;
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String value) {
		this.accountId = value;
	}

	/**
	 */
	private String createAccountKey;
	public String getCreateAccountKey() {
		return createAccountKey;
	}
	public void setCreateAccountKey(String value) {
		this.createAccountKey = value;
	}

	/**
	 * Country code for the bank
	 *
	 * @Required
	 */
	private String bankCountryCode;
	public String getBankCountryCode() {
		return bankCountryCode;
	}
	public void setBankCountryCode(String value) {
		this.bankCountryCode = value;
	}

	/**
	 * The defualt value is UNKNOWN.
	 */
	private String bankName;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String value) {
		this.bankName = value;
	}

	/**
	 * Bank routing or transit number
	 */
	private String routingNumber;
	public String getRoutingNumber() {
		return routingNumber;
	}
	public void setRoutingNumber(String value) {
		this.routingNumber = value;
	}

	/**
	 */
	private BankAccountType bankAccountType;
	public BankAccountType getBankAccountType() {
		return bankAccountType;
	}
	public void setBankAccountType(BankAccountType value) {
		this.bankAccountType = value;
	}

	/**
	 * Basic Bank Account Number (BBAN)
	 */
	private String bankAccountNumber;
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String value) {
		this.bankAccountNumber = value;
	}

	/**
	 * International Bank Account Number (IBAN)
	 */
	private String iban;
	public String getIban() {
		return iban;
	}
	public void setIban(String value) {
		this.iban = value;
	}

	/**
	 * CLABE represents the bank information for countries like Mexico
	 */
	private String clabe;
	public String getClabe() {
		return clabe;
	}
	public void setClabe(String value) {
		this.clabe = value;
	}

	/**
	 * Bank/State/Branch number
	 */
	private String bsbNumber;
	public String getBsbNumber() {
		return bsbNumber;
	}
	public void setBsbNumber(String value) {
		this.bsbNumber = value;
	}

	/**
	 * Branch location
	 */
	private String branchLocation;
	public String getBranchLocation() {
		return branchLocation;
	}
	public void setBranchLocation(String value) {
		this.branchLocation = value;
	}

	/**
	 * Branch sort code.
	 */
	private String sortCode;
	public String getSortCode() {
		return sortCode;
	}
	public void setSortCode(String value) {
		this.sortCode = value;
	}

	/**
	 * Bank transit number
	 */
	private String bankTransitNumber;
	public String getBankTransitNumber() {
		return bankTransitNumber;
	}
	public void setBankTransitNumber(String value) {
		this.bankTransitNumber = value;
	}

	/**
	 * Institution number
	 */
	private String institutionNumber;
	public String getInstitutionNumber() {
		return institutionNumber;
	}
	public void setInstitutionNumber(String value) {
		this.institutionNumber = value;
	}

	/**
	 * Branch code
	 */
	private String branchCode;
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String value) {
		this.branchCode = value;
	}

	/**
	 * For Brazil Agency Number
	 */
	private String agencyNumber;
	public String getAgencyNumber() {
		return agencyNumber;
	}
	public void setAgencyNumber(String value) {
		this.agencyNumber = value;
	}

	/**
	 * Bank code
	 */
	private String bankCode;
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String value) {
		this.bankCode = value;
	}

	/**
	 * RIB key 
	 */
	private String ribKey;
	public String getRibKey() {
		return ribKey;
	}
	public void setRibKey(String value) {
		this.ribKey = value;
	}

	/**
	 * control digits
	 */
	private String controlDigit;
	public String getControlDigit() {
		return controlDigit;
	}
	public void setControlDigit(String value) {
		this.controlDigit = value;
	}

	/**
	 * Tax id type of CNPJ or CPF, only supported for Brazil.
	 */
	private String taxIdType;
	public String getTaxIdType() {
		return taxIdType;
	}
	public void setTaxIdType(String value) {
		this.taxIdType = value;
	}

	/**
	 * Tax id number for Brazil.
	 */
	private String taxIdNumber;
	public String getTaxIdNumber() {
		return taxIdNumber;
	}
	public void setTaxIdNumber(String value) {
		this.taxIdNumber = value;
	}

	/**
	 * Date of birth of the account holder
	 */
	private String accountHolderDateOfBirth;
	public String getAccountHolderDateOfBirth() {
		return accountHolderDateOfBirth;
	}
	public void setAccountHolderDateOfBirth(String value) {
		this.accountHolderDateOfBirth = value;
	}

	/**
	 *
	 * @Required
	 */
	private ConfirmationType confirmationType;
	public ConfirmationType getConfirmationType() {
		return confirmationType;
	}
	public void setConfirmationType(ConfirmationType value) {
		this.confirmationType = value;
	}

	/**
	 */
	private WebOptionsType webOptions;
	public WebOptionsType getWebOptions() {
		return webOptions;
	}
	public void setWebOptions(WebOptionsType value) {
		this.webOptions = value;
	}


	public AddBankAccountRequest(RequestEnvelope requestEnvelope, String bankCountryCode, ConfirmationType confirmationType) {
		this.requestEnvelope = requestEnvelope;
		this.bankCountryCode = bankCountryCode;
		this.confirmationType = confirmationType;
	}
	public AddBankAccountRequest() {
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
		if( emailAddress != null ) {
			sb.append(prefix).append("emailAddress=").append(NVPUtil.encodeUrl(emailAddress));
			sb.append('&');
		}
		if( accountId != null ) {
			sb.append(prefix).append("accountId=").append(NVPUtil.encodeUrl(accountId));
			sb.append('&');
		}
		if( createAccountKey != null ) {
			sb.append(prefix).append("createAccountKey=").append(NVPUtil.encodeUrl(createAccountKey));
			sb.append('&');
		}
		if( bankCountryCode != null ) {
			sb.append(prefix).append("bankCountryCode=").append(NVPUtil.encodeUrl(bankCountryCode));
			sb.append('&');
		}
		if( bankName != null ) {
			sb.append(prefix).append("bankName=").append(NVPUtil.encodeUrl(bankName));
			sb.append('&');
		}
		if( routingNumber != null ) {
			sb.append(prefix).append("routingNumber=").append(NVPUtil.encodeUrl(routingNumber));
			sb.append('&');
		}
		if( bankAccountType != null ) {
			sb.append(prefix).append("bankAccountType=").append(bankAccountType.getValue());
			sb.append('&');
		}
		if( bankAccountNumber != null ) {
			sb.append(prefix).append("bankAccountNumber=").append(NVPUtil.encodeUrl(bankAccountNumber));
			sb.append('&');
		}
		if( iban != null ) {
			sb.append(prefix).append("iban=").append(NVPUtil.encodeUrl(iban));
			sb.append('&');
		}
		if( clabe != null ) {
			sb.append(prefix).append("clabe=").append(NVPUtil.encodeUrl(clabe));
			sb.append('&');
		}
		if( bsbNumber != null ) {
			sb.append(prefix).append("bsbNumber=").append(NVPUtil.encodeUrl(bsbNumber));
			sb.append('&');
		}
		if( branchLocation != null ) {
			sb.append(prefix).append("branchLocation=").append(NVPUtil.encodeUrl(branchLocation));
			sb.append('&');
		}
		if( sortCode != null ) {
			sb.append(prefix).append("sortCode=").append(NVPUtil.encodeUrl(sortCode));
			sb.append('&');
		}
		if( bankTransitNumber != null ) {
			sb.append(prefix).append("bankTransitNumber=").append(NVPUtil.encodeUrl(bankTransitNumber));
			sb.append('&');
		}
		if( institutionNumber != null ) {
			sb.append(prefix).append("institutionNumber=").append(NVPUtil.encodeUrl(institutionNumber));
			sb.append('&');
		}
		if( branchCode != null ) {
			sb.append(prefix).append("branchCode=").append(NVPUtil.encodeUrl(branchCode));
			sb.append('&');
		}
		if( agencyNumber != null ) {
			sb.append(prefix).append("agencyNumber=").append(NVPUtil.encodeUrl(agencyNumber));
			sb.append('&');
		}
		if( bankCode != null ) {
			sb.append(prefix).append("bankCode=").append(NVPUtil.encodeUrl(bankCode));
			sb.append('&');
		}
		if( ribKey != null ) {
			sb.append(prefix).append("ribKey=").append(NVPUtil.encodeUrl(ribKey));
			sb.append('&');
		}
		if( controlDigit != null ) {
			sb.append(prefix).append("controlDigit=").append(NVPUtil.encodeUrl(controlDigit));
			sb.append('&');
		}
		if( taxIdType != null ) {
			sb.append(prefix).append("taxIdType=").append(NVPUtil.encodeUrl(taxIdType));
			sb.append('&');
		}
		if( taxIdNumber != null ) {
			sb.append(prefix).append("taxIdNumber=").append(NVPUtil.encodeUrl(taxIdNumber));
			sb.append('&');
		}
		if( accountHolderDateOfBirth != null ) {
			sb.append(prefix).append("accountHolderDateOfBirth=").append(NVPUtil.encodeUrl(accountHolderDateOfBirth));
			sb.append('&');
		}
		if( confirmationType != null ) {
			sb.append(prefix).append("confirmationType=").append(confirmationType.getValue());
			sb.append('&');
		}
		if( webOptions != null ) {
			String newPrefix = prefix + "webOptions.";
			sb.append(webOptions.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}

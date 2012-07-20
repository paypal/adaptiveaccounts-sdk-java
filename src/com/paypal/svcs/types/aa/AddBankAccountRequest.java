package com.paypal.svcs.types.aa;
import com.paypal.svcs.types.common.RequestEnvelope;
import com.paypal.svcs.types.aa.BankAccountType;
import com.paypal.svcs.types.aa.ConfirmationType;
import com.paypal.svcs.types.aa.WebOptionsType;
import java.io.UnsupportedEncodingException;
import com.paypal.core.NVPUtil;

/**
 * Identifying the PayPal account to which this request is
 * targetted to. Caller of this API has to either provided an
 * emailAddress or an accountId. 
 */
public class AddBankAccountRequest{


	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private RequestEnvelope requestEnvelope;

	/**
	 * Identifying the PayPal account to which this request is
	 * targetted to. Caller of this API has to either provided an
	 * emailAddress or an accountId. 	 
	 */ 
	private String emailAddress;

	/**
	 * Identifying the PayPal account to which this request is
	 * targetted to. Caller of this API has to either provided an
	 * emailAddress or an accountId. 	 
	 */ 
	private String accountId;

	/**
	 * No Document Comments	 
	 */ 
	private String createAccountKey;

	/**
	 * Country code for the bank 	  
	 *@Required	 
	 */ 
	private String bankCountryCode;

	/**
	 * The defualt value is UNKNOWN. 	 
	 */ 
	private String bankName;

	/**
	 * Bank routing or transit number 	 
	 */ 
	private String routingNumber;

	/**
	 * No Document Comments	 
	 */ 
	private BankAccountType bankAccountType;

	/**
	 * Basic Bank Account Number (BBAN) 	 
	 */ 
	private String bankAccountNumber;

	/**
	 * International Bank Account Number (IBAN) 	 
	 */ 
	private String iban;

	/**
	 * CLABE represents the bank information for countries like
	 * Mexico 	 
	 */ 
	private String clabe;

	/**
	 * Bank/State/Branch number 	 
	 */ 
	private String bsbNumber;

	/**
	 * Branch location 	 
	 */ 
	private String branchLocation;

	/**
	 * Branch sort code. 	 
	 */ 
	private String sortCode;

	/**
	 * Bank transit number 	 
	 */ 
	private String bankTransitNumber;

	/**
	 * Institution number 	 
	 */ 
	private String institutionNumber;

	/**
	 * Branch code 	 
	 */ 
	private String branchCode;

	/**
	 * For Brazil Agency Number 	 
	 */ 
	private String agencyNumber;

	/**
	 * Bank code 	 
	 */ 
	private String bankCode;

	/**
	 * RIB key 	 
	 */ 
	private String ribKey;

	/**
	 * control digits 	 
	 */ 
	private String controlDigit;

	/**
	 * Tax id type of CNPJ or CPF, only supported for Brazil. 	 
	 */ 
	private String taxIdType;

	/**
	 * Tax id number for Brazil. 	 
	 */ 
	private String taxIdNumber;

	/**
	 * Date of birth of the account holder 	 
	 */ 
	private String accountHolderDateOfBirth;

	/**
	 * No Document Comments	  
	 *@Required	 
	 */ 
	private ConfirmationType confirmationType;

	/**
	 * No Document Comments	 
	 */ 
	private WebOptionsType webOptions;

	

	/**
	 * Constructor with arguments
	 */
	public AddBankAccountRequest (RequestEnvelope requestEnvelope, String bankCountryCode, ConfirmationType confirmationType){
		this.requestEnvelope = requestEnvelope;
		this.bankCountryCode = bankCountryCode;
		this.confirmationType = confirmationType;
	}	

	/**
	 * Default Constructor
	 */
	public AddBankAccountRequest (){
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
	 * Getter for createAccountKey
	 */
	 public String getCreateAccountKey() {
	 	return createAccountKey;
	 }
	 
	/**
	 * Setter for createAccountKey
	 */
	 public void setCreateAccountKey(String createAccountKey) {
	 	this.createAccountKey = createAccountKey;
	 }
	 
	/**
	 * Getter for bankCountryCode
	 */
	 public String getBankCountryCode() {
	 	return bankCountryCode;
	 }
	 
	/**
	 * Setter for bankCountryCode
	 */
	 public void setBankCountryCode(String bankCountryCode) {
	 	this.bankCountryCode = bankCountryCode;
	 }
	 
	/**
	 * Getter for bankName
	 */
	 public String getBankName() {
	 	return bankName;
	 }
	 
	/**
	 * Setter for bankName
	 */
	 public void setBankName(String bankName) {
	 	this.bankName = bankName;
	 }
	 
	/**
	 * Getter for routingNumber
	 */
	 public String getRoutingNumber() {
	 	return routingNumber;
	 }
	 
	/**
	 * Setter for routingNumber
	 */
	 public void setRoutingNumber(String routingNumber) {
	 	this.routingNumber = routingNumber;
	 }
	 
	/**
	 * Getter for bankAccountType
	 */
	 public BankAccountType getBankAccountType() {
	 	return bankAccountType;
	 }
	 
	/**
	 * Setter for bankAccountType
	 */
	 public void setBankAccountType(BankAccountType bankAccountType) {
	 	this.bankAccountType = bankAccountType;
	 }
	 
	/**
	 * Getter for bankAccountNumber
	 */
	 public String getBankAccountNumber() {
	 	return bankAccountNumber;
	 }
	 
	/**
	 * Setter for bankAccountNumber
	 */
	 public void setBankAccountNumber(String bankAccountNumber) {
	 	this.bankAccountNumber = bankAccountNumber;
	 }
	 
	/**
	 * Getter for iban
	 */
	 public String getIban() {
	 	return iban;
	 }
	 
	/**
	 * Setter for iban
	 */
	 public void setIban(String iban) {
	 	this.iban = iban;
	 }
	 
	/**
	 * Getter for clabe
	 */
	 public String getClabe() {
	 	return clabe;
	 }
	 
	/**
	 * Setter for clabe
	 */
	 public void setClabe(String clabe) {
	 	this.clabe = clabe;
	 }
	 
	/**
	 * Getter for bsbNumber
	 */
	 public String getBsbNumber() {
	 	return bsbNumber;
	 }
	 
	/**
	 * Setter for bsbNumber
	 */
	 public void setBsbNumber(String bsbNumber) {
	 	this.bsbNumber = bsbNumber;
	 }
	 
	/**
	 * Getter for branchLocation
	 */
	 public String getBranchLocation() {
	 	return branchLocation;
	 }
	 
	/**
	 * Setter for branchLocation
	 */
	 public void setBranchLocation(String branchLocation) {
	 	this.branchLocation = branchLocation;
	 }
	 
	/**
	 * Getter for sortCode
	 */
	 public String getSortCode() {
	 	return sortCode;
	 }
	 
	/**
	 * Setter for sortCode
	 */
	 public void setSortCode(String sortCode) {
	 	this.sortCode = sortCode;
	 }
	 
	/**
	 * Getter for bankTransitNumber
	 */
	 public String getBankTransitNumber() {
	 	return bankTransitNumber;
	 }
	 
	/**
	 * Setter for bankTransitNumber
	 */
	 public void setBankTransitNumber(String bankTransitNumber) {
	 	this.bankTransitNumber = bankTransitNumber;
	 }
	 
	/**
	 * Getter for institutionNumber
	 */
	 public String getInstitutionNumber() {
	 	return institutionNumber;
	 }
	 
	/**
	 * Setter for institutionNumber
	 */
	 public void setInstitutionNumber(String institutionNumber) {
	 	this.institutionNumber = institutionNumber;
	 }
	 
	/**
	 * Getter for branchCode
	 */
	 public String getBranchCode() {
	 	return branchCode;
	 }
	 
	/**
	 * Setter for branchCode
	 */
	 public void setBranchCode(String branchCode) {
	 	this.branchCode = branchCode;
	 }
	 
	/**
	 * Getter for agencyNumber
	 */
	 public String getAgencyNumber() {
	 	return agencyNumber;
	 }
	 
	/**
	 * Setter for agencyNumber
	 */
	 public void setAgencyNumber(String agencyNumber) {
	 	this.agencyNumber = agencyNumber;
	 }
	 
	/**
	 * Getter for bankCode
	 */
	 public String getBankCode() {
	 	return bankCode;
	 }
	 
	/**
	 * Setter for bankCode
	 */
	 public void setBankCode(String bankCode) {
	 	this.bankCode = bankCode;
	 }
	 
	/**
	 * Getter for ribKey
	 */
	 public String getRibKey() {
	 	return ribKey;
	 }
	 
	/**
	 * Setter for ribKey
	 */
	 public void setRibKey(String ribKey) {
	 	this.ribKey = ribKey;
	 }
	 
	/**
	 * Getter for controlDigit
	 */
	 public String getControlDigit() {
	 	return controlDigit;
	 }
	 
	/**
	 * Setter for controlDigit
	 */
	 public void setControlDigit(String controlDigit) {
	 	this.controlDigit = controlDigit;
	 }
	 
	/**
	 * Getter for taxIdType
	 */
	 public String getTaxIdType() {
	 	return taxIdType;
	 }
	 
	/**
	 * Setter for taxIdType
	 */
	 public void setTaxIdType(String taxIdType) {
	 	this.taxIdType = taxIdType;
	 }
	 
	/**
	 * Getter for taxIdNumber
	 */
	 public String getTaxIdNumber() {
	 	return taxIdNumber;
	 }
	 
	/**
	 * Setter for taxIdNumber
	 */
	 public void setTaxIdNumber(String taxIdNumber) {
	 	this.taxIdNumber = taxIdNumber;
	 }
	 
	/**
	 * Getter for accountHolderDateOfBirth
	 */
	 public String getAccountHolderDateOfBirth() {
	 	return accountHolderDateOfBirth;
	 }
	 
	/**
	 * Setter for accountHolderDateOfBirth
	 */
	 public void setAccountHolderDateOfBirth(String accountHolderDateOfBirth) {
	 	this.accountHolderDateOfBirth = accountHolderDateOfBirth;
	 }
	 
	/**
	 * Getter for confirmationType
	 */
	 public ConfirmationType getConfirmationType() {
	 	return confirmationType;
	 }
	 
	/**
	 * Setter for confirmationType
	 */
	 public void setConfirmationType(ConfirmationType confirmationType) {
	 	this.confirmationType = confirmationType;
	 }
	 
	/**
	 * Getter for webOptions
	 */
	 public WebOptionsType getWebOptions() {
	 	return webOptions;
	 }
	 
	/**
	 * Setter for webOptions
	 */
	 public void setWebOptions(WebOptionsType webOptions) {
	 	this.webOptions = webOptions;
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
		if (emailAddress != null) {
			sb.append(prefix).append("emailAddress=").append(NVPUtil.encodeUrl(emailAddress));
			sb.append("&");
		}
		if (accountId != null) {
			sb.append(prefix).append("accountId=").append(NVPUtil.encodeUrl(accountId));
			sb.append("&");
		}
		if (createAccountKey != null) {
			sb.append(prefix).append("createAccountKey=").append(NVPUtil.encodeUrl(createAccountKey));
			sb.append("&");
		}
		if (bankCountryCode != null) {
			sb.append(prefix).append("bankCountryCode=").append(NVPUtil.encodeUrl(bankCountryCode));
			sb.append("&");
		}
		if (bankName != null) {
			sb.append(prefix).append("bankName=").append(NVPUtil.encodeUrl(bankName));
			sb.append("&");
		}
		if (routingNumber != null) {
			sb.append(prefix).append("routingNumber=").append(NVPUtil.encodeUrl(routingNumber));
			sb.append("&");
		}
		if (bankAccountType != null) {
			sb.append(prefix).append("bankAccountType=").append(bankAccountType.getValue());
			sb.append("&");
		}
		if (bankAccountNumber != null) {
			sb.append(prefix).append("bankAccountNumber=").append(NVPUtil.encodeUrl(bankAccountNumber));
			sb.append("&");
		}
		if (iban != null) {
			sb.append(prefix).append("iban=").append(NVPUtil.encodeUrl(iban));
			sb.append("&");
		}
		if (clabe != null) {
			sb.append(prefix).append("clabe=").append(NVPUtil.encodeUrl(clabe));
			sb.append("&");
		}
		if (bsbNumber != null) {
			sb.append(prefix).append("bsbNumber=").append(NVPUtil.encodeUrl(bsbNumber));
			sb.append("&");
		}
		if (branchLocation != null) {
			sb.append(prefix).append("branchLocation=").append(NVPUtil.encodeUrl(branchLocation));
			sb.append("&");
		}
		if (sortCode != null) {
			sb.append(prefix).append("sortCode=").append(NVPUtil.encodeUrl(sortCode));
			sb.append("&");
		}
		if (bankTransitNumber != null) {
			sb.append(prefix).append("bankTransitNumber=").append(NVPUtil.encodeUrl(bankTransitNumber));
			sb.append("&");
		}
		if (institutionNumber != null) {
			sb.append(prefix).append("institutionNumber=").append(NVPUtil.encodeUrl(institutionNumber));
			sb.append("&");
		}
		if (branchCode != null) {
			sb.append(prefix).append("branchCode=").append(NVPUtil.encodeUrl(branchCode));
			sb.append("&");
		}
		if (agencyNumber != null) {
			sb.append(prefix).append("agencyNumber=").append(NVPUtil.encodeUrl(agencyNumber));
			sb.append("&");
		}
		if (bankCode != null) {
			sb.append(prefix).append("bankCode=").append(NVPUtil.encodeUrl(bankCode));
			sb.append("&");
		}
		if (ribKey != null) {
			sb.append(prefix).append("ribKey=").append(NVPUtil.encodeUrl(ribKey));
			sb.append("&");
		}
		if (controlDigit != null) {
			sb.append(prefix).append("controlDigit=").append(NVPUtil.encodeUrl(controlDigit));
			sb.append("&");
		}
		if (taxIdType != null) {
			sb.append(prefix).append("taxIdType=").append(NVPUtil.encodeUrl(taxIdType));
			sb.append("&");
		}
		if (taxIdNumber != null) {
			sb.append(prefix).append("taxIdNumber=").append(NVPUtil.encodeUrl(taxIdNumber));
			sb.append("&");
		}
		if (accountHolderDateOfBirth != null) {
			sb.append(prefix).append("accountHolderDateOfBirth=").append(NVPUtil.encodeUrl(accountHolderDateOfBirth));
			sb.append("&");
		}
		if (confirmationType != null) {
			sb.append(prefix).append("confirmationType=").append(confirmationType.getValue());
			sb.append("&");
		}
		if (webOptions != null) {
			String newPrefix = prefix + "webOptions.";
			sb.append(webOptions.toNVPString(newPrefix));
		}
		return sb.toString();
	}

}
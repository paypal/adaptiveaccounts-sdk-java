
/**
 * Auto generated code
 */

package com.paypal.svcs.types.aa;

import com.paypal.core.NVPUtil;
import com.paypal.svcs.types.aa.AddressType;
import com.paypal.svcs.types.aa.CardDateType;
import com.paypal.svcs.types.aa.CardTypeType;
import com.paypal.svcs.types.aa.ConfirmationType;
import com.paypal.svcs.types.aa.NameType;
import com.paypal.svcs.types.aa.WebOptionsType;
import com.paypal.svcs.types.common.RequestEnvelope;
import java.io.UnsupportedEncodingException;


/**
 * Identifying the PayPal account to which this request is targetted to.
 * Caller of this API has to either provided an emailAddress or an accountId.
 */
public class AddPaymentCardRequest {

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
	 *
	 * @Required
	 */
	private NameType nameOnCard;
	public NameType getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(NameType value) {
		this.nameOnCard = value;
	}

	/**
	 *
	 * @Required
	 */
	private AddressType billingAddress;
	public AddressType getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(AddressType value) {
		this.billingAddress = value;
	}

	/**
	 */
	private String cardOwnerDateOfBirth;
	public String getCardOwnerDateOfBirth() {
		return cardOwnerDateOfBirth;
	}
	public void setCardOwnerDateOfBirth(String value) {
		this.cardOwnerDateOfBirth = value;
	}

	/**
	 *
	 * @Required
	 */
	private String cardNumber;
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String value) {
		this.cardNumber = value;
	}

	/**
	 *
	 * @Required
	 */
	private CardTypeType cardType;
	public CardTypeType getCardType() {
		return cardType;
	}
	public void setCardType(CardTypeType value) {
		this.cardType = value;
	}

	/**
	 */
	private CardDateType expirationDate;
	public CardDateType getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(CardDateType value) {
		this.expirationDate = value;
	}

	/**
	 * CVV2: Proivde only for requests where 
	 * confirmationType is None (Direct request)
	 */
	private String cardVerificationNumber;
	public String getCardVerificationNumber() {
		return cardVerificationNumber;
	}
	public void setCardVerificationNumber(String value) {
		this.cardVerificationNumber = value;
	}

	/**
	 */
	private CardDateType startDate;
	public CardDateType getStartDate() {
		return startDate;
	}
	public void setStartDate(CardDateType value) {
		this.startDate = value;
	}

	/**
	 * Up to 2 digit for Switch/Maestro/Solo cards.
	 */
	private String issueNumber;
	public String getIssueNumber() {
		return issueNumber;
	}
	public void setIssueNumber(String value) {
		this.issueNumber = value;
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


	public AddPaymentCardRequest(RequestEnvelope requestEnvelope, NameType nameOnCard, AddressType billingAddress, String cardNumber, CardTypeType cardType, ConfirmationType confirmationType) {
		this.requestEnvelope = requestEnvelope;
		this.nameOnCard = nameOnCard;
		this.billingAddress = billingAddress;
		this.cardNumber = cardNumber;
		this.cardType = cardType;
		this.confirmationType = confirmationType;
	}
	public AddPaymentCardRequest() {
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
		if( nameOnCard != null ) {
			String newPrefix = prefix + "nameOnCard.";
			sb.append(nameOnCard.toNVPString(newPrefix));
		}
		if( billingAddress != null ) {
			String newPrefix = prefix + "billingAddress.";
			sb.append(billingAddress.toNVPString(newPrefix));
		}
		if( cardOwnerDateOfBirth != null ) {
			sb.append(prefix).append("cardOwnerDateOfBirth=").append(NVPUtil.encodeUrl(cardOwnerDateOfBirth));
			sb.append('&');
		}
		if( cardNumber != null ) {
			sb.append(prefix).append("cardNumber=").append(NVPUtil.encodeUrl(cardNumber));
			sb.append('&');
		}
		if( cardType != null ) {
			sb.append(prefix).append("cardType=").append(cardType.getValue());
			sb.append('&');
		}
		if( expirationDate != null ) {
			String newPrefix = prefix + "expirationDate.";
			sb.append(expirationDate.toNVPString(newPrefix));
		}
		if( cardVerificationNumber != null ) {
			sb.append(prefix).append("cardVerificationNumber=").append(NVPUtil.encodeUrl(cardVerificationNumber));
			sb.append('&');
		}
		if( startDate != null ) {
			String newPrefix = prefix + "startDate.";
			sb.append(startDate.toNVPString(newPrefix));
		}
		if( issueNumber != null ) {
			sb.append(prefix).append("issueNumber=").append(NVPUtil.encodeUrl(issueNumber));
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

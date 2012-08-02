package com.sample.adaptiveaccounts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.paypal.exception.ClientActionRequiredException;
import com.paypal.exception.HttpErrorException;
import com.paypal.exception.InvalidCredentialException;
import com.paypal.exception.InvalidResponseDataException;
import com.paypal.exception.MissingCredentialException;
import com.paypal.exception.SSLConfigurationException;
import com.paypal.sdk.exceptions.OAuthException;
import com.paypal.svcs.services.AdaptiveAccountsService;
import com.paypal.svcs.types.aa.AddBankAccountRequest;
import com.paypal.svcs.types.aa.AddBankAccountResponse;
import com.paypal.svcs.types.aa.AddPaymentCardRequest;
import com.paypal.svcs.types.aa.AddPaymentCardResponse;
import com.paypal.svcs.types.aa.AddressType;
import com.paypal.svcs.types.aa.BankAccountType;
import com.paypal.svcs.types.aa.BusinessInfoType;
import com.paypal.svcs.types.aa.BusinessStakeholderType;
import com.paypal.svcs.types.aa.BusinessSubtypeType;
import com.paypal.svcs.types.aa.BusinessType;
import com.paypal.svcs.types.aa.CardDateType;
import com.paypal.svcs.types.aa.CardTypeType;
import com.paypal.svcs.types.aa.ConfirmationType;
import com.paypal.svcs.types.aa.CreateAccountRequest;
import com.paypal.svcs.types.aa.CreateAccountResponse;
import com.paypal.svcs.types.aa.CreateAccountWebOptionsType;
import com.paypal.svcs.types.aa.GetUserAgreementRequest;
import com.paypal.svcs.types.aa.GetUserAgreementResponse;
import com.paypal.svcs.types.aa.GetVerifiedStatusRequest;
import com.paypal.svcs.types.aa.GetVerifiedStatusResponse;
import com.paypal.svcs.types.aa.NameType;
import com.paypal.svcs.types.aa.SalesVenueType;
import com.paypal.svcs.types.aa.SetFundingSourceConfirmedRequest;
import com.paypal.svcs.types.aa.SetFundingSourceConfirmedResponse;
import com.paypal.svcs.types.aa.StakeholderRoleType;
import com.paypal.svcs.types.aa.WebOptionsType;
import com.paypal.svcs.types.common.RequestEnvelope;

/**
 * Servlet implementation class CreateAccountServlet
 */
public class AdaptiveAccountsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdaptiveAccountsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (request.getRequestURI().contains("CreateAccount"))
			getServletConfig().getServletContext()
					.getRequestDispatcher("/CreateAccount.jsp")
					.forward(request, response);
		else if (request.getRequestURI().contains("AddPaymentCard"))
			getServletConfig().getServletContext()
					.getRequestDispatcher("/AddPaymentCard.jsp")
					.forward(request, response);
		else if (request.getRequestURI().contains("AddBankAccount"))
			getServletConfig().getServletContext()
					.getRequestDispatcher("/AddBankAccount.jsp")
					.forward(request, response);
		else if (request.getRequestURI().contains("GetUserAgreement"))
			getServletConfig().getServletContext()
					.getRequestDispatcher("/GetUserAgreement.jsp")
					.forward(request, response);
		else if (request.getRequestURI().contains("GetVerifiedStatus"))
			getServletConfig().getServletContext()
					.getRequestDispatcher("/GetVerifiedStatus.jsp")
					.forward(request, response);
		else if (request.getRequestURI().contains("SetFundingSourceConfirmed"))
			getServletConfig().getServletContext()
					.getRequestDispatcher("/SetFundingSourceConfirmed.jsp")
					.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		session.setAttribute("url", request.getRequestURI());
	
		response.setContentType("text/html");
		try {
			AdaptiveAccountsService service = new AdaptiveAccountsService(this
					.getServletContext().getRealPath("/")
					+ "/WEB-INF/sdk_config.properties");
			if (request.getRequestURI().contains("CreateAccount")) {
				RequestEnvelope requestEnvelope = new RequestEnvelope();
				requestEnvelope.setErrorLanguage("en_US");
				NameType name = null;
				if (request.getParameter("firstName") != "") {
					name = new NameType(request.getParameter("firstName"),
							request.getParameter("lastName"));

				}
				if (request.getParameter("middleName") != "")
					name.setMiddleName(request.getParameter("middleName"));
				if (request.getParameter("suffix") != "")
					name.setSuffix(request.getParameter("suffix"));
				if (request.getParameter("salutation") != "")
					name.setSalutation(request.getParameter("salutation"));
				String preferredLanguageCode = request
						.getParameter("preferredLanguageCode");
				AddressType address = new AddressType(
						request.getParameter("street"),
						request.getParameter("countryCode"));
				if (request.getParameter("postalCode") != "")
					address.setPostalCode(request.getParameter("postalCode"));
				if (request.getParameter("state") != "")
					address.setState(request.getParameter("state"));
				if (request.getParameter("city") != "")
					address.setCity(request.getParameter("city"));
				if (request.getParameter("line2") != "")
					address.setLine2(request.getParameter("line2"));

				CreateAccountRequest req = new CreateAccountRequest(
						requestEnvelope, name, address, preferredLanguageCode);
				if (request.getParameter("partnerField1") != "")
					req.setPartnerField1(request.getParameter("partnerField1"));
				if (request.getParameter("partnerField2") != "")
					req.setPartnerField2(request.getParameter("partnerField2"));
				if (request.getParameter("partnerField3") != "")
					req.setPartnerField3(request.getParameter("partnerField3"));
				if (request.getParameter("partnerField4") != "")
					req.setPartnerField4(request.getParameter("partnerField4"));
				if (request.getParameter("partnerField5") != "")
					req.setPartnerField5(request.getParameter("partnerField5"));
				if (request.getParameter("contactNum") != "")
					req.setContactPhoneNumber(request
							.getParameter("contactNum"));
				if (request.getParameter("homeNum") != "")
					req.setContactPhoneNumber(request.getParameter("homeNum"));
				if (request.getParameter("mobileNum") != "")
					req.setContactPhoneNumber(request.getParameter("mobileNum"));
				if (request.getParameter("dateOfBirth") != "")
					req.setDateOfBirth(request.getParameter("dateOfBirth"));
				if (request.getParameter("accountType") != "")

					req.setAccountType(request.getParameter("accountType"));

				// TODO
				AddressType businessAddress = new AddressType(
						request.getParameter("businessStreet"),
						request.getParameter("businessCountryCode"));
				if (request.getParameter("businessPostalCode") != "")
					businessAddress.setPostalCode(request
							.getParameter("businessPostalCode"));
				if (request.getParameter("businessState") != "")
					businessAddress.setState(request
							.getParameter("businessState"));
				if (request.getParameter("businessCity") != "")
					businessAddress.setCity(request
							.getParameter("businessCity"));
				if (request.getParameter("businessLine2") != "")
					businessAddress.setLine2(request
							.getParameter("businessLine2"));
				if (request.getParameter("accountType").equalsIgnoreCase(
						"Business")) {
					BusinessInfoType businessInfoType = new BusinessInfoType(
							request.getParameter("businessName"),
							businessAddress, request.getParameter("workPhone"));
					if (request.getParameter("averageMonthlyVolume") != "")
						businessInfoType.setAverageMonthlyVolume(Double
								.parseDouble(request
										.getParameter("averageMonthlyVolume")));
					if (request.getParameter("averagePrice") != "")
						businessInfoType.setAveragePrice(Double
								.parseDouble(request
										.getParameter("averagePrice")));

					List<BusinessStakeholderType> businessStakeHolderList = new ArrayList<BusinessStakeholderType>();
					BusinessStakeholderType businessStakeHolder = null;
					if (request.getParameter("role") != "") {
						businessStakeHolder = new BusinessStakeholderType(
								StakeholderRoleType.fromValue(request
										.getParameter("role")));
						AddressType stakeHolderAddress = new AddressType(
								request.getParameter("stakeHolderStreet"),
								request.getParameter("stakeHolderCountryCode"));
						if (request.getParameter("stakeHolderPostalCode") != "")
							stakeHolderAddress.setPostalCode(request
									.getParameter("stakeHolderPostalCode"));
						if (request.getParameter("stakeHolderState") != "")
							stakeHolderAddress.setState(request
									.getParameter("stakeHolderState"));
						if (request.getParameter("stakeHolderCity") != "")
							stakeHolderAddress.setCity(request
									.getParameter("stakeHolderCity"));
						if (request.getParameter("stakeHolderLine2") != "")
							stakeHolderAddress.setLine2(request
									.getParameter("stakeHolderLine2"));
						businessStakeHolder.setAddress(stakeHolderAddress);
						if (request.getParameter("stakeHolderDateofBirth") != "")
							businessStakeHolder.setDateOfBirth(request
									.getParameter("stakeHolderDateofBirth"));
						if (request.getParameter("fullLegalName") != "")
							businessStakeHolder.setFullLegalName(request
									.getParameter("fullLegalName"));
						NameType stakeHolderName = null;
						if (request.getParameter("stakeHolderFirstName") != "") {
							name = new NameType(
									request.getParameter("stakeHolderFirstName"),
									request.getParameter("stakeHolderLastName"));

						}
						if (request.getParameter("stakeHolderMiddleName") != "")
							name.setMiddleName(request
									.getParameter("stakeHolderMiddleName"));
						if (request.getParameter("stakeHolderSuffix") != "")
							name.setSuffix(request
									.getParameter("stakeHolderSuffix"));
						if (request.getParameter("stakeHolderSalutation") != "")
							name.setSalutation(request
									.getParameter("stakeHolderSalutation"));
						businessStakeHolder.setName(stakeHolderName);

						businessStakeHolderList.add(businessStakeHolder);
						businessInfoType
								.setBusinessStakeholder(businessStakeHolderList);
					}
					if (request.getParameter("businessSubtype") != "")
						businessInfoType.setBusinessSubtype(BusinessSubtypeType
								.fromValue(request
										.getParameter("businessSubtype")));
					if (request.getParameter("businessType") != "")
						businessInfoType
								.setBusinessType(BusinessType.fromValue(request
										.getParameter("businessType")));
					if (request.getParameter("category") != "")
						businessInfoType.setCategory(Integer.parseInt(request
								.getParameter("category")));
					if (request.getParameter("commercialRegistrationLocation") != "")
						businessInfoType
								.setCommercialRegistrationLocation(request
										.getParameter("commercialRegistrationLocation"));
					if (request.getParameter("companyId") != "")
						businessInfoType.setCompanyId(request
								.getParameter("companyId"));
					if (request.getParameter("customerServiceEmail") != "")
						businessInfoType.setCustomerServiceEmail(request
								.getParameter("customerServiceEmail"));
					if (request.getParameter("customerServicePhone") != "")
						businessInfoType.setCustomerServicePhone(request
								.getParameter("customerServicePhone"));
					if (request.getParameter("dateOfEstablishment") != "")
						businessInfoType.setDateOfEstablishment(request
								.getParameter("dateOfEstablishment"));
					if (request.getParameter("disputeEmail") != "")
						businessInfoType.setDisputeEmail(request
								.getParameter("disputeEmail"));
					if (request.getParameter("doingBusinessAs") != "")
						businessInfoType.setDoingBusinessAs(request
								.getParameter("doingBusinessAs"));
					if (request.getParameter("establishmentCountryCode") != "")
						businessInfoType.setEstablishmentCountryCode(request
								.getParameter("establishmentCountryCode"));
					if (request.getParameter("establishmentState") != "")
						businessInfoType.setEstablishmentState(request
								.getParameter("establishmentState"));
					if (request.getParameter("incorporationId") != "")
						businessInfoType.setIncorporationId(request
								.getParameter("incorporationId"));
					if (request.getParameter("merchantCategoryCode") != "")
						businessInfoType.setMerchantCategoryCode(Integer
								.parseInt(request
										.getParameter("merchantCategoryCode")));
					if (request.getParameter("percentageRevenueFromOnline") != "")
						businessInfoType
								.setPercentageRevenueFromOnline(Integer.parseInt(request
										.getParameter("percentageRevenueFromOnline")));
					if (request.getParameter("placeOfBusinessStreet") != "") {
						AddressType placeOfBusinessAddress = new AddressType(
								request.getParameter("placeOfBusinessStreet"),
								request.getParameter("placeOfBusinessCountryCode"));
						if (request.getParameter("placeOfBusinessPostalCode") != "")
							placeOfBusinessAddress.setPostalCode(request
									.getParameter("placeOfBusinessPostalCode"));
						if (request.getParameter("placeOfBusinessState") != "")
							placeOfBusinessAddress.setState(request
									.getParameter("placeOfBusinessState"));
						if (request.getParameter("placeOfBusinessCity") != "")
							placeOfBusinessAddress.setCity(request
									.getParameter("placeOfBusinessCity"));
						if (request.getParameter("placeOfBusinessLine2") != "")
							placeOfBusinessAddress.setLine2(request
									.getParameter("placeOfBusinessLine2"));
						businessInfoType
								.setPrincipalPlaceOfBusinessAddress(placeOfBusinessAddress);
					}
					if (request.getParameter("registeredOfficeStreet") != "") {
						AddressType registeredOfficeAddress = new AddressType(
								request.getParameter("registeredOfficeStreet"),
								request.getParameter("registeredOfficeCountryCode"));
						if (request.getParameter("registeredOfficePostalCode") != "")
							registeredOfficeAddress
									.setPostalCode(request
											.getParameter("registeredOfficePostalCode"));
						if (request.getParameter("registeredOfficeState") != "")
							registeredOfficeAddress.setState(request
									.getParameter("registeredOfficeState"));
						if (request.getParameter("registeredOfficeCity") != "")
							registeredOfficeAddress.setCity(request
									.getParameter("registeredOfficeCity"));
						if (request.getParameter("registeredOfficeLine2") != "")
							registeredOfficeAddress.setLine2(request
									.getParameter("registeredOfficeLine2"));
						businessInfoType
								.setRegisteredOfficeAddress(registeredOfficeAddress);
					}
					List<SalesVenueType> salesVenueList = new ArrayList<SalesVenueType>();
					if (request.getParameter("salesVenue") != "")
						salesVenueList.add(SalesVenueType.fromValue(request
								.getParameter("salesVenue")));
					businessInfoType.setSalesVenue(salesVenueList);
					if (request.getParameter("salesVenuDesc") != "")
						businessInfoType.setSalesVenueDesc(request
								.getParameter("salesVenuDesc"));
					if (request.getParameter("subCategory") != "")
						businessInfoType.setSubCategory(Integer
								.parseInt(request.getParameter("subCategory")));
					if (request.getParameter("vatCountryCode") != "")
						businessInfoType.setVatCountryCode(request
								.getParameter("vatCountryCode"));
					if (request.getParameter("vatId") != "")
						businessInfoType
								.setVatId(request.getParameter("vatId"));
					if (request.getParameter("webSite") != "")
						businessInfoType.setWebSite(request
								.getParameter("webSite"));

					req.setBusinessInfo(businessInfoType);
				}
				if (request.getParameter("taxID") != "")
					req.setTaxId(request.getParameter("taxID"));
				if (request.getParameter("notificationURL") != "")
					req.setNotificationURL(request
							.getParameter("notificationURL"));
				if (request.getParameter("performExtraVettingOnThisAccount") != "")
					req.setPerformExtraVettingOnThisAccount(Boolean.parseBoolean(request
							.getParameter("performExtraVettingOnThisAccount")));
				if (request.getParameter("citizenshipCtryCode") != "")
					req.setCitizenshipCountryCode(request
							.getParameter("citizenshipCtryCode"));
				if (request.getParameter("currencyCode") != "")
					req.setCurrencyCode(request.getParameter("currencyCode"));
				if (request.getParameter("email") != "")
					req.setEmailAddress(request.getParameter("email"));

				CreateAccountWebOptionsType webOptions = new CreateAccountWebOptionsType();
				if (request.getParameter("returnUrl") != "")
					webOptions.setReturnUrl(request.getParameter("returnUrl"));
				if (request.getParameter("returnUrlDescription") != "")
					webOptions.setReturnUrlDescription(request
							.getParameter("returnUrlDescription"));
				if (request.getParameter("useMiniBrowser") != "")
					webOptions.setUseMiniBrowser(Boolean.parseBoolean(request
							.getParameter("useMiniBrowser")));
				if (request.getParameter("showMobileConfirm") != "")
					webOptions.setShowMobileConfirm(Boolean
							.parseBoolean(request
									.getParameter("showMobileConfirm")));
				if (request.getParameter("showAddCreditCard") != "")
					webOptions.setShowAddCreditCard(Boolean
							.parseBoolean(request
									.getParameter("showAddCreditCard")));
				if (request.getParameter("regType") != "")
					req.setRegistrationType(request.getParameter("regType"));
				req.setCreateAccountWebOptions(webOptions);

				CreateAccountResponse resp = service.createAccount(req);
				if (resp != null) {
					session.setAttribute("RESPONSE_OBJECT", resp);
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getResponseEnvelope().getAck().toString()
							.equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getResponseEnvelope().getAck());
						map.put("Correlation ID", resp.getResponseEnvelope()
								.getCorrelationId());
						map.put("TimeStamp", resp.getResponseEnvelope()
								.getTimestamp());
						map.put("Redirect URL",
								"<a href=\"" + resp.getRedirectURL() + "\">"
										+ resp.getRedirectURL() + "</a>");
						map.put("Execution Status", resp.getExecStatus());
						map.put("CreateAccountKey", resp.getCreateAccountKey());
						session.setAttribute("map", map);
						response.sendRedirect("/adaptiveaccounts-sample/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getError());
						response.sendRedirect("/adaptiveaccounts-sample/Error.jsp");
					}
				}
			} else if (request.getRequestURI().contains("AddPaymentCard")) {
				RequestEnvelope requestEnvelope = new RequestEnvelope();
				requestEnvelope.setErrorLanguage("en_US");
				NameType nameOnCard = null;
				if (request.getParameter("firstName") != ""
						&& request.getParameter("lastName") != "") {
					nameOnCard = new NameType(
							request.getParameter("firstName"),
							request.getParameter("lastName"));
				}
				AddressType billingAddress = new AddressType(
						request.getParameter("billingStreet"),
						request.getParameter("billingCountryCode"));
				if (request.getParameter("billingPostalCode") != "")
					billingAddress.setPostalCode(request
							.getParameter("billingPostalCode"));
				if (request.getParameter("billingState") != "")
					billingAddress.setState(request
							.getParameter("billingState"));
				if (request.getParameter("billingCity") != "")
					billingAddress.setCity(request.getParameter("billingCity"));
				if (request.getParameter("billingLine2") != "")
					billingAddress.setLine2(request
							.getParameter("billingLine2"));
				AddPaymentCardRequest req = new AddPaymentCardRequest(
						requestEnvelope,
						nameOnCard,
						billingAddress,
						request.getParameter("cardNumber"),
						CardTypeType.fromValue(request.getParameter("cardType")),
						ConfirmationType.fromValue(request
								.getParameter("confirmationType")));
				if (request.getParameter("accountID") != "")
					req.setAccountId(request.getParameter("accountID"));
				if (request.getParameter("createAccountKey") != "")
					req.setCreateAccountKey(request
							.getParameter("createAccountKey"));
				if (request.getParameter("emailAddress") != "")
					req.setEmailAddress(request.getParameter("emailAddress"));
				WebOptionsType webOptionsType = new WebOptionsType();
				if (request.getParameter("cancelURL") != "")
					webOptionsType.setCancelUrl(request
							.getParameter("cancelURL"));
				if (request.getParameter("cancelURLDescription") != "")
					webOptionsType.setCancelUrlDescription(request
							.getParameter("cancelURLDescription"));
				if (request.getParameter("returnURL") != "")
					webOptionsType.setReturnUrl(request
							.getParameter("returnURL"));
				if (request.getParameter("returnURLDescription") != "")
					webOptionsType.setReturnUrlDescription(request
							.getParameter("returnURLDescription"));
				req.setWebOptions(webOptionsType);
				if (request.getParameter("cardOwnerDateOfBirth") != "")
					req.setCardOwnerDateOfBirth(request
							.getParameter("cardOwnerDateOfBirth"));
				if (request.getParameter("cardVerificationNumber") != "")
					req.setCardVerificationNumber(request
							.getParameter("cardVerificationNumber"));
				if (request.getParameter("issueNumber") != "")
					req.setIssueNumber(request.getParameter("issueNumber"));
				if (request.getParameter("startMonth") != "") {
					CardDateType startDate = new CardDateType(
							Integer.parseInt(request.getParameter("startMonth")),
							Integer.parseInt(request.getParameter("startYear")));
					req.setStartDate(startDate);
				}
				if (request.getParameter("expirationMonth") != "") {
					CardDateType expirationDate = new CardDateType(
							Integer.parseInt(request
									.getParameter("expirationMonth")),
							Integer.parseInt(request
									.getParameter("expirationYear")));
					req.setExpirationDate(expirationDate);
				}
				AddPaymentCardResponse resp = service.addPaymentCard(req);
				if (resp != null) {
					session.setAttribute("RESPONSE_OBJECT", resp);
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getResponseEnvelope().getAck().toString()
							.equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getResponseEnvelope().getAck());
						map.put("Correlation ID", resp.getResponseEnvelope()
								.getCorrelationId());
						map.put("TimeStamp", resp.getResponseEnvelope()
								.getTimestamp());
						map.put("Redirect URL",
								"<a href=\"" + resp.getRedirectURL() + "\">"
										+ resp.getRedirectURL() + "</a>");
						map.put("Execution Status", resp.getExecStatus());
						map.put("Funding Source Key",
								resp.getFundingSourceKey());
						session.setAttribute("map", map);
						response.sendRedirect("/adaptiveaccounts-sample/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getError());
						response.sendRedirect("/adaptiveaccounts-sample/Error.jsp");
					}
				}
			} else if (request.getRequestURI().contains("AddBankAccount")) {
				RequestEnvelope requestEnvelope = new RequestEnvelope();
				requestEnvelope.setErrorLanguage("en_US");
				AddBankAccountRequest req = new AddBankAccountRequest(
						requestEnvelope,
						request.getParameter("bankCountryCode"),
						ConfirmationType.fromValue(request
								.getParameter("confirmationType")));
				if (request.getParameter("accountHolderDateOfBirth") != "")
					req.setAccountHolderDateOfBirth(request
							.getParameter("accountHolderDateOfBirth"));
				if (request.getParameter("accountID") != "")
					req.setAccountId(request.getParameter("accountID"));
				if (request.getParameter("brazilAgencyNumber") != "")
					req.setAgencyNumber(request
							.getParameter("brazilAgencyNumber"));
				if (request.getParameter("bankAccountNumber") != "")
					req.setBankAccountNumber(request
							.getParameter("bankAccountNumber"));
				if (request.getParameter("bankAccountType") != "")
					req.setBankAccountType(BankAccountType.fromValue(request
							.getParameter("bankAccountType")));
				if (request.getParameter("bankCode") != "")
					req.setBankCode(request.getParameter("bankCode"));
				if (request.getParameter("bankName") != "")
					req.setBankName(request.getParameter("bankName"));
				if (request.getParameter("bankTransitNumber") != "")
					req.setBankTransitNumber(request
							.getParameter("bankTransitNumber"));
				if (request.getParameter("branchCode") != "")
					req.setBranchCode(request.getParameter("branchCode"));
				if (request.getParameter("branchLocation") != "")
					req.setBranchLocation(request
							.getParameter("branchLocation"));
				if (request.getParameter("bsbNumber") != "")
					req.setBsbNumber(request.getParameter("bsbNumber"));
				if (request.getParameter("clabe") != "")
					req.setClabe(request.getParameter("clabe"));
				if (request.getParameter("controlDigit") != "")
					req.setControlDigit(request.getParameter("controlDigit"));
				if (request.getParameter("createAccountKey") != "")
					req.setCreateAccountKey(request
							.getParameter("createAccountKey"));
				if (request.getParameter("emailAddress") != "")
					req.setEmailAddress(request.getParameter("emailAddress"));
				if (request.getParameter("iban") != "")
					req.setIban(request.getParameter("iban"));
				if (request.getParameter("institutionNum") != "")
					req.setInstitutionNumber(request
							.getParameter("institutionNum"));
				if (request.getParameter("rib") != "")
					req.setRibKey(request.getParameter("rib"));
				if (request.getParameter("routingNum") != "")
					req.setRoutingNumber(request.getParameter("routingNum"));
				if (request.getParameter("sortCode") != "")
					req.setSortCode(request.getParameter("sortCode"));
				if (request.getParameter("taxIdNum") != "")
					req.setTaxIdNumber(request.getParameter("taxIdNum"));
				if (request.getParameter("taxIdType") != "")
					req.setTaxIdType(request.getParameter("taxIdType"));
				WebOptionsType webOptionsType = new WebOptionsType();
				if (request.getParameter("cancelURL") != "")
					webOptionsType.setCancelUrl(request
							.getParameter("cancelURL"));
				if (request.getParameter("cancelURLDescription") != "")
					webOptionsType.setCancelUrlDescription(request
							.getParameter("cancelURLDescription"));
				if (request.getParameter("returnURL") != "")
					webOptionsType.setReturnUrl(request
							.getParameter("returnURL"));
				if (request.getParameter("returnURLDescription") != "")
					webOptionsType.setReturnUrlDescription(request
							.getParameter("returnURLDescription"));
				req.setWebOptions(webOptionsType);

				AddBankAccountResponse resp = service.addBankAccount(req);
				if (resp != null) {
					session.setAttribute("RESPONSE_OBJECT", resp);
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getResponseEnvelope().getAck().toString()
							.equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getResponseEnvelope().getAck());
						map.put("Correlation ID", resp.getResponseEnvelope()
								.getCorrelationId());
						map.put("TimeStamp", resp.getResponseEnvelope()
								.getTimestamp());
						map.put("Redirect URL",
								"<a href=\"" + resp.getRedirectURL() + "\">"
										+ resp.getRedirectURL() + "</a>");
						map.put("Execution Status", resp.getExecStatus());
						map.put("Funding Source Key",
								resp.getFundingSourceKey());
						session.setAttribute("map", map);
						response.sendRedirect("/adaptiveaccounts-sample/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getError());
						response.sendRedirect("/adaptiveaccounts-sample/Error.jsp");
					}
				}
			} else if (request.getRequestURI().contains("GetUserAgreement")) {
				RequestEnvelope requestEnvelope = new RequestEnvelope();
				requestEnvelope.setErrorLanguage("en_US");
				GetUserAgreementRequest req = new GetUserAgreementRequest(
						requestEnvelope);
				if (request.getParameter("countryCode") != "")
					req.setCountryCode(request.getParameter("countryCode"));
				if (request.getParameter("createAccountKey") != "")
					req.setCreateAccountKey(request
							.getParameter("createAccountKey"));
				if (request.getParameter("languageCode") != "")
					req.setLanguageCode(request.getParameter("languageCode"));
				GetUserAgreementResponse resp = service.getUserAgreement(req);

				if (resp != null) {
					session.setAttribute("RESPONSE_OBJECT", resp);
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getResponseEnvelope().getAck().toString()
							.equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getResponseEnvelope().getAck());
						map.put("Correlation ID", resp.getResponseEnvelope()
								.getCorrelationId());
						map.put("TimeStamp", resp.getResponseEnvelope()
								.getTimestamp());
						map.put("Agreement", resp.getAgreement());
						session.setAttribute("map", map);
						response.sendRedirect("/adaptiveaccounts-sample/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getError());
						response.sendRedirect("/adaptiveaccounts-sample/Error.jsp");
					}
				}

			} else if (request.getRequestURI().contains("GetVerifiedStatus")) {
				RequestEnvelope requestEnvelope = new RequestEnvelope();
				requestEnvelope.setErrorLanguage("en_US");
				GetVerifiedStatusRequest req = new GetVerifiedStatusRequest(
						requestEnvelope, request.getParameter("emailAddress"),
						request.getParameter("matchCriteria"));
				if (request.getParameter("firstName") != ""
						&& request.getParameter("lastName") != "") {
					req.setFirstName(request.getParameter("firstName"));
					req.setLastName(request.getParameter("lastName"));
				}
				GetVerifiedStatusResponse resp = service.getVerifiedStatus(req);
				if (resp != null) {
					session.setAttribute("RESPONSE_OBJECT", resp);
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getResponseEnvelope().getAck().toString()
							.equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getResponseEnvelope().getAck());
						map.put("Correlation ID", resp.getResponseEnvelope()
								.getCorrelationId());
						map.put("TimeStamp", resp.getResponseEnvelope()
								.getTimestamp());
						map.put("AccountStatus", resp.getAccountStatus());
						map.put("AccountID", resp.getUserInfo().getAccountId());
						map.put("Account Type", resp.getUserInfo()
								.getAccountType());
						session.setAttribute("map", map);
						response.sendRedirect("/adaptiveaccounts-sample/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getError());
						response.sendRedirect("/adaptiveaccounts-sample/Error.jsp");
					}
				}

			} else if (request.getRequestURI().contains(
					"SetFundingSourceConfirmed")) {
				RequestEnvelope requestEnvelope = new RequestEnvelope();
				requestEnvelope.setErrorLanguage("en_US");
				SetFundingSourceConfirmedRequest req = new SetFundingSourceConfirmedRequest(
						requestEnvelope,
						request.getParameter("fundingSourceKey"));
				if (request.getParameter("accountId") != "")
					req.setAccountId(request.getParameter("accountId"));
				if (request.getParameter("emailAddress") != "")
					req.setEmailAddress(request.getParameter("emailAddress"));
				SetFundingSourceConfirmedResponse resp = service
						.setFundingSourceConfirmed(req);

				if (resp != null) {
					session.setAttribute("RESPONSE_OBJECT", resp);
					session.setAttribute("lastReq", service.getLastRequest());
					session.setAttribute("lastResp", service.getLastResponse());
					if (resp.getResponseEnvelope().getAck().toString()
							.equalsIgnoreCase("SUCCESS")) {
						Map<Object, Object> map = new LinkedHashMap<Object, Object>();
						map.put("Ack", resp.getResponseEnvelope().getAck());
						map.put("Correlation ID", resp.getResponseEnvelope()
								.getCorrelationId());
						map.put("TimeStamp", resp.getResponseEnvelope()
								.getTimestamp());
						session.setAttribute("map", map);
						response.sendRedirect("/adaptiveaccounts-sample/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getError());
						response.sendRedirect("/adaptiveaccounts-sample/Error.jsp");
					}
				}
			}

		} catch (SSLConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidCredentialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HttpErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidResponseDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClientActionRequiredException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MissingCredentialException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (OAuthException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

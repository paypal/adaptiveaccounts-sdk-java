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
import com.paypal.svcs.types.aa.AccountIdentifierType;
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
			
			// Configuration map containing signature credentials and other required configuration.
			// For a full list of configuration parameters refer at 
			// (https://github.com/paypal/adaptiveaccounts-sdk-java/wiki/SDK-Configuration-Parameters)
			Map<String,String> configurationMap =  Configuration.getSignatureConfig();
			
			// Creating service wrapper object to make an API call and loading
			// configuration map for your credentials and endpoint
			AdaptiveAccountsService service = new AdaptiveAccountsService(configurationMap);

			if (request.getRequestURI().contains("CreateAccount")) { 			// CreateAccount Request
				RequestEnvelope requestEnvelope = new RequestEnvelope();
				requestEnvelope.setErrorLanguage("en_US");

				// The name of the person for whom the PayPal account is
				// created, which
				// contains
				//
				// * `FirstName` - First name of the account or payment card
				// holder.
				// * `LastName` - Last name of the account or payment card
				// holder.
				NameType name = null;
				
				//(Required) First name of the account or payment card holder. 
				if (request.getParameter("firstName") != "") {
					name = new NameType(request.getParameter("firstName"),
							request.getParameter("lastName"));
				}
				//Optional) Middle name of the account or payment card holder. 
				if (request.getParameter("middleName") != "")
					name.setMiddleName(request.getParameter("middleName"));
				//(Optional) A suffix for the account or payment card holder. 
				if (request.getParameter("suffix") != "")
					name.setSuffix(request.getParameter("suffix"));
				//(Optional) A salutation for the account or payment card holder. 
				if (request.getParameter("salutation") != "")
					name.setSalutation(request.getParameter("salutation"));
				
				String preferredLanguageCode = request
						.getParameter("preferredLanguageCode");

				// The address to be associated with the PayPal account
				AddressType address = new AddressType(
						request.getParameter("street"),
						request.getParameter("countryCode"));
				//(Optional) Zip or postal code. 
				if (request.getParameter("postalCode") != "")
					address.setPostalCode(request.getParameter("postalCode"));
				//(Optional) State code. 
				if (request.getParameter("state") != "")
					address.setState(request.getParameter("state"));
				//(Required) City name
				if (request.getParameter("city") != "")
					address.setCity(request.getParameter("city"));
				/*
				 * (Optional) Second line of the address.
				 * Note: This field is required for Brazilian addresses. 
				 */
				if (request.getParameter("line2") != "")
					address.setLine2(request.getParameter("line2"));

				
				// Instantiating createAccountRequest with mandatory arguments:
				//
				// * `requestenvelope` - Information common to each API
				// operation, such
				// as the language in which an error message is returned.
				// * `name` - The name of the person for whom the PayPal account
				// is
				// created.
				// * `address` - The address to be associated with the PayPal
				// account.
				// * `preferredlanguagecode`- The code indicating the language
				// to be
				// associated with the account.
				// What value is allowed depends on the country code passed in
				// the
				// countryCode parameter for the address.
				// For Example: United States (US) - en_US
				CreateAccountRequest req = new CreateAccountRequest(
						requestEnvelope, name, address, preferredLanguageCode);
				
				//(Optional) A maximum of five fields for your own use, where n is a digit between 1 and 5, inclusive. 
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
				
				// Phone Number to be associated with the account.
				if (request.getParameter("contactNum") != "")
					req.setContactPhoneNumber(request.getParameter("contactNum"));
				if (request.getParameter("homeNum") != "")
					req.setContactPhoneNumber(request.getParameter("homeNum"));
				if (request.getParameter("mobileNum") != "")
					req.setContactPhoneNumber(request.getParameter("mobileNum"));
				//(Optional) The date of birth of the stakeholder in the business. Use YYYY-MM-DDZ format; for example 1970-01-01Z. 
				if (request.getParameter("dateOfBirth") != "")
					req.setDateOfBirth(request.getParameter("dateOfBirth"));

				// The type of account to be created. Allowable values are:
				//
				// * Personal - Personal account
				// * Premier - Premier account
				// * Business - Business account
				if (request.getParameter("accountType") != "") {
					req.setAccountType(request.getParameter("accountType"));
				}

				// The address for the business for which the PayPal account is
				// created,
				// which contains
				//
				// * `Street1` - The street address.
				// * `Countrycode` - The country code.
				// * `City` - The city.
				// * `State` - The state code.
				// * `Postalcode` - The zip or postal code.
				AddressType businessAddress = new AddressType(
						request.getParameter("businessStreet"),
						request.getParameter("businessCountryCode"));
				//(Optional) Zip or postal code. 
				if (request.getParameter("businessPostalCode") != "")
					businessAddress.setPostalCode(request
							.getParameter("businessPostalCode"));
				//(Optional) State code. 
				if (request.getParameter("businessState") != "")
					businessAddress.setState(request
							.getParameter("businessState"));
				//(Required) City name
				if (request.getParameter("businessCity") != "")
					businessAddress.setCity(request
							.getParameter("businessCity"));
				/*
				 * (Optional) Second line of the address.
				 * Note: This field is required for Brazilian addresses. 
				 */
				if (request.getParameter("businessLine2") != "")
					businessAddress.setLine2(request
							.getParameter("businessLine2"));

				// This field is required for business accounts which takes
				// mandatory
				// arguments:
				//
				// * `Business Name` - The name of the business for which the
				// PayPal
				// account is created.
				// * `Business Address`
				// * `Contact Phone Number`
				if (request.getParameter("accountType").equalsIgnoreCase(
						"Business")) {

					BusinessInfoType businessInfoType = new BusinessInfoType(
							request.getParameter("businessName"),
							businessAddress, request.getParameter("workPhone"));
					/*
					 * The average monthly transaction volume of the business for which the PayPal account is created.
					 *  Required for all countries except Japan and Australia. 
					 */
					if (request.getParameter("averageMonthlyVolume") != "") {
						businessInfoType.setAverageMonthlyVolume(Double
								.parseDouble(request
										.getParameter("averageMonthlyVolume")));
					}

					// The average price per transaction. Required for all
					// countries except
					// Japan and Australia.
					if (request.getParameter("averagePrice") != "") {
						businessInfoType.setAveragePrice(Double
								.parseDouble(request
										.getParameter("averagePrice")));
					}
					List<BusinessStakeholderType> businessStakeHolderList = new ArrayList<BusinessStakeholderType>();
					BusinessStakeholderType businessStakeHolder = null;
					/*
					 * (Optional) The role of the stakeholder in the business for which the PayPal account is created. Allowable values are
					       	CHAIRMAN
						    SECRETARY
						    TREASURER
						    BENEFICIAL_OWNER
						    PRIMARY_CONTACT
						    INDIVIDUAL_PARTNER
						    NON_INDIVIDUAL_PARTNER
						    PRIMARY_INDIVIDUAL_PARTNER
						    DIRECTOR
						    NO_BENEFICIAL_OWNER
					 */
					if (request.getParameter("role") != "") {
						businessStakeHolder = new BusinessStakeholderType(
								StakeholderRoleType.fromValue(request
										.getParameter("role")));
						
						AddressType stakeHolderAddress = new AddressType(
								request.getParameter("stakeHolderStreet"),
								request.getParameter("stakeHolderCountryCode"));
						//(Optional) Zip or postal code. 
						if (request.getParameter("stakeHolderPostalCode") != "")
							stakeHolderAddress.setPostalCode(request
									.getParameter("stakeHolderPostalCode"));
						//(Optional) State code.
						if (request.getParameter("stakeHolderState") != "")
							stakeHolderAddress.setState(request
									.getParameter("stakeHolderState"));
						//(Required) City name
						if (request.getParameter("stakeHolderCity") != "")
							stakeHolderAddress.setCity(request
									.getParameter("stakeHolderCity"));
						/*
						 * (Optional) Second line of the address.
						 * Note: This field is required for Brazilian addresses. 
						 */
						if (request.getParameter("stakeHolderLine2") != "")
							stakeHolderAddress.setLine2(request
									.getParameter("stakeHolderLine2"));
						
						businessStakeHolder.setAddress(stakeHolderAddress);
						/*
						 * (Optional) The date of birth of the stakeholder in the business. 
						 * Use YYYY-MM-DDZ format; for example 1970-01-01Z. 
						 */
						if (request.getParameter("stakeHolderDateofBirth") != "")
							businessStakeHolder.setDateOfBirth(request
									.getParameter("stakeHolderDateofBirth"));
						/*
						 * (Optional) The legal name of the stakeholder in the business for which the PayPal account is created. 
						 */
						if (request.getParameter("fullLegalName") != "")
							businessStakeHolder.setFullLegalName(request
									.getParameter("fullLegalName"));
						
						NameType stakeHolderName = null;
						//(Required) First name of the account or payment card holder. 
						if (request.getParameter("stakeHolderFirstName") != "") {
							name = new NameType(
									request.getParameter("stakeHolderFirstName"),
									request.getParameter("stakeHolderLastName"));

						}
						//(Optional) Middle name of the account or payment card holder. 
						if (request.getParameter("stakeHolderMiddleName") != "")
							name.setMiddleName(request
									.getParameter("stakeHolderMiddleName"));
						//(Optional) A suffix for the account or payment card holder.
						if (request.getParameter("stakeHolderSuffix") != "")
							name.setSuffix(request.getParameter("stakeHolderSuffix"));
						//(Optional) A salutation for the account or payment card holder
						if (request.getParameter("stakeHolderSalutation") != "")
							name.setSalutation(request.getParameter("stakeHolderSalutation"));
						
						businessStakeHolder.setName(stakeHolderName);

						businessStakeHolderList.add(businessStakeHolder);
						businessInfoType.setBusinessStakeholder(businessStakeHolderList);
					}
					/*
					 * (Optional) The sub type of the business for which the PayPal account is created.
					 *  Allowable values are:
					        ENTITY
						    EMANATION
						    ESTD_COMMONWEALTH
						    ESTD_UNDER_STATE_TERRITORY
						    ESTD_UNDER_FOREIGH_COUNTY
						    INCORPORATED
						    NON_INCORPORATED

					 */
					if (request.getParameter("businessSubtype") != "")
						businessInfoType.setBusinessSubtype(BusinessSubtypeType
								.fromValue(request
										.getParameter("businessSubtype")));

					// The type of the business for which the PayPal account is
					// created.
					// Allowable values are:
					//
					// * CORPORATION
					// * GOVERNMENT
					// * INDIVIDUAL
					// * NONPROFIT
					// * PARTNERSHIP
					// * PROPRIETORSHIP
					if (request.getParameter("businessType") != "") {
						businessInfoType
								.setBusinessType(BusinessType.fromValue(request
										.getParameter("businessType")));
					}
					/*
					 * The category describing the business for which the PayPal account is created, for example; 1004 for Baby.
					 * Required unless you specify merchantCategoryCode. PayPal uses the industry standard Merchant Category Codes. 
					 * Refer to the business’s Association Merchant Category Code documentation for a list of codes. 
					 */
					if (request.getParameter("category") != "")
						businessInfoType.setCategory(Integer.parseInt(request
								.getParameter("category")));
					/*
					 * Official commercial registration location for the business for which the PayPal account is created. 
					 * Required for Germany.
					 */
					if (request.getParameter("commercialRegistrationLocation") != "")
						businessInfoType
								.setCommercialRegistrationLocation(request
										.getParameter("commercialRegistrationLocation"));
					
					/*
					 * The identification number, equivalent to the tax ID in the United States, of the business for which the PayPal account is created.
					 * Optional for business accounts in the United States, United Kingdom, France, Spain, Italy, Netherlands, Sweden, and Denmark. 
					 * Required for business accounts in Canada, and some accounts in Australia, and Germany, 
					 */
					if (request.getParameter("companyId") != "")
						businessInfoType.setCompanyId(request
								.getParameter("companyId"));

					// The email address for the customer service department of
					// the
					// business.
					if (request.getParameter("customerServiceEmail") != "") {
						businessInfoType.setCustomerServiceEmail(request
								.getParameter("customerServiceEmail"));
					}

					// Required for US accounts
					if (request.getParameter("customerServicePhone") != "") {
						businessInfoType.setCustomerServicePhone(request
								.getParameter("customerServicePhone"));
					}

					/* The date of establishment for the business. 
					 Optional for France
					 business accounts and required for business accounts in
					 the following
					 countries: United States, United Kingdom, Canada, Germany, Spain,
					 Italy, Netherlands, Czech Republic, Sweden, and Denmark.
					 Format needs to be `YYYY-MM-DD`
					 */
					if (request.getParameter("dateOfEstablishment") != "") {
						businessInfoType.setDateOfEstablishment(request
								.getParameter("dateOfEstablishment"));
					}
					//(Optional) The email address to contact to dispute charges. 
					if (request.getParameter("disputeEmail") != "")
						businessInfoType.setDisputeEmail(request
								.getParameter("disputeEmail"));
					//(Optional) The business name being used if it is not the actual name of the business.
					if (request.getParameter("doingBusinessAs") != "")
						businessInfoType.setDoingBusinessAs(request
								.getParameter("doingBusinessAs"));
					//(Optional) The code of the country where the business was established.
					if (request.getParameter("establishmentCountryCode") != "")
						businessInfoType.setEstablishmentCountryCode(request
								.getParameter("establishmentCountryCode"));
					//(Optional) The state in which the business was established. 
					if (request.getParameter("establishmentState") != "")
						businessInfoType.setEstablishmentState(request
								.getParameter("establishmentState"));
					//(Optional) The incorporation identification number for the business. 
					if (request.getParameter("incorporationId") != "")
						businessInfoType.setIncorporationId(request
								.getParameter("incorporationId"));

					// The category code for the business. state in which the
					// business was
					// established. Required unless you specify both category
					// and
					// subcategory. PayPal uses the industry standard Merchant
					// Category
					// Codes.
					if (request.getParameter("merchantCategoryCode") != "") {
						businessInfoType.setMerchantCategoryCode(Integer
								.parseInt(request
										.getParameter("merchantCategoryCode")));
					}
					// The percentage of online sales for the business from 0
					// through 100.
					// Required for business accounts in the following
					// countries: United
					// States, Canada, United Kingdom, France, Czech Republic,
					// New Zealand,
					// Switzerland, and Israel.
					if (request.getParameter("percentageRevenueFromOnline") != "") {
						businessInfoType
								.setPercentageRevenueFromOnline(Integer.parseInt(request
										.getParameter("percentageRevenueFromOnline")));
					}

					if (request.getParameter("placeOfBusinessStreet") != "") {
						AddressType placeOfBusinessAddress = new AddressType(
								request.getParameter("placeOfBusinessStreet"),
								request.getParameter("placeOfBusinessCountryCode"));
						//(Optional) Zip or postal code. 
						if (request.getParameter("placeOfBusinessPostalCode") != "")
							placeOfBusinessAddress.setPostalCode(request
									.getParameter("placeOfBusinessPostalCode"));
						//(Optional) State code. 
						if (request.getParameter("placeOfBusinessState") != "")
							placeOfBusinessAddress.setState(request
									.getParameter("placeOfBusinessState"));
						//(Required) City name
						if (request.getParameter("placeOfBusinessCity") != "")
							placeOfBusinessAddress.setCity(request
									.getParameter("placeOfBusinessCity"));
						/*
						 * (Optional) Second line of the address.
						 * Note: This field is required for Brazilian addresses. 
						 */
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
						//(Optional) Zip or postal code. 
						if (request.getParameter("registeredOfficePostalCode") != "")
							registeredOfficeAddress
									.setPostalCode(request
											.getParameter("registeredOfficePostalCode"));
						//(Optional) State code. 
						if (request.getParameter("registeredOfficeState") != "")
							registeredOfficeAddress.setState(request
									.getParameter("registeredOfficeState"));
						//(Required) City name
						if (request.getParameter("registeredOfficeCity") != "")
							registeredOfficeAddress.setCity(request
									.getParameter("registeredOfficeCity"));
						/*
						 * (Optional) Second line of the address.
						 * Note: This field is required for Brazilian addresses. 
						 */
						if (request.getParameter("registeredOfficeLine2") != "")
							registeredOfficeAddress.setLine2(request
									.getParameter("registeredOfficeLine2"));
						businessInfoType
								.setRegisteredOfficeAddress(registeredOfficeAddress);
					}

					// The venue type for sales. Required for business accounts
					// in all
					// countries except Czech Republic and Australia. Allowable
					// values are:
					//
					// * WEB
					// * EBAY
					// * OTHER_MARKETPLACE
					// * OTHER
					List<SalesVenueType> salesVenueList = new ArrayList<SalesVenueType>();
					if (request.getParameter("salesVenue") != "")
						salesVenueList.add(SalesVenueType.fromValue(request
								.getParameter("salesVenue")));
					businessInfoType.setSalesVenue(salesVenueList);

					// A description of the sales venue. Required if salesVenue
					// is OTHER for
					// all countries except Czech Republic and Australia.
					if (request.getParameter("salesVenuDesc") != "")
						businessInfoType.setSalesVenueDesc(request
								.getParameter("salesVenuDesc"));
					/*
					 * The subcategory describing the business for which the PayPal account is created. 
					 * Required unless you specify merchantCategoryCode. PayPal uses the industry standard Merchant Category Codes.
					 * Refer to the business’ Association Merchant Category Code documentation for a list of codes. 
					 */
					if (request.getParameter("subCategory") != "")
						businessInfoType.setSubCategory(Integer
								.parseInt(request.getParameter("subCategory")));
					/*
					 * The country for the VAT. Optional for business accounts in the following countries:
					 *  United Kingdom, France, Germany, Spain, Italy, Netherlands, Switzerland, Sweden, and Denmark
					 */
					if (request.getParameter("vatCountryCode") != "")
						businessInfoType.setVatCountryCode(request
								.getParameter("vatCountryCode"));
					/*
					 * The VAT identification number of the business. Optional for business accounts in the following countries: 
					 * United Kingdom, France, Germany, Spain, Italy, Netherlands, Switzerland, Sweden, and Denmark. 
					 */
					if (request.getParameter("vatId") != "")
						businessInfoType
								.setVatId(request.getParameter("vatId"));
					/*
					 * The URL for the website of the business in the following format: http://www.example.com.
					 * Required if the salesVenue is WEB; otherwise optional. The URL must be to a hosted website. 
					 */
					if (request.getParameter("webSite") != "")
						businessInfoType.setWebSite(request
								.getParameter("webSite"));

					req.setBusinessInfo(businessInfoType);
				}
				if (request.getParameter("taxID") != "")
					req.setTaxId(request.getParameter("taxID"));

				// The URL to post instant payment notification (IPN) messages
				// to
				// regarding account creation. This URL supersedes the IPN
				// notification
				// URL set in the merchant profile.
				if (request.getParameter("notificationURL") != "")
					req.setNotificationURL(request
							.getParameter("notificationURL"));
				
				/*
				 * (Optional) Determines whether PayPal subjects the new account to extra vetting before allowing it to be used.
					    true - PayPal will perform extra vetting
					    false - PayPal will not perform extra vetting
				 */
				if (request.getParameter("performExtraVettingOnThisAccount") != "")
					req.setPerformExtraVettingOnThisAccount(Boolean.parseBoolean(request
							.getParameter("performExtraVettingOnThisAccount")));

				// The code of the country to be associated with the account.
				if (request.getParameter("citizenshipCtryCode") != "")
					req.setCitizenshipCountryCode(request
							.getParameter("citizenshipCtryCode"));

				// The three letter code for the currency to be associated with
				// the
				// account.
				if (request.getParameter("currencyCode") != "")
					req.setCurrencyCode(request.getParameter("currencyCode"));
				if (request.getParameter("email") != "") {
					// Email address of person for whom the PayPal account is
					// created.
					req.setEmailAddress(request.getParameter("email"));
				}

				// Used for configuration settings for the web flow
				CreateAccountWebOptionsType webOptions = new CreateAccountWebOptionsType();

				/*
				 * (Required) The URL to which you want the account holder to return when he or she finishes account registration. 
				 * This URL appears as a link on the final page of the PayPal account registration flow.
				 * The text of this link is the text passed in the returnUrlDescription request parameter (below).
				 */
				if (request.getParameter("returnUrl") != "")
					webOptions.setReturnUrl(request.getParameter("returnUrl"));
				//(Optional) A description of the return URL. 
				if (request.getParameter("returnUrlDescription") != "")
					webOptions.setReturnUrlDescription(request
							.getParameter("returnUrlDescription"));
				/*
				 * (Optional) Defines whether to use the minibrowser account registration flow or the traditional account registration flow.
				    true - Use the minibrowser flow
				    false - Use the traditional flow (default)
				 */
				if (request.getParameter("useMiniBrowser") != "")
					webOptions.setUseMiniBrowser(Boolean.parseBoolean(request
							.getParameter("useMiniBrowser")));
				/*
				 * (Optional) Defines whether the "mobile confirmation" option is included in the PayPal account registration flow.
					    true - Show the option
					    false - Do not show the option (default)
				 */
				if (request.getParameter("showMobileConfirm") != "")
					webOptions.setShowMobileConfirm(Boolean
							.parseBoolean(request
									.getParameter("showMobileConfirm")));
				/*
				 * (Optional) Defines whether the "add credit card" option is included in the PayPal account registration flow.
				    true - Show the option (default)
				    false - Do not show the option
				 */
				if (request.getParameter("showAddCreditCard") != "")
					webOptions.setShowAddCreditCard(Boolean
							.parseBoolean(request
									.getParameter("showAddCreditCard")));
				/*
				 * This attribute determines whether a key or a URL is returned
				 * for the redirect URL. Allowable value(s) currently
				 * supported:`Web` - Returns a URL
				 */
				if (request.getParameter("regType") != "")
					req.setRegistrationType(request.getParameter("regType"));
				req.setCreateAccountWebOptions(webOptions);

				// ## Making API call
				// invoke the appropriate method corresponding to API in service
				// wrapper object
				CreateAccountResponse resp = service.createAccount(req);

				// ## Accessing response parameters
				// You can access the response parameters using getter methods
				// in
				// response object as shown below
				// ### Success values
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
								"<a href=\"" + resp.getRedirectURL()
										+ "\">Redirect To PayPal</a>");
						map.put("Execution Status", resp.getExecStatus());
						map.put("CreateAccountKey", resp.getCreateAccountKey());
						session.setAttribute("map", map);
						response.sendRedirect(this.getServletContext()
								.getContextPath() + "/Response.jsp");

					} else {
						session.setAttribute("Error", resp.getError());
						response.sendRedirect(this.getServletContext()
								.getContextPath() + "/Error.jsp");
					}
				}
			} 
			// The AddPaymentCard API operation lets your application set up payment cards as funding sources for PayPal accounts.
			else if (request.getRequestURI().contains("AddPaymentCard")) { 		// AddPaymentCard Request
				RequestEnvelope requestEnvelope = new RequestEnvelope();
				requestEnvelope.setErrorLanguage("en_US");
				NameType nameOnCard = null;

				// (Required) First name of the account or payment card holder.
				if (request.getParameter("firstName") != ""
						&& request.getParameter("lastName") != "") {
					nameOnCard = new NameType(
							request.getParameter("firstName"),
							request.getParameter("lastName"));
				}

				// (Optional) Billing address of the payment card holder. See
				// AddressType Fields for details.
				AddressType billingAddress = new AddressType(
						request.getParameter("billingStreet"),
						request.getParameter("billingCountryCode"));
				// (Optional) The zip or postal code.
				if (request.getParameter("billingPostalCode") != "")
					billingAddress.setPostalCode(request
							.getParameter("billingPostalCode"));
				// (Optional) The state code.
				if (request.getParameter("billingState") != "")
					billingAddress.setState(request
							.getParameter("billingState"));
				// (Required) The city.
				if (request.getParameter("billingCity") != "")
					billingAddress.setCity(request.getParameter("billingCity"));
				/*
				 * (Optional) The second line of the address. Note: This field
				 * is required for Brazilian addresses.
				 */
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

				/*
				 * (Optional) Unique identification number of the PayPal account
				 * to which to add the payment card. You must pass either an
				 * accountId or an emailAddress in this request. You can't leave
				 * both fields out of the message.
				 */
				if (request.getParameter("accountID") != "")
					req.setAccountId(request.getParameter("accountID"));

				/*
				 * (Required if confirmationType is NONE) Unique identifier of
				 * the account to which to add a payment card. Use in cases
				 * where the payment card is being added without the account
				 * holder's explicit confirmation. The value to pass is returned
				 * in the createAccountKey field of a CreateAccount response. A
				 * create account key response expires after 60 minutes. If you
				 * pass an expired key to an Adaptive Accounts API, an error is
				 * returned
				 */
				if (request.getParameter("createAccountKey") != "")
					req.setCreateAccountKey(request
							.getParameter("createAccountKey"));

				/*
				 * (Optional) Email address that uniquely identifies the PayPal
				 * account to which to add the payment card.
				 */
				if (request.getParameter("emailAddress") != "")
					req.setEmailAddress(request.getParameter("emailAddress"));

				// (Optional) Structure in which to pass the URLs for the return
				// and cancelation web flows
				WebOptionsType webOptionsType = new WebOptionsType();

				/*
				 * (Optional) The URL to which PayPal returns the account holder
				 * if he or she cancels confirmation of the payment card
				 * addition.
				 */
				if (request.getParameter("cancelURL") != "")
					webOptionsType.setCancelUrl(request
							.getParameter("cancelURL"));
				// (Optional) A description of the cancelation URL.
				if (request.getParameter("cancelURLDescription") != "")
					webOptionsType.setCancelUrlDescription(request
							.getParameter("cancelURLDescription"));
				/*
				 * (Optional) The URL to which PayPal returns the account holder
				 * once he or she completes confirmation of the payment card
				 * addition.
				 */
				if (request.getParameter("returnURL") != "")
					webOptionsType.setReturnUrl(request
							.getParameter("returnURL"));
				// (Optional) A description of the return URL.
				if (request.getParameter("returnURLDescription") != "")
					webOptionsType.setReturnUrlDescription(request
							.getParameter("returnURLDescription"));
				req.setWebOptions(webOptionsType);

				// (Optional) Date of birth of the payment card holder.
				if (request.getParameter("cardOwnerDateOfBirth") != "")
					req.setCardOwnerDateOfBirth(request
							.getParameter("cardOwnerDateOfBirth"));
				/*
				 * The verification code of the payment card. This parameter is
				 * generally required for calls in which confirmationType is
				 * NONE. With the appropriate account review, this parameter can
				 * be optional.
				 */
				if (request.getParameter("cardVerificationNumber") != "")
					req.setCardVerificationNumber(request
							.getParameter("cardVerificationNumber"));
				// (Optional) 2-digit issue number of the payment card (for
				// Maestro cards only).
				if (request.getParameter("issueNumber") != "")
					req.setIssueNumber(request.getParameter("issueNumber"));

				// (Optional) Start date of the payment card. 
				if (request.getParameter("startMonth") != "") {
					CardDateType startDate = new CardDateType(
							Integer.parseInt(request.getParameter("startMonth")),
							Integer.parseInt(request.getParameter("startYear")));
					req.setStartDate(startDate);
				}

				// (Optional) Expiration date of the payment card. 
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
								"<a href=\"" + resp.getRedirectURL()
										+ "\">Redirect To PayPal</a>");
						map.put("Execution Status", resp.getExecStatus());
						map.put("Funding Source Key",
								resp.getFundingSourceKey());
						session.setAttribute("map", map);
						response.sendRedirect(this.getServletContext()
								.getContextPath() + "/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getError());
						response.sendRedirect(this.getServletContext()
								.getContextPath() + "/Error.jsp");
					}
				}
			} 
			// The AddBankAccount API operation lets your application set up bank accounts as funding sources for PayPal accounts.
			else if (request.getRequestURI().contains("AddBankAccount")) { 		// AddBankAccount Request
				RequestEnvelope requestEnvelope = new RequestEnvelope();
				requestEnvelope.setErrorLanguage("en_US");
				AddBankAccountRequest req = new AddBankAccountRequest(
						requestEnvelope,
						request.getParameter("bankCountryCode"),
						ConfirmationType.fromValue(request
								.getParameter("confirmationType")));

				// (Optional) The date of birth of the account holder in
				// YYYY-MM-DDZ format, for example 1970-01-01Z.
				if (request.getParameter("accountHolderDateOfBirth") != "")
					req.setAccountHolderDateOfBirth(request
							.getParameter("accountHolderDateOfBirth"));

				/*
				 * (Optional) The identification number of the PayPal account
				 * for which a bank account is added. You must specify either
				 * the accountId or emailAddress for this request.
				 */
				if (request.getParameter("accountID") != "")
					req.setAccountId(request.getParameter("accountID"));

				if (request.getParameter("brazilAgencyNumber") != "")
					req.setAgencyNumber(request
							.getParameter("brazilAgencyNumber"));

				// (Optional) The account number (BBAN) of the bank account to
				// be added.
				if (request.getParameter("bankAccountNumber") != "")
					req.setBankAccountNumber(request
							.getParameter("bankAccountNumber"));

				/*
				 * (Optional) The type of bank account to be added. Allowable
				 * values are: CHECKING SAVINGS BUSINESS_SAVINGS
				 * BUSINESS_CHECKINGS NORMAL UNKNOWN
				 */
				if (request.getParameter("bankAccountType") != "")
					req.setBankAccountType(BankAccountType.fromValue(request
							.getParameter("bankAccountType")));

				// (Optional) The code that identifies the bank where the
				// account is held.
				if (request.getParameter("bankCode") != "")
					req.setBankCode(request.getParameter("bankCode"));

				// (Optional) The default value is UNKNOWN.
				if (request.getParameter("bankName") != "")
					req.setBankName(request.getParameter("bankName"));

				// (Optional) The transit number of the bank.
				if (request.getParameter("bankTransitNumber") != "")
					req.setBankTransitNumber(request
							.getParameter("bankTransitNumber"));

				// (Optional) The branch code for the bank.
				if (request.getParameter("branchCode") != "")
					req.setBranchCode(request.getParameter("branchCode"));

				// (Optional) The branch location.
				if (request.getParameter("branchLocation") != "")
					req.setBranchLocation(request
							.getParameter("branchLocation"));

				// (Optional) The Bank/State/Branch number for the bank.
				if (request.getParameter("bsbNumber") != "")
					req.setBsbNumber(request.getParameter("bsbNumber"));

				// CLABE represents the bank information for countries like
				// Mexico.
				if (request.getParameter("clabe") != "")
					req.setClabe(request.getParameter("clabe"));

				// (Optional) The control digits for the bank.
				if (request.getParameter("controlDigit") != "")
					req.setControlDigit(request.getParameter("controlDigit"));

				if (request.getParameter("createAccountKey") != "")
					req.setCreateAccountKey(request
							.getParameter("createAccountKey"));

				/*
				 * (Optional) The email address for the PayPal account. You must
				 * specify either the accountId or emailAddress for this
				 * request.
				 */
				if (request.getParameter("emailAddress") != "")
					req.setEmailAddress(request.getParameter("emailAddress"));

				// (Optional) The IBAN for the bank.
				if (request.getParameter("iban") != "")
					req.setIban(request.getParameter("iban"));

				// (Optional) The institution number for the bank.
				if (request.getParameter("institutionNum") != "")
					req.setInstitutionNumber(request
							.getParameter("institutionNum"));

				// (Optional) The RIB key for the bank.
				if (request.getParameter("rib") != "")
					req.setRibKey(request.getParameter("rib"));

				// (Optional) The bank's routing number.
				if (request.getParameter("routingNum") != "")
					req.setRoutingNumber(request.getParameter("routingNum"));

				// (Optional) The branch sort code.
				if (request.getParameter("sortCode") != "")
					req.setSortCode(request.getParameter("sortCode"));

				// (Optional) Tax id number for Brazil.
				if (request.getParameter("taxIdNum") != "")
					req.setTaxIdNumber(request.getParameter("taxIdNum"));

				// (Optional) Tax id type of CNPJ or CPF, only supported for
				// Brazil.
				if (request.getParameter("taxIdType") != "")
					req.setTaxIdType(request.getParameter("taxIdType"));

				// (Optional) Additional structure to define the URLs for the
				// cancellation and return web flows.
				WebOptionsType webOptionsType = new WebOptionsType();

				/*
				 * (Optional) The URL to which bank account/payment card holders
				 * return when they cancel the bank account addition flow.
				 */
				if (request.getParameter("cancelURL") != "")
					webOptionsType.setCancelUrl(request
							.getParameter("cancelURL"));
				// (Optional) A description of the cancellation URL.
				if (request.getParameter("cancelURLDescription") != "")
					webOptionsType.setCancelUrlDescription(request
							.getParameter("cancelURLDescription"));
				/*
				 * (Optional) The URL to which bank account/payment card holders
				 * return after they add the account or payment card.
				 */
				if (request.getParameter("returnURL") != "")
					webOptionsType.setReturnUrl(request
							.getParameter("returnURL"));
				// (Optional) A description of the return URL.
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
								"<a href=\"" + resp.getRedirectURL()
										+ "\">Redirect To PayPal</a>");
						map.put("Execution Status", resp.getExecStatus());
						map.put("Funding Source Key",
								resp.getFundingSourceKey());
						session.setAttribute("map", map);
						response.sendRedirect(this.getServletContext()
								.getContextPath() + "/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getError());
						response.sendRedirect(this.getServletContext()
								.getContextPath() + "/Error.jsp");
					}
				}
			}
			// The GetUserAgreement API operation lets you retrieve the user agreement for the customer to approve the new PayPal account.
			else if (request.getRequestURI().contains("GetUserAgreement")) { 		// GetUserAgreement Request
				RequestEnvelope requestEnvelope = new RequestEnvelope();
				requestEnvelope.setErrorLanguage("en_US");
				GetUserAgreementRequest req = new GetUserAgreementRequest(
						requestEnvelope);
				/*
				 * (Optional) The code for the country in which the user account
				 * is located. You do not need to provide this country code if
				 * you are passing the createAccount key. Allowable values are:
				 */
				if (request.getParameter("countryCode") != "")
					req.setCountryCode(request.getParameter("countryCode"));
				/*
				 * (Optional) The key returned for this account in the
				 * CreateAccountResponse message in the createAccountKey field.
				 * If you specify this key, do not pass a country code or
				 * language code. Doing so will result in an error.
				 */
				if (request.getParameter("createAccountKey") != "")
					req.setCreateAccountKey(request
							.getParameter("createAccountKey"));
				// (Optional) The code indicating the language to be used for
				// the agreement.
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
						response.sendRedirect(this.getServletContext()
								.getContextPath() + "/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getError());
						response.sendRedirect(this.getServletContext()
								.getContextPath() + "/Error.jsp");
					}
				}

			} 
			// The GetVerifiedStatus API operation lets you determine whether the specified PayPal account's status is verified or unverified.
			else if (request.getRequestURI().contains("GetVerifiedStatus")) {  	// GetVerifiedStatus Request
				RequestEnvelope requestEnvelope = new RequestEnvelope();
				requestEnvelope.setErrorLanguage("en_US");

				GetVerifiedStatusRequest req = new GetVerifiedStatusRequest(
						requestEnvelope, request.getParameter("matchCriteria"));

				/*
				 * (Required) The first name of the PayPal account holder.
				 * Required if matchCriteria is NAME. (Required) The last name
				 * of the PayPal account holder. Required if matchCriteria is
				 * NAME.
				 */
				if (request.getParameter("firstName") != ""
						&& request.getParameter("lastName") != "") {
					req.setFirstName(request.getParameter("firstName"));
					req.setLastName(request.getParameter("lastName"));
				}

				/*
				 * (Optional - must be present if the emailAddress field above
				 * is not) The identifier of the PayPal account holder. If
				 * present, must be one (and only one) of these account
				 * identifier types: 1. emailAddress 2. mobilePhoneNumber 3.
				 * accountId
				 */
				AccountIdentifierType accountIdentifier = new AccountIdentifierType();

				/*
				 * (Required)Email address associated with the PayPal account:
				 * one of the unique identifiers of the account.
				 */
				accountIdentifier.setEmailAddress(request
						.getParameter("emailAddress"));

				req.setAccountIdentifier(accountIdentifier);
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
						response.sendRedirect(this.getServletContext()
								.getContextPath() + "/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getError());
						response.sendRedirect(this.getServletContext()
								.getContextPath() + "/Error.jsp");
					}
				}

			}
			// The SetFundingSourceConfirmed API operation lets your application set up bank accounts as funding sources for PayPal accounts.
			else if (request.getRequestURI().contains(
					"SetFundingSourceConfirmed")) { 		// SetFundingSourceConfirmed Request
				
				RequestEnvelope requestEnvelope = new RequestEnvelope();
				requestEnvelope.setErrorLanguage("en_US");
				SetFundingSourceConfirmedRequest req = new SetFundingSourceConfirmedRequest(
						requestEnvelope,
						request.getParameter("fundingSourceKey"));

				/*
				 * (Optional) The merchant account Id of the PayPal account to
				 * which the funding source was added in the AddPaymentCard or
				 * AddBankAccount request. You must specify either the accountId
				 * or mailAddress when making this request, but never both in
				 * the same request.
				 */
				if (request.getParameter("accountId") != "")
					req.setAccountId(request.getParameter("accountId"));
				/*
				 * (Optional) The email address of the PayPal account to which
				 * the funding source was added in the AddPaymentCard or
				 * AddBankAccount request. You must specify either the accountId
				 * or mailAddress when making this request, but never both in
				 * the same request.
				 */
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
						response.sendRedirect(this.getServletContext()
								.getContextPath() + "/Response.jsp");
					} else {
						session.setAttribute("Error", resp.getError());
						response.sendRedirect(this.getServletContext()
								.getContextPath() + "/Error.jsp");
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

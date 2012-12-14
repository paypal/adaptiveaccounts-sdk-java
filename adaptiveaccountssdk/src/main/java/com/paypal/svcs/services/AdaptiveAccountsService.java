package com.paypal.svcs.services;
import java.io.*;
import java.util.Properties;
import com.paypal.core.BaseService;
import com.paypal.exception.*;
import com.paypal.core.credential.ICredential;
import com.paypal.core.APICallPreHandler;
import com.paypal.core.NVPUtil;
import com.paypal.core.nvp.PlatformAPICallPreHandler;
import com.paypal.svcs.types.aa.CreateAccountRequest;
import com.paypal.svcs.types.aa.CreateAccountResponse;
import com.paypal.svcs.types.aa.GetUserAgreementRequest;
import com.paypal.svcs.types.aa.GetUserAgreementResponse;
import com.paypal.svcs.types.aa.GetVerifiedStatusRequest;
import com.paypal.svcs.types.aa.GetVerifiedStatusResponse;
import com.paypal.svcs.types.aa.AddBankAccountRequest;
import com.paypal.svcs.types.aa.AddBankAccountResponse;
import com.paypal.svcs.types.aa.AddPaymentCardRequest;
import com.paypal.svcs.types.aa.AddPaymentCardResponse;
import com.paypal.svcs.types.aa.SetFundingSourceConfirmedRequest;
import com.paypal.svcs.types.aa.SetFundingSourceConfirmedResponse;
import com.paypal.svcs.types.aa.CheckComplianceStatusRequest;
import com.paypal.svcs.types.aa.CheckComplianceStatusResponse;
import com.paypal.svcs.types.aa.AddPartnerFinancialProductRequest;
import com.paypal.svcs.types.aa.AddPartnerFinancialProductResponse;
import com.paypal.svcs.types.aa.ActivateProductRequest;
import com.paypal.svcs.types.aa.ActivateProductResponse;
import com.paypal.sdk.exceptions.OAuthException;

public class AdaptiveAccountsService extends BaseService {


	// Service Version
	public static final String SERVICE_VERSION = "1.0.3";

	// Service Name
	public static final String SERVICE_NAME = "AdaptiveAccounts";

	//SDK Name
	private static final String SDK_NAME="adaptiveaccounts-java-sdk";
	
	//SDK Version
	private static final String SDK_VERSION="2.1.96";

	
	public AdaptiveAccountsService(File configFile) throws IOException {
		initConfig(configFile);
	}		

	public AdaptiveAccountsService(InputStream config) throws IOException {
		initConfig(config);
	}

	public AdaptiveAccountsService(String configFilePath) throws IOException {
		initConfig(configFilePath);
	}
	
	public AdaptiveAccountsService(Properties properties) {
		initConfig(properties);
	}



	/**	
	 * 
	 *   Coutries Supported:
	 *   AU - Australia
	 *   CA - Canada
	 *   CY - Cyprus
	 *   CZ - Czech Republic
	 *   DK - Denmark
	 *   EE - Estonia
	 *   FI - Finland
	 *   FR - France
	 *   DE - Germany
	 *   GR - Greece
	 *   HU - Hungary
	 *   IT - Italy
	 *   LV - Latvia
	 *   LT - Lithuania
	 *   LU - Luxembourg
	 *   MT - Malta
	 *   NL - Netherlands
	 *   PL - Poland
	 *   PT - Portugal
	 *   SK - Slovak Republic
	 *   SI - Slovenia
	 *   ES - Spain
	 *   SE - Sweden
	 *   UK - United Kingdom
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public CreateAccountResponse createAccount(CreateAccountRequest createAccountRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(createAccountRequest.toNVPString(), SERVICE_NAME, "CreateAccount", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return CreateAccountResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * 
	 *   Coutries Supported:
	 *   AU - Australia
	 *   CA - Canada
	 *   CY - Cyprus
	 *   CZ - Czech Republic
	 *   DK - Denmark
	 *   EE - Estonia
	 *   FI - Finland
	 *   FR - France
	 *   DE - Germany
	 *   GR - Greece
	 *   HU - Hungary
	 *   IT - Italy
	 *   LV - Latvia
	 *   LT - Lithuania
	 *   LU - Luxembourg
	 *   MT - Malta
	 *   NL - Netherlands
	 *   PL - Poland
	 *   PT - Portugal
	 *   SK - Slovak Republic
	 *   SI - Slovenia
	 *   ES - Spain
	 *   SE - Sweden
	 *   UK - United Kingdom
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public CreateAccountResponse createAccount(CreateAccountRequest createAccountRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return createAccount(createAccountRequest, (String) null);
	 }

	/** 
	 * 
	 *   Coutries Supported:
	 *   AU - Australia
	 *   CA - Canada
	 *   CY - Cyprus
	 *   CZ - Czech Republic
	 *   DK - Denmark
	 *   EE - Estonia
	 *   FI - Finland
	 *   FR - France
	 *   DE - Germany
	 *   GR - Greece
	 *   HU - Hungary
	 *   IT - Italy
	 *   LV - Latvia
	 *   LT - Lithuania
	 *   LU - Luxembourg
	 *   MT - Malta
	 *   NL - Netherlands
	 *   PL - Poland
	 *   PT - Portugal
	 *   SK - Slovak Republic
	 *   SI - Slovenia
	 *   ES - Spain
	 *   SE - Sweden
	 *   UK - United Kingdom
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public CreateAccountResponse createAccount(CreateAccountRequest createAccountRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(createAccountRequest.toNVPString(), SERVICE_NAME, "CreateAccount", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return CreateAccountResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	/**	
	 * 
	 *   Countries Supported:
	 *   AU - Australia
	 *   AT - Austria  
	 *   CA - Canada
	 *   CZ - Czech Republic
	 *   EU - European Union *
	 *   FR - France
	 *   DE - Germany
	 *   GB - Great Britain
	 *   GR - Greece
	 *   IE - Ireland
	 *   IL - Israel
	 *   IT - Italy
	 *   JP - Japan
	 *   NL - Netherlands
	 *   NZ - New Zealand (Aotearoa)
	 *   PL - Poland
	 *   PT - Portugal
	 *   RU - Russian Federation
	 *   SG - Singapore
	 *   ZA - South Africa
	 *   ES - Spain
	 *   CH - Switzerland  
	 *   US - United States
	 *   * technically a group of countries
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public GetUserAgreementResponse getUserAgreement(GetUserAgreementRequest getUserAgreementRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(getUserAgreementRequest.toNVPString(), SERVICE_NAME, "GetUserAgreement", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return GetUserAgreementResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * 
	 *   Countries Supported:
	 *   AU - Australia
	 *   AT - Austria  
	 *   CA - Canada
	 *   CZ - Czech Republic
	 *   EU - European Union *
	 *   FR - France
	 *   DE - Germany
	 *   GB - Great Britain
	 *   GR - Greece
	 *   IE - Ireland
	 *   IL - Israel
	 *   IT - Italy
	 *   JP - Japan
	 *   NL - Netherlands
	 *   NZ - New Zealand (Aotearoa)
	 *   PL - Poland
	 *   PT - Portugal
	 *   RU - Russian Federation
	 *   SG - Singapore
	 *   ZA - South Africa
	 *   ES - Spain
	 *   CH - Switzerland  
	 *   US - United States
	 *   * technically a group of countries
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public GetUserAgreementResponse getUserAgreement(GetUserAgreementRequest getUserAgreementRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return getUserAgreement(getUserAgreementRequest, (String) null);
	 }

	/** 
	 * 
	 *   Countries Supported:
	 *   AU - Australia
	 *   AT - Austria  
	 *   CA - Canada
	 *   CZ - Czech Republic
	 *   EU - European Union *
	 *   FR - France
	 *   DE - Germany
	 *   GB - Great Britain
	 *   GR - Greece
	 *   IE - Ireland
	 *   IL - Israel
	 *   IT - Italy
	 *   JP - Japan
	 *   NL - Netherlands
	 *   NZ - New Zealand (Aotearoa)
	 *   PL - Poland
	 *   PT - Portugal
	 *   RU - Russian Federation
	 *   SG - Singapore
	 *   ZA - South Africa
	 *   ES - Spain
	 *   CH - Switzerland  
	 *   US - United States
	 *   * technically a group of countries
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public GetUserAgreementResponse getUserAgreement(GetUserAgreementRequest getUserAgreementRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(getUserAgreementRequest.toNVPString(), SERVICE_NAME, "GetUserAgreement", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return GetUserAgreementResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	/**	
	 * 
	 *   All countries are supported.
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public GetVerifiedStatusResponse getVerifiedStatus(GetVerifiedStatusRequest getVerifiedStatusRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(getVerifiedStatusRequest.toNVPString(), SERVICE_NAME, "GetVerifiedStatus", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return GetVerifiedStatusResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * 
	 *   All countries are supported.
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public GetVerifiedStatusResponse getVerifiedStatus(GetVerifiedStatusRequest getVerifiedStatusRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return getVerifiedStatus(getVerifiedStatusRequest, (String) null);
	 }

	/** 
	 * 
	 *   All countries are supported.
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public GetVerifiedStatusResponse getVerifiedStatus(GetVerifiedStatusRequest getVerifiedStatusRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(getVerifiedStatusRequest.toNVPString(), SERVICE_NAME, "GetVerifiedStatus", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return GetVerifiedStatusResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	/**	
	 * 
	 *   Countries Supported:
	 *   AU - Australia
	 *   CA - Canada
	 *   FR - France
	 *   DE - Germany
	 *   IL - Israel
	 *   IT - Italy
	 *   NL - Netherlands
	 *   UK - United Kingdom
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public AddBankAccountResponse addBankAccount(AddBankAccountRequest addBankAccountRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(addBankAccountRequest.toNVPString(), SERVICE_NAME, "AddBankAccount", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return AddBankAccountResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * 
	 *   Countries Supported:
	 *   AU - Australia
	 *   CA - Canada
	 *   FR - France
	 *   DE - Germany
	 *   IL - Israel
	 *   IT - Italy
	 *   NL - Netherlands
	 *   UK - United Kingdom
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public AddBankAccountResponse addBankAccount(AddBankAccountRequest addBankAccountRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return addBankAccount(addBankAccountRequest, (String) null);
	 }

	/** 
	 * 
	 *   Countries Supported:
	 *   AU - Australia
	 *   CA - Canada
	 *   FR - France
	 *   DE - Germany
	 *   IL - Israel
	 *   IT - Italy
	 *   NL - Netherlands
	 *   UK - United Kingdom
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public AddBankAccountResponse addBankAccount(AddBankAccountRequest addBankAccountRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(addBankAccountRequest.toNVPString(), SERVICE_NAME, "AddBankAccount", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return AddBankAccountResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	/**	
	 * 
	 *   Countries Supported:
	 *   AU - Australia
	 *   AT - Austria  
	 *   BE - Belgium
	 *   BR - Brazil
	 *   CA - Canada
	 *   CZ - Czech Republic
	 *   FR - France
	 *   DE - Germany
	 *   GR - Greece
	 *   HK - Hong Kong
	 *   IE - Ireland
	 *   IT - Italy
	 *   JP - Japan
	 *   LU - Luxembourg
	 *   MX - Mexico
	 *   NL - Netherlands
	 *   NZ - New Zealand (Aotearoa)
	 *   PL - Poland
	 *   PT - Portugal
	 *   RU - Russian Federation
	 *   SG - Singapore
	 *   ZA - South Africa
	 *   ES - Spain
	 *   CH - Switzerland  
	 *   UK - United Kingdom
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public AddPaymentCardResponse addPaymentCard(AddPaymentCardRequest addPaymentCardRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(addPaymentCardRequest.toNVPString(), SERVICE_NAME, "AddPaymentCard", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return AddPaymentCardResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * 
	 *   Countries Supported:
	 *   AU - Australia
	 *   AT - Austria  
	 *   BE - Belgium
	 *   BR - Brazil
	 *   CA - Canada
	 *   CZ - Czech Republic
	 *   FR - France
	 *   DE - Germany
	 *   GR - Greece
	 *   HK - Hong Kong
	 *   IE - Ireland
	 *   IT - Italy
	 *   JP - Japan
	 *   LU - Luxembourg
	 *   MX - Mexico
	 *   NL - Netherlands
	 *   NZ - New Zealand (Aotearoa)
	 *   PL - Poland
	 *   PT - Portugal
	 *   RU - Russian Federation
	 *   SG - Singapore
	 *   ZA - South Africa
	 *   ES - Spain
	 *   CH - Switzerland  
	 *   UK - United Kingdom
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public AddPaymentCardResponse addPaymentCard(AddPaymentCardRequest addPaymentCardRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return addPaymentCard(addPaymentCardRequest, (String) null);
	 }

	/** 
	 * 
	 *   Countries Supported:
	 *   AU - Australia
	 *   AT - Austria  
	 *   BE - Belgium
	 *   BR - Brazil
	 *   CA - Canada
	 *   CZ - Czech Republic
	 *   FR - France
	 *   DE - Germany
	 *   GR - Greece
	 *   HK - Hong Kong
	 *   IE - Ireland
	 *   IT - Italy
	 *   JP - Japan
	 *   LU - Luxembourg
	 *   MX - Mexico
	 *   NL - Netherlands
	 *   NZ - New Zealand (Aotearoa)
	 *   PL - Poland
	 *   PT - Portugal
	 *   RU - Russian Federation
	 *   SG - Singapore
	 *   ZA - South Africa
	 *   ES - Spain
	 *   CH - Switzerland  
	 *   UK - United Kingdom
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public AddPaymentCardResponse addPaymentCard(AddPaymentCardRequest addPaymentCardRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(addPaymentCardRequest.toNVPString(), SERVICE_NAME, "AddPaymentCard", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return AddPaymentCardResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	/**	
	 * 
	 *   To be updated.
	 *   Countries Supported:
	 *   AU - Australia
	 *   AT - Austria  
	 *   BE - Belgium
	 *   BR - Brazil
	 *   CA - Canada
	 *   CZ - Czech Republic
	 *   FR - France
	 *   DE - Germany
	 *   GR - Greece
	 *   HK - Hong Kong
	 *   IE - Ireland
	 *   IT - Italy
	 *   JP - Japan
	 *   LU - Luxembourg
	 *   MX - Mexico
	 *   NL - Netherlands
	 *   NZ - New Zealand (Aotearoa)
	 *   PL - Poland
	 *   PT - Portugal
	 *   RU - Russian Federation
	 *   SG - Singapore
	 *   ZA - South Africa
	 *   ES - Spain
	 *   CH - Switzerland  
	 *   UK - United Kingdom
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public SetFundingSourceConfirmedResponse setFundingSourceConfirmed(SetFundingSourceConfirmedRequest setFundingSourceConfirmedRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(setFundingSourceConfirmedRequest.toNVPString(), SERVICE_NAME, "SetFundingSourceConfirmed", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return SetFundingSourceConfirmedResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * 
	 *   To be updated.
	 *   Countries Supported:
	 *   AU - Australia
	 *   AT - Austria  
	 *   BE - Belgium
	 *   BR - Brazil
	 *   CA - Canada
	 *   CZ - Czech Republic
	 *   FR - France
	 *   DE - Germany
	 *   GR - Greece
	 *   HK - Hong Kong
	 *   IE - Ireland
	 *   IT - Italy
	 *   JP - Japan
	 *   LU - Luxembourg
	 *   MX - Mexico
	 *   NL - Netherlands
	 *   NZ - New Zealand (Aotearoa)
	 *   PL - Poland
	 *   PT - Portugal
	 *   RU - Russian Federation
	 *   SG - Singapore
	 *   ZA - South Africa
	 *   ES - Spain
	 *   CH - Switzerland  
	 *   UK - United Kingdom
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public SetFundingSourceConfirmedResponse setFundingSourceConfirmed(SetFundingSourceConfirmedRequest setFundingSourceConfirmedRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return setFundingSourceConfirmed(setFundingSourceConfirmedRequest, (String) null);
	 }

	/** 
	 * 
	 *   To be updated.
	 *   Countries Supported:
	 *   AU - Australia
	 *   AT - Austria  
	 *   BE - Belgium
	 *   BR - Brazil
	 *   CA - Canada
	 *   CZ - Czech Republic
	 *   FR - France
	 *   DE - Germany
	 *   GR - Greece
	 *   HK - Hong Kong
	 *   IE - Ireland
	 *   IT - Italy
	 *   JP - Japan
	 *   LU - Luxembourg
	 *   MX - Mexico
	 *   NL - Netherlands
	 *   NZ - New Zealand (Aotearoa)
	 *   PL - Poland
	 *   PT - Portugal
	 *   RU - Russian Federation
	 *   SG - Singapore
	 *   ZA - South Africa
	 *   ES - Spain
	 *   CH - Switzerland  
	 *   UK - United Kingdom
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public SetFundingSourceConfirmedResponse setFundingSourceConfirmed(SetFundingSourceConfirmedRequest setFundingSourceConfirmedRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(setFundingSourceConfirmedRequest.toNVPString(), SERVICE_NAME, "SetFundingSourceConfirmed", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return SetFundingSourceConfirmedResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	/**	
	 * 
	 *   To be updated.
	 *   Countries Supported:
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public CheckComplianceStatusResponse checkComplianceStatus(CheckComplianceStatusRequest checkComplianceStatusRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(checkComplianceStatusRequest.toNVPString(), SERVICE_NAME, "CheckComplianceStatus", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return CheckComplianceStatusResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * 
	 *   To be updated.
	 *   Countries Supported:
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public CheckComplianceStatusResponse checkComplianceStatus(CheckComplianceStatusRequest checkComplianceStatusRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return checkComplianceStatus(checkComplianceStatusRequest, (String) null);
	 }

	/** 
	 * 
	 *   To be updated.
	 *   Countries Supported:
	 *   US - United States
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public CheckComplianceStatusResponse checkComplianceStatus(CheckComplianceStatusRequest checkComplianceStatusRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(checkComplianceStatusRequest.toNVPString(), SERVICE_NAME, "CheckComplianceStatus", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return CheckComplianceStatusResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	/**	
	 * 
	 *   To be updated.
	 *   Countries Supported:
	 *   US - United States
	 *   Supported FinancialProduct: PayPal netSpend Master Prepaid
	 * Card
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public AddPartnerFinancialProductResponse addPartnerFinancialProduct(AddPartnerFinancialProductRequest addPartnerFinancialProductRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(addPartnerFinancialProductRequest.toNVPString(), SERVICE_NAME, "AddPartnerFinancialProduct", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return AddPartnerFinancialProductResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * 
	 *   To be updated.
	 *   Countries Supported:
	 *   US - United States
	 *   Supported FinancialProduct: PayPal netSpend Master Prepaid
	 * Card
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public AddPartnerFinancialProductResponse addPartnerFinancialProduct(AddPartnerFinancialProductRequest addPartnerFinancialProductRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return addPartnerFinancialProduct(addPartnerFinancialProductRequest, (String) null);
	 }

	/** 
	 * 
	 *   To be updated.
	 *   Countries Supported:
	 *   US - United States
	 *   Supported FinancialProduct: PayPal netSpend Master Prepaid
	 * Card
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public AddPartnerFinancialProductResponse addPartnerFinancialProduct(AddPartnerFinancialProductRequest addPartnerFinancialProductRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(addPartnerFinancialProductRequest.toNVPString(), SERVICE_NAME, "AddPartnerFinancialProduct", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return AddPartnerFinancialProductResponse.createInstance(NVPUtil.decode(response), "", -1);
	}
	/**	
	 * 
	 *   To Activate POS - For a POC - Internal Purposes
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public ActivateProductResponse activateProduct(ActivateProductRequest activateProductRequest, String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(activateProductRequest.toNVPString(), SERVICE_NAME, "ActivateProduct", apiUsername, getAccessToken(), getTokenSecret());
	    ((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return ActivateProductResponse.createInstance(NVPUtil.decode(response), "", -1);
	 }
	 
	/** 
	 * 
	 *   To Activate POS - For a POC - Internal Purposes
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public ActivateProductResponse activateProduct(ActivateProductRequest activateProductRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	return activateProduct(activateProductRequest, (String) null);
	 }

	/** 
	 * 
	 *   To Activate POS - For a POC - Internal Purposes
	 * 
	 * @throws SSLConfigurationException
	 * @throws InvalidCredentialException
	 * @throws UnsupportedEncodingException
	 * @throws IOException
	 * @throws HttpErrorException
	 * @throws InvalidResponseDataException
	 * @throws ClientActionRequiredException
	 * @throws MissingCredentialException
	 * @throws InterruptedException
	 * @throws OAuthException
	 */
	 public ActivateProductResponse activateProduct(ActivateProductRequest activateProductRequest, ICredential credential) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
	 	APICallPreHandler apiCallPreHandler = null;
	 	String portName = "AdaptiveAccounts";
		apiCallPreHandler = new PlatformAPICallPreHandler(activateProductRequest.toNVPString(), SERVICE_NAME, "ActivateProduct", credential);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkName(SDK_NAME);
		((PlatformAPICallPreHandler) apiCallPreHandler).setSdkVersion(SDK_VERSION);
		((PlatformAPICallPreHandler) apiCallPreHandler).setPortName(portName);
	 	String response = call(apiCallPreHandler);
		return ActivateProductResponse.createInstance(NVPUtil.decode(response), "", -1);
	}

}
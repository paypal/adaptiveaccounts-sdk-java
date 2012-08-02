package com.paypal.svcs.services;
import java.io.*;
import com.paypal.core.BaseService;
import com.paypal.exception.*;
import com.paypal.core.NVPUtil;
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
import com.paypal.sdk.exceptions.OAuthException;

public class AdaptiveAccountsService extends BaseService{


	// Service Version
	public static final String SERVICE_VERSION = "1.0.3";

	// Service Name
	public static final String SERVICE_NAME = "AdaptiveAccounts";

	
	public AdaptiveAccountsService(File configFile) throws IOException, FileNotFoundException {
		super(SERVICE_NAME, SERVICE_VERSION);
		initConfig(configFile);
	}		

	public AdaptiveAccountsService(InputStream config) throws IOException, FileNotFoundException {
		super(SERVICE_NAME, SERVICE_VERSION);
		initConfig(config);
	}

	public AdaptiveAccountsService(String configFilePath) throws IOException, FileNotFoundException {
		super(SERVICE_NAME, SERVICE_VERSION);
		initConfig(configFilePath);
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
	 	String response = call("CreateAccount", createAccountRequest.toNVPString(), apiUsername);
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
	 	return createAccount(createAccountRequest, null);
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
	 	String response = call("GetUserAgreement", getUserAgreementRequest.toNVPString(), apiUsername);
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
	 	return getUserAgreement(getUserAgreementRequest, null);
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
	 	String response = call("GetVerifiedStatus", getVerifiedStatusRequest.toNVPString(), apiUsername);
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
	 	return getVerifiedStatus(getVerifiedStatusRequest, null);
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
	 	String response = call("AddBankAccount", addBankAccountRequest.toNVPString(), apiUsername);
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
	 	return addBankAccount(addBankAccountRequest, null);
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
	 	String response = call("AddPaymentCard", addPaymentCardRequest.toNVPString(), apiUsername);
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
	 	return addPaymentCard(addPaymentCardRequest, null);
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
	 	String response = call("SetFundingSourceConfirmed", setFundingSourceConfirmedRequest.toNVPString(), apiUsername);
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
	 	return setFundingSourceConfirmed(setFundingSourceConfirmedRequest, null);
	 }


}
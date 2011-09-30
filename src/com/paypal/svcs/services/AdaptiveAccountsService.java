/**
 * AdaptiveAccountsService wrapper class
 * Auto generated code
 */
package com.paypal.svcs.services;

import com.paypal.core.BaseService;
import com.paypal.core.NVPUtil;
import com.paypal.exception.ClientActionRequiredException;
import com.paypal.exception.HttpErrorException;
import com.paypal.exception.InvalidCredentialException;
import com.paypal.exception.InvalidResponseDataException;
import com.paypal.exception.MissingCredentialException;
import com.paypal.exception.SSLConfigurationException;
import com.paypal.sdk.exceptions.OAuthException;
import com.paypal.svcs.types.aa.AddBankAccountRequest;
import com.paypal.svcs.types.aa.AddBankAccountResponse;
import com.paypal.svcs.types.aa.AddPaymentCardRequest;
import com.paypal.svcs.types.aa.AddPaymentCardResponse;
import com.paypal.svcs.types.aa.CreateAccountRequest;
import com.paypal.svcs.types.aa.CreateAccountResponse;
import com.paypal.svcs.types.aa.GetUserAgreementRequest;
import com.paypal.svcs.types.aa.GetUserAgreementResponse;
import com.paypal.svcs.types.aa.GetVerifiedStatusRequest;
import com.paypal.svcs.types.aa.GetVerifiedStatusResponse;
import com.paypal.svcs.types.aa.SetFundingSourceConfirmedRequest;
import com.paypal.svcs.types.aa.SetFundingSourceConfirmedResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;


public class AdaptiveAccountsService extends BaseService {

	private static final String SERVICE_VERSION = "1.0.3";
	private static final String SERVICE_NAME = "AdaptiveAccounts";

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
 * Coutries Supported:
 * AU - Australia
 * CA - Canada
 * CY - Cyprus
 * CZ - Czech Republic
 * DK - Denmark
 * EE - Estonia
 * FI - Finland
 * FR - France
 * DE - Germany
 * GR - Greece
 * HU - Hungary
 * IT - Italy
 * LV - Latvia
 * LT - Lithuania
 * LU - Luxembourg
 * MT - Malta
 * NL - Netherlands
 * PL - Poland
 * PT - Portugal
 * SK - Slovak Republic
 * SI - Slovenia
 * ES - Spain
 * SE - Sweden
 * UK - United Kingdom
 * US - United States
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
	public CreateAccountResponse createAccount (CreateAccountRequest CreateAccountRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("CreateAccount", CreateAccountRequest.toNVPString(), apiUsername);
		return new CreateAccountResponse(NVPUtil.decode(response), "");
	}

	public CreateAccountResponse createAccount (CreateAccountRequest CreateAccountRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return createAccount(CreateAccountRequest, null);
	}

	/**
 * Countries Supported:
 * AU - Australia
 * AT - Austria  
 * CA - Canada
 * CZ - Czech Republic
 * EU - European Union *
 * FR - France
 * DE - Germany
 * GB - Great Britain
 * GR - Greece
 * IE - Ireland
 * IL - Israel
 * IT - Italy
 * JP - Japan
 * NL - Netherlands
 * NZ - New Zealand (Aotearoa)
 * PL - Poland
 * PT - Portugal
 * RU - Russian Federation
 * SG - Singapore
 * ZA - South Africa
 * ES - Spain
 * CH - Switzerland  
 * US - United States
 * * technically a group of countries
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
	public GetUserAgreementResponse getUserAgreement (GetUserAgreementRequest GetUserAgreementRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("GetUserAgreement", GetUserAgreementRequest.toNVPString(), apiUsername);
		return new GetUserAgreementResponse(NVPUtil.decode(response), "");
	}

	public GetUserAgreementResponse getUserAgreement (GetUserAgreementRequest GetUserAgreementRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return getUserAgreement(GetUserAgreementRequest, null);
	}

	/**
 * All countries are supported.
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
	public GetVerifiedStatusResponse getVerifiedStatus (GetVerifiedStatusRequest GetVerifiedStatusRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("GetVerifiedStatus", GetVerifiedStatusRequest.toNVPString(), apiUsername);
		return new GetVerifiedStatusResponse(NVPUtil.decode(response), "");
	}

	public GetVerifiedStatusResponse getVerifiedStatus (GetVerifiedStatusRequest GetVerifiedStatusRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return getVerifiedStatus(GetVerifiedStatusRequest, null);
	}

	/**
 * Countries Supported:
 * AU - Australia
 * CA - Canada
 * FR - France
 * DE - Germany
 * IL - Israel
 * IT - Italy
 * NL - Netherlands
 * UK - United Kingdom
 * US - United States
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
	public AddBankAccountResponse addBankAccount (AddBankAccountRequest AddBankAccountRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("AddBankAccount", AddBankAccountRequest.toNVPString(), apiUsername);
		return new AddBankAccountResponse(NVPUtil.decode(response), "");
	}

	public AddBankAccountResponse addBankAccount (AddBankAccountRequest AddBankAccountRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return addBankAccount(AddBankAccountRequest, null);
	}

	/**
 * Countries Supported:
 * AU - Australia
 * AT - Austria  
 * BE - Belgium
 * BR - Brazil
 * CA - Canada
 * CZ - Czech Republic
 * FR - France
 * DE - Germany
 * GR - Greece
 * HK - Hong Kong
 * IE - Ireland
 * IT - Italy
 * JP - Japan
 * LU - Luxembourg
 * MX - Mexico
 * NL - Netherlands
 * NZ - New Zealand (Aotearoa)
 * PL - Poland
 * PT - Portugal
 * RU - Russian Federation
 * SG - Singapore
 * ZA - South Africa
 * ES - Spain
 * CH - Switzerland  
 * UK - United Kingdom
 * US - United States
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
	public AddPaymentCardResponse addPaymentCard (AddPaymentCardRequest AddPaymentCardRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("AddPaymentCard", AddPaymentCardRequest.toNVPString(), apiUsername);
		return new AddPaymentCardResponse(NVPUtil.decode(response), "");
	}

	public AddPaymentCardResponse addPaymentCard (AddPaymentCardRequest AddPaymentCardRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return addPaymentCard(AddPaymentCardRequest, null);
	}

	/**
 * To be updated.
 * Countries Supported:
 * AU - Australia
 * AT - Austria  
 * BE - Belgium
 * BR - Brazil
 * CA - Canada
 * CZ - Czech Republic
 * FR - France
 * DE - Germany
 * GR - Greece
 * HK - Hong Kong
 * IE - Ireland
 * IT - Italy
 * JP - Japan
 * LU - Luxembourg
 * MX - Mexico
 * NL - Netherlands
 * NZ - New Zealand (Aotearoa)
 * PL - Poland
 * PT - Portugal
 * RU - Russian Federation
 * SG - Singapore
 * ZA - South Africa
 * ES - Spain
 * CH - Switzerland  
 * UK - United Kingdom
 * US - United States
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
	public SetFundingSourceConfirmedResponse setFundingSourceConfirmed (SetFundingSourceConfirmedRequest SetFundingSourceConfirmedRequest,  String apiUsername) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		String response = call("SetFundingSourceConfirmed", SetFundingSourceConfirmedRequest.toNVPString(), apiUsername);
		return new SetFundingSourceConfirmedResponse(NVPUtil.decode(response), "");
	}

	public SetFundingSourceConfirmedResponse setFundingSourceConfirmed (SetFundingSourceConfirmedRequest SetFundingSourceConfirmedRequest) throws SSLConfigurationException, InvalidCredentialException, UnsupportedEncodingException, IOException, HttpErrorException, InvalidResponseDataException, ClientActionRequiredException, MissingCredentialException, InterruptedException, OAuthException {
		return setFundingSourceConfirmed(SetFundingSourceConfirmedRequest, null);
	}

}

package com.sample.adaptiveaccounts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.paypal.exception.ClientActionRequiredException;
import com.paypal.exception.HttpErrorException;
import com.paypal.exception.InvalidCredentialException;
import com.paypal.exception.InvalidResponseDataException;
import com.paypal.exception.MissingCredentialException;
import com.paypal.exception.SSLConfigurationException;
import com.paypal.sdk.exceptions.OAuthException;
import com.paypal.svcs.services.AdaptiveAccountsService;
import com.paypal.svcs.types.aa.AddressType;
import com.paypal.svcs.types.aa.CreateAccountRequest;
import com.paypal.svcs.types.aa.CreateAccountResponse;
import com.paypal.svcs.types.aa.NameType;
import com.paypal.svcs.types.common.AckCode;
import com.paypal.svcs.types.common.RequestEnvelope;

/**
 * Servlet implementation class CreateAccountServlet
 */
public class CreateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CreateAccountServlet() {
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
		getServletConfig().getServletContext()
				.getRequestDispatcher("/CreateAccount.jsp")
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestEnvelope requestEnvelope = new RequestEnvelope();
		requestEnvelope.setErrorLanguage("en_US");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		NameType name = new NameType(firstName, lastName);
		String street = request.getParameter("street");
		String countryCode = request.getParameter("countryCode");
		String preferredLanguageCode = request
				.getParameter("preferredLanguageCode");
		AddressType address = new AddressType(street, countryCode);
		address.setPostalCode(request.getParameter("postalCode"));
		address.setState(request.getParameter("state"));
		address.setCity(request.getParameter("city"));
		CreateAccountRequest req = new CreateAccountRequest(requestEnvelope,
				name, address, preferredLanguageCode);
		req.setContactPhoneNumber(request.getParameter("contactNum"));
		req.setCitizenshipCountryCode(request
				.getParameter("citizenshipCtryCode"));
		req.setCurrencyCode(request.getParameter("currencyCode"));
		req.setEmailAddress(request.getParameter("email"));
		AdaptiveAccountsService service = new AdaptiveAccountsService(this
				.getServletContext().getRealPath("/")
				+ "/WEB-INF/sdk_config.properties");
		try {
			CreateAccountResponse resp = service.createAccount(req);
			response.getWriter().println(
					"Ack:" + resp.getResponseEnvelope().getAck());
			response.setContentType("text/html");
			response.getWriter().println("<a href='index.html'>Home</a>");
			if (resp.getResponseEnvelope().getAck().equals(AckCode.SUCCESS)) {
				// String redirectURL =
				// "https://www.sanbox.paypal.com/cgi-bin/webscr?cmd=_grant-permission&request_token="
				// + resp.getPreapprovalKey();
				//response.getWriter().println(
						//"<a href=https://www.sandbox.paypal.com/cgi-bin/webscr?cmd=_ap-payment&paykey="
							//	+ resp.getPayKey() + ">RedirectURL</a>");
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

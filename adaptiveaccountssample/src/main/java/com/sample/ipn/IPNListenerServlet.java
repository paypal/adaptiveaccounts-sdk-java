package com.sample.ipn;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.paypal.core.LoggingManager;
import com.paypal.ipn.IPNMessage;
import com.paypal.svcs.services.AdaptiveAccountsService;

public class IPNListenerServlet extends HttpServlet {
	
	/* 
	 * receiver for PayPal ipn call back.
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		IPNMessage ipnlistener=null;
		AdaptiveAccountsService service = new AdaptiveAccountsService(this
				.getClass().getResourceAsStream("/sdk_config.properties"));
		try{
			
			ipnlistener = new IPNMessage(request);

		}catch(IOException io){
			LoggingManager.debug(IPNListenerServlet.class, io.getMessage());
		}
		
		
		boolean isIpnVerified = ipnlistener.isIpnVerified();
		Map<String,String> map = ipnlistener.getIpnParamValueMap();
		
		LoggingManager.info(IPNListenerServlet.class, "******* IPN (name:value) pair : "+ map + "  " +"  ======== IPN verified : "+ isIpnVerified);
	}
}

package com.paypal.sdk.mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.paypal.svcs.types.aa.GetUserAgreementRequest;
import com.sample.adaptiveaccounts.AdaptiveAccountsServlet;

@Test
public class AdaptiveAccountsMockTestCase {

	HttpServletRequest req = mock(HttpServletRequest.class);
	HttpServletResponse resp = mock(HttpServletResponse.class);
	AdaptiveAccountsServlet aaServlet = new AdaptiveAccountsServlet();

	public void simpleTest() {
		GetUserAgreementRequest getUA = new GetUserAgreementRequest();
		Assert.assertNotNull(getUA);

		JSONTokener tokener = new JSONTokener(new InputStreamReader(this
				.getClass().getResourceAsStream("/requestparams.json")));
		JSONObject jsonObject =  null;
		try {
			jsonObject = new JSONObject(tokener);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			// e1.printStackTrace();
		}
		
		for (String key : JSONObject.getNames(jsonObject)) {
			try {
				when(req.getParameter(key)).thenReturn(jsonObject.getString(key));
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}

		try {
			 aaServlet.createAccount(req);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

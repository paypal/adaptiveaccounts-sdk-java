<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.net.URL"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdaptiveAccounts - AddPaymentCard</title>
<%
	URL currentURL = new URL(request.getRequestURL().toString());
	URL returnURL = new URL(currentURL, "index.html");
%>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>AddPaymentCard</h3>
			<div id="apidetails">AddPaymentCard API operation lets your
				application set up credit cards as funding sources for PayPal
				accounts.</div>
		</div>
		<form method="POST">
			<div id="request_form">
				<div class="params">
					<div class="param_name">First Name*</div>
					<div class="param_value">
						<input type="text" name="firstName" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Last Name*</div>
					<div class="param_value">
						<input type="text" name="lastName" value="" />
					</div>
				</div>

				<div class="input_header">Card Details</div>
				<table class="params">
					<tr>
						<th class="param_name">Card Number*</th>
						<th class="param_name">Card Type*</th>
						<th class="param_name">Card Owner Date Of Birth</th>
						<th class="param_name">Card Verification Number</th>
						<th class="param_name">Issue Number</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text" name="cardNumber"
							value="" /></td>
						<td class="param_value"><select name="cardType">
								<option value="">--Select--</option>
								<option value="Visa">Visa</option>
								<option value="MasterCard">MasterCard</option>
								<option value="AmericanExpress">AmericanExpress</option>
								<option value="Discover">Discover</option>
								<option value="SwitchMaestro">SwitchMaestro</option>
								<option value="Solo">Solo</option>
								<option value="CarteAurore">CarteAurore</option>
								<option value="CarteBleue">CarteBleue</option>
								<option value="Cofinoga">Cofinoga</option>
								<option value="4etoiles">4etoiles</option>
								<option value="CartaAura">CartaAura</option>
								<option value="TarjetaAurora">TarjetaAurora</option>
								<option value="JCB">JCB</option>


						</select></td>
						<td class="param_value"><input type="text"
							name="cardOwnerDateOfBirth" value="" /></td>
						<td class="param_value"><input type="text"
							name="cardVerificationNumber" value="" /></td>
						<td class="param_value"><input type="text" name="issueNumber"
							value="" /></td>
				</table>
				<div class="input_header">Start Date</div>
				<table class="params">
					<tr>
						<th class="param_name">Start Month</th>
						<th class="param_name">Start Year</th>
					</tr>
					<tr>
						<td class="param_value"><select name="startMonth">
								<option value="">--Select--</option>
								<option value="01">01</option>
								<option value="02">02</option>
								<option value="03">03</option>
								<option value="04">04</option>
								<option value="05">05</option>
								<option value="06">06</option>
								<option value="07">07</option>
								<option value="08">08</option>
								<option value="09">09</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>

						</select></td>
						<td class="param_value"><input type="text" name="startYear"
							value="" /></td>
					</tr>
				</table>
				<div class="input_header">Expiration Date*</div>
				<table class="params">
					<tr>
						<th class="param_name">Expiration Month</th>
						<th class="param_name">Expiration Year</th>
					</tr>
					<tr>
						<td class="param_value"><select name="expirationMonth">
								<option value="">--Select--</option>
								<option value="01">01</option>
								<option value="02">02</option>
								<option value="03">03</option>
								<option value="04">04</option>
								<option value="05">05</option>
								<option value="06">06</option>
								<option value="07">07</option>
								<option value="08">08</option>
								<option value="09">09</option>
								<option value="10">10</option>
								<option value="11">11</option>
								<option value="12">12</option>

						</select></td>
						<td class="param_value"><input type="text"
							name="expirationYear" value="" /></td>
					</tr>
				</table>
				<div class="params">
					<div class="param_name">Confirmation Type*(NOTE:ConfirmationType
						NONE requires advanced permission levels. You must pass the
						createAccount key.)</div>
					<div class="param_value">
						<select name="confirmationType">
							<option value="WEB">WEB</option>
							<option value="MOBILE">MOBILE</option>
							<option value="NONE">NONE</option>
						</select>
					</div>
				</div>
				<div class="params">
					<div class="param_name">
						Create Account Key(Get CreateAccountKey via <a href='CreateAccount'>CreateAccount</a>)
					</div>
					<div class="param_value">
						<input type="text" name="createAccountKey" value="" />
					</div>
				</div>
				<div class="input_header">For Confirmation Type - WEB</div>
				<table class="params">
					<tr>
						<th class="param_name">Cancel URL</th>
						<th class="param_name">Cancel URL Description</th>
						<th class="param_name">Return URL</th>
						<th class="param_name">Return URL Description</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text" name="cancelURL"
							value="<%=returnURL%>" /></td>
						<td class="param_value"><input type="text"
							name="cancelURLDescription" value="" /></td>
						<td class="param_value"><input type="text" name="returnURL"
							value="<%=returnURL%>" /></td>
						<td class="param_value"><input type="text"
							name="returnURLDescription" value="" /></td>
					</tr>
				</table>
				<div class="note">You must specify either account ID or email
					Address of your paypal account</div>
				<table class="params">
					<tr>
						<th class="param_name">Account ID</th>
						<th class="param_name">Email Address</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text" name="accountID"
							value="" /></td>
						<td class="param_value"><input type="text"
							name="emailAddress" value="" /></td>
					</tr>
				</table>
				<div class="input_header">Address Details</div>
				<table class="params">
					<tr>
						<th class="param_name">Address Line1*</th>
						<th class="param_name">Address Line2</th>
						<th class="param_name">City*</th>
						<th class="param_name">State*</th>
						<th class="param_name">PostalCode*</th>
						<th class="param_name">CountryCode*</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text"
							name="billingStreet" value="1,Main St" /></td>
						<td class="param_value"><input type="text"
							name="billingLine2" value="" /></td>
						<td class="param_value"><input type="text" name="billingCity"
							value="Austin" /></td>
						<td class="param_value"><input type="text"
							name="billingState" value="TX" /></td>
						<td class="param_value"><input type="text"
							name="billingPostalCode" value="78750" /></td>
						<td class="param_value"><input type="text"
							name="billingCountryCode" value="US" /></td>
					</tr>
				</table>
				<div class="submit">
					<input type="submit" name="AddPaymentCardBtn"
						value="AddPaymentCard" /><br />
				</div>
				<a href="../index.html">Home</a>
			</div>
		</form>

	</div>

</body>
</html>
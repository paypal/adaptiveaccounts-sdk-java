<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdaptiveAccounts</title>
<%
	StringBuilder url = new StringBuilder();
	url.append("http://");
	url.append(request.getServerName());
	url.append(":");
	url.append(request.getServerPort());
	url.append(request.getContextPath());
	String returnURL = url.toString() + "/index.html";
%>
</head>
<body>
	<h2>CreateAccount API Test Page</h2>
	<form method="POST">
		<div class="params">
			<div class="param_name">FirstName</div>
			<div class="param_value">
				<input type="text" name="firstName" value="John" size="50"
					maxlength="260" />
			</div>
		</div>
		<div class="params">
			<div class="param_name">LastName</div>
			<div class="param_value">
				<input type="text" name="lastName" value="Lichard" size="50"
					maxlength="260" />
			</div>
		</div>
		<div class="params">
			<div class="param_name">PreferredLanguage</div>
			<div class="param_value">
				<input type="text" name="preferredLanguageCode" value="en_US"
					size="50" maxlength="260" />
			</div>
		</div>
		<div class="params">
			<div class="param_name">Address Line1</div>
			<div class="param_value">
				<input type="text" name="street" value="1,Main St" size="50"
					maxlength="260" />
			</div>
		</div>

		<div class="params">
			<div class="param_name">City</div>
			<div class="param_value">
				<input type="text" name="city" value="Austin" size="50"
					maxlength="260" />
			</div>

		</div>
		<div class="params">
			<div class="param_name">State</div>
			<div class="param_value">
				<input type="text" name="state" value="TX" size="50" maxlength="260" />
			</div>
		</div>
		<div class="params">
			<div class="param_name">PostalCode</div>
			<div class="param_value">
				<input type="text" name="postalCode" value="78750" size="50"
					maxlength="260" />
			</div>
		</div>

		<div class="params">
			<div class="param_name">CountryCode</div>
			<div class="param_value">
				<input type="text" name="countryCode" value="US" size="50"
					maxlength="260" />
			</div>
		</div>
		<div class="params">
			<div class="param_name">ContactNumber</div>
			<div class="param_value">
				<input type="text" name="contactNum" value="5126914160" size="50"
					maxlength="260" />
			</div>
		</div>
		<div class="params">
			<div class="param_name">CitizenshipCountryCode</div>
			<div class="param_value">
				<input type="text" name="citizenshipCtryCode" value="US" size="50"
					maxlength="260" />
			</div>

		</div>
		<div class="params">
			<div class="param_name">CurrencyCode</div>
			<div class="param_value">
				<input type="text" name="currencyCode" value="USD" size="50"
					maxlength="260" />
			</div>

		</div>
		<div class="params">
			<div class="param_name">Email</div>
			<div class="param_value">
				<input type="text" name="email" value="test@paypal.com" size="50"
					maxlength="260" />
			</div>
		</div>
		<div class="params">
			<div class="param_name">Registration Type</div>
			<div class="param_value">
				<input type="text" name="regType" value="WEB" size="50"
					maxlength="260" />
			</div>
		</div>
		<div class="params">
			<div class="param_name">Return Url</div>
			<div class="param_value">
				<input type="text" name="returnUrl" value="<%=returnURL%>"
					size="50" maxlength="260" />
			</div>
		</div>
		<input type="submit" name="CreateAccountBtn" value="CreateAccount" />
		<a href="index.html">Home</a>
	</form>

</body>
</html>
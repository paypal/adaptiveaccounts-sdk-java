<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdaptiveAccounts - GetUserAgreement</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>GetUserAgreement</h3>
			<div id="apidetails">GetUserAgreement API operation lets you
				retrieve the user agreement for the customer to approve the new
				PayPal account.</div>
		</div>
		<form method="POST">
			<div id="request_form">
				<div class="note">If you specify CreateAccount key, do not
					pass a country code or language code. Doing so will result in an
					error.</div>
				<div class="params">
					<div class="param_name">
						Create Account Key(Get CreateAccountKey via <a
							href='CreateAccount'>CreateAccount</a> )
					</div>
					<div class="param_value">
						<input type="text" name="createAccountKey" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Country Code</div>
					<div class="param_value">
						<select name="countryCode">
							<option value="">--Select--</option>
							<option value="AU">AU - Australia</option>
							<option value="AT">AT - Austria</option>
							<option value="CA">CA - Canada</option>
							<option value="CZ">CZ - Czech Republic</option>
							<option value="EU">EU - European Union *</option>
							<option value="FR">FR - France</option>
							<option value="DE">DE - Germany</option>
							<option value="GB">GB - Great Britain</option>
							<option value="GR">GR - Greece</option>
							<option value="IE">IE - Ireland</option>
							<option value="IL">IL - Israel</option>
							<option value="IT">IT - Italy</option>
							<option value="JP">JP - Japan</option>
							<option value="NL">NL - Netherlands</option>
							<option value="NZ">NZ - New Zealand (Aotearoa)</option>
							<option value="PL">PL - Poland</option>
							<option value="PT">PT - Portugal</option>
							<option value="RU">RU - Russian Federation</option>
							<option value="SG">SG - Singapore</option>
							<option value="ZA">ZA - South Africa</option>
							<option value="ES">ES - Spain</option>
							<option value="CH">CH - Switzerland</option>
							<option value="US">US - United States *</option>
						</select>
					</div>
				</div>
				<div class="params">
					<div class="param_name">Language Code</div>
					<div class="param_value">
						<input type="text" name="languageCode" value="" />
					</div>
				</div>
				<div class="submit">
					<input type="submit" name="GetUserAgreementBtn"
						value="GetUserAgreement" /><br />
				</div>
				<a href="../index.html">Home</a>
			</div>
		</form>

	</div>

</body>
</html>
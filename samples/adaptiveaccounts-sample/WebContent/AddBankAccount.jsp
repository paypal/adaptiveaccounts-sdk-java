<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="java.net.URL"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdaptiveAccounts - AddBankAccount</title>
<%
	URL currentURL = new URL(request.getRequestURL().toString());
	URL returnURL = new URL(currentURL, "index.html");
%>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>AddBankAccount</h3>
			<div id="apidetails">AddBankAccount API operation lets your
				application set up bank accounts as funding sources for PayPal
				accounts.</div>
		</div>
		<form method="POST">
			<div id="request_form">
				<div class="params">
					<div class="param_name">Bank Country Code*</div>
					<div class="param_value">
						<input type="text" name="bankCountryCode" value="" />
					</div>
				</div>
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
						<td class="param_value"><input type="text" name="cancelURLDescription"
							value="" /></td>
						<td class="param_value"><input type="text" name="returnURL"
							value="<%=returnURL%>" /></td>
						<td class="param_value"><input type="text" name="returnURLDescription"
							value="" /></td>
					</tr>
				</table>
				<div class="note">You must specify either account ID
					or email Address of your paypal account</div>
				<table class="params">
					<tr>
						<th class="param_name">Account ID</th>
						<th class="param_name">Email Address</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text" name="accountID"
							value="" />
						</td>
						<td class="param_value"><input type="text"
							name="emailAddress" value="" />
						</td>
					</tr>
				</table>
				<div class="params">
					<div class="param_name">Bank's routing number*</div>
					<div class="param_value">
						<input type="text" name="routingNum" value="" />
					</div>
				</div>
				<div class="input_header">Account Details</div>
				<table class="params">
					<tr>
						<th class="param_name">Bank Account Number*</th>
						<th class="param_name">Account Holder Date Of Birth</th>
						<th class="param_name">Bank Account Type</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text"
							name="bankAccountNumber" value="" />
						</td>
						<td class="param_value"><input type="text"
							name="accountHolderDateOfBirth" value="" />
						</td>
						<td class="param_value"><select name="bankAccountType">
								<option value="">--Select--</option>
								<option value="CHECKING">CHECKING</option>
								<option value="SAVINGS">SAVINGS</option>
								<option value="BUSINESS_CHECKING">BUSINESS_CHECKING</option>
								<option value="BUSINESS_SAVINGS">BUSINESS_SAVINGS</option>
								<option value="NORMAL">NORMAL</option>
								<option value="UNKNOWN">UNKNOWN</option>
						</select>
						</td>
					</tr>
				</table>
				<div class="input_header">Bank Details</div>
				<table class="params">
					<tr>
						<th class="param_name">Bank Code</th>
						<th class="param_name">Bank Name</th>
						<th class="param_name">TransitNumber of Bank</th>
						<th class="param_name">Branch Code</th>
						<th class="param_name">Branch Location</th>
						<th class="param_name">Bank/State/Branch number for the bank</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text" name="bankCode"
							value="" />
						</td>
						<td class="param_value"><input type="text" name="bankName"
							value="" />
						</td>
						<td class="param_value"><input type="text"
							name="bankTransitNumber" value="" />
						</td>
						<td class="param_value"><input type="text" name="branchCode"
							value="" />
						</td>
						<td class="param_value"><input type="text"
							name="branchLocation" value="" />
						</td>
						<td class="param_value"><input type="text" name="bsbNumber"
							value="" />
						</td>
					</tr>
				</table>
				<div class="params">
					<div class="param_name">Control Digits for the bank</div>
					<div class="param_value">
						<input type="text" name="controlDigit" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">International Bank Account Number</div>
					<div class="param_value">
						<input type="text" name="iban" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Institution number for the bank</div>
					<div class="param_value">
						<input type="text" name="institutionNum" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">RIB key for the bank</div>
					<div class="param_value">
						<input type="text" name="rib" value="" />
					</div>
				</div>

				<div class="params">
					<div class="param_name">Branch sort code</div>
					<div class="param_value">
						<input type="text" name="sortCode" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">CLABE (Represents the bank
						information for countries like Mexico)</div>
					<div class="param_value">
						<input type="text" name="clabe" value="" />
					</div>
				</div>
				<div class="input_header">Only for Brazil Accounts</div>
				<table class="params">
					<tr>
						<th class="param_name">Agency Number</th>
						<th class="param_name">Tax ID Number</th>
						<th class="param_name">Tax ID Type</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text"
							name="brazilAgencyNumber" value="" />
						</td>
						<td class="param_value"><input type="text" name="taxIdNum"
							value="" />
						</td>
						<td class="param_value"><input type="text" name="taxIdType"
							value="" />
						</td>
					</tr>
				</table>
				<div class="submit">
					<input type="submit" name="AddBankAccountBtn"
						value="AddBankAccount" /><br />
				</div>
				<a href="../index.html">Home</a>
			</div>
		</form>

	</div>

</body>
</html>
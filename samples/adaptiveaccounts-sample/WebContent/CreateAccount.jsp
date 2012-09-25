<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.net.URL"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdaptiveAccounts - CreateAccount</title>
<%
	URL currentURL = new URL(request.getRequestURL().toString());
	URL returnURL = new URL(currentURL, "index.html");
%>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>CreateAccount</h3>
			<div id="apidetails">CreateAccount API operation enables you to
				create a PayPal account on behalf of a third party.</div>
		</div>
		<form method="POST">
			<div id="request_form">
				<div class="params">
					<div class="param_name">Account Type</div>
					<div class="param_value">
						<select name="accountType">
							<option value="">--Select a value--</option>
							<option value="Personal">Personal</option>
							<option value="Premier">Premier</option>
							<option value="Business">Business</option>
						</select>
					</div>
				</div>
				<div class="section_header">Personal Info</div>
				<div class="input_header">Name</div>
				<table class="params">
					<tr>
						<th class="param_name">Salutation</th>
						<th class="param_name">First Name*</th>
						<th class="param_name">Last Name*</th>
						<th class="param_name">Middle Name</th>
						<th class="param_name">Suffix</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text" name="salutation"
							value="Mr." /></td>
						<td class="param_value"><input type="text" name="firstName"
							value="Bonzop" /></td>
						<td class="param_value"><input type="text" name="lastName"
							value="Simore" /></td>	
						<td class="param_value"><input type="text" name="middleName"
							value="Zaius" /></td>
						<td class="param_value"><input type="text" name="suffix"
							value="" /></td>
					</tr>
				</table>
				<div class="params">
					<div class="param_name">Date Of Birth</div>
					<div class="param_value">
						<input type="text" name="dateOfBirth" value="" />
					</div>
				</div>
				<div class="input_header">Address Details</div>
				<table class="params">
					<tr>
						<th class="param_name">Address Line1*</th>
						<th class="param_name">Address Line2</th>
						<th class="param_name">City*</th>
						<th class="param_name">State*</th>
						<th class="param_name">Postal Code*</th>
						<th class="param_name">Country Code*</th>
						<th class="param_name">Citizenship Country Code*</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text" name="street"
							value="1,Main St" />
						</td>
						<td class="param_value"><input type="text" name="line2"
							value="" />
						</td>
						<td class="param_value"><input type="text" name="city"
							value="Austin" />
						</td>
						<td class="param_value"><input type="text" name="state"
							value="TX" /></td>
						<td class="param_value"><input type="text" name="postalCode"
							value="78750" />
						</td>
						<td class="param_value"><input type="text" name="countryCode"
							value="US" />
						</td>
						<td class="param_value"><input type="text"
							name="citizenshipCtryCode" value="US" /></td>
					</tr>
				</table>
				<div class="input_header">Phone Details(NOTE:Must provide at
					least one of contactPhoneNumber, homePhoneNumber, or
					mobilePhoneNumber)</div>
				<table class="params">
					<tr> 
						<th class="param_name">Contact Number</th>
						<th class="param_name">Home Number</th>
						<th class="param_name">Mobile Number</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text" name="contactNum"
							value="5126914160" /></td>
						<td class="param_value"><input type="text" name="homeNum"
							value="" /></td>
						<td class="param_value"><input type="text" name="mobileNum"
							value="" /></td>
					</tr>
				</table>

				<div class="params">
					<div class="param_name">Email*</div>
					<div class="param_value">
						<input type="text" name="email" value="test@paypal.com" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Currency Code*</div>
					<div class="param_value">
						<input type="text" name="currencyCode" value="USD" />
					</div>

				</div>

				<div class="params">
					<div class="param_name">Preferred Language*</div>
					<div class="param_value">
						<input type="text" name="preferredLanguageCode" value="en_US" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Registration Type*</div>
					<div class="param_value">
						<select name="regType">
							<option value="">--Select a value--</option>
							<option value="Web">Web</option>
							<option value="Mobile">Mobile</option>
						</select>
					</div>
				</div>
				<div class="input_header">WebOptions</div>
				<table class="params">
					<tr>
						<th class="param_name">Return Url</th>
						<th class="param_name">Return Url Description</th>
						<th class="param_name">Use Mini browser?</th>
						<th class="param_name">Show Mobile confirmation option?</th>
						<th class="param_name">Show Add Credit Card option?</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text" name="returnUrl"
							value="<%=returnURL%>" /></td>
						<td class="param_value"><input type="text"
							name="returnUrlDescription" value="" /></td>
						<td class="param_value"><select name="useMiniBrowser">
								<option value="">--Select--</option>
								<option value="True">True</option>
								<option value="False">False</option>
						</select></td>
						<td class="param_value"><select name="showMobileConfirm">
								<option value="">--Select--</option>
								<option value="True">True</option>
								<option value="False">False</option>
						</select></td>
						<td class="param_value"><select name="showAddCreditCard">
								<option value="">--Select--</option>
								<option value="True">True</option>
								<option value="False">False</option>
						</select></td>
					</tr>
				</table>
				<div class="note">NOTE: This is only supported for Brazil,
					which uses tax ID numbers such as the CPF and CNPJ.</div>
				<div class="params">
					<div class="param_name">Tax ID</div>
					<div class="param_value">
						<input type="text" name="taxID" value="" />
					</div>

				</div>
				<div class="params">
					<div class="param_name">Notification URL(The URL to post
						instant payment notification (IPN) messages to regarding account
						creation)</div>
					<div class="param_value">
						<input type="text" name="notificationURL" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Perform ExtraVetting On This Account?</div>
					<div class="param_value">

						<select name="performExtraVettingOnThisAccount">
							<option value="">--Select--</option>
							<option value="True">True</option>
							<option value="False">False</option>
						</select>
					</div>

				</div>
				<div class="section_header">Partner Info fields</div>
				<table class="params">
					<tr>
						<th class="param_name">Partner Field 1</th>
						<th class="param_name">Partner Field 2</th>
						<th class="param_name">Partner Field 3</th>
						<th class="param_name">Partner Field 4</th>
						<th class="param_name">Partner Field 5</th>
					</tr>
					<tr>
						<td class="param_value"><input type="text"
							name="partnerField1" /></td>
						<td class="param_value"><input type="text"
							name="partnerField2" /></td>
						<td class="param_value"><input type="text"
							name="partnerField3" /></td>
						<td class="param_value"><input type="text"
							name="partnerField4" /></td>
						<td class="param_value"><input type="text"
							name="partnerField5" /></td>
					</tr>
				</table>


				<div class="section_header">Business info (for business
					accounts only)</div>
				<div class="params">
					<div class="param_name">Business Name</div>
					<div class="param_value">
						<input type="text" name="businessName" value="" />
					</div>
				</div>
				<div class="section_header">Business address</div>
				<table class="params">
					<tr>
						<th>Line 1 *</th>
						<th>Line 2</th>
						<th>City</th>
						<th>State</th>
						<th>Postal code</th>
						<th>Country code *</th>
					</tr>
					<tr>
						<td><input type="text" name="businessStreet"
							value="1968 Ape Way" />
						</td>
						<td><input type="text" name="businessLine2" value="" />
						</td>
						<td><input type="text" name="businessCity" value="Austin" />
						</td>
						<td><input type="text" name="businessState" value="TX" />
						</td>
						<td><input type="text" name="businessPostalCode"
							value="78750" />
						</td>
						<td><input type="text" name="businessCountryCode" value="US" />
						</td>
					</tr>
				</table>
				<div class="params">
					<div class="param_name">Work Phone *</div>
					<div class="param_value">
						<input type="text" name="workPhone" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Category describing the business.
						(Refer to the business' Association Merchant Category Code
						documentation)</div>
					<div class="param_value">
						<input type="text" name="category" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Sub-category describing the business.
						(Refer to the business' Association Merchant Category Code
						documentation)</div>
					<div class="param_value">
						<input type="text" name="subCategory" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Merchant category code. (Category
						code for the business. state in which the business was
						established)</div>
					<div class="param_value">
						<input type="text" name="merchantCategoryCode" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Doing business as. (The business name
						being used if it is not the actual name of the business)</div>
					<div class="param_value">
						<input type="text" name="doingBusinessAs" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Customer Service phone</div>
					<div class="param_value">
						<input type="text" name="customerServicePhone" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Customer Service email</div>
					<div class="param_value">
						<input type="text" name="customerServiceEmail" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Dispute email</div>
					<div class="param_value">
						<input type="text" name="disputeEmail" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Website</div>
					<div class="param_value">
						<input type="text" name="webSite" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Company Id</div>
					<div class="param_value">
						<input type="text" name="companyId" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Date of establishment</div>
					<div class="param_value">
						<input type="text" name="dateOfEstablishment" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Business type</div>
					<div class="param_value">
						<select name="businessType">
							<option>ASSOCIATION</option>
							<option>CORPORATION</option>
							<option>GENERAL_PARTNERSHIP</option>
							<option>GOVERNMENT</option>
							<option>INDIVIDUAL</option>
							<option>LIMITED_LIABILITY_PARTNERSHIP</option>
							<option>LIMITED_LIABILITY_PRIVATE_CORPORATION</option>
							<option>LIMITED_LIABILITY_PROPRIETORS</option>
							<option>LIMITED_PARTNERSHIP</option>
							<option>LIMITED_PARTNERSHIP_PRIVATE_CORPORATION</option>
							<option>NONPROFIT</option>
							<option>OTHER_CORPORATE_BODY</option>
							<option>PARTNERSHIP</option>
							<option>PRIVATE_CORPORATION</option>
							<option>PRIVATE_PARTNERSHIP</option>
							<option>PROPRIETORSHIP</option>
							<option>PROPRIETORSHIP_CRAFTSMAN</option>
							<option>PROPRIETARY_COMPANY</option>
							<option>PUBLIC_COMPANY</option>
							<option>PUBLIC_CORPORATION</option>
							<option>PUBLIC_PARTNERSHIP</option>
						</select>
					</div>
				</div>
				<div class="params">
					<div class="param_name">Business subtype (required only for
						Business Type GOVERNMENT and ASSOCIATION_GOVERNMENT)</div>
					<div class="param_value">
						<select name="businessSubtype">
							<option value="">- Select a value -</option>
							<option>ENTITY</option>
							<option>EMANATION</option>
							<option>ESTD_COMMONWEALTH</option>
							<option>ESTD_UNDER_STATE_TERRITORY</option>
							<option>ESTD_UNDER_FOREIGN_COUNTRY</option>
							<option>INCORPORATED</option>
							<option>NON_INCORPORATED</option>
						</select>
					</div>
				</div>
				<div class="params">
					<div class="param_name">Incorporation Id</div>
					<div class="param_value">
						<input type="text" name="incorporationId" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Average price</div>
					<div class="param_value">
						<input type="text" name="averagePrice" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Average monthly volume</div>
					<div class="param_value">
						<input type="text" name="averageMonthlyVolume" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Percentage Revenue from online sales</div>
					<div class="param_value">
						<input type="text" name="percentageRevenueFromOnline" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Sales Venue</div>
					<div class="param_value">
						<select name="salesVenue">
							<option>WEB</option>
							<option>EBAY</option>
							<option>OTHER_MARKETPLACES</option>
							<option>OTHER</option>
						</select>
					</div>
				</div>
				<div class="params">
					<div class="param_name">Sales Venue description</div>
					<div class="param_value">
						<input type="text" name="salesVenueDesc" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">VAT Id</div>
					<div class="param_value">
						<input type="text" name="vatId" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">VAT Country code</div>
					<div class="param_value">
						<input type="text" name="vatCountryCode" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Commercial registration location</div>
					<div class="param_value">
						<input type="text" name="commercialRegistrationLocation" value="" />
					</div>
				</div>
				<div class="input_header">Principal place of business</div>
				<table class="params">
					<tr>
						<th>Line 1 *</th>
						<th>Line 2</th>
						<th>City</th>
						<th>State</th>
						<th>Postal code</th>
						<th>Country code *</th>
					</tr>
					<tr>
						<td><input type="text" name="placeOfBusinessStreet"
							value="1968 Ape Way" />
						</td>
						<td><input type="text" name="placeOfBusinessLine2" value="" />
						</td>
						<td><input type="text" name="placeOfBusinessCity"
							value="Austin" />
						</td>
						<td><input type="text" name="placeOfBusinessState" value="TX" />
						</td>
						<td><input type="text" name="placeOfBusinessPostalCode"
							value="78750" />
						</td>
						<td><input type="text" name="placeOfBusinessCountryCode"
							value="US" />
						</td>
					</tr>
				</table>
				<div class="input_header">Registered office address</div>
				<table class="params">
					<tr>
						<th>Line 1 *</th>
						<th>Line 2</th>
						<th>City</th>
						<th>State</th>
						<th>Postal code</th>
						<th>Country code *</th>
					</tr>
					<tr>
						<td><input type="text" name="registeredOfficeStreet"
							value="1968 Ape Way" />
						</td>
						<td><input type="text" name="registeredOfficeLine2" value="" />
						</td>
						<td><input type="text" name="registeredOfficeCity"
							value="Austin" />
						</td>
						<td><input type="text" name="registeredOfficeState"
							value="TX" />
						</td>
						<td><input type="text" name="registeredOfficePostalCode"
							value="78750" />
						</td>
						<td><input type="text" name="registeredOfficeCountryCode"
							value="US" />
						</td>
					</tr>
				</table>
				<div class="params">
					<div class="param_name">Establishment country code</div>
					<div class="param_value">
						<input type="text" name="establishmentCountryCode" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Establishment state</div>
					<div class="param_value">
						<input type="text" name="establishmentState" value="" />
					</div>
				</div>
				<div class="section_header">Business stakeholder</div>
				<div class="params">
					<div class="param_name">Stakeholder role *</div>
					<div class="param_value">
						<select name="role">
							<option value="">- Select a value -</option>
							<option>CHAIRMAN</option>
							<option>SECRETARY</option>
							<option>TREASURER</option>
							<option>BENEFICIAL_OWNER</option>
							<option>PRIMARY_CONTACT</option>
							<option>INDIVIDUAL_PARTNER</option>
							<option>NON_INDIVIDUAL_PARTNER</option>
							<option>PRIMARY_INDIVIDUAL_PARTNER</option>
							<option>DIRECTOR</option>
							<option>NO_BENEFICIAL_OWNER</option>
						</select>
					</div>
				</div>
				<div class="input_header">Stakeholder name</div>
				<table class="params">
					<tr>
						<th>Salutation</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Middle Name</th>
						<th>Suffix</th>
					</tr>
					<tr>
						<td><input type="text" name="stakeHolderSalutation"
							value="Mr." />
						</td>
						<td><input type="text" name="stakeHolderFirstName"
							value="Krakkel" />
						</td>
						<td><input type="text" name="stakeHolderMiddleName" value="" />
						</td>
						<td><input type="text" name="stakeHolderLastName"
							value="Simore" />
						</td>
						<td><input type="text" name="stakeHolderSuffix" value="" />
						</td>
					</tr>
				</table>
				<div class="params">
					<div class="param_name">Full legal name</div>
					<div class="param_value">
						<input type="text" name="fullLegalName" value="" />
					</div>
				</div>
				<div class="input_header">Address</div>
				<table class="params">
					<tr>
						<th>Line 1 *</th>
						<th>Line 2</th>
						<th>City</th>
						<th>State</th>
						<th>Postal code</th>
						<th>Country code *</th>
					</tr>
					<tr>
						<td><input type="text" name="stakeHolderStreet"
							value="1968 Ape Way" />
						</td>
						<td><input type="text" name="stakeHolderLine2" value="" />
						</td>
						<td><input type="text" name="stakeHolderCity" value="Austin" />
						</td>
						<td><input type="text" name="stakeHolderState" value="TX" />
						</td>
						<td><input type="text" name="stakeHolderPostalCode"
							value="78750" />
						</td>
						<td><input type="text" name="stakeHolderCountryCode"
							value="US" />
						</td>
					</tr>
				</table>
				<div class="params">
					<div class="param_name">Date of birth</div>
					<div class="param_value">
						<input type="text" name="stakeHolderDateOfBirth"
							value="1968-01-01Z" />
					</div>
				</div>
				<div class="submit">
					<input type="submit" name="CreateAccountBtn" value="CreateAccount" />
				</div>
				<br /> <a href="../index.html">Home</a>
			</div>
		</form>
	</div>

</body>
</html>
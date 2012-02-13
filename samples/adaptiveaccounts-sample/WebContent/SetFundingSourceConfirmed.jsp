<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdaptiveAccounts - SetFundingSourceConfirmed</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>SetFundingSourceConfirmed</h3>
			<div id="apidetails">SetFundingSourceConfirmed API operation
				allows your application to mark a funding source as confirmed, after
				it is added successfully with AddPaymentCard or AddBankAccount.</div>
		</div>
		<form method="POST">
			<div id="request_form">
				<div class="params">
					<div class="param_name">
						Funding Source Key*(Get FundingSourceKey via <a
							href='AddBankAccount'>AddBankAccount</a> or <a
							href='AddPaymentCard'>AddPaymentCard</a>)
					</div>
					<div class="param_value">
						<input type="text" name="fundingSourceKey" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Account ID of the account to which
						the funding source added</div>
					<div class="param_value">
						<input type="text" name="accountId" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Email Address of the account to which
						the funding source added</div>
					<div class="param_value">
						<input type="text" name="emailAddress" value="" />
					</div>
				</div>
				<div class="submit">
					<input type="submit" name="SetFundingSourceConfirmedBtn"
						value="SetFundingSourceConfirmed" /><br />
				</div>
				<a href="../index.html">Home</a>
			</div>
		</form>

	</div>

</body>
</html>
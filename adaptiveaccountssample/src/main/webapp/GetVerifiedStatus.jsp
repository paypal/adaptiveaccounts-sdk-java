<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdaptiveAccounts - GetVerifiedStatus</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h3>GetVerifiedStatus</h3>
			<div id="apidetails">GetVerifiedStatus API operation lets you
				check if a PayPal account status is verified. A PayPal account gains
				verified status under a variety of circumstances, such as when an
				account is linked to a verified funding source. Verified status
				serves to indicate a trust relationship.</div>
		</div>
		<form method="POST">
			<div id="request_form">
				<div class="params">
					<div class="param_name">Email Address of the account holder*</div>
					<div class="param_value">
						<input type="text" name="emailAddress" value="" />
					</div>
				</div>
				<div class="note">NOTE:To use ConfirmationType NONE you must
					request and be granted advanced permission levels.</div>
				<div class="params">
					<div class="param_name">Match Criteria</div>
					<div class="param_value">
						<select name="matchCriteria">
							<option value="">--Select--</option>
							<option value="NAME">Name</option>
							<option value="NONE">None</option>
						</select>
					</div>
				</div>
				<div class="params">
					<div class="param_name">First Name(Required if matchCriteria
						is NAME)</div>
					<div class="param_value">
						<input type="text" name="firstName" value="" />
					</div>
				</div>
				<div class="params">
					<div class="param_name">Last Name(Required if matchCriteria
						is NAME)</div>
					<div class="param_value">
						<input type="text" name="lastName" value="" />
					</div>
				</div>
				<div class="submit">
					<input type="submit" name="GetVerifiedStatusBtn"
						value="GetVerifiedStatus" /><br />
				</div>
				<a href="../index.html">Home</a>
			</div>
		</form>

	</div>

</body>
</html>
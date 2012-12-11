IPN Overview :
------------
* PayPal Instant Payment Notification is call back system that initiated once a tranction is completed(eg: When 
a PayPal account is created successfully).
* you will receive the transaction related ipn variables on your call back url that you have specified in your request.
*  You have to send this ipn variable back to PayPal system for varification, Upon varification PayPal will send
a response string "VERIFIED" or "INVALID".
* PayPal will continuously resend this ipn, if a wrong ipn is send.

IPN configuration :
-----------------
    * Ipn endpoint url is specified in 'sdk_config.properties' as 'service.IPNEndpoint'. This will be used for ipn post back.
    * A util class 'IPNMessage' is provided in java sdk-core for ipn message validation. IPN Listener can use this class 
      for message validation.
    * Ipn Listener sample provided under the package com/sample/ipn/IPNListenerServlet.java. 
       
IPN variables :
--------------

[Transaction]
-------------
notify_version,
verify_sign,
charset,
confirmation_code,
event_type

[Paymentinfo]
-------------
account_key

[BuyerInfo]
-----------
first_name,
last_name

* For a full list of ipn variables you need to check log file, that Ipn Listener is logging into.    

IPN Reference :
--------------
* You can refer IPN getting started guide at [https://www.x.com/developers/paypal/documentation-tools/ipn/gs_IPN]
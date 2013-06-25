IPN Overview :
------------
* PayPal Instant Notification is a call back system that will get initiated once a tranction is completed(eg: When 
a PayPal account is created successfully).
* You will receive the transaction related ipn variables on your call back url that you have specified in your request.
* You have to send this ipn variable back to PayPal system for verification, Upon verification PayPal will send
a response string "VERIFIED" or "INVALID".
* PayPal will continuously resend this ipn, if a wrong ipn is sent.

IPN configuration :
-----------------
* Initialize IPNMessage constructor with a configuration map containing, mode (sandbox/live) and connection parameters as shown below.
* IPNMessage is provided in 'sdk-core-java' repository for ipn message validation. IPN Listener can use this class for message validation.
    ```java
		Map<String,String> configMap = new HashMap<String,String>();
		
		// Endpoints are varied depending on whether sandbox OR live is chosen for mode
		configMap.put("mode", "sandbox");
		
		//Connection Information
		configMap.put("http.ConnectionTimeOut", "5000");
		configMap.put("http.Retry", "2");
		configMap.put("http.ReadTimeOut", "30000");
		configMap.put("http.MaxConnection", "100");
			
		IPNMessage ipnlistener = new IPNMessage(request,configMap);
    ```		
     

IPN How to run?
--------------
* Ipn Listener sample 'IPNListenerServlet.java' is provided under the package 'com/sample/ipn'.
* Deploy IPN Listener sample in Cloud environment or you can expose your server port using any third party 
  LocalTunneling software , so that you can receive PayPal IPN call back.
* Make a PayPal api call (eg: CreateAccount request), setting the NotificationUrl field of api request class
  to the url of deployed IPNListener sample(eg: http://DNS-Name/adaptiveaccountssample/IPNListener).
* You will receive ipn call back from PayPal , which will be logged into log file in case of IPN sample.   
   
IPN variables :
--------------

[Transaction]
-------------
* notify_version
* verify_sign
* charset
* confirmation_code
* event_type
* account_key

[BuyerInfo]
-----------
* first_name
* last_name

* For a full list of ipn variables you need to check log file, that Ipn Listener is logging into.    

IPN Reference :
--------------
* You can refer IPN getting started guide at [https://www.x.com/developers/paypal/documentation-tools/ipn/gs_IPN]

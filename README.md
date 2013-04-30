This repository contains java sdk and samples for Adaptive Accounts API.

Prerequisites:
---------------
*	Java jdk-1.5 or higher
*	Apache Maven 3 or higher
*	Please refer http://maven.apache.org/guides/getting-started/maven-in-five-minutes.html for any help in Maven.

To build sdk and samples:
--------------------------
*	Build core files from https://github.com/paypal/sdk-core-java, as it is a dependency for sdk.
*	Then, run 'mvn install' to build sdk jar and sample war files.

SDK Integration:
----------------
*	Create a new maven application.

*	Add dependency to sdk in your application's pom.xml as below.
		
    ```xml
    <dependency>
        <groupId>com.paypal.sdk</groupId>
        <artifactId>adaptiveaccountssdk</artifactId>
        <version>2.3.101</version>
    </dependency>
    ```

To make an API call:
--------------------		
*	Import AdaptiveAccountsService.java into your code.
		
*	Copy the configuration file 'sdk_config.properties' in 'adaptiveaccountssample/src/main/resources' folder to your application 'src/main/resources'. Use the default constructor to run in default configuration(configuration used from sdk_config.properties found in classpath).
	```java
	new AdaptiveAccountsService();
	```
*	For Dynamic configuration(configuration is tied to the lifetime of the service object)		
	```java
	new AdaptiveAccountsService(new File("/pathto/custom.properties"));
			 Or
	new AdaptiveAccountsService(new FileInputStream(new File("/pathto/custom.properties")));
			 Or
	new AdaptiveAccountsService("/pathto/custom.properties");
			 Or
	new AdaptiveAccountsService(Map<String, String> customConfigurationMap);
			 Or
	new AdaptiveAccountsService(Properties customProperties);
	```
*	The SDK takes defaults for certain parameters(refer sdk_config.properties for defaults). Account Credentials and either of 'mode' or 'service.Endpoint' are mandatory parameters.
  
*	Create a service wrapper object.

*	Create a request object as per your project needs. 

*	Invoke the appropriate method on the service wrapper object.

    For example,

          
    ```java
    import com.paypal.svcs.services.AdaptiveAccountsService;
    import com.paypal.svcs.types.common.RequestEnvelope;
    import com.paypal.svcs.types.aa.*;
    ...
    RequestEnvelope env = new RequestEnvelope();
    env.setErrorLanguage("en_US");
    ...
    NameType name = new NameType("John", "Lui");
    ...
    AddressType address = new AddressType("Main St", "US");
    ...
    String preferredLanguageCode ="en_US";
    ...
    CreateAccountRequest createAccountRequest = new CreateAccountRequest(requestEnvelope, 
                                                            name, address, preferredLanguageCode);
    ...
    AdaptiveAccountsService adaptiveAccountsService = new AdaptiveAccountsService();
			Or
    Map<String, String> customConfigurationMap = new HashMap<String, String>();
    customConfigurationMap.put("mode", "sandbox"); // Load the map with all mandatory parameters
    ...
    AdaptiveAccountsService adaptiveAccountsService = new AdaptiveAccountsService(Map<String, String> customConfigurationMap);
    CreateAccountResponse createAccountResponse = adaptiveAccountsService.createAccount(createAccountRequest,userName);
    ```

SDK Logging:
------------
*	For logging - java.util.logging has been used. To change the default configuration, edit the logging.properties file in 'jre/lib' folder under your JDK root.		  

		  
SDK Configuration:
------------------
The SDK uses .properties format configuration file. Sample of this file is at 
 
'adaptiveaccountssample/src/main/resources/'. You can use the 'sdk_config.properties' configuration file to configure

*	Mode is specified using the parameter name 'mode' with values 'sandbox' or 'live', if specified 'service.EndPoint' parameter is not required and the SDK chooses the sandbox or live endpoints automatically.

*	(Multiple) API account credentials, by appending a '.' (dot) character and the service name to 'service.EndPoint' parameter.

*	HTTP connection parameters, if certain connection parameters are not specified, the SDK will assume defaults for them.

*	Service configuration.

Multiple SDK usage (Multiple End-points Support)
---------------------------
Multiple end-points configuration can be done by specifying mulitple end-points identified by specific property keys. 
When using multiple SDKs in combination, like Merchant and Permissions etc..configure the endpoints as shown below 
one for each service used, The existing service.EndPoint property is still supported for backward compatibility (using 
a single SDK). The list below specifies endpoints for different services, in SANDBOX and PRODUCTION, with their 
property keys and end-point as property values.

Sandbox EndPoints
------------------------------  
*   Merchant/Button Manager Service (3 Token)  
    ```properties
    service.EndPoint.PayPalAPI=https://api-3t.sandbox.paypal.com/2.0  
    service.EndPoint.PayPalAPIAA=https://api-3t.sandbox.paypal.com/2.0  
    ```

*   Merchant/Button Manager Service (Certificate)  
    ```properties
    service.EndPoint.PayPalAPI=https://api.sandbox.paypal.com/2.0  
    service.EndPoint.PayPalAPIAA=https://api.sandbox.paypal.com/2.0  
    ```

*   AdaptiveAccounts Platform Service  
    ```properties
    service.EndPoint.AdaptiveAccounts=https://svcs.sandbox.paypal.com/  
    ```

*   AdaptivePayments Platform Service  
    ```properties
    service.EndPoint.AdaptivePayments=https://svcs.sandbox.paypal.com/  
    ```

*   Invoice Platform Service  
    ```properties
    service.EndPoint.Invoice=https://svcs.sandbox.paypal.com/  
    ```

*   Permissions Platform Service  
    ```properties
    service.EndPoint.Permissions=https://svcs.sandbox.paypal.com/  
    ```

Production EndPoints
------------------------------  
*   Merchant/Button Manager Service (3 Token)  
    ```properties
    service.EndPoint.PayPalAPI=https://api-3t.paypal.com/2.0  
    service.EndPoint.PayPalAPIAA=https://api-3t.paypal.com/2.0
    ```

*   Merchant/Button Manager Service (Certificate)  
    ```properties
    service.EndPoint.PayPalAPI=https://api.paypal.com/2.0  
    service.EndPoint.PayPalAPIAA=https://api.paypal.com/2.0  
    ```

*   AdaptiveAccounts Platform Service  
    ```properties
    service.EndPoint.AdaptiveAccounts=https://svcs.paypal.com/  
    ```

*   AdaptivePayments Platform Service  
    ```properties
    service.EndPoint.AdaptivePayments=https://svcs.paypal.com/  
    ```

*   Invoice Platform Service  
    ```properties
    service.EndPoint.Invoice=https://svcs.paypal.com/  
    ```

*   Permissions Platform Service  
    ```properties
    service.EndPoint.Permissions=https://svcs.paypal.com/  
    ```

For additional information on Adaptive Accounts API, please refer to https://www.x.com/developers/paypal/documentation-tools/api

Instant Payment Notification(IPN) 
---------------------------------
* Please refer readme at 'adaptiveaccountssample/IPN-README.md'

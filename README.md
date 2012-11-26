This repository contains java sdk and samples for Adaptive Accounts API.

Prerequisites:
---------------
*	Java jdk-1.5 or higher
*	Apache Maven 2 or higher

SDK Integration:
----------------
For Non-Maven Users:
--------------------
*   Create a new application.

*   Copy  all the jar files inside 'lib' folder to your application.

For Maven Users:
----------------
*   Install all the jar files inside 'lib' folder manually to local repository. 

        mvn install:install-file -Dfile=commons-codec-1.3.jar -DgroupId=commons-codec -DartifactId=commons-codec -Dversion=1.3 -Dpackaging=jar
        mvn install:install-file -Dfile=paypal-auth-signature-1.0.jar -DgroupId=com.paypal.sdk -DartifactId=paypal-auth-signature -Dversion=1.0 -Dpackaging=jar
        mvn install:install-file -Dfile=paypal-core-1.0.jar -DgroupId=com.paypal.sdk -DartifactId=paypal-core -Dversion=1.0 -Dpackaging=jar
		mvn install:install-file -Dfile=adaptiveaccountssdk-2.2.96.jar -DgroupId=com.paypal.sdk -DartifactId=adaptiveaccountssdk -Dversion=2.2.96 -Dpackaging=jar	

*	Create a new maven application.

*	Add dependency to sdk in your application's pom.xml as below.
		
		<dependency>
			<groupId>com.paypal.sdk</groupId>
			<artifactId>adaptiveaccountssdk</artifactId>
			<version>2.2.96</version>
		</dependency>
	
To make an API call:
--------------------		
*	Import AdaptiveAccountsService.java into your code.
		
*	Copy the configuration file 'sdk_config.properties' in 'adaptiveaccountssample/src/main/resources' folder to your application 'src/main/resources'. And load it using,  
		  
		new AdaptiveAccountsService(this.getClass().getResourceAsStream("/sdk_config.properties"));
	
*	Or load the configuration file from any location using absolute path with the below method calls as required.

          new AdaptiveAccountsService(new File(" .../sdk_config.properties"));
                                 Or
		  new AdaptiveAccountsService(new InputStream(new File(" .../sdk_config.properties")));
                                 Or
          new AdaptiveAccountsService(" .../sdk_config.properties");
  
*	Create a service wrapper object.

*	Create a request object as per your project needs. 

*	Invoke the appropriate method on the service wrapper object.

For example,

          
	  import com.paypal.svcs.services.AdaptiveAccountsService;
	  import com.paypal.svcs.types.common.RequestEnvelope;
	  import com.paypal.svcs.types.aa.AddressType;
	  import com.paypal.svcs.types.aa.CreateAccountRequest;
	  import com.paypal.svcs.types.aa.CreateAccountResponse;
	  import com.paypal.svcs.types.aa.NameType;
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
		  
	      CreateAccountRequest createAccountRequest = new CreateAccountRequest(requestEnvelope, name, address, preferredLanguageCode);
          ...

   		  AdaptiveAccountsService adaptiveAccountsService = new AdaptiveAccountsService(this.getClass().getResourceAsStream("/sdk_config.properties"));
		  //userName is optional
		  CreateAccountResponse createAccountResponse = adaptiveAccountsService.createAccount(createAccountRequest,userName);
		  

SDK Logging:
------------
*	For logging - java.util.logging has been used. To change the default configuration, edit the logging.properties file in 'jre/lib' folder under your JDK root.		  

		  
SDK Configuration:
------------------
The SDK uses .properties format configuration file. Sample of this file is at 
 
'adaptiveaccountssample/src/main/resources/'. You can use the 'sdk_config.properties' configuration file to configure

*	(Multiple) API account credentials.

*	HTTP connection parameters.

*	Service configuration.


For additional information on Adaptive Accounts API, please refer to https://www.x.com/developers/paypal/documentation-tools/api





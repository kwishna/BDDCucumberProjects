Feature: Test Login Functionality. Here, We Will Test Login Function.

	Scenario: Login With Valid Credentials. Here, We Will Try To Login With Valid Credentials.
	When user enters right user name
	And user enters right password
	And clicks sign in button
	Then user should be logged in successfully
	
	Scenario: Login With Invalid Credentials. Here, We Will Try To Login With invalid Credentials.
	When user enters wrong user name
	And user enters right password
	And clicks sign in button
	Then user should not be logged in successfully
	
	Scenario: Login With Invalid Credentials. Here, We Will Try To Login With Invalid Credentials.
	When user enters right username
	And user enters wrong password
	And clicks sign in button
	Then user should not be logged in successfully		   
	   

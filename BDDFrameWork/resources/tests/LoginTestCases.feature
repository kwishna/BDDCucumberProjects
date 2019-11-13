#Author: @AB_D
	#Keywords Summary :
	#Feature: List of scenarios.
	#Scenario: Business rule through list of steps with arguments.
	#Given: Some precondition step
	#When: Some key actions
	#Then: To observe outcomes or validation
	#And,But: To enumerate more Given,When,Then steps
	#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
	#Examples: Container for s table
	#Background: List of steps run before each of the scenarios
	#""" (Doc Strings)
	#| (Data Tables)
	#@ (Tags/Labels):To group Scenarios
	#<> (placeholder)
	#""
	## (Comments)
	#Sample Feature Definition Template
	@tag
	Feature: Facebook Login Functionality
	  I want to use this template for my feature file

	  @tag1
	  Scenario: Login With Valid Credentials
	    Given User In On Login Page
	    When User Enters Username
	    And User Enters Password
	    And Clicks On Login Button
	    Then User Logged Succesfully
	    And Home Page Opens
	   
	   @tag1 
	  Scenario: Login With Invalid Credentials
	    Given User In On Login Page
	    When User Enters Incorrect Username
	    And User Enters Password
	    And Clicks On Login Button
	    Then User Failed To Login
	    And Home Page Doesn't Open
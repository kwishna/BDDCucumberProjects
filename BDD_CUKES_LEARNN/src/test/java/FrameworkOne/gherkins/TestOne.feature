Feature: Test Demo Site
		Testing The Demo WebSite
	
	Background: Open The Driver
	Given I Open The Browser
	And Open Login Page
	
	Scenario: Test Demo Website Menu
	When I Am On Login Page
	And Hover Over "TESTER'S HUB"
	And Select "Demo Testing Site" From The Menu
	And Click On "Select Elements"
	Then Select Elements Page Should Open
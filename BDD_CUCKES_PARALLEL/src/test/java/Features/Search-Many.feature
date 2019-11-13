Feature: Search On DuckDuckGo
		This Feature Is For Testing Search Functionality On DuckDuckGo Search Engine

	Scenario: Searching For News On DuckDuckGo Using Chorme
	Given I Launch 'chrome' browser
	When I Navigate To 'https://duckduckgo.com/'
	And I Enter 'Latest News' In The Search Box
	And I Click On Seach Button
	Then I Search Results Appears
	And I Scroll Down The Page
	
	Scenario: Searching For News On DuckDuckGo Using Firefox
	Given I Launch 'firefox' browser
	When I Navigate To 'https://duckduckgo.com/'
	And I Enter 'Latest News' In The Search Box
	And I Click On Seach Button
	Then I Search Results Appears
	And I Scroll Down The Page
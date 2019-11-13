Feature: Search On DuckDuckGo
		This Feature Is For Testing Search Functionality On DuckDuckGo Search Engine

	Scenario Outline: Searching For News On DuckDuckGo Using Browser
	Given I Launch '<browser>' browser
	When I Navigate To '<url>'
	And I Enter '<keyword>' In The Search Box
	And I Click On Seach Button
	Then I Search Results Appears
	And I Scroll Down The Page
	
	Examples:
		|browser  |		  url			  |keyword    |
		|chrome   |https://duckduckgo.com/|Latest News|
		|firefox  |https://duckduckgo.com/|Best News  |
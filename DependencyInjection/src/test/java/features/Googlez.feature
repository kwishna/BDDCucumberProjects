Feature: First google test

  @smoke
  Scenario: Go to google page and verify page title
    Given I navigated to Google main page
    Then I see that title should be Google
@Learn
Feature: test google homepage
  @Smoke
  Scenario: test google homepage Functionality.
    Given  i open a browser
    When  i navigate to "https://www.google.com"
    Then  google homepage should open
    And  search box should be present
    But  zero search result

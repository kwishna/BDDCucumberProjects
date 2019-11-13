@Baba
Feature: feature name
  As a [role]
  I want [feature]
  So that [benefit/business reason]

  Scenario: title One
    Given context context
    When event event
    Then outcome outcome
    And more of the same

  Scenario: title Two
    Given context contextz
    When event eventz
    Then outcome outcomez
    And more of the samez

  Scenario: title Three
    Given context "contextz"
    When event "eventz"
    Then outcome "outcomez"
    And more of the "samez"

  Scenario Outline: title
    Given ....placeholder <placeholder1> one....
    When ....placeholder <placeholder2> two....
    Then ....placeholder <placeholder3> three....
    And ....placeholder <placeholder4> four....

    Examples: 
      | placeholder1 | placeholder2 | placeholder3 | placeholder4 |
      | value11     | value12     | value13     | value14     |
      | value21     | value22     | value23     | value23     |

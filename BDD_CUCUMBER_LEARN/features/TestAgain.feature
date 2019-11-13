@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes
    
  Scenario: Title of your scenario
    Given I wantz to write a step with precondition
    And some otherz precondition
    When I completez action
    And some otherz action
    And yet anotherz action
    Then I validatez the outcomes
    And check morez outcomes
    
   Scenario: Title of your scenario
    Given I wantz to write a "step" with precondition
    When I "completez" action
    Then I "validatez" the outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

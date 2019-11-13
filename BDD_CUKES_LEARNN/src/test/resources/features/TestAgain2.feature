@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario ok1
    Given I want to write a step with precondition ok
    And   some other precondition ok
    When  I complete action ok
    And   some other action ok
    And   yet another action ok
    Then  I validate the outcomes ok
    And   check more outcomes ok
    
  Scenario: Title of your scenario ok2
    Given I wantz to write a step with precondition ok
    And   some otherz precondition ok
    When  I completez action ok
    And   some otherz action ok
    And   yet anotherz action ok
    Then  I validatez the outcomes ok
    And   check morez outcomes ok
  
   Scenario: Title of your scenario ok3
    Given I wantz {to} write a "step" with precondition ok
    When  I "completez" action ok
    Then  I "validatez" the (outcomes) ok

  @tag2
  Scenario Outline: Title of your scenario outline ok4
    Given I want to write a step with <name> okx
    When  I check for the <value> in step okx
    Then  I verify the <status> in step okx

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |

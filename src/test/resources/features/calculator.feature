@tag
Feature: Calculator

  Scenario: operate two numbers
    Given Three input values, 2 and 6 and "^"
    When I operate the two values
    Then I expect the result 64

@tag
Feature: Calculator

  Scenario: divide two numbers
    Given Two input values, 6 and 2
    When I divide the two values
    Then I expect the result 3

  Scenario: power two numbers
    Given Two input values, 2 and 5
    When I Increase the first number to the power of second number
    Then I expect the result 32
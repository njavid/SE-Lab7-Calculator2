@tag
Feature: Calculator

  Scenario: operate two numbers
    Given two input values, 2, 6 and an opt '^'
    When I operate the two values
    Then I expect the result 64

@tag
Feature: Calculator

  Scenario Outline: operate two numbers
    Given Three input values, <arg0> and <arg1> and "<arg2>"
    When I operate the two values
    Then I expect the result <arg3>
    Examples:
      | arg0 | arg1 | arg2 | arg3 |
      | 1    | 6000 |  ^   |  1   |
      | 25   | 0    |  ^   |  1   |
      | 0    | 6    |  ^   |  0   |
      | 12   | 2    |  ^   |  144 |
      | 050  | 1    |  ^   |  50  |
      | 12   | 1    |  \   |  12  |
      | 6    | 7    |  \   |  0   |
      | 0    | 666  |  \   |  0   |
      | 444  | 4    |  \   |  111 |
      |  5   | 4    |  \   |   1  |

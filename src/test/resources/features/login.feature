Feature: Login functionality

@login @valid
  Scenario Outline: Login with valid credentials
    Given user is on login page
    When user enters username "<username>" and password "<password>"
    And user clicks on login button
    Then user should be navigated to home page
    Examples:
      |username  |password|
    |standard_user|secret_sauce|
    |locked_out_user|secret_sauce|
    |problem_user   |secret_sauce|

@login @invalid
  Scenario Outline: Login with invalid credentials
    Given user is on login page
    When user enters username "<username>" and password "<password>"
    And user clicks on login button
    Then user should be informed with an error message
    Examples:
      |username  |password|
    |vignesh|ueruafou   |

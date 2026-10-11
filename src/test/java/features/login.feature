Feature: User Login

  Scenario: Successful login
    Given user is on the login page
    When user enters valid credentials
    And user clicks the login button
    Then user should be logged in successfully
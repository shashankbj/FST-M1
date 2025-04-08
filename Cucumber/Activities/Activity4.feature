
@activity4
Feature: Activity to test the login feature

@loginTest @loginSuccess
  Scenario: Successful login
    Given the user is on the login page
    When the user enters username and password 
    And 
    Then get the confirmation message and verify it
   
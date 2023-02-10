@Print
Feature: Reset functionality on login page of Application 

  @Print @CP-2 @OPEN
  Scenario: Verification of Reset Button
    Given Open the Firefox and launch the application
    When Enter the Username and Password
    Then Reset the credential

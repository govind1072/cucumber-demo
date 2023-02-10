@demo
Feature: Identify all elements on form and submit

  @JIRA_CP-2 @CP-2 @OPEN
  Scenario: Complete the registration form
    Given Chrome browser should be opened
    When Zephyrcodecontest website is launched
    And the form is submitted with all fields filled
    Then Successfully submitted message should be shown

  @JIRA_CP-2 @CP-2 @OPEN
  Scenario: Open zephyrcodecontest.com website and fill multiple values
    Given Chrome browser should be opened
    When Zephyrcodecontest website is launched
    And the form is filled with "Pradeep" "kumar" "Male" "2" "1/1/2000"
    And the form is filled with "Red Tea" "Break" "India" and "Navigation Commands"
    And clicked on submit button
    Then Go back to Welcome page and verify title

  @JIRA_CP-2 @CP-2 @OPEN
  Scenario: Open zephyrcodecontest.com website and fill multiple values 2
    Given Chrome browser should be opened
    When Zephyrcodecontest website is launched
    And the form is filled with "Greg" "Mont" "Male" "1" "1/1/2001"
    And the form is filled with "Black Tea" "Harmless Addiction" "Asia" and "Browser Commands"
    And clicked on submit button
    Then Go back to Welcome page and verify title

  @JIRA_CP-2
  Scenario: Open zephyrcodecontest.com website and fill multiple values 3
    Given Chrome browser should be opened
    When Zephyrcodecontest website is launched
    And the form is filled with "Rex" "Morg" "Male" "3" "3/1/2010"
    And the form is filled with "oolong tea" "Harmless Addiction" "USA" and "Wait Commands"
    And clicked on submit button
    Then Go back to Welcome page and verify title

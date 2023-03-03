@demo
Feature: Identify all elements on form and submit


@JIRA_CP-1
Scenario: Complete the registration form
Given Chrome browser should be opened
When Zephyrcodecontest website is launched
And the form is submitted with all fields filled
Then Successfully submitted message should be shown

@JIRA_CP-1
Scenario Outline: Open zephyrcodecontest.com website and fill multiple values <Number>
Given Chrome browser should be opened
When Zephyrcodecontest website is launched
And the form is filled with <FirstName> <LastName> <Sex> <Number> <Date>
And the form is filled with <Beverage> <Addiction> <Country> and <Command>
And clicked on submit button
Then Go back to Welcome page and verify title

Examples:
| FirstName | LastName | Sex  | Number | Date    | Beverage | Addiction | Country | Command            |
| "Pradeep"   | "kumar"    | "Male" | "1"      | "1/1/2000" | "Red Tea"  | "Break"| "Europe" | "Navigation Commands" |
| "Greg" | "Mont" | "Male" | "2" | "1/1/2001" | "Black Tea" | "Harmless Addiction" | "Asia" | "Browser Commands" |
|"Rex" | "Morg"| "Male" | "3" | "3/1/2010" | "oolong tea" | "Harmless Addiction"|  "USA" | "Wait Commands" |
|"Govind" | "Drolia"| "Male" | "4" | "3/1/2010" | "coffee" | "Harmless Addiction"|  "INDIA" | "Login Commands" |



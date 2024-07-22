Feature: To test offline application

Scenario: To test login functionality

Given user should be on login page
When user enters valid credentials
Then user should be on home page

Scenario: To test logo of the page

Given user should be on login page
Then user should see logo on the page
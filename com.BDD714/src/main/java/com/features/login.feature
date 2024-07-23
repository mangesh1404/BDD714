Feature: To test offline application

@run
Scenario Outline: To test login functionality

Given user should be on login page
When  user enters "<username>" and "<password>"
And   user click on login button
Then  user should be on home page

Examples:
|username         |password|
|kiran@gmail.com  |123456  |
|mangesh@gmail.com|qwerty  |

Scenario: To test logo of the page

Given user should be on login page
Then user should see logo on the page
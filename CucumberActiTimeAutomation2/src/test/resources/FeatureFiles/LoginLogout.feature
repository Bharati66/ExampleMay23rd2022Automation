#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: Login,Logout Scenarios

Feature: Login and Logout Functionality
Description this feature validates login and logout funtionality

Scenario: Login with valid credentials
    Given I launch the chrome browser
    And I navigate the Application url
    When I enter the username in username text field
    And I enter the password in password text field
    And I click on login button
    Then I found the home page
    And I click on minimize flyout window
 
Scenario: Logout functionality 
    Given I found the home page
    When I click on logout link
    Then I found the login page
    And I close Application
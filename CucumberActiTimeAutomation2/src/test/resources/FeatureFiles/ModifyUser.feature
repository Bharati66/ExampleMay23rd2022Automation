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
    
Scenario: Create User
    Given I click on user icon
    And I click on Add User
    When I enter the firstname in firstname text field
    When I enter the lastname in lastname text field
    When I enter the email in email text field
    Then I enter the Username in Username text field
    When I enter the Password in Password text field
    Then I enter password in retypepassword text field
    And I click on create user button
    
Scenario: Modify User
		Given I click on user
		And I click on email
		And I change the email
		Then I click on save changes button
Scenario: Delete User
    Then I click on modifieduser
    And I click on delete user
    And I click on delete alert button
 
Scenario: Logout functionality 
    Given I found the home page
    When I click on logout link
    Then I found the login page
    And I close Application
Feature: To Verify Login Functionality of Sauce Demo Website

  Scenario: Verify successful login to Website with valid credentials
    Given the user is on the Sauce Demo login page
    When the user enters username "standard_user"
    And the user enters password "secret_sauce"
    And the user clicks the login button
    Then the user should be logged in successfully

  Scenario: Verify unsuccessful login to Website with invalid credentials
    Given the user is on the Sauce Demo login page
    When the user enters username "invalid_user"
    And  the user enters password "invalid_password"
    And the user clicks the login button
    Then the user should see an error message "Epic sadface: Username and password do not match any user in this service"

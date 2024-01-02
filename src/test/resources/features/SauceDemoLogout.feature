Feature: Verify the functionality of Sauce Demo logout feature

  Background:
    Given the user is on the Sauce Demo login page
    When the user enters username "standard_user"
    And the user enters password "secret_sauce"
    And the user clicks the login button
    Then the user should be logged in successfully

  Scenario: Verify successful logout from website
    When the user clicks on menu icon
    And the user clicks on Logout button
    Then the user should be logout successfully
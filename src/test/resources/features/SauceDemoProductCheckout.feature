Feature: Verify the functionality of Sauce Demo checkout feature

  Background:
    Given the user is on the Sauce Demo login page
    When the user enters username "standard_user"
    And the user enters password "secret_sauce"
    And the user clicks the login button
    Then the user should be logged in successfully

  Scenario: Verify successful checkout of product
    When the user selects "Sauce Labs Bike Light" product
    Then "Sauce Labs Bike Light" product page should be visible

    When the user clicks Add to Cart button
    And the user verify that number of items in cart is "1"
    And the user open cart page
    Then Remove button should be visible

    When the user clicks Checkout button
    And the user enters firstname "Abdul"
    And the user enters lastname "Rehman"
    And the user enters postal code "78940"

    When the user clicks on Continue button
    Then Checkout Overview page should be visible

    When the user clicks Finish button
    Then the user verify order is successfully dispatched

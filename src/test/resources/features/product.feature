Feature: Verify Products Page Functionality

@product
  Scenario Outline: User logs in and verifies the Products page
    Given user is on login page
    When user enters username "<username>" and password "<password>"
    And user clicks on login button
    Then user should be navigated to home page
    And page title should be "Products"
    And sort dropdown should display "Name (A to Z)"
    And all 6 products should be displayed
    And each product should display a name, description, price, and "Add to cart" button
    When user clicks "Add to cart" for "Sauce Labs Backpack"
    Then the product should be added to the cart
    And the copyright information should be displayed
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
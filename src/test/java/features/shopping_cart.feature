Feature: Shopping Cart

  Scenario: Add product to cart
    Given user is logged in
    When user adds a product to the cart
    And user opens the cart
    Then the product should be displayed in the cart
Feature: Product Purchase

  Scenario: Complete purchase successfully
    Given user is on the electronics page for purchase
    When user adds Samsung Mobile to cart
    And user proceeds to checkout
    And user fills in billing details
    And user continues with the order
    Then purchase should be completed successfully
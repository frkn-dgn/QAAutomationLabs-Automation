Feature: Product Filtering

  Scenario: Filter products by type
    Given user is on the products page
    When user selects the Mobile filter
    Then only mobile products should be displayed

  Scenario: Filter products by price
    Given user is on the products page
    When user selects the 101 to 200 price filter
    Then products in the selected price range should be displayed
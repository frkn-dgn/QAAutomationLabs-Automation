Feature: Product Search

  Scenario: Search for a Samsung product
    Given user is on the electronics page
    When user searches for "Samsung"
    Then Samsung Mobile should be displayed
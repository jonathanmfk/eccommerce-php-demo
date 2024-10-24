Feature: Buy a product

  Scenario: making a successful purchase
    Given Camila is going to buy a product
    When she selects the product
    Then she should see the purchase was successful
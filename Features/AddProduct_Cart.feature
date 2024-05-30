Feature: Add product to cart
  Scenario: Verify product in cart after adding it
    Given User launch chrome browser
    When User opens url "https://automationexercise.com"
    Then User Click on Products button
    Then User Hover over first product and click Add to cart
    And User Click Continue Shopping button
    Then User Hover over second product and click Add to cart
    And User Click View Cart button
    Then Verify both products are added to Cart
    Then Verify their prices and quantity
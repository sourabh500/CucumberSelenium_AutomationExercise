Feature: Checkout
  Scenario: Successfully place order
    Given User launch chrome browser
    When User opens url "https://automationexercise.com/login"
    Then User click on Signup Login button
    Then User Verify Login to your account is visible
    Then User Enter email address as "shuklasourabh50@gmail.com" and password as "Sourabh@1"
    Then User Click login button
    Then User Verify that Logged in as username is visible
    Then User Hover over first product and click Add to cart
    Then User click on cart button
    And Verify that cart page is displayed
    Then User click on Proceed to checkout button
    And Verify address details
    Then User Enter description in comment text area as "Order by sourabh" and click Place Order
    Then Enter payment details: Name on Card as "sourabh", Card Number as "123456789", CVC as"032", Expiration date "02/26"
    And Click Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!

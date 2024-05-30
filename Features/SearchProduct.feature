Feature: Search product
  Scenario: Searched product should be visible
    Given User launch chrome browser
    When User opens url "https://automationexercise.com"
    Then User Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    Then User Enter product name in search as "Tshirt" and click on search button
    And Verify SEARCHED PRODUCTS is visible
    Then Verify all the products related to search are visible
@checkoutTests
Feature: Checkout Tests
  As a user
  I should able to add an item in basket and able to checkout

  Background:
    Given I'm on Home Page "https://www.apricotonline.co.uk"

  Scenario: Add product to basket and checkout
    When I search for a product "coats" using search option
    And  I got list of search results
    And I should be able to add products to the bag and checkout
    Then verify the checkout confirmation page



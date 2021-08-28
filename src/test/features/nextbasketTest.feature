@next
Feature: Basket Feature Test
  As a user
  I should able to search an item and added to the basket

  Background:
    Given I'm on Home Page "https://www.next.co.uk/"

  @addItemToBasket
  Scenario: verify user search an item and added to the basket
    When I enter searchTerm "T-Shirt"
    And I click searchIcon
    And I should get redirected to results page with heading as "T-Shirt"
    And click the first item from results page
    And select the size for the item
    And click add to bag button
    Then verify the actual item name in the basket




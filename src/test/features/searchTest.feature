@next
Feature: Search Feature Test
  As a user
  I should search and retrieve the relevant products

  @search
  Scenario:  verify product search with product name
    Given I'm on Home Page "https://www.next.co.uk/"
    When I enter searchTerm "T-Shirt"
    And I click searchIcon
    Then I should get redirected to results page with heading as "T-Shirt"


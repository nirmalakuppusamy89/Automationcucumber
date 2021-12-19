@addressBookTests
Feature: Address Book Tests
  As a user
  I should able to create a Address book

  Background:
    Given I'm on Home Page "https://www.apricotonline.co.uk"

    Scenario: Add an address to Address book and verifies
      When I navigate to my address book section under my account
      And I should be able to add a new address
      Then I should verify the  new added address



@accountCreationTests
Feature: Account Creation Tests
  As a user
  I should able to create an account
  Background:
    Given I'm on Home Page "https://www.apricotonline.co.uk"

  @positive
  Scenario: Verify user able to create an account
    When I am on the new account registration page
    And I fill in personal information and sign in information sections
    And I click the CREATE AN ACCOUNT button
    Then I should see ACCOUNT DASHBOARD header and “Thank you for registering with Apricot.“ banner



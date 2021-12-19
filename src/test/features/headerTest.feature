Feature: Header Tests

  Background:
    Given I'm on Home Page "https://www.next.co.uk/"

  @header
  Scenario Outline: Header Links Verification
    When I click on headerLink "<link>"
    Then I should get redirected to appropriate page with tile as "<pageTitleText>"

    Examples:
      | link          | pageTitleText           |
      | My Account    | My Account              |
      | Help          | Next Help Information   |
      | Store Locator | Find Your Nearest Store |

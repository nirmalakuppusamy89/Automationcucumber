Feature: Menu Tests

  Background:
    Given I'm on Home Page "https://www.next.co.uk/"

  @menu
  Scenario Outline:Menu Bar Verification
    When I click on menuBar "<link>"
    Then I should get redirected to appropriate submenu page with tile as "<pageTitleText>"

    Examples:
      | link            | pageTitleText |
      | WOMEN           |               |
      | MEN             |               |
      | HOME            |               |
      | SCHOOL          |               |
      | BOYS            |               |
      | GIRLS           |               |
      | BABY            |               |
      | BEAUTY          |               |
      | BRANDS          |               |
      | SPORTS          |               |
      | GIFTS & FLOWERS |               |
      | CLEARANCE       |               |

Feature: working with google.

@firsttest
Scenario: Validate for Cypress url
    Given Open the browser and enter google search
    When search for cypress
    Then goto cypress site

    
  @multpletest
Scenario Outline: Validate for Cypress url
    Given Open the browser and enter google search
    When search for "<search>"
    Then goto to site
    
    Examples:
    |search|
    |Java|
    |Python|
    |oracle|
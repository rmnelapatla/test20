@Runall
Feature:  this is my first feature file

  Background:

    @smoke1
  Scenario Outline:  Search for  Java in  Gooogle search engine
    Given  As user i navigate to  google page
    When As user i enter "<language>" in search box
    And click on Search button
    Then  Validate the java links on tha page "<search language>"

    Examples:
    |Language| sech language|
    |Java    | java         |
    |Python  | Python       |
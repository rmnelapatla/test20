@functionalTesting

Feature: Flight booking

  Scenario Outline: Book the filght with mulitple destination and break journey.
    Given As user i navigate to orbitz.com "<url>"
    And I select Flight Tab
    And I select multicity option
    And I select first tavel point "<cityA>","<cityB>"
    And I select first journey "<jdate1>"
    And I select Passenger list "<adult>","<child>"

    And I select second day tavel point "<cityB>","<cityC>"
    And I select seond day journey "<jdate2>"

    And I select third day tavel point "<cityC>","<cityA>"
    And I select thiday day journey "<jdate3>"
    And I submit my Search


  #mm/dd/yyyy
    Examples:
      |url                    |jdate1    |jdate2    |jdate3    |adult|child|cityA                     |cityB                      |cityC                        |
      |https://www.orbitz.com/|06/28/2020|07/11/2020|07/22/2020|2    |2:5,10    |Dallas (DFW-All Airports) |Houston (HOU-All Airports) |San Diego (SAN-All Airports) |
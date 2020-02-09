Feature: To validtae the search functionality in youtube mobile application

  Scenario Outline: To validate the search functionality with valid keyword
    Given user should be in the youtube application homepage
    When user should enter the "<Keyword>" to search
    And user should be able to view the suggestion of the search and relevant option has to be selected
    Then user should viewing the video playing

    Examples: 
      | Keyword             |
      | Selena Gomez Wolves |

Feature: feature to test google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google serch page
    When user enters a text in serach box
    And clicks on serach button
    Then user navigates to serach result

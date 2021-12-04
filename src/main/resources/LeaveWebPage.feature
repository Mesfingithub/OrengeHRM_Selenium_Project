Feature: Test Cases about Orange HRM My Leave WebPage
  Background: Web driver is able to find My Leave WebPage
  Scenario: Test case about My Leave WebPag
    Given User is able to get the My leave list Webpage
    When  User is able select beginning date from date calendar
    And   User is able select ending date from date calendar
    And   User is able to select All check box
    And   User is able to click the search button
    Then  System should display employee details

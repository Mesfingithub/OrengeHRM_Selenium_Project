Feature: Test Cases about Orange Home Page
  Background: Web driver is able to find the home page and be landed on dashboard

  Scenario: Test case about home page
    Given User is able type username and password
    And   Click the Login Button and pass
    Then  System should open the Dashboard directly
    And   User should be able to see new Dashboard HTMl Page
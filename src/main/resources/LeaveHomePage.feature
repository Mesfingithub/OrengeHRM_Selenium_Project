Feature: Test Cases about Leave Web Page
  Background: WebDriver is able to find the Leave Web Page by click on Assign Leave Link/button
  Scenario: Test Case is about Assign Leave Web Page
    Given User is able to type any employee's first letter Name from Employee Name input box
    When  User selects the Leave Assign Employee Name from the dropdown list
    And   User is able to select the appropriate Leave Type from the input box dropdown list
    And   User is able to select the Beginning Date: year/month/day from FROM Date calendar
    And   User is able to select the End Date: year/month/day from To Date calendar
    And   User is able to comment anything on Comment Type Box
    And   User is able to click on Assign Button
    And   User is able to see the result on Leave Balance
    Then  System should generate confirmation on the pop-up window
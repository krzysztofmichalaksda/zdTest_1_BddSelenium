Feature: Search in google browser

  Scenario: Search sda in google
    Given a user is on google.com page
    When the user types sda in google input search
      And the user clicks on search button
    Then the user should see sdacademy on search results
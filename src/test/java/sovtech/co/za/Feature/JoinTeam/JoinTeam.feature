Feature: User completes Form to Join SovTech Team

  @Regression
  Scenario Outline: User fills in all the required information on the form to Join SevTech team
    Given User navigates to sovtech website "<url>"
    And User needs to be on sovtech home_page
    And User clicks About Us
    And User User scrolls down to Join out team
    And User clicks Join our team button
    Then User validates Join our team page
    And User clicks Apply Below button
    And User selcts Qaulity Assurance Tester option
    Then User scroll down to Apply for this position button
    And User clicks button Apply for this position
    Examples:
      | url                       |
      | https://www.sovtech.co.za |



Feature: User completes a form for Software Quote

  @Regression
  Scenario Outline: User fills in all the required information for Software Qoute
    Given User navigates to sovtech website "<url>"
    And User needs to be on sovtech home_page
    And User clicks on Clients dropdown
    And User scrolls down to Software Quote
    And User enters Full Names "<full_name>"
    And User enters Work Email Address "<work_email>"
    And User enters Mobile Number "<mobile_number>"
#    And User clicks Company size
    And User selects second option for Company Size
#    And User clicks on How can we help you
    And User selects third option for How can we help you
    And User user enters a message "<message>"
    And User clicks button Submit
    Then User closes browser

    Examples:
      | url                       | full_name         | work_email               | mobile_number | message                             |
      | https://www.sovtech.co.za | Aubrey Fredericks | afredericksdvt@gmail.com | 0847389926    | need assistance in scaling engineer |
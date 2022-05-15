Feature: User completes SovTech Business request form

  @Regression
  Scenario Outline: User fills in all the required information on the form
    Given User navigates to sovtech website "<url>"
    And User needs to be on sovtech home_page
    And User clicks on start_a_project button
    And User validates page heading Start a project
    And User enters Full Name "<full_name>"
    And User enters Work Email "<work_email>"
    And User enters Contact Number "<contact_number>"
    And User selects Company Size "<company_size>"
    And User gives more details about the project "<message>"
    And User clicks Submit button
    Then User closes browser
    Examples:
      | url                       | full_name    | work_email               | contact_number | company_size | message                          |
      | https://www.sovtech.co.za | Daniel Green | daniel.green20@gmail.com | 0847389926     | 5-25         | the project is for retail system |

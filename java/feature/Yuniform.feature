Feature: Uniform Delete Coupon Page

  Background: Background Scenario
    Given User is on homepage
    When user enter valid Username "admin" and password "Admin@123"
    And user clicks on submit button
    And user clicks on Menu to navigate to Marketing
    And user clicks on Coupons linktext and navigates to coupons page

  @mohisin
  Scenario: 
    When user clicks on Checkbox
    And clicks on Delete button to delete selected
    And confirm the selected files to be delete
    Then selected coupon deleted

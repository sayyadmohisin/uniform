Feature: Uniform Edit Coupon Page

  Background: Background Scenario
    Given User is on homepage
    When user enter valid Username "admin" and password "Admin@123"
    And user clicks on submit button
    And user clicks on Menu to navigate to Marketing
    And user clicks on Coupons linktext and navigates to coupons page
@third
  Scenario Outline: 
    When User clicks on Edit coupon Page
    And User clears the prevoius Coupon
    And User enters the New coupon Couponname"<couponname>" and CouponCode"<couponcode>"
    Then Saves the Coupon

    Examples: 
      | couponname | couponcode |
      | flat10%off | asjhr7    |

Feature: Uniform Add new coupon Page

  Background: Background Scenario
    Given User is on homepage
    When user enter valid Username "admin" and password "Admin@123"
    And user clicks on submit button
    And user clicks on Menu to navigate to Marketing
    And user clicks on Coupons linktext and navigates to coupons page
@second
  Scenario Outline: 
    When user clicks on Addnewcoupon
    And user enters  data in fields CouponName"<couponname>" and Code"<code>"
    Then Saves the new coupon

    Examples: 
      | couponname | code      |
      | flat29%off | amoyt123 |

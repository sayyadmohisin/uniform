Feature: Uniform Login  page

  @first
  Scenario Outline: Login with unauthorized user
    Given User is on homepage
    When user enter invalid Username "<username>" and password "<password>"
    And user clicks on submit button
    Then Validation message appears

    Examples: 
      | username | password |
      | mohisin  | Mohi007  |

  @first2
  Scenario Outline: Login with authorized user
    Given User is on homepage
    When user enter valid Username "<username>" and password "<password>"
    And user clicks on submit button

    Examples: 
      | username | password  |
      | admin    | Admin@123 |

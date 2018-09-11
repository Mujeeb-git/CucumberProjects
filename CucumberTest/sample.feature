Feature: Refund of item

  Background: 
    Given Refund of any faulty item as per the guidelines

  Scenario Outline: Jeff returns the faulty microwave
    Given Jeff has brought microwave for <cost>
    And Jeff has a receipt
    When Jeff returns the microwave
    Then Jeff should receive refund of <refund_amount>

    Examples: 
      | cost | refund_amount |
      |  100 |            98 |
      |  150 |           125 |

  Scenario Outline: User login to the portal
    Given Application is opened
    When User enters the userName as "<user>" and password as "<pwd>"
    Then User should be able to login to the portal

    Examples: 
      | user  | pwd   |
      | demo  | demo  |
      | demo1 | demo1 |
      | demo2 | demo2 |
      | demo3 | demo3 |

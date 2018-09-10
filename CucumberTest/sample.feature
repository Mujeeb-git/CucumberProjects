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

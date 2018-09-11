#Author: Mujeeb Mohammed
Feature: Refund of item

  @loginTest
  Scenario Outline: User login to the portal
    Given Application is opened
    When User enters the userName as "<user>" and password as "<pwd>"
    Then User should be able to login to the portal

    Examples: 
      | user | pwd  |
      | demo | demo |

  @dataTest
  Scenario: large data
    Given the following users exist
      | useName | password  | country       |
      | user1   | password1 | UNITED STATES |
      | user2   | password2 | RUSSIA        |
      | user3   | password3 | UGANGA        |
      | user4   | password4 | GERMANY       |

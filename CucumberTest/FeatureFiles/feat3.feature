#Author: Mujeeb Mohammed
Feature: Register from the portal

  @register
  Scenario Outline: User login to the portal
    Given Application is opened
    When Register with country name as "<country>", "<userName>" and "<password>"
    Then User should be registered succesfully the "<userName>"

    Examples: 
      | country       | userName | password  |
      | UNITED STATES | ut01     | password1 |
      | RUSSIA        | rus01    | password2 |
      | TURKEY        | tur01    | password3 |

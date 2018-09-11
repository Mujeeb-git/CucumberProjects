#Author: Mujeeb Mohammed
Feature: Login to Portal

  @loginTest
  Scenario: User login to the portal2
    Given Application2 is opened
    When User enters the userName2 as "user" and password2 as "password"
    Then User should be able to login to the portal2

  @loginTest @smokeTest
  Scenario: User login to the portal3
    Given Application3 is opened
    When User enters the userName3 as "user" and password3 as "password"
    Then User should be able to login to the portal3

Feature: Login feature for VR Foundations

  Scenario: Login VR Foundations with valid username and password
    Given I launch the application
    When I enter valid credentials from 1
    Then I verify welcome Message as "Welcome Red Radius"



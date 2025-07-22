Feature: Login feature for VR Foundations

  Scenario: Login VR Foundations with valid username and password
    Given I launch the application
    When I enter valid credentials from 1
    Then I verify welcome Message as "Welcome Red Radius"


  Scenario Outline: Fill the details and add leads
    Given I launch the application
    When I enter valid credentials from 1
    Then I click Add lead button
    And I fill the lead details
    Examples:
      | FirstName | LastName | Phone      | Project     |
      | mansoor   | khan     | 8123456780 | Dazzle City |
      | jayasree  | meticota | 9796826701 | VR Paradise |





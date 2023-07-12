Feature: An example

  Scenario: The example
    Given I am on the Google Search page
    When The search term of "Cucumber" is written
    And The search button is clicked
    Then the scenario passes

  Scenario: The example2
    Given I am on the Google Search page
    When The Deutsch language button is clicked
    Then the scenario passes

  Scenario: The example3
    Given I am on the Google Search page
    When The Google search by image link is clicked
    And The search term of "Cucuvea" is written
    And The search Image Button is clicked
    Then the scenario passes

  Scenario: The example4
    Given I am on the Google Search page
    When The Gmail button is clicked
    And The connect button to your e-mail is clicked
    Then the scenario passes

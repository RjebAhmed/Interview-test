Feature: Feature 1

  Scenario: Scenario 1
    Given Navigate to the web page
    When User click on the click button
    Then Then click done message should be displayed

  Scenario: Scenario 2
    Given Navigate to the web page
    When User click on the DblClick button
    Then Then DblClick Done message should be displayed

  Scenario: Scenario 3
    Given Navigate to the web page
    When Move the mouse over the MouseOver button
    Then Then MouseOver Done message should be displayed

  Scenario: Scenario 4
    Given Navigate to the web page
    When User insert a value in the first input text field
    And Click on the propagate button
    And All other input fields contain the same value inserted initially
    And Click on the clear all button
    Then All the four input fields are empty

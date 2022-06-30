Feature: The tester should be able to check for assigned defects and update defects status
Scenario: As a tester I want to be able to check for defect that had been assign to me 
    Given The tester is on the tester page
    When  The tester click on the Check for defect button
    Then  The tester should be able to see the assigned defect

Scenario: As a tester I want to be able to reject and update the defect
    Given The tester is on the tester page and see the assigned defect
    When  The tester enter the defect ID to reject
    When  The tester select reject from the selector
    When  The tester click the save button 
    Then  The defect should be rejected

Scenario: As a tester I want to be able to accept and update the defect
    Given The tester is on the tester page and see the assigned defect
    When  The tester enter the defect ID to accept
    When  The tester select accept from the selector
    When  The tester select one of the action option
    When  The tester click the save button
    Then  The defect should be accepted and updated
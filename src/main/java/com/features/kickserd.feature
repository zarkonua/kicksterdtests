Feature: Kicksterd Feature

  @1
  Scenario: Verify that user can login
    Given I open twitter
    When I'm filling in login form
    Then I should be logged in

  @2
  Scenario: Verify that user can update status
    Given I open twitter
    When I select
    Then I should see cat
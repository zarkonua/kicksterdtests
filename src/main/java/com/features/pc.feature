Feature: PC Feature

  @1
  Scenario: Verify that user can open category1 page
    Given I open kicksterd
    When I select category "category1"
    Then I should see page url "http://localhost:8080/category/1.html"

  @2
  Scenario: Verify that user can see projects
    Given I open kicksterd
    When I select category "category1"
    Then verify that it has projects:
      | project1 |
      | project2 |

  @3
  Scenario: Verify that unregistered user can invest
    Given I open kicksterd
    When I select category "category1"
    When I select project "project1"
    Then verify that unregistered user can invest money "22"

  @4
  Scenario: Verify that user can register
    Given I open kicksterd
    When I select register link
    When I enter my information
    Then I should be able to login
Feature: PC Feature

  @1
  Scenario: Verify that user can open PC page
    Given I open kicksterd
    When I select category "category1"
    Then I should see page url "http://localhost:8080/category/1.html"

  @2
  Scenario: Verify that user can open PC page
    Given I open kicksterd
    When I select category "category1"
    Then verify that it has projects:
      | project1 |
      | project2 |
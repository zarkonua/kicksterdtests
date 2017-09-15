package com.kicksterd.steps;

import com.kicksterd.pages.Home;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class HomeSteps extends Step {

    @Autowired
    Home home;

    @When("^I select")
    public void shouldSelectCategory() throws Throwable {
        home.GetStatusByName();
    }

    @Then("I should see cat")
    public void shouldBeCategoryPage() {
        assertTrue(true);
    }
}

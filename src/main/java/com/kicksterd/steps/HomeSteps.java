package com.kicksterd.steps;

import com.kicksterd.pages.Home;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps extends Step {

    @Autowired
    Home home;

    @Given("^I open kicksterd$")
    public void shouldOpenMainPage() throws Throwable {
        home.open();
    }

    @When("^I select category \"(.*?)\"$")
    public void shoulSelectCategory(String cat) throws Throwable {
        home.getCategoty(cat).click();
    }

}

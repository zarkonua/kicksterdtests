package com.kicksterd.steps;

import com.kicksterd.pages.LoginForm;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LoginSteps extends Step {

    @Autowired
    LoginForm loginForm;

    Random rn = new Random();
    String userName = "user" + rn.nextInt(99999999);
    String password = "123456";
    String email = userName + "@kicksterd.com";


    @Given("^I open twitter")
    public void shouldOpenMainPage() throws Throwable {
        loginForm.open();
    }

    @When("^I'm filling in login form")
    public void shouldFillInLoginForm() throws Throwable {
        loginForm.fillInLoginForm("", "");
    }

    @Then("I should be logged in")
    public void shouldBeLoggedIn() throws InterruptedException {
        assertThat(loginForm.amILoggedIn(),  is(true));
    }

}

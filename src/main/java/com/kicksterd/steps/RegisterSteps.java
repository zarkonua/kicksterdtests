package com.kicksterd.steps;

import com.kicksterd.pages.Login;
import com.kicksterd.pages.Register;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class RegisterSteps extends Step {

    @Autowired
    Register register;

    @Autowired
    Login login;

    Random rn = new Random();
    String userName = "user" + rn.nextInt(99999999);
    String password = "123456";
    String email = userName + "@kicksterd.com";

    @When("^I select register link")
    public void shouldSelectRegister() throws Throwable {
        register.open();
    }

    @When("^I enter my information")
    public void fillInRegForm() throws Throwable {
        register.fillInRegistrationForm(userName, email, password);
    }

    @Then("I should be able to login")
    public void shouldBeCategoryPage() throws InterruptedException {
        login.fillInLoginForm(userName, password);
        assertThat(login.isMyAccountDisplayed(),  is(true));
    }

}

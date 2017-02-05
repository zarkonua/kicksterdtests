package com.kicksterd.steps;

import com.kicksterd.pages.Login;
import com.kicksterd.pages.Projects;
import com.kicksterd.pages.UserAccount;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class UserAccountSteps extends Step {

    @Autowired
    UserAccount userAccount;

    @Autowired
    Projects projects;

    @Autowired
    Login login;

    String userName = "testUser";
    String password = "123456";
    Random rn = new Random();
    int projectRandomPostfix = rn.nextInt(99999999);
    String projectName = "TestProject" + projectRandomPostfix;

    @When("^Check if user login")
    public void fillInLoginForm() throws InterruptedException {
        if (!login.isMyAccountDisplayed()) {
            login.fillInLoginForm(userName, password);
        }
    }

    @Then("I should be able to create new project")
    public void shouldCreateProject() throws InterruptedException {
        userAccount.open();
        Thread.sleep(1000);
        userAccount.fillInNewProjectForm(projectName, "Test Project Description " + projectRandomPostfix, String.valueOf(projectRandomPostfix),
                "23", "Test Project History " + projectRandomPostfix, "http://testproject.com", "category1");
        projects.open();
        assertThat(projectName, equalTo(projects.getProject(projectName).getText()));
    }

}

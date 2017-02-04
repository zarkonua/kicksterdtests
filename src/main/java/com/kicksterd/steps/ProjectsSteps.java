package com.kicksterd.steps;

import com.kicksterd.pages.Projects;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ProjectsSteps extends Step {

    @Autowired
    Projects projects;

    @Then("I should see page url \"(.*?)\"$")
    public void shouldCategoryPage(String url) {
        assertThat(projects.getCurrentUrl(), equalTo(url));
    }

    @Then("^verify that it has projects:$")
    public void shouldBeSubItems(DataTable table) throws Throwable {
        List<String> expect = table.asList(String.class);
        List<WebElement> actual = projects.getSubItems();
        assertThat(actual.size(), equalTo(expect.size()));
    }

}

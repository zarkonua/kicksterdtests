package com.kicksterd.steps;

import com.kicksterd.pages.Project;
import cucumber.api.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ProjectSteps extends Step {

    @Autowired
    Project project;

    @Then("^verify that unregistered user can invest money \"(.*?)\"$")
    public void summShouldIncrease(String summ) throws Throwable {
        project.open();
        project.investCustomSummBotton().click();
        int collectedSumm = Integer.parseInt(project.getCollectedSumm().getText());
        project.fillInvestForm("investor1", "24235634634", summ);
        project.open();
        int collectedSummAfterDonation = Integer.parseInt(project.getCollectedSumm().getText());
        assertThat(collectedSumm + Integer.parseInt(summ), equalTo(collectedSummAfterDonation));
    }

}

package com.kicksterd;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = {},format = {"pretty", "json:target/kicksterd.json","html:target/kicksterd.html"}, features = {"src/main/java/com/features/"})
public class CucumberRunner {

}

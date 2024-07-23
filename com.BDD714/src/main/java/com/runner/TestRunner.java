package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/main/java/com/features",
		glue="com.stepdefs",
		plugin="html:target",
		dryRun=false,// to compile feature file
		monochrome=true,// to get readbable output in the console
		tags="@run" // to run a specific Scenario/feature
		)

public class TestRunner {

}

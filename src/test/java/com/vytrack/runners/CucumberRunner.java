package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //this 2 parameters are mandatory
        glue = "com/vytrack/step_definitions", // path to the package with step definition methods
        features = "src/test/resources/features", //path to the folder/directory with feature files
        dryRun = false, //to run the test dryRun must be false
        strict = false,
        tags ="", //tags="not@driver"run every cases except this one
        plugin = "html:target/cucumber-html-report" // will generate cucumber html report
)
public class CucumberRunner {
}

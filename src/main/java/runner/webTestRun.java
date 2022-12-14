package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features",
tags = {"@test"}, monochrome = true, plugin = {
        "pretty", 
        "html:target/cucumber-report/runwebat",
        "junit:target/cucumber-report/cucumber.xml",
        "json:target/cucumber-report/runwebat/cucumber.json",
        "rerun:target/rerun.txt"},
        glue = "com.salmon.test")



public class webTestRun extends AbstractTestNGCucumberTests {
	

}

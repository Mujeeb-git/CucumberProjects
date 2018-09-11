package testSuite;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles", glue = {"stepDefs"},
tags={"@dataTest"},
plugin = {"pretty","html:target/cucumber-html-report"})
public class TestRunner {

}

package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)


@CucumberOptions(features = { "src/test/java/FeatureFiles" },
//tags={"@Create"},
tags = { "@demo" },
glue = { "stepdefinations" }, plugin = {
		"io.cucumber.zephyr.ZephyrXMLFormatter:target/zephyr.xml"}, monochrome = false)
public class SampleRunner {

}

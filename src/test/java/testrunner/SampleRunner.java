package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(features = { "src/test/java/FeatureFiles" },
//tags={"@Create"},
tags = { "@demo" },
glue = { "stepdefinations" }, plugin = {
		"io.cucumber.zephyr.ZephyrXMLFormatter:target/zephyr.xml"}, monochrome = false)
public class SampleRunner {

}

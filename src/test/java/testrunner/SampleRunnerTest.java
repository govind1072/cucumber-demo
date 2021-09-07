package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)


@CucumberOptions(features = { "src/test/java/FeatureFiles" },
//tags={"@Create"},
//tags = { "@demo" },
glue = {"stepdefinations"}, plugin = {
		"io.cucumber.zephyr.ZephyrXMLFormatter:target/zephyr.xml","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
		"pretty", "json:target/cucumber-reports/Cucumber.json",
		 "junit:target/cucumber-reports/Cucumber.xml",
		 "html:target/cucumber-reports"}, monochrome = false)
public class SampleRunnerTest {

}

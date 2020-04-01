package com.qa.runner;


import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = {"src/test/java/com/qa/features"},
		glue = {"com.qa.stepdefn"},
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" },
		monochrome = true,
		tags = {"@Sanity"}
		
		
		
		)







public class CucumberTest {

}

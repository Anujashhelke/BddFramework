package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"C:\\Users\\mindtreefeb188\\eclipse-workspace\\BddFramework\\Feature"},
		glue={"stepdefination"},
		plugin={"pretty", "html:report/rep.html"},
		monochrome=true,
		dryRun=false)
public class TestRunner {

}
	

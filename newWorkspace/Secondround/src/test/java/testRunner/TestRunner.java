package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="Features",
		glue="stepDef",
		tags = "@one or @two"
		
		)

public class TestRunner extends AbstractTestNGCucumberTests{

}

package test_runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="FEATURES", glue="test_set")
public class Test_Runner extends AbstractTestNGCucumberTests{
	
}

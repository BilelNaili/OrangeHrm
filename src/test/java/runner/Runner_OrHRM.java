package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
 
@CucumberOptions(
		
		features="src/test/resources/Feature/ControlerMenu.feature",
		glue="testsuite",
		plugin= {"pretty","html:target/cucumber-report.html"}
		)



public class Runner_OrHRM {

}

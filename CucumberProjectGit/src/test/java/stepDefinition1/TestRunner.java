package stepDefinition1;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
	features="src\\test\\resources\\Features\\tricentis.feature"	, 
	glue= {"stepDefinition1"},
	dryRun=false,		
	plugin= {"pretty","html:target/Reports/OrangeHRM.html"},
	monochrome = true
		)

public class TestRunner {

	
}

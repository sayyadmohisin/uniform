package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		 features = "src/test/java/feature",
	        glue ={"stepdefinition","hooks"},
	        monochrome= true,
	        dryRun= false,
           tags={"@first,@first2,@second,@third,@mohisin"},
	        plugin={"pretty","html:Reports","json:Reports/jsonReports.json","junit:Reports/xmlreports.xml"}
	       )
public class runner {

}

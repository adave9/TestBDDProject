package runnerOrange;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(

		features = {
				"C:\\Selenium_Workspace_New\\OrangeHRM_BDD_Practice\\src\\main\\java\\featuresOrange\\loginOrange.feature",
				"C:\\Selenium_Workspace_New\\OrangeHRM_BDD_Practice\\src\\main\\java\\featuresOrange\\AddEmp.feature" },
		// the path of the feature files
		glue = { "stepDefinationsOrange" }, // step Defination Package Name
		plugin = { "pretty", "html:target/cucumber-reports.html" },
		// "html:test-output"},
		// "jason:jason_output/cucumber.jason"},
		monochrome = true, // display the console output in a proper readable format
		// strict = true, //it will check if any step is not defined in step definition
		// file
		dryRun = false // to check the mapping is proper between feature file and step def file
)
public class TestRunnerOrange extends AbstractTestNGCucumberTests {

}

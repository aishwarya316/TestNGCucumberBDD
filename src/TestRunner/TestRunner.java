package TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;




@CucumberOptions(
		features={"features"}, //the path of the feature files
		glue={"StepDef"},//the path of the step definition files
		format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json"},
		monochrome=true)


		

	public class TestRunner {
	    private TestNGCucumberRunner testNGCucumberRunner;

	    @BeforeClass()
	    public void setUpClass() throws Exception {
	        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	    }

	    @Test(dataProvider = "features")
	    public void feature(CucumberFeatureWrapper cucumberFeature) {
	        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	    }

	    @DataProvider
	    public Object[][] features() {
	        return testNGCucumberRunner.provideFeatures();
	    }

	    @AfterClass()
	    public void tearDownClass() throws Exception {
	        testNGCucumberRunner.finish();
	    }
	} 

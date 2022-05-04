package stepdefination;

import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import bddFrameUtility.BaseClass;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;
import bddFrameUtility.Snapshot;
import bddframePageobject.Footer;
import bddframePageobject.Searchpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class FooterPageStepDefination {
	public static ExtentReport extent=new ExtentReport();
	
	public static ExtentTest test;
	WebDriver driver;
	Logs logger;
	Logger log;
	Footer f=new Footer();
	Snapshot snap;

	    @When("^user click on Floss in footer$")
	    public void user_click_on_floss_in_footer() throws Throwable {
	        f.clickOnLink();
	        extent.logFail("clicked fail");
	      }

	    @Then("^next page populated$")
	    public void next_page_populated() throws Throwable {
	        f.getTitle();
	        

	    }

	    @And("^text FLOSS PICKS verified$")
	    public void text_floss_picks_verified() throws Throwable {
	        f.verifyText();
	      extent.logPass("text verified");
	       BaseClass.close();
	    }
	   

	    @Then("close driver")
	    public void close_driver() {
	        // Write code here that turns the phrase above into concrete actions
	      
	    }




	}



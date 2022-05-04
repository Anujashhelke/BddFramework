package stepdefination;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



import bddFrameUtility.BaseClass;
import bddFrameUtility.ConfigRead;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;
import bddframePageobject.Homepage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
public class HomepageStepdefination extends BaseClass {
	public static ExtentReport extent;
	WebDriver driver;
	Logs logger;
	Logger log;
	Homepage h=new Homepage();
	ConfigRead read;
  
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
	    extent=new ExtentReport();
		read=new ConfigRead();
		
			// TODO Auto-generated catch bloc
		  //  extent.createReport();
		    driver=BaseClass.setUp();
					driver.get(read.getUrl());
	    extent.createReport(getClass().getName());
	  extent.createTest("verify product");
	  extent.logPass("browser launched successfully");
	   
	}
	@When("^user hover on more products$")
	public void user_hover_on_more_products() {
		h.hover();
		extent.logPass("hover successfully");
	   
	}
	@And("^click on kids brushes$")
	public void click_on_kids_brushes() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	   h.clickOnKidsBrush();
	   extent.logPass("clicked successfully");
	}
	@Then("^text Kids displayed in second brush in list$")
	public void text_kids_displayed_in_second_brush_in_list() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(3000);
	   h.verifyText();
	   extent.logFail("failed to display brush in list");
	
	    
	}
	@And("^close the driver$")
	public void close_the_driver() throws IOException {
		extent.logPass("closed successfully");
		BaseClass.close();
		
	}



	
}



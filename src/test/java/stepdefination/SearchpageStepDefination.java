package stepdefination;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import bddFrameUtility.BaseClass;
import bddFrameUtility.ExcelRead;
import bddFrameUtility.ExtentReport;
import bddFrameUtility.Logs;
import bddFrameUtility.ConfigRead;
import bddframePageobject.Searchpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class SearchpageStepDefination {
	
		public static ExtentReport extent=new ExtentReport();
		public static ExtentTest test;
		WebDriver driver;
		Logs logger;
		Logger log;
		ExcelRead reader;
		ConfigRead read=new ConfigRead();
		Searchpage h=new Searchpage();

		@When("^user click on search$")
		public void user_click_on_search() {
			 h.search();
			 extent.logFail("clicked on search successfully");
			 
			   
		}
		@Then("^enter the \"([^\"]*)\" and \"([^\"]*)\"$")
		public void enter_the(String string, int num) throws IOException {
			 reader=new ExcelRead();
			String testData= reader.getdata(read.getFile(), string,num);
			
		   h.enterProduct(testData);
		   
		   extent.logPass("product entered successfully");
		}
		@And("^click on search icon$")
		public void click_on_search_icon() {
		  h.clickOnSearch();
		  extent.logPass("successful");
		  
		}
		@And("^click on resultant product$")
		public void click_on_resultant_product() throws InterruptedException {
			h.clickOnNext();
			extent.logPass("clicked on next");
		  h.clickOnProduct();
		  extent.logPass("clicked on another product");
		}
	

		@Then("^product \"([^\"]*)\" displayed on product details page$")
		public void product_displayed_on_product_details_page(String string) throws IOException {
		    // Write code here that turns the phrase above into concrete actions
		   h.verifyText(string);
		   extent.logPass(string);
		  // extent.endReport();
		   BaseClass.close();
		}



	



}

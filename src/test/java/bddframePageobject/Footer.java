package bddframePageobject;

import java.io.IOException;

import org.apache.logging.log4j.Logger;

import bddFrameReusable.WebDriverHelper;
import bddFrameUistore.FooterUi;
import bddFrameUtility.BaseClass;
import bddFrameUtility.Logs;
    
     
public class Footer {
	 Logs log;
	 Logger logger;
	WebDriverHelper helper;
	public Footer() {
		helper=new WebDriverHelper();
		  log=new Logs();
			logger=log.createLog();
	}

	public void clickOnLink() {
		helper.explictlyWaitOfVisibilityOfElementLocatedBy(FooterUi.link, 60);
		helper.clickButton(FooterUi.link);
		logger.info("clicked successfully");
	}

	public void getTitle() {
		helper.getTitle();
		logger.debug("title get successfully");
		
	}

	public void verifyText() {
		helper.getText();
	//helper.textPresent(FooterUi.text);
		logger.debug("text got successfully");
		
	}

	public void close() throws IOException {
		BaseClass.close();
		
	}

}

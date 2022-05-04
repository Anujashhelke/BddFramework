package bddframePageobject;

import org.apache.logging.log4j.Logger;

import bddFrameReusable.WebDriverHelper;
import bddFrameUistore.HomeUi;
import bddFrameUtility.Logs;

public class Homepage {
	WebDriverHelper helper;
	Logs logUtil;
	Logger log;
	
	public Homepage() {
		helper=new WebDriverHelper();
		  logUtil=new Logs();
			log=logUtil.createLog();
	}

	public void hover() {
		helper.explictlyWaitOfVisibilityOfElementLocatedBy(HomeUi.hover,50);
		helper.action(HomeUi.hover);
	log.info("hover successfully");
		
	}

	public void clickOnKidsBrush() {
		helper.explictlyWaitOfVisibilityOfElementLocatedBy(HomeUi.kid,50);
		helper.click(HomeUi.kid);
		log.info("clicled on kid brush");
		
	}

	 public void verifyText() {
			helper.explictlyWaitOfVisibilityOfElementLocatedBy(HomeUi.text,50);
		boolean var=helper.textContains(HomeUi.text);
		 if(var) {
			 System.out.println("text is present");
		 }
		 else {
			 System.out.println("text is not present");
		 }
		 log.error("error occured");
		
	}

}

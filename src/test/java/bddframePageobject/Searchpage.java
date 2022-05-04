package bddframePageobject;

import org.apache.logging.log4j.Logger;

import bddFrameReusable.WebDriverHelper;
import bddFrameUistore.SearchUi;
import bddFrameUtility.Logs;

public class Searchpage {
	WebDriverHelper helper;
	Logs logUtil;
	Logger log;
	
	public Searchpage() {
	       logUtil=new Logs();
			log=logUtil.createLog();
			helper=new WebDriverHelper();
	}

	public void search() {
		// TODO Auto-generated method stub
		
		helper.clickButton(SearchUi.search);	
		log.info("clicked on search");
	}

	public void enterProduct(String string) {
		
		helper.sendText(SearchUi.sendText,string);
		log.debug("text sended successfully");
	}

	public void clickOnSearch() {
		// TODO Auto-generated method stub
		helper.enterKeys(SearchUi.sendText);
		log.info("Entered successfully");
		
	}

	public void clickOnProduct() {
		helper.clickButton(SearchUi.text);
		
	}

	public void verifyText(String string) {
		// TODO Auto-generated method stub
		helper.textEquals(SearchUi.get,string);
		
	}

	public void clickOnNext() throws InterruptedException {
		Thread.sleep(3000);
		helper.clickNext(SearchUi.nextClick);
		log.debug("clicked on next");
		
	}

}

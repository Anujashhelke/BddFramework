package bddFrameReusable;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import bddFrameUtility.BaseClass;

public class WebDriverHelper extends BaseClass{

	

	

	public void action(By hover) {
		WebElement ele=driver.findElement(hover);
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		
	}

	public void click(By kid) {
		WebElement click=driver.findElement(kid);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click",click);
		
	}

	public boolean textContains(By text) {
		if(driver.findElement(text).getText().contains("Kids")) {
			return true;
		}
		return false;
		
	}

	public void explictlyWaitOfVisibilityOfElementLocatedBy(By hover, int i) {
	WebDriverWait wait=new WebDriverWait(driver,i);
	wait.until(ExpectedConditions.visibilityOfElementLocated(hover));
	
		
	}

	public void clickButton(By search) {
		driver.findElement(search).click();
		
	}

	public void sendText(By sendText, String string) {
		driver.findElement(sendText).sendKeys(string);
		
	}

	public void enterKeys(By sendText) {
		driver.findElement(sendText).sendKeys(Keys.ENTER);
		
	}

	public void clickNext(By nextClick) {
		boolean b=driver.findElement(nextClick).isEnabled();
		if(b) {
			driver.findElement(nextClick).click();;
			
			
		}
	}

	public void textEquals(By get, String string) {
	if(driver.findElement(get).getText().equalsIgnoreCase(string)){
		System.out.println(driver.findElement(get).getText()+"text is present");
	}
		
	}

	public void getTitle() {
		System.out.println(driver.getTitle());
		
	}

	public void textPresent(By text) {
		String ste=driver.findElement(text).getText();
		if(ste.equalsIgnoreCase("Floss Picks")) {
			System.out.println(driver.findElement(text).getText()+"text is present");
		}
		
	}

	public void getText() {
		if(driver.getPageSource().contains("OXYJET")) {
			System.out.println("Text is present");
		}
		else {
			System.out.println("text is not present");
		}
		
	}

}

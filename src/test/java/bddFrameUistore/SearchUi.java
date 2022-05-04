package bddFrameUistore;

import org.openqa.selenium.By;

public class SearchUi {
	public static By search=By.xpath("//a[@class='navUser-action navUser-action--quickSearch event_search']");
	public static By sendText=By.id("search_query");
	
	//public static By nextClick=By.xpath("//*[@id='product-listing-container']/div/ul/li[3]/a/i/svg");
	//"//*[@id='product-listing-container']/div/ul/li[3]/a/i/svg"
	public static By nextClick=By.xpath("//*[@id='product-listing-container'] //li[@class='pagination-item pagination-item--next']");
	public static By text=By.xpath("//*[@id='product-listing-container'] //a[contains(text(),'3D White Battery Toothbrush')]");
	public static By get=By.xpath("//div[@class='productView-product'] //h1");

}

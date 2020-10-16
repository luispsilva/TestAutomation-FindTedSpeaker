package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	private By watchTab = By.xpath("//a[text()='Watch']");
	private By tedTalksOption = By.xpath("//div[text()='TED Talks']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getWatchTab() {
	
		return driver.findElement(watchTab);
		
	}
	
	public WebElement getTedTalksOption() {
		
		return driver.findElement(tedTalksOption);
		
	}
}

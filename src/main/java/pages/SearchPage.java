package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {
	
	public WebDriver driver;
	
	private By closePopUp = By.xpath("//div[@id='recommends-banner']//button");
	private By topicsDropdown = By.cssSelector("#topics");
	private By languagesDropdown = By.id("languages");
	private By moreButton = By.xpath("(//button[text()='More'])[2]");
	private By findSpeakerButton = By.cssSelector("a.button.button--wide");
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void closePopUp() {
		driver.findElement(closePopUp).click();
	}
	
	public void selectTechnologhyOption() {
		Select s = new Select(driver.findElement(topicsDropdown));
		s.selectByValue("Technology");
	}
	
	public void selectEnglishOption() {
		Select s = new Select(driver.findElement(languagesDropdown));
		s.selectByValue("en");
	}
	
	public void clickOnMoreButton() {
		driver.findElement(moreButton).click();
	}
	
	public void clickOnFindSpeakerButton() {
		driver.findElement(findSpeakerButton).click();
	}
}

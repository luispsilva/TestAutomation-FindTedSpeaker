package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpeakersPage {

	public WebDriver driver;
	
	public SpeakersPage(WebDriver driver) {
		this.driver = driver;
	}

	public void getSpeaker() {
		
		List<WebElement> speakers = driver.findElements(By.cssSelector("h4.h7.m5")); 
																							
		for (int i=0; i<speakers.size(); i++) {

			String name = speakers.get(i).getText(); 

			if (name.contains("Abdallah")) {
				driver.findElements(By.cssSelector("h4.h7.m5")).get(i).click(); 
				break;
			}
		}
	}
}

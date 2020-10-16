package steps;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pages.BasePage;
import pages.HomePage;
import pages.SearchPage;
import pages.SpeakersPage;

@RunWith(Cucumber.class)
public class FindTedSpeakerStep extends BasePage  {
	
	@Given("^Initialize the browser$")
	public void initialize_the_browser() throws Throwable {
		
	    driver = initializeBrowser();
	}
	
	@Given("^User navigate to \"([^\"]*)\"$")
	public void user_navigate_to(String arg1) throws Throwable {
	    
		driver.get(arg1);
	}

	@Given("^Click on TED Talks on Watch tab$")
	public void click_on_TED_Talks_on_Watch_tab() throws Throwable {
	    
	    HomePage watchTab = new HomePage(driver);
	    Actions a = new Actions(driver);
	    WebElement move = watchTab.getWatchTab();
	    a.moveToElement(move).build().perform();
	    watchTab.getTedTalksOption().click();
	}

	@Given("^Select Technology topic on Topics dropdown$")
	public void select_Technology_topic_on_Topics_dropdown() throws Throwable {
	    SearchPage topicsDropdown = new SearchPage(driver);
	    Thread.sleep(3000);
	    topicsDropdown.closePopUp();
	    topicsDropdown.selectTechnologhyOption(); 
	}

	@Given("^Select English language on Languages dropdown$")
	public void select_English_language_on_Languages_dropdown() throws Throwable {
		SearchPage languagesDropdown = new SearchPage(driver);
	    languagesDropdown.selectEnglishOption();
	}

	@Given("^Click on More button$")
	public void click_on_More_button() throws Throwable {
		SearchPage moreButton = new SearchPage(driver);
	    moreButton.clickOnMoreButton();
	}

	@Given("^Click on Find a speaker button$")
	public void click_on_Find_a_speaker_button() throws Throwable {
		SearchPage findSpeakerButton = new SearchPage(driver);
	    findSpeakerButton.clickOnFindSpeakerButton();
	}

	@When("^Choose one of the speakers in the page$")
	public void choose_one_of_the_speakers_in_the_page() throws Throwable {
	    SpeakersPage listSpeakers = new SpeakersPage(driver);
	    listSpeakers.getSpeaker();
	}

	@Then("^The page of the chosen speaker is displayed$")
	public void the_page_of_the_chosen_speaker_is_displayed() throws Throwable {
		Thread.sleep(5000);
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@data-spec='profile-link'])[1]")).isDisplayed());
	    
	}
}

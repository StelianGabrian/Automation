package org.example;

import PageObjects.GoogleSearch;
import io.cucumber.java.After;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StepDefinitions {
    public WebDriver driver;
    ChromeOptions options = new ChromeOptions();
    private GoogleSearch googleSearch;

    public StepDefinitions() {
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        googleSearch = new GoogleSearch(driver);
    }

    @Given("I am on the Google Search page")
    public void googleSearchPageAction () {
      driver.get("https://www.google.com");
      googleSearch.acceptConsentClick();
    }
    @When("The search term of {string} is written")
    public void writeToSearchBox(String string) {
        googleSearch.writeToSearch(string);
    }

    @When("The Deutsch language button is clicked")
    public void changeLanguageToDeutsch() {googleSearch.changeLanguageToDeutsch();}

    @When("The Google search by image link is clicked")
    public void goToGoogleImageSearchPage() {googleSearch.googleImageSearchPage();}

    @When("The Gmail button is clicked")
    public void goToGmail() {googleSearch.goToGmail();}

    @And ("The search button is clicked")
    public void clickSearchButton () {
        googleSearch.clickOnSearchButton();
    }
    @And ("The search Image Button is clicked")
    public void searchImageButton() {googleSearch.searchImageButton();}

    @And("The connect button to your e-mail is clicked")
    public void connectButton() {googleSearch.connectButton();}

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }
    /*@After ()
    public void cleanUp() {
        driver.quit();
    }*/
}


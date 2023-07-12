package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch {
    @FindBy(xpath = "//*[@id=\"L2AGLb\"]/div")
    private WebElement googleSearchAcceptButton;

    @FindBy(xpath = "//*[@id=\"APjFqb\"]")
    private WebElement googleSearchBar;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")
    private WebElement googleSearchButton;

    @FindBy(xpath = "//*[@id=\"SIvCob\"]/a[2]")
    private WebElement googleChangeLanguageToDeutsch;

    @FindBy(xpath = "//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")//Link to the Google Images Search page
    private WebElement goToGoogleImageSearchPage;

    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/button")
    private WebElement searchImageButton;

    @FindBy(xpath = "//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")
    private WebElement goToGmail;

    @FindBy(xpath = "/html/body/header/div/div/div/a[2]")
    private WebElement connectButton;

    public GoogleSearch(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void acceptConsentClick() {
        googleSearchAcceptButton.click();
    }

    public void writeToSearch (String string) {
        googleSearchBar.sendKeys(string);
    }

    public void clickOnSearchButton() {
        googleSearchButton.click();
    }

    public void changeLanguageToDeutsch() {googleChangeLanguageToDeutsch.click();}

    public void googleImageSearchPage() {goToGoogleImageSearchPage.click();}

    public void searchImageButton() {searchImageButton.click();}

    public void goToGmail() {goToGmail.click();}

    public void connectButton(){connectButton.click();}
    }


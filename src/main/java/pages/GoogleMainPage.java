package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class GoogleMainPage {

    @FindBy(name = "q")
    WebElement searchInput;

    @FindBy(id="W0wltc")
    WebElement denyButton;

//    @FindBy(className="RNmpXc")
//    WebElement luckyGuess;

    public void searchForText(String text) {
        searchInput.sendKeys(text);
        searchInput.submit();
    }

    public void clickDenyCookiesIfModalPresent() {
        if(denyButton.isDisplayed())
            denyButton.click();
    }

//    public void clickLuckyGuess() {
//        luckyGuess.submit();
//    }

}

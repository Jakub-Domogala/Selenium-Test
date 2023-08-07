package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

//    NOT WORKING FOR NOW
//    public void clickLuckyGuess() {
//        luckyGuess.submit();
//    }

}

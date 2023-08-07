package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage {
    @FindBy(linkText = "Grafika")
    WebElement spanImages;

    public void goToImages() {
        spanImages.click();
    }

    public void openImage(int index) {
//        r5xl4
    }
}

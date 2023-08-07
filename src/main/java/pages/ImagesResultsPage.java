package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ImagesResultsPage {
    @FindBy(xpath = "//div[@jsname='r5xl4']/div")
    List<WebElement> imageContainer;

    public Integer countImages() {
        return imageContainer.size();
    }

    public void clickOnImageIdx(int idx) {
        imageContainer.get(Math.min(idx, countImages())).click();
    }
}

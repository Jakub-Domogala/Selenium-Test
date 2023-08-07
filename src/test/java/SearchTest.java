import org.junit.Test;

public class SearchTest extends TestBase{


    @Test
    public void shouldSearchForCatImages() {
        mainPage.clickDenyCookiesIfModalPresent();
        mainPage.searchForText("cat");
        searchResultsPage.goToImages();
        imagesResultsPage.clickOnImageIdx(3);
    }

    @Test
    public void shouldSearchForDogImages() {
        mainPage.clickDenyCookiesIfModalPresent();
        mainPage.searchForText("dog");
        searchResultsPage.goToImages();
        imagesResultsPage.clickOnImageIdx(3);
    }



//    @Test
//    public void LuckyGuess() {
//        mainPage.clickDenyCookiesIfModalPresent();
//        wait(8);
//        mainPage.clickLuckyGuess();
//        wait(4);
//    }
}

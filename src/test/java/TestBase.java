import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.GoogleMainPage;
import pages.ImagesResultsPage;
import pages.SearchResultsPage;

public class TestBase {
    WebDriver driver;
    String BASE_URL = "https://www.google.com/";
    GoogleMainPage mainPage;
    SearchResultsPage searchResultsPage;
    ImagesResultsPage imagesResultsPage;

    @Before
    public void setup() {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\kubad\\Desktop\\selenium1Tutorial\\selenium1\\src\\main\\resources\\chromedriver.exe"
        );

        driver = new ChromeDriver();

        mainPage = PageFactory.initElements(driver, GoogleMainPage.class);
        searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
        imagesResultsPage = PageFactory.initElements(driver, ImagesResultsPage.class);

        driver.get(BASE_URL);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BooksSite;
import pages.MainPage;


public class ItBooksTests {
    WebDriver webDriver;
    BooksSite webSite;
    WebDriverWait wait;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Kengoroo/IdeaProjects/chromedriver.exe"); //setting for running chromedriver server
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 30, 500); //wait for 30 seconds with updating every 500 msec

        webSite = new BooksSite(webDriver);

        webDriver.get("http://it-ebooks.info/");

        System.out.println("Step 1: Switch to search by title");
        webSite.mainPage().switchSearchToTitle();

        System.out.println("Step 2: Enter search phrase");
        webSite.mainPage().enterSearchableText("Automation");

        System.out.println("Step 3: Click search button");
        webSite.mainPage().clickSearchButton();

        System.out.println("Step 4: Wait for search results");
        webSite.searchResultsPage().waitForSearchResults();
    }

    @After
    public void tearDown() {
        if (webDriver != null)
            webDriver.quit();
    }

    @Test
    public void testSearchBookUrl() {
        System.out.println("Check URL");
        Assert.assertTrue(webDriver.getCurrentUrl().contains("search/?q=Automation&type=title"));
    }

    @Test
    public void testBookSearch() {
        System.out.println("Check search results");
        Assert.assertTrue(
                webDriver.findElement(By.className("top"))
                        .findElements(By.tagName("tr"))
                        .size() == 10);
    }

    @Test
    public void testOpenBookInfoFromSearch() {
        System.out.println("Step 5: Open book info");
        webSite.searchResultsPage().openBookFromResultsBy("Home Automation with Intel Galileo");
        System.out.println("Step 6: Wait for page load");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h1[itemprop = 'name']")));
    }

}
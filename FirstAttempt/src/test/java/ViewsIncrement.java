//import java.util.concurrent.TimeUnit;

//import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ViewsIncrement {
	WebDriver driver = new FirefoxDriver();

	@Test
	public void navigateToYoutube() throws InterruptedException {

		driver.get("https://www.youtube.com/watch?v=RfbHrYfgjt4");

		Thread.sleep(25000);
		driver.quit();
		// driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	}
}

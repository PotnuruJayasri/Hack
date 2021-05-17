package Exercise.Hack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dummyTest {

	@Test
	public void dummy1() throws InterruptedException {

		String URL = "https://www.facebook.com";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-workspace\\Hack\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get(URL);

		TimeUnit.SECONDS.sleep(5);

		// Assert.assertEquals(driver.getTitle(),"Facebook – log in or sign up");

		driver.close();

	}

}
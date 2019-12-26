package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Objects.HomePage;

public class EnterTheStoreTest {
	
	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// Going to main JPStore page and clicking Enter the store link
	// Testing to see if you actually are on Store Page

	@Test
	public void OpenHomePage() {

		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "src\\Utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(HomePage.Page_URL);

		sa.assertEquals(HomePage.Page_URL, driver.getCurrentUrl());
		wait2();

		HomePage.clickEnterStore(driver);
		
		wait2();
		sa.assertEquals(HomePage.Store_URL, driver.getCurrentUrl());

		sa.assertAll();
		
		

	}
}

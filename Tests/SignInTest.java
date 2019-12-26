package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Objects.HomePage;
import Objects.SignIn;
import Utility.ExcelUtils;

public class SignInTest {

	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// Testing to see if you can Sign In with Registred user

	@Test
	public void SignInTest1() {

		System.setProperty("webdriver.chrome.driver", "src\\Utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert sa = new SoftAssert();

		String DATA_SOURCE = "src\\Utility\\UserRandomData.xlsx";
		String currentUrl;

		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < 2; i++) {

			driver.get(SignIn.SignIn_URL);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			String Username, Password;

			Username = ExcelUtils.getDataAtNum(i, 0);
			Password = ExcelUtils.getDataAt(i, 1);
			
			SignIn.clearUsername(driver);
			SignIn.clearPassword(driver);
			wait2();
			
			SignIn.inputUsername(driver, Username);
			SignIn.inputPassword(driver, Password);
			
			//SignIn.inputUsername(driver, "Pera1");
			//SignIn.inputPassword(driver, "pera123");
			
			wait2();
			
			SignIn.clickLoginButton(driver);

			wait2();
			currentUrl = driver.getCurrentUrl();
			currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
			sa.assertEquals(HomePage.Store_URL, currentUrl);
		}
		driver.quit();
	}
}

package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Objects.EditUserData;
import Objects.HomePage;
import Objects.PetStore;
import Objects.SignIn;
import Utility.ExcelUtils;

public class ChangeUserDataTest {

	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// Logging in with already registered user Pera1 with password pera123
	// Changing password to pera, saving it and signing out
	// Trying to sign in with username Pera1 and new password pera
	// Test actually fails because site doesn't allow changes to User Data

	@Test
	public void EditUserData1() {
		
		System.setProperty("webdriver.chrome.driver", "src\\Utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert sa = new SoftAssert();
		
		String currentUrl;
		
		driver.get(SignIn.SignIn_URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		SignIn.clearUsername(driver);
		SignIn.clearPassword(driver);
		wait2();
		
		SignIn.inputUsername(driver, "Pera1");
		SignIn.inputPassword(driver, "pera123");
		
		wait2();
		
		SignIn.clickLoginButton(driver);
		
		wait2();
		
		EditUserData.clickMyAccountLink(driver);
		
		EditUserData.clearNewPassword(driver);
		EditUserData.clearRepeatPassword(driver);
		
		EditUserData.inputNewPassword(driver, "pera");
		EditUserData.inputRepeatPassword(driver, "pera");
		
		EditUserData.clickSaveAccButton(driver);
		wait2();
		
		EditUserData.clickSignOut(driver);
		wait2();
		
		PetStore.clickSignIn(driver);
		
		SignIn.clearUsername(driver);
		SignIn.clearPassword(driver);
		
		SignIn.inputUsername(driver, "Pera1");
		SignIn.inputPassword(driver, "pera");
		
		wait2();
		
		SignIn.clickLoginButton(driver);
		
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(HomePage.Store_URL, currentUrl);
		sa.assertAll();
				
	}
}

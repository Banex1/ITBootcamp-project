package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Objects.HomePage;
import Objects.PetStore;

public class PetStoreMenuTest {

	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Testing every pet on Left menu to see if it leads to selected pet
	
	@Test
	public void LeftMenuTest() {

		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "src\\Utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String currentUrl;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(HomePage.Store_URL);

		// Checking Left Menu Fish link
		PetStore.clickLMFish(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.FishMenu_URL, currentUrl);
		wait2();

		// Checking Left Menu Dog link
		driver.navigate().back();
		PetStore.clickLMDogs(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.DogsMenu_URL, currentUrl);
		wait2();

		// Checking Left Menu Cat link
		driver.navigate().back();
		PetStore.clickLMCats(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.CatsMenu_URL, currentUrl);
		wait2();

		// Checking Left Menu Reptiles link
		driver.navigate().back();
		PetStore.clickLMReptiles(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.ReptilesMenu_URL, currentUrl);
		wait2();

		// Checking Left Menu Bird link
		driver.navigate().back();
		PetStore.clickLMBirds(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.BirdsMenu_URL, currentUrl);
		wait2();

		sa.assertAll();
		driver.close();

	}

	// Testing every pet on Top menu to see if it leads to selected pet
	
	@Test
	public void TopMenuTest() {

		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "src\\Utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String currentUrl;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(HomePage.Store_URL);

		// Checking Top Menu Fish link
		PetStore.clickTMFish(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.FishMenu_URL, currentUrl);
		wait2();

		// Checking Top Menu Dog link
		driver.navigate().back();
		PetStore.clickTMDogs(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.DogsMenu_URL, currentUrl);
		wait2();

		// Checking Top Menu Reptiles link
		driver.navigate().back();
		PetStore.clickTMReptiles(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.ReptilesMenu_URL, currentUrl);
		wait2();

		// Checking Top Menu Cat link
		driver.navigate().back();
		PetStore.clickTMCats(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.CatsMenu_URL, currentUrl);
		wait2();

		// Checking Top Menu Bird link
		driver.navigate().back();
		PetStore.clickTMBirds(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.BirdsMenu_URL, currentUrl);
		wait2();

		sa.assertAll();
		driver.close();

	}
	
	// Testing every pet on Picture menu to see if it leads to selected pet

	@Test
	public void PictureMenuTest() {

		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "src\\Utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String currentUrl;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(HomePage.Store_URL);

		// Checking Picture Menu Fish link
		PetStore.clickRMFish(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.FishMenu_URL, currentUrl);
		wait2();

		// Checking Picture Menu Dog link
		driver.navigate().back();
		PetStore.clickRMDogs(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.DogsMenu_URL, currentUrl);
		wait2();

		// Checking Picture Menu Reptiles link
		driver.navigate().back();
		PetStore.clickRMReptiles(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.ReptilesMenu_URL, currentUrl);
		wait2();

		// Checking Picture Menu Cat link
		driver.navigate().back();
		PetStore.clickRMCats(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.CatsMenu_URL, currentUrl);
		wait2();

		// Checking Picture Menu Bird link
		driver.navigate().back();
		PetStore.clickRMBirds(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.BirdsMenu_URL, currentUrl);
		wait2();
		wait2();

		// Checking Picture Menu Bird2 link
		driver.navigate().back();
		PetStore.clickRMBirds2(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.BirdsMenu_URL, currentUrl);
		wait2();
		sa.assertAll();
		driver.close();

	}
	
	// Testing Sign In link to see if it leads to Sign In page
	
	@Test
	public void SignInTest() {

		SoftAssert sa = new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "src\\Utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String currentUrl;
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(HomePage.Store_URL);

		// Checking Sign In link
		PetStore.clickSignIn(driver);
		currentUrl = driver.getCurrentUrl();
		currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
		sa.assertEquals(PetStore.SignIn_URL, currentUrl);
		wait2();
		driver.close();
	
}
}
package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Objects.HomePage;
import Objects.PetStore;
import Objects.ShoppingCart;
import Objects.SignIn;

public class AddingItemToCartTest {

	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Adding 5 Angelfishes to cart, then adding 3 Amazon Parrots
	// After that checking if in shoping cart there actualy is Angelfish

	@Test
	public void AddingItemToCartTesting() {

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

		PetStore.clickLMFish(driver);

		ShoppingCart.clickAngelfish(driver);
		ShoppingCart.clickAddToCart(driver);

		ShoppingCart.clearQuantity(driver);
		ShoppingCart.inputQuantity(driver, "5");
		ShoppingCart.clickUpdateCart(driver);

		driver.get(HomePage.Store_URL);

		PetStore.clickLMBirds(driver);
		wait2();
		ShoppingCart.clickAmazonParrot(driver);
		ShoppingCart.clickAddToCart2(driver);
		wait2();
		ShoppingCart.clearQuantity2(driver);
		ShoppingCart.inputQuantity2(driver, "3");
		ShoppingCart.clickUpdateCart(driver);
		wait2();

		String Angelfish = "//td[contains(text(),'FI-SW-01')]";

		boolean Angelfish1 = driver.findElement(By.xpath(Angelfish)).isDisplayed();
		sa.assertTrue(Angelfish1);

	}
}

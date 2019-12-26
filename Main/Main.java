package Main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import Objects.HomePage;
import Objects.PetStore;
import Objects.Register;
import Objects.ShoppingCart;
import Objects.SignIn;
import Utility.ExcelUtils;

public class Main {
	
	public static void wait2() {
		try {
		Thread.sleep(2000);		
				}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "src\\Utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(HomePage.Page_URL);
		
		HomePage.clickEnterStore(driver);
		PetStore.clickSignIn(driver);
		
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
	}
	}
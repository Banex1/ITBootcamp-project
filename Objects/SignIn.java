package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {

	public static final String SignIn_URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	private static final String Username = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]";
	private static final String Password = "//input[@name='password']";
	private static final String LoginButton = "//input[@name='signon']";
	private static final String Registration = "//a[contains(text(),'Register Now!')]";

	// Method to find Username field
	public static WebElement getUsername(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Username));
		return driver1;
	}

	// Method to click on Username field
	public static void clickUsername(WebDriver driver) {
		getUsername(driver).click();
	}

	// Method to input Username
	public static void inputUsername(WebDriver driver, String input) {
		getUsername(driver).sendKeys(input);
	}

	// Method to clear Username
	public static void clearUsername(WebDriver driver) {
		getUsername(driver).clear();
	}

	// Method to find Password field
	public static WebElement getPassword(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Password));
		return driver1;
	}

	// Method to click on Password field
	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}

	// Method to input Password
	public static void inputPassword(WebDriver driver, String input) {
		getPassword(driver).sendKeys(input);
	}

	// Method to clear Password
	public static void clearPassword(WebDriver driver) {
		getPassword(driver).clear();
	}

	// Method to find Login button
	public static WebElement getLoginButton(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(LoginButton));
		return driver1;
	}

	// Method to click on Login button
	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}

	// Method to find Registration link
	public static WebElement getRegistration(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Registration));
		return driver1;
	}

	// Method to click on Registration
	public static void clickRegistration(WebDriver driver) {
		getRegistration(driver).click();
	}

}

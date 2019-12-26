package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCart {

	private static final String Angelfish = "//a[contains(text(),'FI-SW-01')]";
	private static final String AmazonParrot = "//a[contains(text(),'AV-CB-01')]";
	private static final String AddToCart = "//tr[2]//td[5]//a[1]";
	private static final String AddToCart2 = "//a[@class='Button']";
	private static final String Quantity = "//input[@name='EST-1']";
	private static final String Quantity2 = "//input[@name='EST-18']";
	private static final String UpdateCart = "//input[@name='updateCartQuantities']";

	// Method to find Angelfish
	public static WebElement getAngelfish(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Angelfish));
		return driver1;
	}

	// Method to click on Angelfish
	public static void clickAngelfish(WebDriver driver) {
		getAngelfish(driver).click();
	}

	// Method to find AmazonParrot
	public static WebElement getAmazonParrot(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(AmazonParrot));
		return driver1;
	}

	// Method to click on AmazonParrot
	public static void clickAmazonParrot(WebDriver driver) {
		getAmazonParrot(driver).click();
	}

	// Method to find AddToCart
	public static WebElement getAddToCart(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(AddToCart));
		return driver1;
	}

	// Method to click on AddToCart
	public static void clickAddToCart(WebDriver driver) {
		getAddToCart(driver).click();
	}

	// Method to find AddToCart2
	public static WebElement getAddToCart2(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(AddToCart2));
		return driver1;
	}

	// Method to click on AddToCart2
	public static void clickAddToCart2(WebDriver driver) {
		getAddToCart2(driver).click();
	}

	// Method to find UpdateCart
	public static WebElement getUpdateCart(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(UpdateCart));
		return driver1;
	}

	// Method to click on UpdateCart
	public static void clickUpdateCart(WebDriver driver) {
		getUpdateCart(driver).click();
	}

	// Method to find Quantity field
	public static WebElement getQuantity(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Quantity));
		return driver1;
	}

	// Method to click on Quantity field
	public static void clickQuantity(WebDriver driver) {
		getQuantity(driver).click();
	}

	// Method to input Quantity
	public static void inputQuantity(WebDriver driver, String input) {
		getQuantity(driver).sendKeys(input);
	}

	// Method to clear Quantity field
	public static void clearQuantity(WebDriver driver) {
		getQuantity(driver).clear();
	}

	// Method to find Quantity2 field
	public static WebElement getQuantity2(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Quantity2));
		return driver1;
	}

	// Method to click on Quantity2 field
	public static void clickQuantity2(WebDriver driver) {
		getQuantity2(driver).click();
	}

	// Method to input Quantity2
	public static void inputQuantity2(WebDriver driver, String input) {
		getQuantity2(driver).sendKeys(input);
	}

	// Method to clear Quantity2 field
	public static void clearQuantity2(WebDriver driver) {
		getQuantity2(driver).clear();
	}

}

package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStore {

	public static final String Store_URL = "https://petstore.octoperf.com/actions/Catalog.action";
	public static final String FishMenu_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH";
	public static final String DogsMenu_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS";
	public static final String CatsMenu_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS";
	public static final String ReptilesMenu_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES";
	public static final String BirdsMenu_URL = "https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS";
	public static final String SignIn_URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	
	private static final String LMFish = "//div[@id='Content']//a[1]//img[1]";
	private static final String LMDogs = "//div[@id='Content']//a[2]//img[1]";
	private static final String LMCats = "//div[@id='Content']//a[3]//img[1]";
	private static final String LMReptiles = "//div[@id='Content']//a[4]//img[1]";
	private static final String LMBirds = "//div[@id='Content']//a[5]//img[1]";
	private static final String TMFish = "//div[@id='QuickLinks']//a[1]//img[1]";
	private static final String TMDogs = "//div[@id='Header']//a[2]//img[1]";
	private static final String TMCats = "//div[@id='Header']//a[4]//img[1]";
	private static final String TMReptiles = "//div[@id='Header']//a[3]//img[1]";
	private static final String TMBirds = "//div[@id='Header']//a[5]//img[1]";
	private static final String RMFish = "//body//area[2]";
	private static final String RMDogs = "//body//area[3]";
	private static final String RMCats = "//body//area[5]";
	private static final String RMReptiles = "//body//area[4]";
	private static final String RMBirds = "//body//area[6]";
	private static final String RMBirds2 = "//body//area[1]";
	private static final String SignIn = "//a[contains(text(),'Sign In')]";

	// Method to find Left Fish submenu
	public static WebElement getLMFish(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(LMFish));
		return driver1;
	}

	// Method to click on Left Fish submenu
	public static void clickLMFish(WebDriver driver) {
		getLMFish(driver).click();

	}

	// Method to find Left Dogs submenu
	public static WebElement getLMDogs(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(LMDogs));
		return driver1;
	}

	// Method to click on Left Dogs submenu
	public static void clickLMDogs(WebDriver driver) {
		getLMDogs(driver).click();

	}

	// Method to find Left Cats submenu
	public static WebElement getLMCats(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(LMCats));
		return driver1;
	}

	// Method to click on Left Cats submenu
	public static void clickLMCats(WebDriver driver) {
		getLMCats(driver).click();

	}

	// Method to find Left Reptiles submenu
	public static WebElement getLMReptiles(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(LMReptiles));
		return driver1;
	}

	// Method to click on Left Reptiles submenu
	public static void clickLMReptiles(WebDriver driver) {
		getLMReptiles(driver).click();

	}

	// Method to find Left Birds submenu
	public static WebElement getLMBirds(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(LMBirds));
		return driver1;
	}

	// Method to click on Left Birds submenu
	public static void clickLMBirds(WebDriver driver) {
		getLMBirds(driver).click();

	}

	// Method to find Top Fish submenu
	public static WebElement getTMFish(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(TMFish));
		return driver1;
	}

	// Method to click on Top Fish submenu
	public static void clickTMFish(WebDriver driver) {
		getTMFish(driver).click();

	}

	// Method to find Top Dogs submenu
	public static WebElement getTMDogs(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(TMDogs));
		return driver1;
	}

	// Method to click on Top Dogs submenu
	public static void clickTMDogs(WebDriver driver) {
		getTMDogs(driver).click();

	}

	// Method to find Top Cats submenu
	public static WebElement getTMCats(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(TMCats));
		return driver1;
	}

	// Method to click on Top Cats submenu
	public static void clickTMCats(WebDriver driver) {
		getTMCats(driver).click();

	}

	// Method to find Top Reptiles submenu
	public static WebElement getTMReptiles(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(TMReptiles));
		return driver1;
	}

	// Method to click on Top Reptiles submenu
	public static void clickTMReptiles(WebDriver driver) {
		getTMReptiles(driver).click();

	}

	// Method to find Top Birds submenu
	public static WebElement getTMBirds(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(TMBirds));
		return driver1;
	}

	// Method to click on Top Birds submenu
	public static void clickTMBirds(WebDriver driver) {
		getTMBirds(driver).click();

	}

	// Method to find Picture Fish submenu
	public static WebElement getRMFish(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(RMFish));
		return driver1;
	}

	// Method to click on Picture Fish submenu
	public static void clickRMFish(WebDriver driver) {
		getRMFish(driver).click();

	}

	// Method to find Picture Picture submenu
	public static WebElement getRMDogs(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(RMDogs));
		return driver1;
	}

	// Method to click on Picture Dogs submenu
	public static void clickRMDogs(WebDriver driver) {
		getRMDogs(driver).click();

	}

	// Method to find Picture Cats submenu
	public static WebElement getRMCats(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(RMCats));
		return driver1;
	}

	// Method to click on Picture Cats submenu
	public static void clickRMCats(WebDriver driver) {
		getRMCats(driver).click();

	}

	// Method to find Picture Reptiles submenu
	public static WebElement getRMReptiles(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(RMReptiles));
		return driver1;
	}

	// Method to click on Picture Reptiles submenu
	public static void clickRMReptiles(WebDriver driver) {
		getRMReptiles(driver).click();

	}

	// Method to find Picture Birds submenu
	public static WebElement getRMBirds(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(RMBirds));
		return driver1;
	}

	// Method to click on Picture Birds submenu
	public static void clickRMBirds(WebDriver driver) {
		getRMBirds(driver).click();

	}

	// Method to find Central Bird Picture submenu
	public static WebElement getRMBirds2(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(RMBirds2));
		return driver1;
	}

	// Method to click on Central Bird Picture submenu
	public static void clickRMBirds2(WebDriver driver) {
		getRMBirds2(driver).click();

	}

	// Method to find SignIn button
	public static WebElement getSignIn(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(SignIn));
		return driver1;
	}

	// Method to click on SignIn button
	public static void clickSignIn(WebDriver driver) {
		getSignIn(driver).click();

	}

}

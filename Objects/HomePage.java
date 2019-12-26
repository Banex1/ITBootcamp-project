package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public static final String Page_URL = "https://petstore.octoperf.com/";
	public static final String Store_URL = "https://petstore.octoperf.com/actions/Catalog.action";
	public static final String EnterStore = "//a[contains(text(),'Enter the Store')]";

	// Method for opening HomePage
	public static void openHomePage(WebDriver driver) {
		driver.get(Page_URL);
	}

	// Method to find Enter Store link
	public static WebElement getEnterStore(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(EnterStore));
		return driver1;
	}

	// Method to click on EnterStore
	public static void clickEnterStore(WebDriver driver) {
		getEnterStore(driver).click();
	}


}

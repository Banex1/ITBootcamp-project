package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class EditUserData {

	public static final String SignIn_URL = "https://petstore.octoperf.com/actions/Account.action?editAccountForm=";
	private static final String New_password = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]";
	private static final String Repeat_password = "//input[@name='repeatedPassword']";
	private static final String First_name = "//input[@name='account.firstName']";
	private static final String Last_name = "//input[@name='account.lastName']";
	private static final String Email = "//input[@name='account.email']";
	private static final String Phone = "//input[@name='account.phone']";
	private static final String Address1 = "//input[@name='account.address1']";
	private static final String Address2 = "//input[@name='account.address2']";
	private static final String City = "//input[@name='account.city']";
	private static final String State = "//input[@name='account.state']";
	private static final String Zip = "//input[@name='account.zip']";
	private static final String Country = "//input[@name='account.country']";
	private static final String Language = "//select[@name='account.languagePreference']";
	private static final String Favourite_Pet = "//select[@name='account.favouriteCategoryId']";
	private static final String MyList = "//input[@name='account.listOption']";
	private static final String MyBanner = "//input[@name='account.bannerOption']";
	private static final String SaveAccButton = "//input[@name='editAccount']";
	private static final String MyAccountLink = "//a[contains(text(),'My Account')]";
	private static final String SignOut = "//a[contains(text(),'Sign Out')]";

	// Method to find New Password field
	public static WebElement getNewPassword(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(New_password));
		return driver1;
	}

	// Method to click on New Password field
	public static void clickNewPassword(WebDriver driver) {
		getNewPassword(driver).click();
	}

	// Method to input New Password
	public static void inputNewPassword(WebDriver driver, String input) {
		getNewPassword(driver).sendKeys(input);
	}

	// Method to clear New Password field
	public static void clearNewPassword(WebDriver driver) {
		getNewPassword(driver).clear();
	}

	// Method to find Repeat Password field
	public static WebElement getRepeatPassword(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Repeat_password));
		return driver1;
	}

	// Method to click on Repeat Password field
	public static void clickRepeatPassword(WebDriver driver) {
		getRepeatPassword(driver).click();
	}

	// Method to input Repeat Password
	public static void inputRepeatPassword(WebDriver driver, String input) {
		getRepeatPassword(driver).sendKeys(input);
	}

	// Method to clear Repeat Password field
	public static void clearRepeatPassword(WebDriver driver) {
		getRepeatPassword(driver).clear();
	}

	// Method to find First Name field
	public static WebElement getFirstName(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(First_name));
		return driver1;
	}

	// Method to click on First Name field
	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	// Method to input First Name
	public static void inputFirstName(WebDriver driver, String input) {
		getFirstName(driver).sendKeys(input);
	}

	// Method to clear First Name field
	public static void clearFirstName(WebDriver driver) {
		getFirstName(driver).clear();
	}

	// Method to find Last Name field
	public static WebElement getLastName(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Last_name));
		return driver1;
	}

	// Method to click on Last Name field
	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	// Method to input Last Name
	public static void inputLastName(WebDriver driver, String input) {
		getLastName(driver).sendKeys(input);
	}

	// Method to clear Last Name field
	public static void clearLastName(WebDriver driver) {
		getLastName(driver).clear();
	}

	// Method to find Email field
	public static WebElement getEmail(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Email));
		return driver1;
	}

	// Method to click on Email field
	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	// Method to input Email
	public static void inputEmail(WebDriver driver, String input) {
		getEmail(driver).sendKeys(input);
	}

	// Method to clear Email field
	public static void clearEmail(WebDriver driver) {
		getEmail(driver).clear();
	}

	// Method to find Phone field
	public static WebElement getPhone(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Phone));
		return driver1;
	}

	// Method to click on Phone field
	public static void clickPhone(WebDriver driver) {
		getPhone(driver).click();
	}

	// Method to input Phone
	public static void inputPhone(WebDriver driver, String input) {
		getPhone(driver).sendKeys(input);
	}

	// Method to clear Phone field
	public static void clearPhone(WebDriver driver) {
		getPhone(driver).clear();
	}

	// Method to find Adress1 field
	public static WebElement getAddress1(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Address1));
		return driver1;
	}

	// Method to click on Address1 field
	public static void clickAddress1(WebDriver driver) {
		getAddress1(driver).click();
	}

	// Method to input Address1
	public static void inputAddress1(WebDriver driver, String input) {
		getAddress1(driver).sendKeys(input);
	}

	// Method to clear Address1 field
	public static void clearAddress1(WebDriver driver) {
		getAddress1(driver).clear();
	}

	// Method to find Address2 field
	public static WebElement getAddress2(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Address2));
		return driver1;
	}

	// Method to click on Address2 field
	public static void clickAddress2(WebDriver driver) {
		getAddress2(driver).click();
	}

	// Method to input Address2
	public static void inputAddress2(WebDriver driver, String input) {
		getAddress2(driver).sendKeys(input);
	}

	// Method to clear Address2 field
	public static void clearAddress2(WebDriver driver) {
		getAddress2(driver).clear();
	}

	// Method to find City field
	public static WebElement getCity(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(City));
		return driver1;
	}

	// Method to click on City field
	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}

	// Method to input City
	public static void inputCity(WebDriver driver, String input) {
		getCity(driver).sendKeys(input);
	}

	// Method to clear City field
	public static void clearCity(WebDriver driver) {
		getCity(driver).clear();
	}

	// Method to find State field
	public static WebElement getState(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(State));
		return driver1;
	}

	// Method to click on State field
	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}

	// Method to input State
	public static void inputState(WebDriver driver, String input) {
		getState(driver).sendKeys(input);
	}

	// Method to clear State field
	public static void clearState(WebDriver driver) {
		getState(driver).clear();
	}

	// Method to find Zip field
	public static WebElement getZip(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Zip));
		return driver1;
	}

	// Method to click on Zip field
	public static void clickZip(WebDriver driver) {
		getZip(driver).click();
	}

	// Method to input Zip
	public static void inputZip(WebDriver driver, String input) {
		getZip(driver).sendKeys(input);
	}

	// Method to clear Zip field
	public static void clearZip(WebDriver driver) {
		getZip(driver).clear();
	}

	// Method to find Country field
	public static WebElement getCountry(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Country));
		return driver1;
	}

	// Method to click on Country field
	public static void clickCountry(WebDriver driver) {
		getCountry(driver).click();
	}

	// Method to input Country
	public static void inputCountry(WebDriver driver, String input) {
		getCountry(driver).sendKeys(input);
	}

	// Method to clear Country field
	public static void clearCountry(WebDriver driver) {
		getCountry(driver).clear();
	}

	// Method to find Language Dropdown menu
	public static WebElement getLanguage(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Language));
		return driver1;
	}

	// Method to click on Language Dropdown menu
	public static void clickLanguage(WebDriver driver) {
		getLanguage(driver).click();
	}

	// Method to select Language
	public static void selectLanguage(WebDriver driver, String lang) {
		Select language = new Select(driver.findElement(By.xpath(Language)));
		String lang1 = lang.toLowerCase();
		language.selectByVisibleText(lang1);
	}

	// Method to find Favourite Pet Dropdown menu
	public static WebElement getFavouritePet(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(Favourite_Pet));
		return driver1;
	}

	// Method to click on Favourite Pet Dropdown menu
	public static void clickFavouritePet(WebDriver driver) {
		getFavouritePet(driver).click();
	}

	// Method to select Favourite Pet
	public static void selectFavouritePet(WebDriver driver, String pet) {
		Select pets = new Select(driver.findElement(By.xpath(Favourite_Pet)));
		String pet1 = pet.toUpperCase();
		pets.selectByVisibleText(pet1);
	}

	// Method to find MyList
	public static WebElement getMyList(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(MyList));
		return driver1;
	}

	// Method to click on MyList
	public static void clickMyList(WebDriver driver) {
		getMyList(driver).click();
	}

	// Method to find MyBanner
	public static WebElement getMyBanner(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(MyBanner));
		return driver1;
	}

	// Method to click on MyBanner field
	public static void clickMyBanner(WebDriver driver) {
		getMyBanner(driver).click();
	}

	// Method to find Save Account button
	public static WebElement getSaveAccButton(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(SaveAccButton));
		return driver1;
	}

	// Method to click on SaveAccButton
	public static void clickSaveAccButton(WebDriver driver) {
		getSaveAccButton(driver).click();
	}

	// Method to find MyAccountLink
	public static WebElement getMyAccountLink(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(MyAccountLink));
		return driver1;
	}

	// Method to click on MyAccountLink
	public static void clickMyAccountLink(WebDriver driver) {
		getMyAccountLink(driver).click();
	}

	// Method to find Sign Out link
	public static WebElement getSignOut(WebDriver driver) {
		WebElement driver1 = driver.findElement(By.xpath(SignOut));
		return driver1;
	}

	// Method to click on SignOut
	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();
	}
}

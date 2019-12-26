package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Objects.HomePage;
import Objects.PetStore;
import Objects.Register;
import Utility.ExcelUtils;

public class RegistrationTest {

	public static void wait2() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Testing to see if you can Register 1 user
	
	@Test
	public void Register1UserTest() {
		System.setProperty("webdriver.chrome.driver", "src\\Utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(Register.Register_URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		String User_ID, New_password, Repeat_password, First_name, Last_name, Email, Phone, Address1, Address2, City,
				State, Zip, Country, Language, Favourite_Pet;

		User_ID = "Pera10";
		New_password = "pera123";
		Repeat_password = "pera123";
		First_name = "Pera";
		Last_name = "Peric";
		Email = "pera@mail.com";
		Phone = "0649875621";
		Address1 = "Pera Street 66";
		Address2 = "Periceva 6";
		City = "Perograd";
		State = "Perostate";
		Zip = "66996";
		Country = "Petrovina";
		Language = "JapaneSe";
		Favourite_Pet = "DoGs";

		Register.inputUserID(driver, User_ID);
		Register.inputNewPassword(driver, New_password);
		Register.inputRepeatPassword(driver, Repeat_password);
		Register.inputFirstName(driver, First_name);
		Register.inputLastName(driver, Last_name);
		Register.inputEmail(driver, Email);
		Register.inputPhone(driver, Phone);
		Register.inputCity(driver, City);
		Register.inputAddress1(driver, Address1);
		Register.inputAddress2(driver, Address2);
		Register.inputState(driver, State);
		Register.inputZip(driver, Zip);
		Register.inputCountry(driver, Country);
		Register.selectLanguage(driver, Language);
		Register.selectFavouritePet(driver, Favourite_Pet);
		Register.clickMyList(driver);
		Register.clickMyBanner(driver);
		Register.clickSaveAccButton(driver);

		wait2();
		wait2();

		driver.quit();
	}
	
	// Testing to see if you can Register 50 users using Excel table with user data

	@Test
	public void Register50UsersTest() {
		System.setProperty("webdriver.chrome.driver", "src\\Utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert sa = new SoftAssert();

		String DATA_SOURCE = "src\\Utility\\UserRandomData.xlsx";
		String currentUrl;
		
		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);

		for (int i = 1; i < 51; i++) {

			driver.get(Register.Register_URL);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			String User_ID, New_password, Repeat_password, First_name, Last_name, Email, Phone, Address1, Address2,
					City, State, Zip, Country, Language, Favourite_Pet;

			User_ID = ExcelUtils.getDataAtNum(i, 0);
			New_password = ExcelUtils.getDataAt(i, 1);
			Repeat_password = ExcelUtils.getDataAt(i, 1);
			First_name = ExcelUtils.getDataAt(i, 2);
			Last_name = ExcelUtils.getDataAt(i, 3);
			Email = ExcelUtils.getDataAt(i, 4);
			Phone = ExcelUtils.getDataAt(i, 5);
			Address1 = ExcelUtils.getDataAt(i, 6);
			Address2 = ExcelUtils.getDataAt(i, 7);
			City = ExcelUtils.getDataAt(i, 8);
			State = ExcelUtils.getDataAt(i, 9);
			Zip = ExcelUtils.getDataAtNum(i, 10);
			Country = ExcelUtils.getDataAt(i, 11);
			Language = ExcelUtils.getDataAt(i, 12);
			Favourite_Pet = ExcelUtils.getDataAt(i, 13);

			if (i != 1) {
				Register.clearUserID(driver);
				Register.clearNewPassword(driver);
				Register.clearRepeatPassword(driver);
				Register.clearFirstName(driver);
				Register.clearLastName(driver);
				Register.clearEmail(driver);
				Register.clearPhone(driver);
				Register.clearCity(driver);
				Register.clearAddress1(driver);
				Register.clearAddress2(driver);
				Register.clearState(driver);
				Register.clearZip(driver);
				Register.clearCountry(driver);
			}
			Register.inputUserID(driver, User_ID);
			Register.inputNewPassword(driver, New_password);
			Register.inputRepeatPassword(driver, Repeat_password);
			Register.inputFirstName(driver, First_name);
			Register.inputLastName(driver, Last_name);
			Register.inputEmail(driver, Email);
			Register.inputPhone(driver, Phone);
			Register.inputCity(driver, City);
			Register.inputAddress1(driver, Address1);
			Register.inputAddress2(driver, Address2);
			Register.inputState(driver, State);
			Register.inputZip(driver, Zip);
			Register.inputCountry(driver, Country);
			Register.selectLanguage(driver, Language);
			Register.selectFavouritePet(driver, Favourite_Pet);
			Register.clickMyList(driver);
			Register.clickMyBanner(driver);
			Register.clickSaveAccButton(driver);

			wait2();
			currentUrl = driver.getCurrentUrl();
			currentUrl = currentUrl.replaceAll(";jsessionid=[^?]*", "");
			sa.assertEquals(HomePage.Store_URL, currentUrl);
		}
		
		wait2();
		driver.quit();
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import mainScript.DriverScript;

public class AddressbookPage {
	
	@FindBy(how=How.NAME, using="ctl00$Body$rgUserName")
	static WebElement enteruserName;
	
	@FindBy(how=How.NAME, using="ctl00$Body$rgPassword")	
	static WebElement enterpassword;
	
	public static void firstName(String testdata) {
	WebDriverWait wait = new WebDriverWait(DriverScript.driver, 20);
	WebElement enterfirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("ctl00$Body$tbxNPFirstName")));
	enterfirstName.sendKeys(testdata);
	}
	
	public static void lastName(String testdata) {
	WebElement enterlastName = DriverScript.driver.findElement(By.name("ctl00$Body$tbxNPLastName"));
	enterlastName.sendKeys(testdata);
	}
	
	public static void userName(String testdata) {
//	WebElement enteruserName = DriverScript.driver.findElement(By.name("ctl00$Body$rgUserName"));
	enteruserName.sendKeys(testdata);
	}
	
	public static void password(String testdata) {
//	WebElement enterpassword = DriverScript.driver.findElement(By.name("ctl00$Body$rgPassword"));
	enterpassword.sendKeys(testdata);
	}
	
	public static void confirmPassword(String testdata) {
	WebElement enterconfirmpassword = DriverScript.driver.findElement(By.name("ctl00$Body$ConfirmPassword"));
	enterconfirmpassword.sendKeys(testdata);
	}
	
	public static void emailId(String testdata) {
	WebElement enterEmailid = DriverScript.driver.findElement(By.name("ctl00$Body$Email"));
	enterEmailid.sendKeys(testdata);
	}
	
	public static void companyName(String testdata) {
	WebElement entercompanyname = DriverScript.driver.findElement(By.name("ctl00$Body$tbxNPCompany"));
	entercompanyname.sendKeys(testdata);
	}
	
	public static void streetName(String testdata) {
	WebElement enterStreetName = DriverScript.driver.findElement(By.name("ctl00$Body$tbxNPStreet"));
	enterStreetName.sendKeys(testdata);
	}
	
	public static void cityName(String testdata) {
	WebElement enterCityName = DriverScript.driver.findElement(By.name("ctl00$Body$tbxNPCity"));
	enterCityName.sendKeys(testdata);
	}
	
	public static void zipCode(String testdata) {
	WebElement enterZipcode = DriverScript.driver.findElement(By.name("ctl00$Body$tbxNPZip"));
	enterZipcode.sendKeys(testdata);
	}
	
	public static void phoneNumber(String testdata) {
	WebElement enterPhone = DriverScript.driver.findElement(By.name("ctl00$Body$txtNPPhone"));
	enterPhone.sendKeys(testdata);
	}
	
	public static void countryName(String testdata) {
	WebElement enterCountry = DriverScript.driver.findElement(By.name("ctl00$Body$ddlNPCountry"));
	Select selcountry = new Select(enterCountry);
	selcountry.selectByVisibleText(testdata);
	}
	
	public static void stateName(String testdata) {
	WebElement enterState = DriverScript.driver.findElement(By.name("ctl00$Body$ddlNPRegion"));
	Select selstate = new Select(enterState);
	selstate.selectByVisibleText(testdata);
	}
}

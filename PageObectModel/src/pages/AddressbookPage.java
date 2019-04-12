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
	
	public static void firstName() {
	WebDriverWait wait = new WebDriverWait(DriverScript.driver, 20);
	WebElement enterfirstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("ctl00$Body$tbxNPFirstName")));
	enterfirstName.sendKeys("CompanyUser");
	}
	
	public static void lastName() {
	WebElement enterlastName = DriverScript.driver.findElement(By.name("ctl00$Body$tbxNPLastName"));
	enterlastName.sendKeys("CompanyLastName");
	}
	
	public static void userName() {
//	WebElement enteruserName = DriverScript.driver.findElement(By.name("ctl00$Body$rgUserName"));
	enteruserName.sendKeys("CompanylastName");
	}
	
	public static void password() {
//	WebElement enterpassword = DriverScript.driver.findElement(By.name("ctl00$Body$rgPassword"));
	enterpassword.sendKeys("Test@1234");
	}
	
	public static void confirmPassword() {
	WebElement enterconfirmpassword = DriverScript.driver.findElement(By.name("ctl00$Body$ConfirmPassword"));
	enterconfirmpassword.sendKeys("Test@1234");
	}
	
	public static void emailId() {
	WebElement enterEmailid = DriverScript.driver.findElement(By.name("ctl00$Body$Email"));
	enterEmailid.sendKeys("Testuserlast@mailinator.com");
	}
	
	public static void companyName() {
	WebElement entercompanyname = DriverScript.driver.findElement(By.name("ctl00$Body$tbxNPCompany"));
	entercompanyname.sendKeys("Oracle");
	}
	
	public static void streetName() {
	WebElement enterStreetName = DriverScript.driver.findElement(By.name("ctl00$Body$tbxNPStreet"));
	enterStreetName.sendKeys("Testt street");
	}
	
	public static void cityName() {
	WebElement enterCityName = DriverScript.driver.findElement(By.name("ctl00$Body$tbxNPCity"));
	enterCityName.sendKeys("Salt Lake city");
	}
	
	public static void zipCode() {
	WebElement enterZipcode = DriverScript.driver.findElement(By.name("ctl00$Body$tbxNPZip"));
	enterZipcode.sendKeys("84120");
	}
	
	public static void phoneNumber() {
	WebElement enterPhone = DriverScript.driver.findElement(By.name("ctl00$Body$txtNPPhone"));
	enterPhone.sendKeys("1115444444");
	}
	
	public static void countryName() {
	WebElement enterCountry = DriverScript.driver.findElement(By.name("ctl00$Body$ddlNPCountry"));
	Select selcountry = new Select(enterCountry);
	selcountry.selectByVisibleText("United States");
	}
	
	public static void stateName() {
	WebElement enterState = DriverScript.driver.findElement(By.name("ctl00$Body$ddlNPRegion"));
	Select selstate = new Select(enterState);
	selstate.selectByVisibleText("UT");
	}
}

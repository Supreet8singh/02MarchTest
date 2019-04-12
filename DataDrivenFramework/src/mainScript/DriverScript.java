package mainScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import constantValues.ConstantVariable;
import pages.AddressbookPage;
import pages.LandingPage;
import pages.MembershipPage;
import pages.ShoppingCartPage;
import utility.ExcelReadWrite;

public class DriverScript {
	
	public static WebDriver driver; 	
	
	public static WebDriver browserName(String bName) {
		if (bName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (bName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
	public static void main(String[] args) throws Exception {
		
		ExcelReadWrite.openExcel(ConstantVariable.excelPath);
		
		browserName(ConstantVariable.browserName);
		
		driver.get(ConstantVariable.url);
		
		PageFactory.initElements(driver, LandingPage.class);
		PageFactory.initElements(driver, AddressbookPage.class);
		
		LandingPage.membershiplink();
		LandingPage.individualLink();
		
		MembershipPage.cartValue();
		MembershipPage.joinNowButton();
		
		ShoppingCartPage.totalPriceshoppingcart();
		ShoppingCartPage.createanaccount();
		
		AddressbookPage.firstName(ConstantVariable.firstName);
		AddressbookPage.lastName(ConstantVariable.lastName);
		AddressbookPage.userName(ConstantVariable.userName);
		AddressbookPage.password(ConstantVariable.password);
		AddressbookPage.confirmPassword(ConstantVariable.confirmPassword);
		AddressbookPage.emailId(ConstantVariable.emailId);
		AddressbookPage.companyName(ConstantVariable.companyName);
		AddressbookPage.streetName(ConstantVariable.streetName);
		AddressbookPage.cityName(ConstantVariable.cityName);
		AddressbookPage.stateName(ConstantVariable.stateName);
		AddressbookPage.countryName(ConstantVariable.countryName);
		AddressbookPage.phoneNumber(ConstantVariable.phoneNumber);
		AddressbookPage.zipCode(ConstantVariable.zipCode);

	}		

}

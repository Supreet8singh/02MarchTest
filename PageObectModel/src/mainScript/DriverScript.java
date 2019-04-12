package mainScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import pages.AddressbookPage;
import pages.LandingPage;
import pages.MembershipPage;
import pages.ShoppingCartPage;

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
	
	public static void main(String[] args) {
		
		browserName("Chrome");
		
		driver.get("https://www.aapc.com/");
		
		PageFactory.initElements(driver, LandingPage.class);
		PageFactory.initElements(driver, AddressbookPage.class);
		
		LandingPage.membershiplink();
		LandingPage.individualLink();
		
		MembershipPage.cartValue();
		MembershipPage.joinNowButton();
		
		ShoppingCartPage.totalPriceshoppingcart();
		ShoppingCartPage.createanaccount();
		
		AddressbookPage.firstName();
		AddressbookPage.lastName();
		AddressbookPage.userName();
		AddressbookPage.password();
		AddressbookPage.confirmPassword();
		AddressbookPage.emailId();
		AddressbookPage.companyName();
		AddressbookPage.streetName();
		AddressbookPage.cityName();
		AddressbookPage.stateName();
		AddressbookPage.countryName();
		AddressbookPage.phoneNumber();
		AddressbookPage.zipCode();

	}		

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainScript.DriverScript;
import utility.ExcelReadWrite;

public class MembershipPage {

	public static void cartValue() throws Exception {
	String cartValue = DriverScript.driver.findElement(By.id("totalPrice")).getText();
	ExcelReadWrite.writeValues("TestData", 5, 4, cartValue);
	System.out.println(cartValue);
	}
	
	public static void joinNowButton() {
	WebElement joinNowButton = DriverScript.driver.findElement(By.name("ctl00$Body$btnJoinNow"));
	joinNowButton.click();
	}
}

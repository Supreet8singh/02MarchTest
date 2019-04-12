package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainScript.DriverScript;

public class MembershipPage {

	public static void cartValue() {
	String cartValue = DriverScript.driver.findElement(By.id("totalPrice")).getText();
	System.out.println(cartValue);
	}
	
	public static void joinNowButton() {
	WebElement joinNowButton = DriverScript.driver.findElement(By.name("ctl00$Body$btnJoinNow"));
	joinNowButton.click();
	}
}

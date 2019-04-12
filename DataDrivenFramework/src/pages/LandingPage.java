package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import mainScript.DriverScript;

public class LandingPage {

	@FindBy(how=How.XPATH, using="//*[@id=\"tm-233\"]")
	static WebElement membershiplink;
	
	public static void membershiplink() {
//	WebElement membershiplink = DriverScript.driver.findElement(By.xpath("//*[@id=\"tm-233\"]"));
	Actions act = new Actions(DriverScript.driver);
	act.moveToElement(membershiplink).build().perform();
	}
	
	public static void individualLink() {
	WebElement individualLink= DriverScript.driver.findElement(By.linkText("Individual"));
	Actions act = new Actions(DriverScript.driver);
	act.moveToElement(individualLink).click().build().perform();
	}
}

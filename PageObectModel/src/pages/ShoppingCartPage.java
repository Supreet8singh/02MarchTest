package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainScript.DriverScript;

public class ShoppingCartPage {

	public static void totalPriceshoppingcart() {
	String totalPriceshoppingcart = DriverScript.driver.findElement(By.xpath("//*[@id=\"ctl00_body_lblSummary_Total\"]")).getText();
	System.out.println(totalPriceshoppingcart);
	}
	
	public static void createanaccount() {
	WebElement createanaccount = DriverScript.driver.findElement(By.xpath("//*[@id=\"ctl00_body_btnLoginAndCreateAccountRedirect\"]/a"));
	createanaccount.click();
	}
}

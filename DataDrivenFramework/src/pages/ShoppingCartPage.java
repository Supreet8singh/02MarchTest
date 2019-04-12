package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mainScript.DriverScript;
import utility.ExcelReadWrite;

public class ShoppingCartPage {

	public static void totalPriceshoppingcart() throws Exception {
	String totalPriceshoppingcart = DriverScript.driver.findElement(By.xpath("//*[@id=\"ctl00_body_lblSummary_Total\"]")).getText();
	ExcelReadWrite.writeValues("TestData", 7, 4, totalPriceshoppingcart);
	System.out.println(totalPriceshoppingcart);
	}
	
	public static void createanaccount() {
	WebElement createanaccount = DriverScript.driver.findElement(By.xpath("//*[@id=\"ctl00_body_btnLoginAndCreateAccountRedirect\"]/a"));
	createanaccount.click();
	}
}

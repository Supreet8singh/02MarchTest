package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	
	static WebDriver driver;
	
	static boolean bflag = false;
	static boolean bflagreturn = false;
	
	public static void selectDate(String date, Boolean b) {
		
		List<WebElement> allTableRows = driver.findElements(By.xpath("//*[starts-with(@id,\"dp15\")]/div/div[2]/table/tbody/tr"));
		
		int countofrows = allTableRows.size();
		
		System.out.println("The number of rows are :" + countofrows);
		
		for (int i = 0; i < countofrows; i++) {
		
			if (b == false) {
				// Find out how many Table data are there in each row
				
				List<WebElement> alltabdata = allTableRows.get(i).findElements(By.tagName("td"));
				
				int tddata = alltabdata.size();
				
				System.out.println("The number of coumns are :" + tddata);

					for (int j = 0; j < tddata; j++) {
						if (b == false) {
						// Fetch the value from each table data in each row
						String tdValue = alltabdata.get(j).getText();
						
						System.out.println("The value in row number : " + i  + " is "  + tdValue);
						
						if (tdValue.equalsIgnoreCase(date)) {
							
							b = true;
							alltabdata.get(j).click();
						}
					}
						
						else if (b == true) {
							break;
						}
				}
			}	
			
			else if (b == true) {
				break;
			}
			}
	}
	
//----------------Method to switch between browsers----------------------	
	public static WebDriver browserType(String bname) {
		
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		return driver;
	}
	
	
	public static void main(String[] args) throws Exception {
	
		browserType("chrome");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		
//----------------------Selecting random date from calender-----------------------		
		
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	

		for (int i = 0; i < 11; i++) {
			driver.findElement(By.name("or-src")).sendKeys(Keys.BACK_SPACE);			
		}

				
		driver.findElement(By.name("or-src")).sendKeys("Bengaluru (BLR)");
		
		driver.findElement(By.name("or-src")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("or-dest")).click();
		
		driver.findElement(By.name("or-dest")).sendKeys("Hyderabad (HYD)");
		
		driver.findElement(By.name("or-depart")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//*[starts-with(@id,\"dp15\")]/div/div[2]/table/tbody/tr[3]/td[7]")).click();
//		
//		driver.findElement(By.name("or-return")).click();
//		
//		driver.findElement(By.xpath("//*[starts-with(@id,\"dp15\")]/div/div[2]/table/tbody/tr[4]/td[2]")).click();
		
		// Find out no of rows in a table
		driver.findElement(By.xpath("//*[starts-with(@id,\"dp15\")]/div/div[2]/div/a")).click();
		
		Thread.sleep(2000);
		
		selectDate("20", bflag);
		
		driver.findElement(By.name("or-return")).click();

		Thread.sleep(2000);
		
		selectDate("25", bflagreturn);
		
		driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[7]/div[6]/button")).click();
		
//		Thread.sleep(20000);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele_ContactLink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"header-login-mount\"]/a[2]")));
		
		String linkname = ele_ContactLink.getText();
		System.out.println(linkname);
}
}
package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import mainScript.DriverScript;

public class CommonMethods {

	public static WebDriver driver; 	
	static String Value;
	
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
	
	public static void openUrl(String testData) {
		try {
			driver.get(testData);	
			Log.info("Successfully opened the URL " + testData);
		} catch (Exception e) {
			Log.error("Not able to open the URL " + testData);
			DriverScript.bValue = false;
		}
	}
	
	public static void handlingHovering_WithoutClick(String locatorVariable) {
		try {
			WebElement element = driver.findElement(LocatorsSplitFunction.locsplit(locatorVariable));
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
			Log.info("Successfully hovered over the element " + locatorVariable);
		} catch (Exception e) {
			Log.error("Not able to hover over the element " + locatorVariable);
			DriverScript.bValue = false;
		}
	}
	
	public static void handlingHovering_WithClick(String locatorVariable) {
		try {
			WebElement element = driver.findElement(LocatorsSplitFunction.locsplit(locatorVariable));
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();
			Log.info("Successfully hovered and clicked on the element " + locatorVariable);
		} catch (Exception e) {
			Log.error("Not able to hover and click the element " + locatorVariable);
			DriverScript.bValue = false;
		}
	}
	
	public static String fetchValue(String locatorVariable) throws Exception {
		try {
			WebElement element = driver.findElement(LocatorsSplitFunction.locsplit(locatorVariable));
			Value = element.getText();
			Log.info("Successfully fetched the value from element " + locatorVariable);
		} catch (Exception e) {
			Log.error("Not able to fetch the value from element " + locatorVariable);
			DriverScript.bValue = false;
		}
		return Value;
	}
	
	public static void handlingClick(String locatorVariable) {
		try {
			WebElement element = driver.findElement(LocatorsSplitFunction.locsplit(locatorVariable));
			element.click();
			Log.info("Successfully clicked the element " + locatorVariable);
		} catch (Exception e) {
			Log.error("Not able to click the element " + locatorVariable);
			DriverScript.bValue = false;
		}
	}
	
	public static void handlingTextBox(String locatorVariable , String testdata) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorsSplitFunction.locsplit(locatorVariable)));
			element.sendKeys(testdata);
			Log.info("Successfully entered the text in the element " + locatorVariable);
		} catch (Exception e) {
			Log.error("Not able to enter the text in the element " + locatorVariable);
			DriverScript.bValue = false;
		}
	}

	public static void handlingDropDown(String locatorVariable , String testdata) {
		try {
			WebElement element = driver.findElement(LocatorsSplitFunction.locsplit(locatorVariable));
			Select sel = new Select(element);
			sel.selectByVisibleText(testdata);
			Log.info("Successfully selected value from dropdown element  " + locatorVariable);
		} catch (Exception e) {
			Log.error("Not able to select value from dropdown element  " + locatorVariable);
			DriverScript.bValue = false;
		}
	}
}

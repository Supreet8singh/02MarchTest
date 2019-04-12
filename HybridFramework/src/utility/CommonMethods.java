package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

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
		} catch (Exception e) {
			System.out.println("This is catch block");
		}
	}
	
	public static void handlingHovering_WithoutClick(String locatorVariable) {
		try {
			WebElement element = driver.findElement(LocatorsSplitFunction.locsplit(locatorVariable));
			Actions act = new Actions(driver);
			act.moveToElement(element).build().perform();
		} catch (Exception e) {
			System.out.println("This is catch block");
		}
	}
	
	public static void handlingHovering_WithClick(String locatorVariable) {
		try {
			WebElement element = driver.findElement(LocatorsSplitFunction.locsplit(locatorVariable));
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();
		} catch (Exception e) {
			System.out.println("This is catch block");
		}
	}
	
	public static String fetchValue(String locatorVariable) throws Exception {
		try {
			WebElement element = driver.findElement(LocatorsSplitFunction.locsplit(locatorVariable));
			Value = element.getText();
		} catch (Exception e) {
			System.out.println("This is catch block");
		}
		return Value;
	}
	
	public static void handlingClick(String locatorVariable) {
		try {
			WebElement element = driver.findElement(LocatorsSplitFunction.locsplit(locatorVariable));
			element.click();
		} catch (Exception e) {
			System.out.println("This is catch block");
		}
	}
	
	public static void handlingTextBox(String locatorVariable , String testdata) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(LocatorsSplitFunction.locsplit(locatorVariable)));
			element.sendKeys(testdata);
		} catch (Exception e) {
			System.out.println("This is catch block");
		}
	}

	public static void handlingDropDown(String locatorVariable , String testdata) {
		try {
			WebElement element = driver.findElement(LocatorsSplitFunction.locsplit(locatorVariable));
			Select sel = new Select(element);
			sel.selectByVisibleText(testdata);
		} catch (Exception e) {
			System.out.println("This is catch block");
		}
	}
}

package autoIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {

	static WebDriver driver;
	
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
			
		driver.manage().window().maximize();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.findElement(By.id("profession-1")).click();
		
		driver.findElement(By.id("photo")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("E:\\2MarchBatch\\ThirdPartyTools\\autoit.exe");

		Thread.sleep(3000);
		
		driver.findElement(By.id("tool-2")).click();
		
}
}
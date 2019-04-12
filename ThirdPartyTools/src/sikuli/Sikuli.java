package sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {
	
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
		
		driver.findElement(By.id("tool-2")).click();
		
		Pattern choosefilebtn = new Pattern("E:\\2MarchBatch\\ThirdPartyTools\\images\\Choosefile.PNG");
		Pattern filenametextbox = new Pattern("E:\\2MarchBatch\\ThirdPartyTools\\images\\Filename.PNG");
		Pattern openbtn = new Pattern("E:\\2MarchBatch\\ThirdPartyTools\\images\\Open.PNG");
		Pattern automationbtn = new Pattern("E:\\2MarchBatch\\ThirdPartyTools\\images\\Automationtester.PNG");
		Pattern sevenradiobtn = new Pattern("E:\\2MarchBatch\\ThirdPartyTools\\images\\sevenradio.PNG");
		
		Screen s = new Screen();
		
		s.click(choosefilebtn);
		Thread.sleep(2000);
		s.type(filenametextbox, "E:\\2MarchBatch\\ThirdPartyTools\\SeleniumCheckBox.PNG");
		Thread.sleep(2000);
		s.click(openbtn);
		Thread.sleep(2000);
		s.click(automationbtn);
		Thread.sleep(2000);
		s.click(sevenradiobtn);
		
		
}
}
package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Parameterstest {
	
	static WebDriver driver;
	
	@BeforeClass
	@Parameters({"browsertype"})
	public static WebDriver browserType(String bname) {
		
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (bname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	
  @Test
  @Parameters({"url","frstname","lstname","emailid"})
  public void f(String url, String frstname, String lstname, String emailid) {
  
	  driver.get(url);
	  driver.findElement(By.name("firstname")).sendKeys(frstname);
	  driver.findElement(By.name("lastname")).sendKeys(lstname);
	  driver.findElement(By.name("reg_email__")).sendKeys(emailid);
	  
  }
}

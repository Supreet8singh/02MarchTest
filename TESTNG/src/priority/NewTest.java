package priority;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  
  @Test(priority = 1)
  public void f() {
	  System.out.println("F method");
	  Reporter.log("This is the F method");
  }
  
  @Test(priority = 2)
  public void a() {
	  System.out.println("a method");
	  Reporter.log("This is the A method");
  }
  
  @Test(priority = 3)
  public void u() {
	  System.out.println("u method");
	  Reporter.log("This is the U method");
  }
  
  @Test(priority = 4)
  public void d() {
	  System.out.println("d method");
	  Reporter.log("This is the D method");
  }
  
  @Test(priority = 5)
  public void e() {
	  System.out.println("e method");
	  Reporter.log("This is the E method");
  }
}

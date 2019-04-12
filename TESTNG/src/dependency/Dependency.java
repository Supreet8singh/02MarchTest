package dependency;

import org.testng.annotations.Test;

public class Dependency {
	  
	  @Test(priority = 1 )
	  public void f() {
		  System.out.println("F method");
	  }
	  
	  @Test(priority = 2, dependsOnMethods = "f")
	  public void a() {
		  System.out.println("a method");
		  int i=1/0;
		  System.out.println(i);
	  }
	  
	  @Test(priority = 3, dependsOnMethods = "a")
	  public void u() {
		  System.out.println("u method");
	  }
	  
	  @Test(priority = 4, dependsOnMethods = "u")
	  public void d() {
		  System.out.println("d method");
	  }
}
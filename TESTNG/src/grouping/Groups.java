package grouping;

import org.testng.annotations.Test;

public class Groups {
	  @Test(priority = 1, groups="group 1")
	  public void f() {
		  System.out.println("F method");
	  }
	  
	  @Test(priority = 2, groups="group 2")
	  public void a() {
		  System.out.println("a method");
	  }
	  
	  @Test(priority = 3, groups="group 1")
	  public void u() {
		  System.out.println("u method");
	  }
	  
	  @Test(priority = 4, groups="group 3")
	  public void d() {
		  System.out.println("d method");
	  }
	  
	  @Test(priority = 5, groups="group 1")
	  public void e() {
		  System.out.println("e method");
	  }
	  
	  @Test(priority = 6, groups="group 2")
	  public void q() {
		  System.out.println("q method");
	  }
	  
	  @Test(priority = 7, groups="group 3")
	  public void m() {
		  System.out.println("m method");
	  }
	  
	  @Test(priority = 8, groups="group 2")
	  public void t() {
		  System.out.println("t method");
	  }
	  
}

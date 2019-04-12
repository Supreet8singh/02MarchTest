package annotattions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  
  @Test
  public void f() {
  System.out.println("This is the f method");
  }
  
  @Test
  public void a() {
  System.out.println("This is the a method");
  }
  
  @Test
  public void b() {
  System.out.println("This is the b method");
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is the before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is the After method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("This is the before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("This is the after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is the before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is the after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is the before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is the after suite");
  }

}

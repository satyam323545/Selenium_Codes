package satyam.mandal.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_1{
	
	
  @Test(priority=3)
  public static void g() {
	 System.out.println("g");
  }
  
  @Test(priority=2)
  public static void h() {
	 System.out.println("h");

  }
  
  @Test(priority=1)
  public static void a() {
	 System.out.println("a");

  }
  
  @AfterMethod
  public static void am() {
	 System.out.println("after method");

  }
  
  @BeforeMethod
  public static void bm() {
	 System.out.println("before method");

  }
  
  @BeforeClass
  public static void bc() {
	 System.out.println("before class");

  }
  
 
}

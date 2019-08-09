package cricket.program;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.*;

public class NewTest {
  @Test
  public void test1() {
	  System.out.println("I met Mr.Dhoni");
  }
  @Test
  public void test2() {
	  System.out.println("I had lunch with Kohli");
  }
  @Test
  public void test3() {
	  System.out.println("Picture with Rohit Sharma");
  }
  
  @BeforeClass
  public void test4() {
	  System.out.println("I came to the cricket stadium");
  }
  
  @AfterClass
  public void test5() {
	  System.out.println("Now I am home");
  }
  
  @BeforeMethod
  public void test6() {
	  System.out.println("Hello");
  }
  
  @AfterMethod
  public void test7() {
	  System.out.println("Bye");
  }
}

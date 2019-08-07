package satyam.mandal.testng;

import org.testng.annotations.Test;

public class excel_test extends Login_function{
  @Test
  public void f1() {
	  login1();//To make it fail.....
  }
  
  @Test
  public void f2() {
	  login();//To make it pass.........
  }
}

package satyam.mandal.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Before_After_annotation extends Login{
	 WebDriver chrome;
	
  @BeforeMethod
  public void open_function() {
	  	System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		chrome=new ChromeDriver();
		chrome.get("http://demowebshop.tricentis.com/");
  }
  
  
  @Test
  public void set_data_function() {//valid all
	  
	  String email="mandal0927@gmail.com";
	  String password="satty0927";
	  
	  String verify=set_data(email,password,chrome);
	  Assert.assertEquals(email, verify);
	  
  }
  
 @Test
  public void set_data_function2() {//incorrect password
	  String email="checklist@gmail.com";
	  String password="satty09927";
	  
	  String verify=set_data(email,password, chrome);
	  Assert.assertEquals(email, verify);
	  System.out.println("After hard assert");
	  
  }
 
 @Test
 public void set_data_function3() {//invalid email
	  String email="cbin$#12.com";
	  String password="satty0927";
	  
	  String verify=set_data(email,password, chrome);
	  //Assert.assertEquals(email, verify);
	  SoftAssert sa=new SoftAssert();//Soft assert allows to keep the execution flow and does not stops like regular assert/hard assert.
	  sa.assertEquals(email, verify);
	  sa.assertAll();
	  System.out.println("After soft assert");
 }
 
 @Test
 public void set_data_function4() {//unregistered email
	  String email="temp11@gmail.com";
	  String password="satty0927";
	  
	  String verify=set_data(email,password, chrome);
	  Assert.assertEquals(email, verify);
	  
 }
 
 @Test
 public void set_data_function5() {//blank
	  String email="";
	  String password="";
	  
	  String verify=set_data(email,password, chrome);
	  Assert.assertEquals(email, verify);
	  
 }
 
  
  @AfterMethod
  public void close() {
	  close1(chrome);
  }
}

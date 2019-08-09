package satyam.mandal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import test.java.satyam.mandal.Working_Functions;

public class NewTest {
	
	Working_Functions functions=new Working_Functions();
	WebDriver chrome;
	
  @BeforeClass
  public void login_attempt() {
	  
	  System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		chrome=new ChromeDriver();
		chrome.get("http://demowebshop.tricentis.com/");
		
		functions.do_login(chrome);
  }
  
  
  
  @Test
  public void make_purchase() {
	  
	  functions.make_purchase(chrome);
  }
}

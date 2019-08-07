package test_cases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import web_pages.fb_home;
import web_pages.fb_login;

public class Facebook_login {
	
	WebDriver dr;
	fb_login login;
	fb_home home;
	
	Logger log;
	
	@BeforeClass
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://www.facebook.com/");
		log=Logger.getLogger("devpinoyLogger");
		
		log.info("Before Class");
	}
	
	
	
	
  @Test(priority=0)
  public void test_login_page() {
	  login = new fb_login(dr);
	  String title= dr.getTitle();//login.get_title();
	  System.out.println("Title: "+title);
	  log.info("Before Class");
	  
	  //Assert.assertTrue(title.contains("Facebook"));
  }
  @Test(priority=1)
  public void test_home_page() {
	  login.do_login("+18452435930", "abcdefg123");
	  home =new fb_home(dr);
	  String profile=home.get_profileName();
	  System.out.println(profile);
	  Assert.assertTrue(profile.contains("Ram"));
	  log.info("Before Class");
  }
}

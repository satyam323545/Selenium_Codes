package multi.threads;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver chrome,firefox,ie;
	
  @Test
  public void test1() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://www.facebook.com/");
		
		System.out.println("Chrome launched");
  }
  
  @Test
  public void test2() {
	  System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver firefox=new FirefoxDriver();
		firefox.get("https://www.quora.com/");
		
		System.out.println("Firefox launched");
  }
  
  
  @Test
  public void test3() {
	  System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		WebDriver ie=new InternetExplorerDriver();
		ie.get("https://in.ebay.com/");
		
		System.out.println("IE launched");
  }
  @Test(priority=99)
  public void stop_all() throws InterruptedException {
	  Thread.sleep(30000);
	  chrome.close();
	  firefox.close();
	  ie.close();
  }
}

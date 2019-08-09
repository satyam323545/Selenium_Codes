//The person who is hub runs this code



package satyam.mandal;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest_HUB_codes {
	
	WebDriver shashank,aditya;
	String baseURL, nodeURL1, nodeURL2,baseURL1;
	
	@BeforeTest
	public void setup() throws MalformedURLException{
		baseURL="https://www.facebook.com";
		baseURL1="http://demowebshop.tricentis.com/";
		nodeURL1="http:///172.16.70.205:5566/wd/hub";//shashank
		nodeURL2="http:///172.16.41.122:5566/wd/hub";//aditya
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		shashank=new RemoteWebDriver(new URL(nodeURL1),cap);
		aditya=new RemoteWebDriver(new URL(nodeURL2),cap);
	}
	
	public void aftertest() {
		aditya.quit();
	}
	
	
	@Test
	public void test1() {
		shashank.get(baseURL);
		aditya.get(baseURL1);
		
		shashank.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("+18452435930");
		shashank.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abcdefg123");
		shashank.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
		
		
		aditya.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	}
}

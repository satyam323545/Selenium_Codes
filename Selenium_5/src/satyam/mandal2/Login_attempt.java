package satyam.mandal2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login_attempt {
	void login_attempt(String eid, String password, String er){
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://demowebshop.tricentis.com/");
		
		String email=eid;
		String pass=password;
		
		chrome.findElement(By.xpath("//*[@href=\"/login\"]")).click();
		chrome.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		chrome.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);
		
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		String expected=chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		String actual=eid;
		Assert.assertEquals(actual, expected);
		chrome.close();
	}
	}


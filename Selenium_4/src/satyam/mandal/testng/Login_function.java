package satyam.mandal.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login_function {
	
	public void login(){
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://demowebshop.tricentis.com/");
		
		String email="mandal0927@gmail.com";
		String pass="satty0927";
		
		chrome.findElement(By.xpath("//*[@href=\"/login\"]")).click();
		chrome.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		chrome.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);
		
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		String expected=chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		String actual=email;
		Assert.assertEquals(actual, expected);
		chrome.close();
	}
	
	public void login1(){
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://demowebshop.tricentis.com/");
		
		String email="mandal0927@gmail.com";
		String pass="satty0927";
		
		chrome.findElement(By.xpath("//*[@href=\"/login\"]")).click();
		chrome.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		chrome.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);
		
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		String expected=chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		String actual="mandalsatyam333@gmail.com";
		Assert.assertEquals(actual, expected);
		
		chrome.close();
	}
	
	public void login2(){
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://demowebshop.tricentis.com/");
		
		String email="mandal09927@gmail.com";
		String pass="satty0927";
		
		chrome.findElement(By.xpath("//*[@href=\"/login\"]")).click();
		chrome.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		chrome.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);
		
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		String expected=chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")).getText();
		String actual=email;
		Assert.assertEquals(actual, expected);
		
		chrome.close();
	}
	
}

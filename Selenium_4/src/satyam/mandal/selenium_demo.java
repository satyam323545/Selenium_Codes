package satyam.mandal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://demowebshop.tricentis.com/");
		
		if(chrome.getTitle().equalsIgnoreCase("Demo Web Shop")) {
			System.out.println("Title: Demo Web Shop found");
		}
		
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
		if(chrome.getTitle().equalsIgnoreCase("Demo Web Shop. Register")) {
			System.out.println("Title: Demo Web Shop Registration page found");
		}
		
		chrome.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		
		chrome.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Satyam");
		
		chrome.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Mandal");
		
		chrome.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("mandalsatyam333@gmail.com");
		
		chrome.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("pass123$");
		
		chrome.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("pass123$");
		
		chrome.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		
		System.out.println("Registration completed");
		
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
		System.out.println("Browser can now be closed");
		
	}

}

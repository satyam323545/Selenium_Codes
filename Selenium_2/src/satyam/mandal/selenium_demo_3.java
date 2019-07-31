package satyam.mandal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://demowebshop.tricentis.com/");
		
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		String s="mandalsatyam333@gmail.com";
		chrome.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(s);
		
		chrome.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("pass123$");
		
		chrome.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
		
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		boolean b=chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText().equalsIgnoreCase(s);
		
		if(b) {
			System.out.println("Corrected Login Successful");
		}
		
	}

}

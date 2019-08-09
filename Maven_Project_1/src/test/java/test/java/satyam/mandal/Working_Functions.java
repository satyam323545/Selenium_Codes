package test.java.satyam.mandal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Working_Functions {

	public void do_login(WebDriver chrome) {
		// TODO Auto-generated method stub
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		
		chrome.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("mandal0927@gmail.com");
		chrome.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("satty0927");
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	}

	public void make_purchase(WebDriver chrome) {
		// TODO Auto-generated method stub
		
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")).click();
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[1]/div/h2/a")).click();
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
		chrome.findElement(By.xpath("//input[@id=\"add-to-cart-button-72\"]")).click();
		
		String processor=chrome.findElement(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[6]/dl/dd[1]/ul/li[2]/label")).getText();
		String ram=chrome.findElement(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[6]/dl/dd[2]/ul/li[2]/label")).getText();
		String hdd=chrome.findElement(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[6]/dl/dd[3]/ul/li[1]/label")).getText();
		
		chrome.findElement(By.xpath("//*[@id=\"topcartlink\"]/a")).click();
		
		String processor1=chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[3]/div[1]/br[1]")).getText();
		String processor2=processor1.substring(processor1.indexOf(':'), processor1.length());
		if(processor2.equalsIgnoreCase(processor)) {
			System.out.println("Correct value");
		}
		
		chrome.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
	}
}

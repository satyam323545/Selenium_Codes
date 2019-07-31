package satyam.mandal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium_demo2 extends Thread{
	
	Thread t=new Thread();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://demowebshop.tricentis.com/");
		
		Actions actions=new Actions(chrome);
		
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		
		WebElement textbox=chrome.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		
		Action entertext=actions.doubleClick(textbox)
				.sendKeys("Satyam")
				.build();
		
		
		Action copytext=actions.doubleClick(textbox)
					.keyDown(Keys.CONTROL)
					.sendKeys("a")
					.sendKeys("c")
					.build();
		
		
		
		Action pastetext=actions.click(chrome.findElement(By.xpath("//*[@id=\"LastName\"]")))
						.keyDown(Keys.CONTROL)
						.sendKeys("v")
						.build();
		
		entertext.perform();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		copytext.perform();
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pastetext.perform();

	}

}

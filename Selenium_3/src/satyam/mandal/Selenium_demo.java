package satyam.mandal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Selenium_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://demowebshop.tricentis.com/");
		
		Actions actions=new Actions(chrome);
		
		Action set1=actions.moveToElement(chrome.findElement(By.xpath("//a[contains(text(),'Computers')]")))
						.build();
		Action set2=actions.moveToElement(chrome.findElement(By.xpath("//a[contains(text(),'Desktops')]")))
						.click()
						.build();
		
		set1.perform();
		set2.perform();
	}

}

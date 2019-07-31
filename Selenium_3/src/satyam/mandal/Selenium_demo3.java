package satyam.mandal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.viralpatel.net/dynamic-add-textbox-input-button-radio-element-html-javascript/");
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		dr.findElement(By.xpath("/html/body/input")).click();
		
		WebDriverWait wt=new WebDriverWait(dr,10);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"fooBar\"]/input")));
		

	}

}

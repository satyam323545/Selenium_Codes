package satyam.mandal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
			WebDriver chrome=new ChromeDriver();
			chrome.get("http://examples.codecharge.com/Store/Default.php");
			
			if(chrome.getTitle().equalsIgnoreCase("Online Bookstore")) {
				System.out.println("Welcome to "+chrome.getTitle());
			}
			
			chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select")).click();
			chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[3]")).click();
			
			chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
			
			
			
			
	}

}

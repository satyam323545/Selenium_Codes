package satyam.mandal.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_access {
	
	public void get_browser_access() {
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://demo.guru99.com/test/delete_customer.php");
		
		chrome.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("test");
		
		delete_data(chrome);
		
	}
	
	private static void delete_data(WebDriver chrome) {
		// TODO Auto-generated method stub
		chrome.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		
		System.out.println(chrome.switchTo().alert().getText());
		
		chrome.switchTo().alert().accept();
		
		//chrome.switchTo().alert().dismiss();
		
		try {
			verify(chrome);
		}catch(Exception e) {
			
		}
		
		chrome.close();
	}

	private static void verify(WebDriver chrome) {
		// TODO Auto-generated method stub
		System.out.println(chrome.switchTo().alert().getText());
		
		chrome.switchTo().alert().accept();
		
	}


}

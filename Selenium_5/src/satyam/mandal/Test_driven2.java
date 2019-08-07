package satyam.mandal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test_driven2 {

	public static String launch_browser(String test_data, WebDriver chrome) {
		// TODO Auto-generated method stub
		chrome.get(test_data);
		
		String out=chrome.getTitle().toString();
		return out;
		
	}

	public static String click(String xpath, WebDriver chrome) {
		// TODO Auto-generated method stub
		chrome.findElement(By.xpath(xpath)).click();
		
		if(chrome.getTitle().equalsIgnoreCase("Demo Web Shop. Login")) {
			return chrome.getTitle();
		}
		else {
			return chrome.getTitle(); 
		}
		
			
		
	}

	public static String enter_data(String xpath, String test_data, WebDriver chrome) {
		// TODO Auto-generated method stub
		chrome.findElement(By.xpath(xpath)).sendKeys(test_data);
		try {
			if(chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span")).isDisplayed()) {
				String out=chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/span/span")).getText();
				return out;
			}
		}catch(Exception e) {}
		
		
		
		String title=chrome.getTitle();
		return title;
		
	}

	public static String verify(String xpath, WebDriver chrome) {
		if((chrome.findElement(By.xpath(xpath)).getText()).equalsIgnoreCase("mandal0927@gmail.com")) {
			return "Login Successful";
		}
		
		try {
			if(chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")).isDisplayed()) {
				String out=chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")).getText();
				return out;
			}	
		}catch(Exception e) {}
		
		return "Something is wrong";
	}
}

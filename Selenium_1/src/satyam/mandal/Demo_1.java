package satyam.mandal;

import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://facebook.com");
		dr.navigate();
		
	}

}

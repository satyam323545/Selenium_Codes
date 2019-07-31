package satyam.mandal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables_html {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("https://www.w3schools.com/html/html_tables.asp");
		for(int i=2;i<=7;i++) {
				String tab1=chrome.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+1+"]")).getText();
				String tab2=chrome.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+2+"]")).getText();
				String tab3=chrome.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+i+"]/td["+3+"]")).getText();
				System.out.format("%32s%32s%32s", tab1, tab2, tab3);
			System.out.println("\n");
		}
		chrome.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[1]")).getText();

	}

}

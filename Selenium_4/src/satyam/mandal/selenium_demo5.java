package satyam.mandal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_demo5 {

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
		
		
		chrome.findElement(By.xpath("//*[text()=\"Web Database Development\"]")).click();
		
		String name=chrome.findElement(By.xpath("//*[text()=\"Web Database Development\"]")).getText();
		
		if(name.equalsIgnoreCase("Web Database Development")) {
			System.out.println("Found: "+name);
		}
		
		chrome.findElement(By.xpath("//*[text()=\"Web Database Development\"]")).click();
		
		String price=chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/table/tbody/tr/td[2]")).getText();
		
		float rate=(Float.parseFloat((price.substring(price.indexOf("$")+1, price.length()))));
		
		System.out.println("Price is: "+rate);
		chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).clear();
		chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).sendKeys("2");
		
		chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();
		
		String k=chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[3]/input")).getText();
		if(k.equalsIgnoreCase("2")) {
			System.out.println("Quantity is verified");
		}
		
		String total=chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr[2]/td[4]")).getText();
		float total_1=Float.parseFloat((total.substring(total.indexOf('$')+1, total.length())));
		float temp=rate*2;
		if(total_1==temp) {
			System.out.println("Total verified to : " +total_1);
		}
		
	}

}

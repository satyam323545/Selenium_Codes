package satyam.mandal;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_demo6 {
	
	static float sum=0;
	

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
		
		calculate(chrome);
		
		
		
		//===================================================================================================================
		
		chrome.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/a[1]")).click();
		
		chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select")).click();
		chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[4]")).click();
		
		chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
		
		String name1=chrome.findElement(By.xpath("//*[text()=\"Flash 4 Magic\"]")).getText();
		
		if(name1.equalsIgnoreCase("Flash 4 Magic")) {
			System.out.println("Found: "+name1);
		}
		
		chrome.findElement(By.xpath("//*[text()=\'Flash 4 Magic\']")).click();
		
		calculate(chrome);
		
		//====================================================================================================================
		
		chrome.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/a[1]")).click();
		
		chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select")).click();
		chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[1]/td/select/option[2]")).click();
		
		chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/form/table[2]/tbody/tr[3]/td/input")).click();
		
		String name11=chrome.findElement(By.xpath("//*[text()='Programming Perl']")).getText();
		
		if(name11.equalsIgnoreCase("Programming Perl")) {
			System.out.println("Found: "+name11);
		}
		
		chrome.findElement(By.xpath("//*[text()='Programming Perl']")).click();
		
		
		
		
		
		calculate(chrome);
		
		
		//Final table verification......
//		for(int i=2;i<=4;i++) {
//			String total=chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr["+i+"]/td[4]")).getText();
//			String price=chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr["+i+"]/td[2]")).getText();
//			String quantity=chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/table/tbody/tr/td/form[1]/table[2]/tbody/tr["+i+"]/td[3]/input")).getText();
//			float total_1=Float.parseFloat((total.substring(total.indexOf('$')+1, total.length())));
//			float price_1=Float.parseFloat(price.substring(price.indexOf('$')+1,price.length()));
//			System.out.println(quantity);
//			float quantity_1=Float.parseFloat(quantity);
//			sum=sum+total_1;
//			if(total_1==(price_1*quantity_1)) {
//				System.out.println("Price verified for "+ i);
//			}
//		}
//		System.out.println("Finally sum is: "+ sum);
		

	}

	private static void calculate(WebDriver chrome) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		// TODO Auto-generated method stub
		String price=chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/table/tbody/tr/td[2]")).getText();
		
		float rate=(Float.parseFloat((price.substring(price.indexOf("$")+1, price.length()))));
		
		System.out.println("Price is: "+rate);
		chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).clear();
		System.out.print("Enter quantity :");
		String data=scan.next();
		
		
		
		chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[1]/input")).sendKeys(data);//Entering amount
		
		chrome.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/form/p[2]/input[1]")).click();//ADD to Shopping cart
		
		
//		
//		
		
		
	}

}

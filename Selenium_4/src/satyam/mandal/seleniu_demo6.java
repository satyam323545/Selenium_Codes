package satyam.mandal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniu_demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
		
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[1]/td[2]/input")).sendKeys("login_117");//Login
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[2]/td[2]/input")).sendKeys("satty0927");//Password
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[3]/td[2]/input")).sendKeys("Satyam");//First Name
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[4]/td[2]/input")).sendKeys("Mandal");//Last Name
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[5]/td[2]/input")).sendKeys("mandalsatyam333@gmail.com");//Email
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[6]/td[2]/input")).sendKeys("UP");//Address line 1
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[9]/td[2]/input")).sendKeys("Noida");//City
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[10]/td[2]/select")).click();;
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[10]/td[2]/select/option[18]")).click();//City
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[11]/td[2]/input")).sendKeys("20135");//Zip code
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[12]/td[2]/select")).click();;
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[12]/td[2]/select/option[18]")).click();//City
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[13]/td[2]/input")).sendKeys("90909090990");//City
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[14]/td[2]/input")).sendKeys("98989898989");//City
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[15]/td[2]/select")).click();
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[15]/td[2]/select/option[3]")).click();//Language
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[16]/td[2]/select")).click();
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[16]/td[2]/select/option[3]")).click();//age
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[17]/td[2]/select")).click();
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[17]/td[2]/select/option[2]")).click();//Gender
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[18]/td[2]/select")).click();
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[18]/td[2]/select/option[2]")).click();//Education
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[19]/td[2]/select")).click();
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[19]/td[2]/select/option[2]")).click();//Income
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[21]/td/input[1]")).click();//Button
		
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[1]/td/input")).sendKeys("Satyam");
		chrome.findElement(By.xpath("/html/body/center/form/table/tbody/tr/td/table[2]/tbody/tr[2]/td[2]/input")).click();
		
		String str=chrome.findElement(By.xpath("/html/body/center/table[2]/tbody/tr/td/table[2]/tbody/tr[2]/td[2]")).getText();
		
		if(str.equalsIgnoreCase("satyam")) {
			System.out.println("Registration is done");
		}

	}

}

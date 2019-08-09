package testrunner_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features="FEATURES", glue="step_def_pkg")
public class testrunner extends AbstractTestNGCucumberTests{
	
	WebDriver chrome;
	
	@Given("^Browser is launched & login page is displayed$")
	public void browser_is_launched_login_page_is_displayed() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		chrome=new ChromeDriver();
		chrome.get("https://www.facebook.com/");
		
	}

	@When("^User enters login credentials & clicks on login$")
	public void user_enters_login_credentials_clicks_on_login() throws Throwable {
		chrome.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("+18452435930");
		chrome.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("abcdefg123");
		chrome.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	}

	@Then("^Successful login happens & profile name is displayed correctly$")
	public void successful_login_happens_profile_name_is_displayed_correctly() throws Throwable {
		
		String name=chrome.findElement(By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span")).getText();
		if(name.equalsIgnoreCase("ram")) {
			//if(chrome.getTitle().equalsIgnoreCase("facebook")) {
				System.out.println("Execution for login successful");
				System.out.println("Welcome: "+ name + " to "+ chrome.getTitle());
			//}
			
		}
	}
	
}

package web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fb_home {
		
	
	
	WebDriver dr;
	
	By profile_xpath=By.xpath("//*[@id=\"u_0_a\"]/div[1]/div[1]/div/a/span/span");
	
	public fb_home(WebDriver dr) {
		this.dr=dr;
	}
	
	public String get_profileName() {
		return dr.findElement(profile_xpath).getText();
	}
}

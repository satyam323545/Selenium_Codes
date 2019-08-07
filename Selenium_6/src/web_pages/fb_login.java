package web_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fb_login {

		By ename=By.xpath("//*[@id=\"email\"]");
		By password=By.xpath("//*[@id=\"pass\"]");
		By login_button=By.xpath("//*[@id=\"loginbutton\"]");
	
		
		WebDriver dr;
		

		public fb_login(WebDriver dr) {
			this.dr=dr;
		}
		
		public void set_uname(String uname) {
			dr.findElement(ename).sendKeys(uname);
		}
		
		public void set_password(String pass) {
			dr.findElement(password).sendKeys(pass);
		}
		
		public void click_button() {
			dr.findElement(login_button).click();
		}
		
		public void do_login(String user, String pass) {
			this.set_uname(user);
			this.set_password(pass);
			this.click_button();
		}
		
		public String get_title() {
			return dr.getTitle();
		}
}

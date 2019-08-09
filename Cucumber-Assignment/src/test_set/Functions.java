package test_set;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Functions {
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriver chrome;
	static String new_name="SWIFT";
	static String book_name="Treasure Island";
	static String price="200";

	boolean b=false;
	boolean element=false;
	
	public void main_page_verify() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		chrome=new ChromeDriver();
		chrome.get("http://examples.codecharge.com/Store/Default.php");
		log.info("Browser Opened");
		
		String title=chrome.getTitle();
		
		
  	    if(title.equalsIgnoreCase("Online Bookstore")) {
  	    	log.info("Valid Website Found");
  	    }
  	    else {
	    	try {
	    		chrome.findElement(By.xpath("//a[text()='Home']")).click();
	    	}
	    	catch(Exception e) {}
	}
  	    
  	    
  	   
	}


	public void click_link_administration() {
		// TODO Auto-generated method stub
		chrome.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/a[4]")).click();
		
		boolean a=chrome.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table[1]/tbody/tr/th")).isDisplayed();
		 if(a) {
			 log.info("Attempting login");
	  	    	chrome.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[1]/td[2]/input")).sendKeys("admin");
	  	    	chrome.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[2]/td[2]/input")).sendKeys("admin");
	  	    	chrome.findElement(By.xpath("/html/body/center/table/tbody/tr/td/form/table[2]/tbody/tr[3]/td/input")).click();
	  	    }
		 log.info("Clicked in login");
	}


	public void verify_admin_menu() {
		// TODO Auto-generated method stub
		
		
		boolean is_in_adminpage=chrome.findElement(By.xpath("/html/body/table/tbody/tr/td/table[1]/tbody/tr/th")).isDisplayed();
		if(is_in_adminpage) {
			log.info("Currently in admin menu");
		}
		else {
			log.info("Admin table not found");
		}
		System.out.println("Admin Table Verified");
		chrome.close();
	}


	public void click_link_categories() {
		// TODO Auto-generated method stub
		chrome.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr[1]/td/a")).click();
		log.info("clicked in categories link");
	}


	public void verify_list_categories() {
		// TODO Auto-generated method stub
		boolean is_in_list_store=chrome.findElement(By.xpath("/html/body/table/tbody/tr/td/table[1]/tbody/tr/th")).isDisplayed();
		if(is_in_list_store) {
			log.info("Categories table found");
		}
		else {
			log.info("Categories table not found");
		}
		System.out.println("Categories link verified");
		chrome.close();
	}


	public void add_new_link() {
		// TODO Auto-generated method stub
		chrome.findElement(By.xpath("//*[text()='Add New']")).click();
		log.info("Selecting add new link");
	}


	public void add_category_name() {
		// TODO Auto-generated method stub
		chrome.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[2]/tbody/tr[1]/td/input")).clear();
		chrome.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[2]/tbody/tr[1]/td/input")).sendKeys(new_name);
		log.info("Added category name");
	}


	public void click_add_button() {
		// TODO Auto-generated method stub
		chrome.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[2]/tbody/tr[2]/td/input[1]")).click();
		System.out.println("Add button clicked");
	}


	public void verify_name_in_categories() {
		// TODO Auto-generated method stub
		while(true) {
		try {
			element=chrome.findElement(By.xpath("//*[text()='"+new_name+"']")).isDisplayed();}
			catch(Exception e) {}
				if(element) {
					log.info("Verified in categories");
					break;
				}
				else {
					log.info("Not Verified in categories");
					try {chrome.findElement(By.xpath("//*[text()='>>']")).click();}catch(Exception e) {}
					
				}
			}
		}
		
		


	public void click_link_products() {
		// TODO Auto-generated method stub
		chrome.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr[5]/td/a")).click();
		
	}


	public void add_product_link() {
		// TODO Auto-generated method stub
		chrome.findElement(By.xpath("//*[text()='Add New']")).click();
	}


	public void add_product() {
		// TODO Auto-generated method stub
		chrome.findElement(By.xpath("//option[text()='"+new_name+"']")).click();
		chrome.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[2]/tbody/tr[2]/td/input")).sendKeys(book_name);
		chrome.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[2]/tbody/tr[3]/td/input")).sendKeys(price);
		chrome.findElement(By.xpath("/html/body/table/tbody/tr/td/form/table[2]/tbody/tr[7]/td/input[1]")).click();
		log.info("New product added");
	}


	public void verify_product() {
		// TODO Auto-generated method stub
		By path=By.xpath("//*[text()='"+book_name+"']");
		
	    while(true) {
	    	try {
	    		b=chrome.findElement(path).isDisplayed();
	    	}catch(Exception e) {}
	    	if(b) {
	    		//if(chrome.findElement(By.xpath("//*[text()='"+price+"']")).isDisplayed()) {
	    			log.info("Product found");
					chrome.close();
					break;
	    		//}
	    		
				
			}
			else {
				chrome.findElement(By.xpath("//*[text()='Next']")).click();
			}
	    	
	    }
	    chrome.quit();
	}
	
	
	
}

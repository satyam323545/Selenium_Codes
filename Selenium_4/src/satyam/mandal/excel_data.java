package satyam.mandal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class excel_data {
	
	static File file=new File("Login_data.xlsx");
	static ArrayList<Data> al=new ArrayList<Data>();
	String mail;
	static String stat;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get_excel_data();
		
			
		
		
		
	}

	private static void get_excel_data() {
		// TODO Auto-generated method stub
		try {
			FileInputStream input=new FileInputStream(file);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheetAt(0);
			String email,pass;
			
			Data data=new Data();
			
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				
				
				
				email=sheet.getRow(i).getCell(0).getStringCellValue();
				pass=sheet.getRow(i).getCell(1).getStringCellValue();
				data.email=email;
				data.password=pass;
				data.expected_value=sheet.getRow(i).getCell(2).getStringCellValue();
				
				al.add(data);
				attempt_login(email,pass,i);
				
				
			}
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void attempt_login(String email,String pass,int i) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://demowebshop.tricentis.com/");
		
		
		
		chrome.findElement(By.xpath("//*[@href=\"/login\"]")).click();
		chrome.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		chrome.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);
		try{
			if(chrome.findElement(By.xpath("//*[text()='Please enter a valid email address.']")).isDisplayed()) {
				System.out.println("Login Failed with error email");
				String status=chrome.findElement(By.xpath("//*[text()='Please enter a valid email address.']")).getText();
				stat="failed 'Atleast enter a valid email dude'";
				update_data(status,stat,i);
			}
		}
		catch(Exception e) {
			System.out.println("Caught an Exception");
		}
		
		
		
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		String verify=chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		
		
		if(verify.equalsIgnoreCase(email)) {
			System.out.println("Login Successful");
			stat="pass";
			update_data(verify,stat,i);
			
		}
		//Weird email
		
		//Wrong credentials
		try {
			if(chrome.findElement(By.xpath("//*[text()='Login was unsuccessful. Please correct the errors and try again.']")).isDisplayed()){
				System.out.println("Login Failed");
				String status=chrome.findElement(By.xpath("//*[text()='Login was unsuccessful. Please correct the errors and try again.']")).getText();
				stat="fail Please check your password";
				update_data(status,stat,i);
				
			}
		}
		catch(Exception e) {
			System.out.println("Login uncessful");
		}
		
		
		chrome.close();
		
	}

	private static void update_data(String email, String stat,int i) {
		// TODO Auto-generated method stub
		try {
			FileInputStream input=new FileInputStream(file);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheetAt(0);
			XSSFRow row=sheet.getRow(i);
			
			
			FileOutputStream output=new FileOutputStream(file);
			XSSFCell cell1=row.createCell(3);
			XSSFCell cell2=row.createCell(4);
			cell1.setCellValue(email);
			cell2.setCellValue(stat);
			
			
			workbook.write(output);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

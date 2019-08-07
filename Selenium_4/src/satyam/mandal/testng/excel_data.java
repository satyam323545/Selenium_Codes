package satyam.mandal.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class excel_data {
	
	static File file=new File("Login_data.xlsx");
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		get_excel_data();
		
		
		
	}

	protected static void get_excel_data() {
		// TODO Auto-generated method stub
		try {
			FileInputStream input=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheetAt(0);
			String email,pass;
			
			
			ArrayList<Data> al=new ArrayList<Data>();
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				
				
				Data data=new Data();
				email=sheet.getRow(i).getCell(0).getStringCellValue().toString();
				pass=sheet.getRow(i).getCell(1).getStringCellValue().toString();
				
				data.email = email;
				data.password = pass;
				data.expected_value = sheet.getRow(i).getCell(2).getStringCellValue().toString();
				
				al.add(data);
				attempt_login(data.email,data.password,i,data);
				}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void attempt_login(String email,String pass,int i,Data data) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		chrome.get("http://demowebshop.tricentis.com/");
		
		chrome.findElement(By.xpath("//*[@href=\"/login\"]")).click();
		chrome.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		chrome.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(pass);
		
		
		
		chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		
		String verify=chrome.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		String stat;
		if(verify.equalsIgnoreCase(email)) {
			System.out.println("Login Successful");
			stat="pass";
			update_data(verify,stat,i);
			
		}
		else {
			System.out.println("Login UNSuccessful");
			stat="fail";
			update_data(verify,stat,i);
			
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

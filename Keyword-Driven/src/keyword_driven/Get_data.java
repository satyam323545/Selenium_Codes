package keyword_driven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_data {

	static WebDriver chrome;
	static File file=new File("Data_test.xlsx"); 
	static String ver;

	static String keyword;
	static String xpath;
	static String test_data;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream input=new FileInputStream(file);
			@SuppressWarnings("resource")
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheet("Test_Runner");
			String testcase;
			
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				XSSFRow row=sheet.getRow(i);
				XSSFCell cell=row.getCell(0);
				XSSFCell cell1=row.getCell(1);
				
				testcase=cell.getStringCellValue();
				String flag=cell1.getStringCellValue();
				if(flag.equalsIgnoreCase("Y")) {
					tests_to_run(testcase,workbook);
				}
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void tests_to_run(String testcase, XSSFWorkbook workbook) {
		// TODO Auto-generated method stub
		XSSFSheet sheet=workbook.getSheet("Test_Cases");
		
		for(int i=1;i<=sheet.getLastRowNum();i++) {
			
			String test_case=sheet.getRow(i).getCell(0).getStringCellValue();
			
			if(test_case.equalsIgnoreCase(testcase)) {
				try {keyword=sheet.getRow(i).getCell(2).getStringCellValue();
				xpath=sheet.getRow(i).getCell(3).getStringCellValue();
				test_data=sheet.getRow(i).getCell(4).getStringCellValue();}catch(Exception e) {}
				
				
				
				switch(keyword) {
				case "launchbrowser":System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
									chrome=new ChromeDriver();
									chrome.get(test_data);
					break;
					
				case "login": chrome.findElement(By.xpath(xpath)).click();
					break;
					
				case "enter_email":  chrome.findElement(By.xpath(xpath)).sendKeys(test_data);
									ver=test_data;
					break;
					
				case "enter_password": chrome.findElement(By.xpath(xpath)).sendKeys(test_data);
					break;
					
				case "click_login":  chrome.findElement(By.xpath(xpath)).click();
					break;
					
				case "verify": String ver1=chrome.findElement(By.xpath(xpath)).getText();
								if(ver1.equalsIgnoreCase(ver)) {
									System.out.println("Verified");
								}
					break;
					
				default:System.out.println("WASTED");
				}
			}
			
		}
	}

}

package satyam.mandal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_driven extends Test_driven2{

	
	
	static File file=new File("List of Test Case.xlsx");
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test_driven3 dataset=new Test_driven3();
		@SuppressWarnings("unused")
		ArrayList<Test_driven3> al=new ArrayList<Test_driven3>();
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_version_75.exe");
		WebDriver chrome=new ChromeDriver();
		//chrome.get("http://demowebshop.tricentis.com/");
		try {
			FileInputStream input=new FileInputStream(file);
			
			@SuppressWarnings("resource")
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheetAt(0);
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				
				XSSFRow row=sheet.getRow(i);
				dataset.setKeyword(row.getCell(1).toString());
				dataset.setXpath(row.getCell(2).toString());
				dataset.setTest_data(row.getCell(3).toString());
				XSSFCell cell=row.createCell(4);
				switch(dataset.getKeyword()) {
				case "launchbrowser" :cell.setCellValue(Test_driven2.launch_browser(dataset.getTest_data(),chrome)); 	
				break;
				
				case "login" : cell.setCellValue(Test_driven2.click(dataset.getXpath(),chrome));
				break;
				
				case "enter_email" : cell.setCellValue(Test_driven2.enter_data(dataset.getXpath(), dataset.getTest_data(),chrome));
				break;
				
				case "enter_password" : cell.setCellValue(Test_driven2.enter_data(dataset.getXpath(), dataset.getTest_data(),chrome));
				break;
				
				case "click_login" : cell.setCellValue(Test_driven2.click(dataset.getXpath(),chrome));
				break;
				
				case "verify" : cell.setCellValue(Test_driven2.verify(dataset.getXpath(),chrome));
				break;
				
				default: System.out.println("EXCEPTION IN SWITCH");
				}
				FileOutputStream output=new FileOutputStream(file);
				workbook.write(output);
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
				System.out.println("Well IT WORKS");
				chrome.close();
		
	}

}

package satyam.mandal2;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_data_fetch {
	File file=new File("Login_data.xlsx");
	ArrayList<Data> al=new ArrayList<Data>();
	
	public ArrayList<Data> fetch_excel_data() {
		
		
		try {
			
			Data data=new Data();
			FileInputStream input=new FileInputStream(file);
			
			@SuppressWarnings("resource")
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheetAt(0);
			for(int i=1;i<=sheet.getLastRowNum();i++) {
				
				XSSFRow row=sheet.getRow(i);
				data.email=row.getCell(0).toString();
				data.password=row.getCell(1).getStringCellValue();
				data.expected_value=row.getCell(2).getStringCellValue();
				
				al.add(data);
				
				
			}
			
			
			
		}
			catch(Exception e) {}
		System.out.println("all");
		System.out.println(al.get(1).email);
		System.out.println(al.get(2).email);
		return al;
		
		
	}
}

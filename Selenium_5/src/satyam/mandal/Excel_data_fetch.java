package satyam.mandal;

import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_data_fetch {
	static File file=new File("Login_data.xlsx");
	
	@SuppressWarnings("null")
	public static ArrayList<Data> fetch_excel_data() {
		ArrayList<Data> al=new ArrayList<Data>();
		
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
			String[][] data_set = new String[al.size()][];
			for (int i = 0; i < al.size(); i++) {
				data_set[i][0]=al.get(i).email;
				data_set[i][1]=al.get(i).password;
				data_set[i][2]=al.get(i).expected_value;
				//return 0;
			}
			
			System.out.println(data_set[0][0]);
			
		}
			catch(Exception e) {}
		//return 0;
		return al;
		
		
	}
}

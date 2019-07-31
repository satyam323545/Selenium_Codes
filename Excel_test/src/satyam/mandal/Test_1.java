package satyam.mandal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_1 {

	/**
	 * @param args
	 */
	static File file=new File("C:\\Users\\satyam.mandal\\Documents\\Test2.xlsx");
	static ArrayList<Student> al=new ArrayList<Student>();
	static Student student=new Student();
	static Student k;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int java=0;
		int sel=0;
	
		
		try {
			FileInputStream input=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheet("Sheet2");
			
			for(int i=1;i<=sheet.getLastRowNum();i++){
				XSSFRow row=sheet.getRow(i);
				for(int j=0;j<row.getLastCellNum();j++){
					XSSFCell cell=row.getCell(j);
					
					if(j==0){
						student.id=(int) cell.getNumericCellValue();
					}
					if(j==1){
						student.name=cell.getStringCellValue();
					}
					if(j==2){
						student.marks1=(int) cell.getNumericCellValue();
						java=student.marks1;
					}
					if(j==3){
						student.marks2=(int) cell.getNumericCellValue();
						sel=student.marks2;
					}
					al.add(student);
					setAverage(java,sel,i);
				}
				k=al.get(i);
				System.out.println(k.id+" "+k.name+" "+k.marks1+" "+k.marks2);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
				e.printStackTrace();
		}
		
//		for(int i=0;i<al.size();i++) {
//			k=al.get(i);
//			System.out.println(k.id+" "+k.name+" "+k.marks1+" "+k.marks2);
//		}
		

	}

	private static void setAverage(int java, int sel, int i) {
		// TODO Auto-generated method stub
		
		try {
			String str;
			FileInputStream input=new FileInputStream(file);
			XSSFWorkbook workbook=new XSSFWorkbook(input);
			XSSFSheet sheet=workbook.getSheet("Sheet2");
			XSSFRow row=sheet.getRow(i);
			XSSFCell cell=row.createCell(4);
			XSSFCell cell1=row.createCell(5);
			int avg=(java+sel)/2;
			if(avg>90){
				str="A";
				cell1.setCellValue(str);				
			}
			else if(avg>80){
				str="B";
				cell1.setCellValue(str);				
			}
			else if(avg>60){
				str="C";
				cell1.setCellValue(str);				
			}
			else if(avg>40){
				str="D";
				cell1.setCellValue(str);				
			}
			else{
				str="F";
				cell1.setCellValue(str);				
			}
			cell.setCellValue(avg);
			FileOutputStream output=new FileOutputStream(file);
			workbook.write(output);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

}

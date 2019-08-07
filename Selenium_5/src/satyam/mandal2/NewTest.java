package satyam.mandal2;


import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	
	Excel_data_fetch excel_data=new Excel_data_fetch();
	Data data=new Data();
	Login_attempt log=new Login_attempt();
	ArrayList<Data> al=new ArrayList<Data>();
	String[][] arr;
	
	
	
	
	
	@Test(dataProvider="logindataprovider")
  public void attempt_login(String eid, String pwd, String er) {
		log.login_attempt(eid,pwd,er);
		
  }
	
	

	@DataProvider(name="logindataprovider")
	public String[][] data_available() {
		al=excel_data.fetch_excel_data();
		arr=new String[al.size()][3];
		
		
		for(int i=0;i<al.size();i++) {
			arr[i][0]=al.get(i).email.toString();
			arr[i][1]=al.get(i).password.toString();
			arr[i][2]=al.get(i).expected_value.toString();
			
		}
		
		return arr;
	}
}

package satyam.mandal;

import org.apache.log4j.Logger;
import org.testng.annotations.*;

public class NewTest {
  
	Logger log;
	
	
	@Test
	public void fun1() {
		log=Logger.getLogger("devpinoyLogger");
		log.info("Function 1 in access");
	}
	
	
	@Test
	public void fun2() {
		log=Logger.getLogger("devpinoyLogger");
		log.info("Function 2 in access");
	}
}

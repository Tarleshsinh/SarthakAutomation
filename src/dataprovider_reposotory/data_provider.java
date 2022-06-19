package dataprovider_reposotory;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_provider {
	// Technically we need to remember 4 things 
	
	
	@Test (dataProvider ="getData") // step 3 - link the test case with the data provider = name of the method in the @Dataprovider annotation 
	public void registernewuser(String user, String browser, String pancard, int userid, String comment) { // step 4 no of input parameters = number of column 
		
	}

	@DataProvider // step 1 - it returns the 2 steps dimensional array 
	public Object [] [] getData(Method name) {
		System.out.println("Test case which has this method is :" + name.getName());
		
		Object [] [] data = new Object [3][5]; // step 2 -enter data as per the rows and column
		
		data [0] [0] = "user1";
		data [0] [1] = "chrome";
		data [0] [2] = "APERE123";
		data [0] [3] = 123;
		data [0] [4] = "abcd";

		data [1] [0] = "user2";
		data [1] [1] = "edge";
		data [1] [2] = "APERE3245";
		data [1] [3] = 456 ;
		data [1] [4] = "abcd";
		
		data [2] [0] = "user3";
		data [2] [1] = "firefox";
		data [2] [2] = "APERE9879";
		data [2] [3] = 789; 
		data [1] [4] = "abcd";
		
		return data;
				
	}
 	
	
}

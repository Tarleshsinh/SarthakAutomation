package dataprovider_reposotory;



import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class Repo_data {

	@DataProvider  
	public  Object [] [] getData(Method name) {
		System.out.println("Test case which has this method is " + name.getName());
		
		
		Object [] [] data = new Object [5][5]; 
		
		data [0] [0] = "user1";
		data [0] [1] = "chrome";
		data [0] [2] = "APERE123";
		data [0] [3] = 123;
		data [0] [4] = "abcd";

		data [1] [0] = "user2";
		data [1] [1] = "edge";
		data [1] [2] = "APERE3245";
		data [1] [3] = 1234;
		data [1] [4] = "abcd";

		data [2] [0] = "user3";
		data [2] [1] = "firefox";
		data [2] [2] = "APERE9879";
		data [2] [3] = 122345;
		data [2] [4] = "abcd";
		
		data [3] [0] = "user3";
		data [3] [1] = "firefox";
		data [3] [2] = "APERE9879";
		data [3] [3] = 789; 
		data [3] [4] = "abcd";

		data [4] [0] = "user3";
		data [4] [1] = "firefox";
		data [4] [2] = "APERE9879";
		data [4] [3] = 789; 
		data [4] [4] = "abcd";
				
		return data;
	}
	
	
	
}

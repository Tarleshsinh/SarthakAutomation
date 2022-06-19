package properties;



import java.io.FileInputStream;
import java.util.Properties;

public class properties {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		//String path = (System.getProperty("user.dir") + "\\src\\properties\\config.properties");
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\properties\\config.properties");
		prop.load(ip);

		
		
		System.out.println(prop.getProperty("url"));	
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		System.out.println(System.getProperty("user.dir"));
		
		
	}

}

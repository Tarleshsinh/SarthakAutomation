package dataprovider_reposotory;

import org.testng.annotations.Test;

public class multiple_test_case {

	@Test(dataProviderClass = Repo_data.class, dataProvider= "getData")
	public void launchURL(String user, String browser, String pancard, int userid, String comment) {
		System.out.println(user+ "---" + browser +"----" + pancard +"----"+ userid);
	}
	
	
	@Test(dataProviderClass= Repo_data.class, dataProvider= "getData")
	public void entercredential(String user, String browser, String pancard, int userid, String comment) {
		System.out.println(user+ "---"+browser+ "----"+ pancard+"----"+ userid);
	}
	
	@Test(dataProviderClass=Repo_data.class, dataProvider="getData")
	public void ValidateLoginHomePage(String user, String browser, String pancard, int userid, String comment) {
		System.out.println(user+"----"+ browser+ "----"+ pancard+"----"+ userid);
	}
	
	@Test(dataProviderClass=Repo_data.class, dataProvider="getData")
	public void Logout(String user, String browser, String pancard, int userid, String comment) {
		System.out.println(user+"---"+browser+"---"+pancard+"----"+userid+"----"+ comment);}
		
	@Test(dataProviderClass=Repo_data.class, dataProvider="getData")
	public void Logout1(String user, String browser, String pancard,  int userid, String comment) {
		System.out.println(user+"---"+browser+"---"+pancard+"----"+userid);}
	
	
}

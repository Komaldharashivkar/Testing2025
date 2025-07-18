package testng;

import org.testng.annotations.Test;

public class GroupDependency {
	@Test(groups = "viewacc")
	public void ViewAcc() {
		System.out.println("View your Dashboard");
	}
	
	@Test(groups = "openbrowser")
	public void OpenBrowser() {
		System.out.println("Browser opened successfully");
	}
	
	@Test(groups = "login")
	public void LogIn() {
		System.out.println("Login into the account");
	}
	
	@Test(groups = "logout")
	public void CloseAccount() {
		System.out.println("Closing the account");
	}

}

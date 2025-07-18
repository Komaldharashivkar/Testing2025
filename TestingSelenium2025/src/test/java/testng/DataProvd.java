package testng;

import org.testng.annotations.DataProvider;

public class DataProvd {
	
	@DataProvider(name="logintest")
	  public Object[][] dp() {
	    return new Object[][] {{"komal@gmail.com", "komal@1234"},
	    					   {"8788543210", "pass@123"},
	    					   {"qbcf@gmail.com", "guip@3425"},
	    					   {"9967554939", "ggodday@67"}};
	  }

}

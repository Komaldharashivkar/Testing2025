package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTest {
  @Test
  public void first() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://utkarshaaacademy.com");
	  driver.manage().window().maximize();
	  
	  String ExpectedTitle = "Software Testing";
	  String ActualTitle = driver.getTitle();
	  //SoftAssert or verify(if we found any error then it execute below lines of codes)
	  SoftAssert sassert = new SoftAssert();
	  sassert.assertEquals(ActualTitle, ExpectedTitle);
	  
	  // Hard Assert or Default Assert(if we found any error then it skips below lines of codes)
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  Reporter.log("We have successfully visited the site",true);
	  sassert.assertAll();
  }
}

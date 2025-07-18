package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void first() {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://utkarshaaacademy.com");
	  driver.manage().window().maximize();
	  Reporter.log("We have successfully visited the site",true);
	  
  }
}

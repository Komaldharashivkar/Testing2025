package testng;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderTest {
  @Test(dataProvider = "logintest", dataProviderClass = DataProvd.class)
  public void Login(String uname, String pword) {
	  
	  WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
		
		username.sendKeys(uname);
		password.sendKeys(pword);
		loginbtn.click();
  }

  //@DataProvider(name="logintest")
  //public Object[][] dp() {
   // return new Object[][] {{"komal@gmail.com", "komal@1234"},{"8788543210", "pass@123"},
    //};
 // }
}

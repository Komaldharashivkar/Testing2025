package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Pages.LoginPage;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {
	
	WebDriver driver;
	LoginPage lpage;
  @Test
  public void loginfb() {
	  lpage = new LoginPage(driver);
	  lpage.login("komal", "pass@word12");
  }
  @BeforeTest
  public void beforeTest() {
	    
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}

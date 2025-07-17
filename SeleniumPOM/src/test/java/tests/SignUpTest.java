package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.SignUpPage;



public class SignUpTest {

	WebDriver driver;
	SignUpPage spage;
  @Test
  public void loginfb() {
	  spage = new SignUpPage(driver);
	  spage.CreateAccount("Komal", "Dharashivkar","9970554890","pass@word123");
	
  }
  @BeforeTest
  public void beforeTest() {
	    
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}

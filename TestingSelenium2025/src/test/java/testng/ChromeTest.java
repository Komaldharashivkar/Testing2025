package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	
	// if we want to run one method multiple times we can use invocationCount = 2 
	//in separate thread within the duration timeOut = 1000000
			
	WebDriver driver;
	
	@Test(invocationCount = 2, threadPoolSize = 2)
	  public void chrome() {
		  System.out.println("Thread Id for chrome is :" +Thread.currentThread().getId());
		  driver = new ChromeDriver();
		  driver.get("https://utkarshaaacademy.com");
		  driver.quit();
	  }
}

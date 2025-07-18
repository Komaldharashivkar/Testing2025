package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeTest {
	WebDriver driver;
	 @Test(invocationCount = 2, threadPoolSize = 2)
	  public void Edge() {
		  
		  System.out.println("Thread Id for Edge is :" +Thread.currentThread().getId());
		  driver = new EdgeDriver();
		  driver.get("https://utkarshaaacademy.com");
		  driver.quit();
	  }
}

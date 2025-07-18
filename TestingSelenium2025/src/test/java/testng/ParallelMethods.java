package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelMethods {
	public WebDriver driver;
	  @Test
	  public void chrome() {
		  System.out.println("Thread Id for chrome is :" +Thread.currentThread().getId());
		  driver = new ChromeDriver();
		  driver.get("https://utkarshaaacademy.com");
		  driver.quit();
	  }
	  
	  @Test
	  public void Edge() {
		  
		  System.out.println("Thread Id for Edge is :" +Thread.currentThread().getId());
		  driver = new EdgeDriver();
		  driver.get("https://utkarshaaacademy.com");
		  driver.quit();
	  }
}

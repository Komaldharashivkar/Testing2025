package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentGroups {
public WebDriver driver;
	
	// defult priority is 0 for all methods and at that it execute as per the alplhates at first
	  @Test(groups = "smoke")
	  public void startingPoint() {
		  
		  driver = new ChromeDriver();
		  driver.get("https://www.google.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  
	  @Test(dependsOnGroups =  "smoke")
	  public void checkTitle() {
		  
		  String testTitle = "Google";
		  String originalTitle = driver.getTitle();
		  Assert.assertEquals(originalTitle, testTitle);
	  }
	  
	  @Test(priority = 1)
	  public void click_element() {
		  
		  driver.findElement(By.xpath("//a[@aria-label='Gmail ']")).click();
		  System.out.println("Page heading is displayed");
	  }
	  
}

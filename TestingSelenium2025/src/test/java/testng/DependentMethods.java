package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(ListenersTest.class)
public class DependentMethods {
	
public WebDriver driver;
	
	// defult priority is 0 for all methods and at that it execute as per the alplhates
	  @Test
	  public void startingPoint() {
		  
		  driver = new ChromeDriver();
		  driver.get("https://www.google.com");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  
	  @Test(dependsOnMethods = "startingPoint")
	  public void checkTitle() {
		  
		  String testTitle = "Google";
		  String originalTitle = driver.getTitle();
		  Assert.assertEquals(originalTitle, testTitle);
	  }
	  
	  @Test(dependsOnMethods = "checkTitle")
	  public void click_element() {
		  
		  driver.findElement(By.xpath("//a[@aria-label='Gmail ']")).click();
		  System.out.println("Page heading is displayed");
	  }
	  
	  @Test 
		public void SkipTest() {
			throw new SkipException("Skipping The Test Method ");
		}
	  
	  private int i = 1;

		@Test (successPercentage = 60, invocationCount = 3) //Failing Within Success
		public void AccountTest() {
				if(i < 2)
					Assert.assertEquals(i , i);
			i++;
		}
	  
}

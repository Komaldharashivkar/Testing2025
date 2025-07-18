package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	
	public WebDriver driver;
	
  @Test(groups = {"sanity","regression"})
  public void StartingPoint() {
	  
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  
  @Test(groups = "sanity")
  public void checkTitle() {
	  
	  String testTitle = "Google";
	  String originalTitle = driver.getTitle();
	  Assert.assertEquals(originalTitle, testTitle);
  }
  
  @Test(groups = "regression")
  public void click_element() {
	  
	  driver.findElement(By.xpath("//a[@aria-label='Gmail ']")).click();
	  System.out.println("Page heading is displayed");
  }
  
}

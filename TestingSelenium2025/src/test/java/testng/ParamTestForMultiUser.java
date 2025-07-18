package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTestForMultiUser {
	
  @Test
  @Parameters({"username", "password"})
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
  
}

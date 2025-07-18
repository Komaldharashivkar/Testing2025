package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrosBrowserTesting {
	
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
  public void beforeclass(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}	
	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
	
	@Test
	public void login() {
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
		
		username.sendKeys("9976805437");
		password.sendKeys("Password@1234");
		loginbtn.click();
	}
	
	@AfterClass
	public void afterclass() {
		
		driver.quit();
	}
	
	
}

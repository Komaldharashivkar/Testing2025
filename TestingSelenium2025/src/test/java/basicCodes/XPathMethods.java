package basicCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathMethods {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//WebElement username = driver.findElement(By.id("email"));
		//WebElement password = driver.findElement(By.id("pass"));
		
		WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy' and @name='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6lub' or @name='pass']"));
		
		username.sendKeys("komal.dharashivkar");
		password.sendKeys("komal@123");
		
		WebElement ForgotPassword = driver.findElement(By.xpath("//a[text() = 'Forgotten password?']"));
		ForgotPassword.click();
		
		WebElement ForgotPassword1 = driver.findElement(By.xpath("//a[contains(text(),'password?')]"));
		ForgotPassword1.click();
		
		WebElement ForgotPassword2 = driver.findElement(By.xpath("//a[starts-with(@id, 'u_0_6')]"));
		ForgotPassword2.click();
		
		WebElement ForgotPassword3 = driver.findElement(By.xpath("//a[contains(@href, 'initiate')]"));
		ForgotPassword3.click();
		

		

	}
}


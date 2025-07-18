package basicCodes;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\TestingSelenium2025\\resources\\config.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		driver.get(prop.getProperty("url"));
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		

	}

}

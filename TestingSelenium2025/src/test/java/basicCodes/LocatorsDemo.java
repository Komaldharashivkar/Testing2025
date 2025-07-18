package basicCodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		
		username.sendKeys("komal.dharashivkar");
		password.sendKeys("komal@123");
		
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
		
		WebElement loginbtn1 = driver.findElement(By.tagName("button"));
		loginbtn.click();
		
		WebElement forgettenPass = driver.findElement(By.linkText("Forgotten password?"));
		forgettenPass.click();
		
		//WebElement forgettenPass1 = driver.findElement(By.partialLinkText("Forgotten"));
		//forgettenPass1.click();
		
		//To find count of links/tags on page
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link : links) {
			System.out.println(link.getText());
		}
	}

}

package basicCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		WebElement Searchbox = driver.findElement(By.className("gLFyf"));
		
		WebElement Searchbox1 = driver.findElement(By.id("APjFqb"));
		
		WebElement Searchbox2 = driver.findElement(By.name("q"));
		
		// Relative Xpath --> // tagname[@attribute ='value']
		// Absolute xPath --> /html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[1]/div[2]/textarea[1]
		
		WebElement Searchbox3 = driver.findElement(By.xpath("//textarea[@class ='gLFyf']"));
		
		 WebElement Searchbox4 = driver.findElement(By.xpath("//textarea[@aria-label='Search']"));
		
		// css selector --> tagname[attribute ='value']
		
		WebElement Searchbox5 = driver.findElement(By.cssSelector("textarea[aria-label='Search']"));
		

		Searchbox.sendKeys("Sindoor");
	}

}

package basicCodes;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String MainWindow = driver.getWindowHandle();   //Handles main window
		
		WebElement Services = driver.findElement(By.xpath("//div[text() = 'Services']"));
		Services.click();
		
		Set<String> ChildWindows = driver.getWindowHandles(); // Handles child windows
		
		for(String ChildWindow: ChildWindows) {
			if(!MainWindow.equals(ChildWindow)){
				driver.switchTo().window(ChildWindow);
				
				WebElement KnowMore = driver.findElement(By.xpath("//div[@class='media-card layer resumeSpotlight']//div[@class='knowMore']"));
				KnowMore.click();	
			}
			
			driver.switchTo().window(MainWindow);
		}		
		
		driver.close(); // to close single window
		driver.quit();
	}

}

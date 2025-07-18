package basicCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String MainWindow = driver.getWindowHandle();
		
		WebElement globalsqa = driver.findElement(By.name("globalSqa"));
		driver.switchTo().frame("globalSqa");  // switch to frame within the webpage by name or Id
		//driver.switchTo().frame(3);  // by index
		//driver.switchTo().frame(globalsqa); // by webelement
			
		WebElement SeleniumOnlineTrain = driver.findElement(By.xpath("//img[@alt='Selenium Online Training']"));
		SeleniumOnlineTrain.click();
		
		//driver.switchTo().parentFrame(); //switch to parent frame 
		driver.switchTo().window(MainWindow); // switch to webpage from frame
		
		
		WebElement DraggableBox= driver.findElement(By.xpath("//div[@class='menu-interaction-container']//span[text()='Draggable Boxes']"));
		DraggableBox.click();

	}

}

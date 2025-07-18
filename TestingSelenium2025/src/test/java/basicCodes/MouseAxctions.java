package basicCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAxctions {

	public static void main(String[] args) {

 
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act = new Actions(driver);
		
		WebElement Forms = driver.findElement(By.xpath("//div[text()='Forms']"));
		WebElement DoubleClickbtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClickbtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement DynamicClickbtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		WebElement ToolsQAImange = driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg\']"));
		
		
		act.scrollToElement(Forms).perform();
		act.doubleClick(DoubleClickbtn).perform();
		act.contextClick(RightClickbtn).perform();
		act.click(DynamicClickbtn).perform();
		act.scrollToElement(ToolsQAImange).perform();
		
		driver.get("https://demoqa.com/menu");
		WebElement MainMenu2 = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		act.moveToElement(MainMenu2).perform();
		
		driver.get("https://demoqa.com/droppable");
		WebElement Dragable = driver.findElement(By.xpath("//span[text()='Dragabble']"));
		WebElement Dragme = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Drophere = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		
		act.scrollToElement(Dragable).perform();
		act.dragAndDrop(Dragme, Drophere).perform();
		
		
		
		
	}

}

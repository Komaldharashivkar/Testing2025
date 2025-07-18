package basicCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions act = new Actions(driver);
		
		//WebElement Interactions = driver.findElement(By.xpath("//div[text()='Interactions']"));
		//act.scrollToElement(Interactions).perform();
		
		WebElement Widgets = driver.findElement(By.xpath("//div[text()='Widgets']"));
		act.scrollToElement(Widgets).perform();
		
		
		WebElement FullName = driver.findElement(By.xpath("//input[@id='userName']"));
		act.sendKeys(FullName, "Komal Dharashivkar").perform();
		
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		//act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("komal.dharashvkar@gmail.com").perform();
		
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		
		act.sendKeys("A/P Urawade Near ZP School Tal-Mulshi Dist-Pune").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		act.keyUp(Keys.CONTROL).perform();
		
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		
		act.sendKeys(Keys.ENTER).perform();
		

	}

}

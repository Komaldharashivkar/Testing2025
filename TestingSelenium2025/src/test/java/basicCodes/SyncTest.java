package basicCodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SyncTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		// implicit wait --> Global wait --> dynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Explicit wait --> by using WebdriverWait class
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		//Explicit wait --> by using Fluentwait class
		FluentWait wait = new FluentWait(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoAlertPresentException.class);
		
		WebElement TimerAlertBtn = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		TimerAlertBtn.click();
		//Thread.sleep(7000); --> static method provided by java
		
		//wait.until(ExpectedConditions.alertIsPresent()).accept();
		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();

	}

}

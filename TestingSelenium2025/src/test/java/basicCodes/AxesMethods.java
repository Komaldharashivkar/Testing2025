package basicCodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//parent + following sibling + child
		List<WebElement> homeapp = driver.findElements(By.xpath("//h2[text() = 'Appliances for your home | Up to 55% off']//parent::div//following-sibling::div//span"));
		for(WebElement home:homeapp) {
			
			System.out.println(home.getText());
		}
		
		WebElement SearchBox = driver.findElement(By.xpath("//input[@name='field-keywords']"));
		SearchBox.sendKeys("mobiles");
		
		WebElement SearchBtn = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		SearchBtn.click();
		
		//child Axes method
		//WebElement VivoCheckBox = driver.findElement(By.xpath("//a[@aria-label='Apply the filter VIVO to narrow results']//child::i"));
		//VivoCheckBox.click();
		
		// preceding sibling + child
		WebElement VivoCheckBox = driver.findElement(By.xpath("//span[text()='VIVO']//preceding-sibling:: div//i"));
		VivoCheckBox.click(); 
		
			
		
		
	}

}

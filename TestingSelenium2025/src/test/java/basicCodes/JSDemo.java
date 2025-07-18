package basicCodes;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSDemo {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//js.executeScript("window.location= 'https://www.facebook.com/'");
		
		js.executeScript("window.location= 'https://www.naukri.com/'");
		WebElement element = driver.findElement(By.xpath("//h2[text()='Top companies hiring now']"));
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		//js.executeAsyncScript(null, args)  --> for fast loading of webpage and used in performanace testing
		
		/*js.executeScript("window.location= 'https://www.facebook.com/'");
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pass']"));
		
		// document.getElementById method
		js.executeScript("document.getElementById('email').value='komal.daharshivkar@gmail.com'");
		
		// arguments[0].value method
		js.executeScript("arguments[0].value='komal.daharshivkar@gmail.com'", username);
		js.executeScript("arguments[0].value='komal@123'", password);
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
		
		// arguments[0].click() method
		js.executeScript("arguments[0].click()", loginbtn);
		
		// alert method 
		js.executeScript("alert('Welcome to Selenium Testing')");
		driver.switchTo().alert().accept();
		
		// reload page method
		js.executeScript("history.go(0)");
		
		// to print text data from webpage
		String innerText = js.executeScript("return document.documentElement.innerText").toString();
		System.out.println(innerText);
		
		// to print title of webpage
		String titleText = js.executeScript("return document.title").toString();
		System.out.println(titleText);
		
		// to print domainName
		String domainName = js.executeScript("return document.domain").toString();
		System.out.println(domainName);
		
		// to print domainName
		String url = js.executeScript("return document.URL").toString();
		System.out.println(url);
		
		// to print height & width
		String innerheight = js.executeScript("return window.innerHeight").toString();
		String innerwidth = js.executeScript("return window.innerWidth").toString();
		
		System.out.println(innerheight);
		System.out.println(innerwidth);
		
		// to scroll the webpage
		js.executeScript("window.scrollBy(0,500)");*/
		
		
		
		
	}

}

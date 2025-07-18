package basicCodes;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {

		//WebDriver driver = new EdgeDriver();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String url = "https://www.utkarshaaacademy.com";
		
		System.out.println(driver.manage().window().getSize());
		
		driver.manage().window().maximize();
		
		driver.manage().window().setSize(new Dimension(360, 740));
		
		driver.manage().window().fullscreen();
		
		driver.navigate().to(url);
		
		driver.navigate().to("https://www.selenium.dev");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
	    driver.close();

	}

}

package basicCodes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemo {

	public static void main(String[] args) {

       WebDriver driver = new ChromeDriver();
       driver.get("https://www.saucedemo.com");
       driver.manage().window().maximize();
       
       WebElement username = driver.findElement(By.id("user-name"));
       WebElement password = driver.findElement(By.id("password"));
       
       username.sendKeys("standard_user");
	   password.sendKeys("secret_sauce");
	   
	   WebElement loginbtn = driver.findElement(By.id("login-button"));
	   loginbtn.click();
	   
	   WebElement addtocart = driver.findElement(By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']"));
	   addtocart.click();
	   
	 //button[@id = 'add-to-cart-sauce-labs-backpack']
	 //div[text() = 'Sauce Labs Backpack']


	}

}

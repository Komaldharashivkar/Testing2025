package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	// By using POM
	//By UserName = By.xpath("//input[@name='email']");
	//By Password = By.xpath("//input[@name='pass']");
	//By LoginBtn = By.xpath("//button[@name='login']");
	
	// By using Page Factory with POM
	@FindBy(xpath = "//input[@name='email']")
	WebElement UserName;
	
	@FindBy(xpath = "//input[@name='pass']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@name='login']")
	WebElement LoginBtn;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void login(String username, String password) {
		
		UserName.sendKeys(username);
		Password.sendKeys(password);
		LoginBtn.click();
		
	}
}

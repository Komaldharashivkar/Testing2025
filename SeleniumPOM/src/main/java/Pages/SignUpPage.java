package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver driver;
	
	//By using POM
	//By FirstName = By.name("firstname");
	//By LastName = By.name("lastname");
	//By MobNumber = By.name("reg_email__");
	//By NewPassword = By.name("reg_passwd__");
	
	// By using Page factory with POM
	@FindBy(name = "firstname")
	WebElement FirstName;
	
	@FindBy(name = "lastname")
	WebElement LastName;
	
	@FindBy(name = "reg_email__")
	WebElement MobNumber;
	
	@FindBy(name = "reg_passwd__")
	WebElement NewPassword;
	public SignUpPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

	public void CreateAccount(String firstName, String lastName, String mobNumber, String newPassword) {
		
		FirstName.sendKeys(firstName);
		LastName.sendKeys(lastName);
		MobNumber.sendKeys(mobNumber);
		NewPassword.sendKeys(newPassword);
	}
}

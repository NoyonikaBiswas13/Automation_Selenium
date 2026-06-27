package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(xpath="//input[@name='Email']")
	private WebElement Email;
		
	
	@FindBy(xpath="//input[@name='Password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement LoginButton;
		
//Initialization
public LoginPage(WebDriver driver) {
PageFactory.initElements(driver,this);
}

//calling getter methods
public WebElement getEmail() {
return Email;
}
public WebElement getPassword() {
return Password;
}
public WebElement getLoginButton() {
return LoginButton;
}
}

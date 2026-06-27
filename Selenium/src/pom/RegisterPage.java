package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(xpath="//label[text()='Gender:']")
	private WebElement Gender;
		
	
	@FindBy(xpath="//input[text()='First name:']")
	private WebElement FirstName;
	
	@FindBy(xpath="//input[text()='Last name:']")
	private WebElement LastName;
	
	@FindBy(xpath="//input[text()='Email:']")
	private WebElement Email;
	
	@FindBy(xpath="//input[text()='Password:']")
	private WebElement Password;
	
	@FindBy(xpath="//input[text()='Confirm password:']")
	private WebElement Confirmpassword;
		
	@FindBy(xpath="//input[@name='register-button']")
	private WebElement Registerbutton;
//Initialization
	
public RegisterPage(WebDriver driver) {
PageFactory.initElements(driver,this);
}

//calling getter methods
public WebElement getGender() {
return Gender;
}
public WebElement getFirstName() {
return FirstName;
}
public WebElement getLastName() {
return LastName;
}
public WebElement getEmail() {
return Email;
}
public WebElement getPassword() {
return Password;
}
public WebElement getConfirmpassword() {
return Confirmpassword;
}
public WebElement getRegisterbutton() {
return Registerbutton;
}
}

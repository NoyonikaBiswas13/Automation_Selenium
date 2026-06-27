package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	//Declaration(Register)
	@FindBy(linkText="Register")
	private WebElement regLink;
	
	//Declaration(Login)
	@FindBy(linkText="Log in")
	private WebElement LogLink;
		
	//Declaration(search tf)
	@FindBy(xpath="//input[@value='Search store']")
	private WebElement Search;
			
	//Declaration(search button)
	@FindBy(xpath="//input[@value='Search']")
	private WebElement button;
					
	//Initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//calling getter methods
	public WebElement getRegLink() {
		return regLink;
		
	}
	public WebElement getLogLink() {
		return LogLink;
	}
	public WebElement getSearch() {
		return Search;
	}
	public WebElement getbutton() {
		return button;
	}
	
}

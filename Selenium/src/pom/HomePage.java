package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	@FindBy(partialLinkText=("COMPUTERS"))
	private WebElement Computers;
	
	@FindBy(partialLinkText=("ELECTRONICS"))
	private WebElement Electronics;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);

	}

}
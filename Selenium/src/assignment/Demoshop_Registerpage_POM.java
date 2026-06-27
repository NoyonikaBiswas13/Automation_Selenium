package assignment;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pom.RegisterPage;

public class Demoshop_Registerpage_POM {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("url");
	
	RegisterPage rp=new RegisterPage(driver);
	rp.getGender().click();
	rp.getFirstName().sendKeys("firstname");
	rp.getLastName().sendKeys("lastname");
	rp.getEmail().sendKeys("email");
	rp.getPassword().sendKeys("password");
	rp.getConfirmpassword().sendKeys("confirmpassword");
	rp.getRegisterbutton().click();
	
}
}

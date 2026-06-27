package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("url");
	
	WelcomePage wp=new WelcomePage(driver);
	wp.getLogLink().click();
	
	LoginPage lp=new LoginPage(driver);
	lp.getEmail().sendKeys("email");
	lp.getPassword().sendKeys("password");
	lp.getLoginButton().click();

}
}
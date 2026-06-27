package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class toLearnHardAssert {

@Test	
	public void login() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("Log in")).click();
	
	
	Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login","Login page is Displayed");
	Reporter.log("Login page is displayed",true);
	
	driver.findElement(By.id("Email")).sendKeys("virat18rcb@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("virat@rcb");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	
	Assert.assertEquals(driver.getCurrentUrl(), "Demo Web Shop", "Home page is not Displayed");
	Reporter.log("Home page is displayed",true);
	Reporter.log("Home page is displayed",true);
	
}
}

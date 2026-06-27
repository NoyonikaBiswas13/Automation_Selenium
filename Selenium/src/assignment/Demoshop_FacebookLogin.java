package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoshop_FacebookLogin {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	Set<String> windowid = driver.getWindowHandles();
	for(String id :windowid) {
		driver.switchTo().window(id);
		String url=driver.getCurrentUrl();
		if(url.equals("https://www.facebook.com/nopCommerce")) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("noyo12345@gmail.com");
			driver.findElement(By.xpath("(//input[@name='pass'])[2]")).sendKeys("12345noyo");
			
		}
	}	
}
}

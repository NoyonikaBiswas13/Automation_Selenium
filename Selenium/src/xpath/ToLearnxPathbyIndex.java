package xpath;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnxPathbyIndex {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.findElement(By.xpath("//a[text()='Twitter']")).click();
	Set<String> windowid = driver.getWindowHandles();
	for(String id :windowid) {
		driver.switchTo().window(id);
		String url=driver.getCurrentUrl();
		if(url.equals("https://x.com/nopCommerce")) {
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Create account']")).click();
			driver.findElement(By.xpath("//input[@name='username_or_email']")).sendKeys("noyo1234@gmail.com");
			
			
				
		}
	}
	
}
}

	


package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(2000);
		WebElement text=driver.findElement(By.xpath("//span[contains(text(),'The login information you entered is incorrect. ')]"));
		System.out.println(text.getTagName());
	
		
	}

}

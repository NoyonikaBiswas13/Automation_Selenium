package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram_isDisplayed {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("noyo@gmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("noyo12345",Keys.ENTER);

		boolean status = driver.findElement(By.xpath("//span[text()='Log in']")).isDisplayed();
		System.out.println(status);
	
	}
}
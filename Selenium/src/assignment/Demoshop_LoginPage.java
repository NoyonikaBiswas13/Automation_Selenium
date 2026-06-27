package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoshop_LoginPage {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.name("Email")).sendKeys("noyo@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("noyo12345");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.linkText("Forget password")).click();
				
	}

}

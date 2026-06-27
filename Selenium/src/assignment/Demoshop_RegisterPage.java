package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoshop_RegisterPage {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Nayonika");
		driver.findElement(By.name("LastName")).sendKeys("Biswas");
		driver.findElement(By.name("Email")).sendKeys("Noyo12345@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("noyo12345");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("noyo12345");
	}

}

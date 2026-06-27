package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClear {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement un=driver.findElement(By.xpath("//input[@id='username']"));
		un.clear();
		un.sendKeys("noyonika");
		
		WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		pwd.sendKeys("noyo12345");
	}
}

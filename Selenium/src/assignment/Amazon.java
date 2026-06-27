package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("iPhone 17 Pro 256 GB");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	List<WebElement> names=driver.findElements(By.xpath("//span[contains(text(),'iPhone 17 Pro 256 GB ')]"));
	System.out.println(names.size());
	for(WebElement ele : names) {
		String brandname =ele.getText();
		System.out.println(brandname);		
	}
		
}
}

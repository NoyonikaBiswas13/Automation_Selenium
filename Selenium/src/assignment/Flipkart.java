package assignment;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search for Products')]")).sendKeys("iphone 17 pro max",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Bank Offer']")).click();
		Thread.sleep(2000);
		
		Set<String>windows =driver.getWindowHandles();
		for(String win:windows)
		{
			driver.switchTo().window(win);
		}
	List<WebElement>discount=driver.findElements(By.xpath("//h1[contains(text(),'realme'])/../../../../../../../../../../../..//div[text()='27%']"));	
	for(WebElement FirstProductDiscount:discount) {
		System.out.println(FirstProductDiscount.getText());
			
	}
				
}
}

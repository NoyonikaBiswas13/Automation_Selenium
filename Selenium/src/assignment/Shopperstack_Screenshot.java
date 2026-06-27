package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Shopperstack_Screenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String time= LocalDateTime.now().toString().replace(":", "-");
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.xpath("//span[text()='NYKAA']")).click();
	
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']"));
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File perm =new File("./Screenshot/"+time+".png");
		FileHandler.copy(temp, perm);
		driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("500001");
		String text=driver.findElement(By.xpath("//a[text()='Check deliverable pins.']")).getText();
		System.out.println(text);
		
		driver.quit();
}
}
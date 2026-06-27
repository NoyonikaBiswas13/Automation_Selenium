package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Globalsqa {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame("aswift_1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']")).click();

		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//img[contains(@alt,'Green mountain lake')]"));
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
		act.dragAndDrop(source, target).perform();
		
		
		WebElement ele = driver.findElement(By.xpath("//div[@id='trash']"));
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File perm =new File("./Screenshot/trash.png");
		FileHandler.copy(temp, perm);
		
		driver.quit();
		
}
}
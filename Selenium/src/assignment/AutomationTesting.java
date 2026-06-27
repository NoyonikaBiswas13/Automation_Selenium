package assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AutomationTesting {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		//switch into frame
		driver.switchTo().frame("singleframe");	
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Selenium");
		
		//screenshot of textbox(Selenium)
		WebElement ele = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		File temp = ele.getScreenshotAs(OutputType.FILE);
		File perm =new File("./Screenshot/Selenium.png");
		FileHandler.copy(temp, perm);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.partialLinkText("Iframe with in an Iframe")).click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Automation");
		
		
		//screenshot of textbox(Automation)
				WebElement ele1 = driver.findElement(By.xpath("//input[@type='text']"));
			File temp1 = ele1.getScreenshotAs(OutputType.FILE);
			File perm1 =new File("./Screenshot/Automation.png");
			FileHandler.copy(temp1, perm1);
				
			driver.switchTo().defaultContent();		
		
		driver.quit();

}
}
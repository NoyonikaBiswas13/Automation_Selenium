package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnHiddenPopups {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");	
		
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

}
}


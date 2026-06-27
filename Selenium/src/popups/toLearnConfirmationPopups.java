package popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnConfirmationPopups {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		
		//clicking on checkboxes
		List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement ele:checkboxes)
		{
			ele.click();
		}
		
		//clicking on delete button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='deleteButton']")).click();
		
		//clicking on cancel button
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		
}
}
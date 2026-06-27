package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnClickAndHold {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://yonobusiness.sbi.bank.in/yonobusinesslogin");
		
		//to close the popup
		driver.findElement(By.xpath("//span[contains(@class,'icon-cancel')]")).click();
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("yono12345",Keys.ENTER);		
		WebElement eyeIcon = driver.findElement(By.xpath("//*[contains(@src,'icon_eye_close')]"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(eyeIcon).pause(4000).release().perform();
			
	}
}
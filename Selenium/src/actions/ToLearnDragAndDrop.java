package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.automationtesting.in/Static.html");
		
		
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//img[@src='logo.png']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droparea']"));
		act.dragAndDrop(source, target).perform();
		
		
		driver.quit();
	}
}

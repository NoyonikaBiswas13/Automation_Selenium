package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectMultipleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/noyo1/OneDrive/Desktop/multipledropdown.html");
		List<WebElement> dropdown1 =driver.findElements(By.id("Countries"));
		Select sel =new Select ((WebElement) dropdown1);
		
		sel.selectByIndex(3);
		sel.selectByValue("8");
		sel.selectByVisibleText("Australia");
	
		//to deselect
		sel.deselectByIndex(3);
		sel.deselectByValue("8");
		sel.deselectByVisibleText("Australia");
		sel.deselectAll();
}
}

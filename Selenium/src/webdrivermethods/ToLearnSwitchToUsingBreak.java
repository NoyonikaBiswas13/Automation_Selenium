package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchToUsingBreak {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shoppersstack.com/products_page/51");
	Thread.sleep(3000);
	driver.findElement(By.id("compare")).click();
	
	Set<String> allWinIds=driver.getWindowHandles();
	for(String id: allWinIds) {
		driver.switchTo().window(id);
		String url =driver.getCurrentUrl();
		if(url.equals("https://www.flipkart.com/")) {
		break;
		}
}
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	driver.manage().window().fullscreen();
	Thread.sleep(2000);
	driver.quit();
}
}

package webelementsmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetattribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("count of links:"+links.size());
		for(WebElement ele:links) {
			System.out.println("names of the link is :"+ele.getText());
			System.out.println("url of the link is :"+ele.getAttribute("href"));
		}
driver.quit();
}
}

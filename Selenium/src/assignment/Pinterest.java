package assignment;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pinterest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.pinterest.com/");
		Thread.sleep(3000);
		boolean status =driver.findElement(By.xpath("//div[@data-test-id='pinterest-logo-home-button']")).isDisplayed();
		System.out.println(status);
		
		List<WebElement>images=driver.findElements(By.tagName("img"));
		System.out.println("count of images:"+images.size());
		for(WebElement img:images) {
			String src=img.getAttribute("src");
		System.out.println("source of the images is :"+img.getAttribute(src));
		}
driver.quit();
		
}
}

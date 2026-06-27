package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnChildWindowPopups {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/54");
		Thread.sleep(3000);
		driver.findElement(By.id("compare")).click();
		
		Set	<String>allWinIds=driver.getWindowHandles();
		for(String id:allWinIds) {
			driver.switchTo().window(id);
			
			String url =driver.getCurrentUrl();
			if(url.equals("https://www.flipkart.com/")) {
				driver.close();
			}
			else if(url.equals("https://www.amazon.in/")) {
				driver.close();		
		}
			else if (url.equals("www.ebay.com/")) {
				driver.close();
			}
		}
}
}
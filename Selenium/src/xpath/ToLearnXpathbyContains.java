package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathbyContains {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("(//input[contains(@title,'Search')])[1]")).sendKeys("medicines");
		driver.findElement(By.xpath("//span[@role='button']")).click();

		//driver.get("https://demowebshop.tricentis.com/");
		//String text=driver.findElement(By.xpath("(//div[contains(text(),'Tricentis')])[2]")).getText();
		//System.out.println(text);
}
}
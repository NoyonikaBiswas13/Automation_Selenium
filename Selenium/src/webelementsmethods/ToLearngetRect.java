package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetRect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(3000);
		Rectangle values=driver.findElement(By.xpath("//input[@value='Subscribe']")).getRect();
		System.out.println(values.getHeight());
		System.out.println(values.getWidth());
		System.out.println(values.getX());
		System.out.println(values.getY());

}
}
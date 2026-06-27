package webelementsmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearngetLocation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Point coordinates=driver.findElement(By.xpath("(//input[@type='button'])[2]")).getLocation();
		System.out.println(coordinates.getX());
		System.out.println(coordinates.getY());
		

}
}

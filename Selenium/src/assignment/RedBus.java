package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//launch app in maximize method
		driver.manage().window().maximize();
		
		//verify whether welcome page is displayed or not
		String url =driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("https://www.redbus.in/")) {
			System.out.println("Welcome page is displayed");
		}else {
			System.out.println("Welcome page is not displayed");
		}
		
		//capture source code of an app
		driver.get("https://www.redbus.in/");
		String code = driver.getPageSource();
		System.out.println(code);
		
		//capture height & width of app
		driver.get("https://www.redbus.in/");
		Dimension size =driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());	
		
		//capture position of app
		driver.get("https://www.redbus.in/");
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		//close the app
			driver.get("https://www.redbus.in/");
			Thread.sleep(10000);
			driver.close();
		
	}

}

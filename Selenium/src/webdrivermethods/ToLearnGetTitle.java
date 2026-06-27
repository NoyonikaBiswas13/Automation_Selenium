package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//Amazon Great Summer Sale 2026
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.equals("Amazon Great Summer Sale 2026"));
		System.out.println("Welcome page is displayed");
	}

}

package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnxPathbyAxis {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/noyo1/OneDrive/Desktop/Movie_Table.html");
		
		WebElement c1=driver.findElement(By.xpath("//td[text()=' Dhurandhar ']/following-sibling::td[2]"));
		WebElement c2=driver.findElement(By.xpath("//td[text()=' Dhurandhar ']/following-sibling::td[1]"));
		WebElement c3=driver.findElement(By.xpath("//td[text()=' Dhurandhar ']/preciding-sibling::td[1]"));
		
		
		WebElement a1=driver.findElement(By.xpath("//td[text()=' Toxic ']/following-sibling::td[2]"));
		WebElement a2=driver.findElement(By.xpath("//td[text()=' Toxic ']/following-sibling::td[1]"));
		WebElement a3=driver.findElement(By.xpath("//td[text()=' Toxic ']/preciding-sibling::td[1]"));
		
		WebElement b1=driver.findElement(By.xpath("//td[text()=' Youth ']/following-sibling::td[2]"));
		WebElement b2=driver.findElement(By.xpath("//td[text()=' Youth ']/following-sibling::td[2]"));
		WebElement b3=driver.findElement(By.xpath("//td[text()=' Youth ']/preciding-sibling::td[1]"));
		
		
		System.out.println("Collection of Dhurandhar is:"+c3.getText());
		System.out.println("Collection of Dhurandhar is:"+c1.getText());
		System.out.println("IMDB Ratings of Dhurandhar is:"+c2.getText());
		System.out.println("Collection of Toxic is:"+a3.getText());
		System.out.println("Collection of Toxic is:"+a1.getText());
		System.out.println("IMDB Ratings of Toxic is:"+a2.getText());
		System.out.println("Collection of Toxic is:"+b3.getText());
		System.out.println("Collection of Youth is:"+b1.getText());
		System.out.println("IMDB Ratings of Youth is:"+b2.getText());
				
	}
	
	
	}


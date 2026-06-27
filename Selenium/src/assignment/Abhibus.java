package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Abhibus {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Leaving From']")).click();
		driver.findElement(By.xpath("(//div[contains(text(),'Bangalore')])[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Going To']")).click();
		driver.findElement(By.xpath("(//div[contains(text(),'Hyderabad')])[1]")).click();
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		//bus
		List<WebElement>busnames = driver.findElements(By.xpath("//5"));
		for (WebElement names:busnames) {
			String busname =names.getText();
			System.out.println(busname);	
		}
		
		//price
		List<WebElement>allprice = driver.findElements(By.xpath("//span[contains(@class,'fare text')]"));
		for (WebElement price:allprice) {
			String prices =price.getText();
			System.out.println(prices);	
		}
		
		//departure time
		List<WebElement>depttime = driver.findElements(By.xpath("//span[contains(@class,'departure')]"));
		for (WebElement dept:depttime) {
			String deptime =dept.getText();
			System.out.println(deptime);	
		}
		
		//arrival time
		List<WebElement>arrtime = driver.findElements(By.xpath("//span[contains(@class,'arrival')]"));
		for (WebElement arrival:arrtime) {
			String arvtime =arrival.getText();
			System.out.println(arvtime);	
		}
		
		//seat availability
		List<WebElement>seat = driver.findElements(By.xpath("//span[contains(@id,'service-operator-select')]"));
		for (WebElement seatavail:seat) {
			String availseat =seatavail.getText();
			System.out.println(availseat);	
		}
		
		
	}

}

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://blazedemo.com/");
	
	driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
	String Price=driver.findElement(By.xpath("//input[@value='200.98']")).getText();
	System.out.println(Price);
    driver.findElement(By.xpath("(//td[text()='Aer Lingus']/..//input[@value='Choose This Flight'])")).click();
	
}
}

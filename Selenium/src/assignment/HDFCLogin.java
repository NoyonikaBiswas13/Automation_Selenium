package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HDFCLogin {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://homeloans.hdfc.bank.in/");
	
	driver.findElement(By.xpath("//a[@title='Login']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[text()='Login To NetBanking'])[1]")).click();
	
	//switch to first window
	Set<String> windowid = driver.getWindowHandles();
	for(String id :windowid) {
		driver.switchTo().window(id);
	}
		
	driver.findElement(By.xpath("//button[@aria-label='Login']")).click();
	
	//switch to second window
	Set<String> windowid1 = driver.getWindowHandles();
	for(String id1 :windowid1) {
		driver.switchTo().window(id1);
	}
	driver.findElement(By.xpath("(//span[text()='NetBanking'])[1]")).click();	
	
	//to fill the details
	//driver.findElement(By.id("userId")).sendKeys("1234321560");
	//driver.findElement(By.id("Password")).sendKeys("Noyo12345");

}
}


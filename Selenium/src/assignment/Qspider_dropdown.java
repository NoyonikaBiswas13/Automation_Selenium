package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Qspider_dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		driver.findElement(By.xpath("//a[text()='Single Select']")).click();
		
		WebElement dropdown =driver.findElement(By.xpath("//select[@id='country_code']"));
		Select sel =new Select (dropdown);
		sel.selectByValue("+91");
		
		
		driver.findElement(By.xpath("//input[@placeholder='enter your number']")).sendKeys("9876543210");
		driver.findElement(By.xpath("//input[@name='gender']")).sendKeys("female");
		
		
		WebElement dropdown1 =driver.findElement(By.xpath("//select[@id='select3']"));
		Select sel1 =new Select (dropdown1);
		sel1.selectByVisibleText("India");
		
		WebElement dropdown2 =driver.findElement(By.xpath("//select[@id='select5']"));
		Select sel2 =new Select (dropdown2);
		sel2.selectByIndex(26);
		
		WebElement dropdown3 =driver.findElement(By.id("optionCity"));
		Select sel3 =new Select (dropdown3);
		sel3.selectByValue("11");
		
		WebElement dropdown4 =driver.findElement(By.xpath("//select[@id='select7']"));
		Select sel4 =new Select (dropdown4);
		sel4.selectByValue("2");
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		List<WebElement> multi =driver.findElements(By.xpath("//h2[text()='Multi Select - Product List']"));
		Select se =new Select ((WebElement) multi);
		se.selectByValue("8");
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		sel.selectByValue("8");
		
		driver.quit();

}
}
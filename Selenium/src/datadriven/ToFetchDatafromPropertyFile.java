package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchDatafromPropertyFile {
	public static void main(String[] args) throws IOException {
		
		//create file location
		FileInputStream fis= new FileInputStream("./Test data/commondata.properties");
		
		//file specific object
		Properties prop= new Properties();
		
		//load
		prop.load(fis);
		
		//get property
		String url= prop.getProperty("url");
		System.out.println(url);
		
		String email=prop.getProperty("email");
		String password=prop.getProperty("pwd");
		
		//Test script
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		
		
		
		
	}

}

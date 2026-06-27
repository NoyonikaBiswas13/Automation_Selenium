package popups;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class toLearnFileUploadPopups {
	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/ui/formValidation?sublist=0");
	
	//change the '\\' to '//'
	File f =new File("C://Users//noyo1//OneDrive//Desktop//Resume//Nayonika Biswas_updated.pdf");
	String upload=f.getAbsolutePath();
	
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys(upload);	
	
}
}
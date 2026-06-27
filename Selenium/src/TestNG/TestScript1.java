package TestNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript1 extends BaseClass {
	@Test
	public void clickonBooks() {
		
		driver.findElement(By.partialLinkText("BOOKS")).click();		
		Reporter.log("Books page is displayed",true);
	}

}

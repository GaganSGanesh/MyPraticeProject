package selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.TestBase;

public class distributedTest extends TestBase{
	@Test
	public void dbTest() throws IOException {
		driver.get(properties("Bankingurl"));
		driver.findElement(By.xpath("//button[contains(.,'Customer Login')]")).click();
		WebElement dropdown = driver.findElement(By.id("userSelect"));
		Select select=new Select(dropdown);
		select.selectByValue("2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Test
	public void manager_AddCustomer() throws IOException {
	driver.get(properties("Bankingurl"));
	driver.findElement(By.xpath("//button[contains(.,'Bank Manager Login')]")).click();
	driver.findElement(By.xpath("//button[@ng-click='addCust()']")).click();
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Mugiwara");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("D Luffy");
	driver.findElement(By.xpath("//input[@placeholder='Post Code']")).sendKeys("900900");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	String Id=driver.switchTo().alert().getText();
	System.out.println(Id);
	driver.switchTo().alert().accept();
	

		
	}

}

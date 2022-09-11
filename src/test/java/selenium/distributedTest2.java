package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.TestBase;

public class distributedTest2 extends TestBase{
	@Test
	public void dbTest() {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject");
		driver.findElement(By.xpath("//button[contains(.,'Customer Login')]")).click();
		WebElement dropdown = driver.findElement(By.id("userSelect"));
		Select select=new Select(dropdown);
		select.selectByValue("2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utility.TestBase;

public class select extends TestBase{
	@Test
	public void selectoption() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://demoqa.com");
		WebElement widget = driver.findElement(By.xpath("(//div[contains(.,'Widgets')])[last()]"));
		js.executeScript("arguments[0].scrollIntoView();", widget);
		js.executeScript("arguments[0].click();",widget);
//		widget.click();
//		driver.findElement(By.xpath("//span[contains(.,'Widgets')]")).click();
		WebElement select = driver.findElement(By.xpath("//span[@class='text' and contains(.,'Select Menu')]"));
		
		js.executeScript("arguments[0].scrollIntoView();",select);
		js.executeScript("arguments[0].click();", select);
		
//		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
//		
//		js.executeScript("arguments[0].scrollIntoView();",dropdown1);
//		js.executeScript("arguments[0].click();", dropdown1);
//		Select sel=new Select(dropdown1);
//		//selectbyvalue
//		sel.selectByValue("5");
//		//Select By Index
//		sel.selectByIndex(1);
		
		//select When there is no Select Tag
		WebElement drop4 = driver.findElement(By.xpath("(//div[contains(.,'Select...')])[last()]"));
		js.executeScript("arguments[0].scrollIntoView();",drop4);
		Thread.sleep(1000);
		js.executeScript("arguments[0].click();", drop4);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[contains(.,'Green')])[last()]")).click();
		
		
	}

}

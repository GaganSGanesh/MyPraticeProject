package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utility.TestBase;

public class interactions extends TestBase{
	@Test
	public void interaction() throws InterruptedException {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	driver.get("https://demoqa.com");
	WebElement Interactions = driver.findElement(By.xpath("(//div[contains(.,'Interactions')])[last()]"));
	js.executeScript("arguments[0].scrollIntoView();", Interactions);
	js.executeScript("arguments[0].click();",Interactions);
	WebElement Droppable = driver.findElement(By.xpath("(//span[contains(.,'Droppable')])[last()]"));
	Droppable.click();
	Actions action=new Actions(driver);
	WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
	Thread.sleep(3000);
//	(new Actions(driver)).dragAndDrop(draggable, droppable).perform();
	action.dragAndDrop(Droppable, droppable).build().perform();
}
}

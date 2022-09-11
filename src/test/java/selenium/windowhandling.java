package selenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class windowhandling {
	@Test
	public void windowHandlerOne() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/");
		WebElement alert = driver.findElement(By.xpath("(//div[contains(.,'Alerts, Frame & Windows')])[last()]"));
		js.executeScript("arguments[0].scrollIntoView();", alert);
		js.executeScript("arguments[0].click();", alert);

		driver.findElement(By.xpath("//span[contains(.,'Browser Windows')]")).click();
		// Switching tab
//		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
//		ArrayList<String> window=new ArrayList<String>( driver.getWindowHandles());
//		driver.switchTo().window(window.get(1));
//		driver.get("https://demoqa.com/");

//		// switch to window
//		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
//		String ThisWindow = driver.getWindowHandle();
//		Set<String> AllWindows = driver.getWindowHandles();
//
//		AllWindows.remove(ThisWindow);
//
//		for (String loop : AllWindows) {
//			driver.switchTo().window(loop);
//			driver.get("https://demoqa.com/");
//			Thread.sleep(1000);
//			//close the window
//			driver.switchTo().window(loop).close();
//			driver.switchTo().window(ThisWindow);
//
//		}
		//switch to Window and GetMessage/text

		driver.findElement(By.xpath("//button[@id='messageWindowButton']")).click();
		String parentwindow = driver.getWindowHandle();
		Set<String>allwindow=driver.getWindowHandles();
		allwindow.remove(parentwindow);
		for(String SwitchWindow:allwindow) {
			driver.switchTo().window(SwitchWindow);
			String text = driver.findElement(By.tagName("body")).getText();
			System.out.println(text);
			
		}
		Thread.sleep(3000);
		driver.close();
	}

}

package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class frames {
	@Test
	public void iframes() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/");
		WebElement alert = driver.findElement(By.xpath("(//div[contains(.,'Alerts, Frame & Windows')])[last()]"));
		js.executeScript("arguments[0].scrollIntoView();", alert);
		js.executeScript("arguments[0].click();",alert);
		driver.findElement(By.xpath("//span[contains(.,'Frames')]")).click();
//		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		
		//Select Frame By(IdorString)
		driver.switchTo().frame("frame1");
		System.out.println("Switched to frame");
		WebElement sampleHeading = driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[last()]"));
		
		System.out.println(sampleHeading.getText());
	}

}

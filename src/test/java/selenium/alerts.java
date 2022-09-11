package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utility.TestBase;

public class alerts{
		@Test
		public  void alertTest() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebDriverWait wait=new WebDriverWait(driver, 10);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 30);
		driver.get("https://demoqa.com/");
		WebElement alert = driver.findElement(By.xpath("(//div[contains(.,'Alerts, Frame & Windows')])[last()]"));
		js.executeScript("arguments[0].scrollIntoView();", alert);
		js.executeScript("arguments[0].click();",alert);
//		wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(alert)));
		try {
			js.executeScript("arguments[0].scrollIntoView();", alert);
			js.executeScript("arguments[0].click();",alert);

		} catch (Exception e) {
			driver.navigate().refresh();
			
		}
		System.out.println("clicked");
		WebElement alertDD = driver.findElement(By.xpath("(//span[contains(.,'Alerts')])[last()]"));
		js.executeScript("arguments[0].scrollIntoView()", alertDD);
		js.executeScript("arguments[0].click()", alertDD);
		//simple Alert
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		//wait Alert/TimeAlert
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		System.out.println("alert accepted");
		//confirmation alert
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println("alert accepted");
		Thread.sleep(5000);//to check what you have selected 
		//Prompt alert
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("GaganSG");
		driver.switchTo().alert().accept();
		System.out.println("alert accepted");
		Thread.sleep(5000);//to check what you have Entered 
		

	}
}

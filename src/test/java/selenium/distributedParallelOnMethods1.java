package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class distributedParallelOnMethods1 {
	@Test
	public void distbTest() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println(Thread.currentThread().getId());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("www.google.com");
		driver.findElement(By.xpath("//button[contains(.,'Customer Login')]")).click();
		WebElement dropdown = driver.findElement(By.id("userSelect"));
		Select select=new Select(dropdown);
		select.selectByValue("2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void demoqa() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.out.println(Thread.currentThread().getId());

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/");
	}

}

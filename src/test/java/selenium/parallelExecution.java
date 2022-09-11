package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.TestBase;

public class parallelExecution extends TestBase {
	@Test
	public void TestCase1() {
//		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/");
		String title=driver.getTitle();
		System.out.println(title);
		
	}

}

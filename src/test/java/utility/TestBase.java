package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestBase {
protected WebDriver driver;
//protected JavascriptExecutor js=(JavascriptExecutor)driver;
//	protected WebDriverWait wait=new WebDriverWait(driver, 10);
	@Parameters("Browser")
	@BeforeClass
	public void openBrowser(String Browser) {
		try {
		System.out.println("Browser Name is : "+ Browser);
		System.out.println("Thread id : "+Thread.currentThread().getId());
		
	if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(Browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver=new FirefoxDriver();
	}
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			
		}
	}
	@Test
	public String properties(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/java/utility/userdata.properties");
		Properties pobjc=new Properties();
		pobjc.load(fis);
		String value = (String) pobjc.get(key);
		return value;
		
	}
	
		
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
//		Thread.sleep(3000);
		driver.close();
		
	}

}

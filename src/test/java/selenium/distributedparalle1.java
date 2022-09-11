package selenium;

import org.testng.annotations.Test;

import utility.TestBase;

public class distributedparalle1 extends TestBase{
	@Test
	public void demoqa() {
		openBrowser("chrome");
		driver.get("https://demoqa.com/");
	}

}

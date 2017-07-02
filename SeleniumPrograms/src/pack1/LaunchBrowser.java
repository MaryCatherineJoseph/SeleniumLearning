package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {

	static WebDriver driver;
	@Test
	public void LaunchChrome()
	{
	
		// TODO Auto-generated method stub
		System.out.println("launching chrome browser");
		//System.setProperty("webdriver.gecko.driver", "D:\\gecko\\geckodriver.exe");  
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");  
	 driver = new ChromeDriver();
	
		driver.navigate().to("http://google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
	}
}

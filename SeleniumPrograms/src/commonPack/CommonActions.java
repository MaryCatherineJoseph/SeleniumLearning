package commonPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonActions {
	WebDriver driver;
	

	public void LaunchBrowser()
	{
	 
		System.out.println("Launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
	}

public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}
	

public void QuitBrowser()
{
		System.out.println("Quitting chrome browser");
		driver.close();
}

}

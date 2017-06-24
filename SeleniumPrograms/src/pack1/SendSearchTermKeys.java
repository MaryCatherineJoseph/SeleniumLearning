package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendSearchTermKeys {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.out.println("Launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		
	WebElement sendkeys1=driver.findElement(By.xpath("//*[@id='lst-ib']"));	
	sendkeys1.click();
	sendkeys1.sendKeys("selenium tutorial for beginners");
	WebElement sendkeys2=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[3]"));
	sendkeys2.click();
	
	
	
	}
	
	
}

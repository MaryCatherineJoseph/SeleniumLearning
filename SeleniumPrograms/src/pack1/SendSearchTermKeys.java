package pack1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonPack.CommonActions;


public class SendSearchTermKeys {

	@Test
	public void sendSearchTerm() throws InterruptedException
	{	
		CommonActions commonActions=new CommonActions();
		commonActions.LaunchBrowser();
		
		WebDriver driver1=commonActions.getDriver();
		driver1.get("http://google.com");
		
	WebElement sendkeys1=driver1.findElement(By.xpath("//*[@id='lst-ib']"));	
	sendkeys1.click();
	sendkeys1.sendKeys("selenium tutorial for beginners");
	WebElement sendkeys2=driver1.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]/div/ul/li[3]"));
	sendkeys2.click();
	Thread.sleep(1000);
	commonActions.QuitBrowser();
	
	}
	
	
	
}


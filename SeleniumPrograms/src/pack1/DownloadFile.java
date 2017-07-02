package pack1;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonPack.CommonActions;


public class DownloadFile {	
	
	@Test
	void downloadFile() throws InterruptedException {
		// TODO Auto-generated method stub
		
		CommonActions commonActions=new CommonActions();
		commonActions.LaunchBrowser();
		
		WebDriver driver1=commonActions.getDriver();
		driver1.get("http://google.com");
		
		WebElement element=driver1.findElement(By.xpath("//*[@id='lst-ib']"));
		element.click();
		element.sendKeys("download selenium latest jar");
		Thread.sleep(2000);
		WebElement element2=driver1.findElement(By.xpath("//*[@id='sbse0']/div[2]"));
		element2.click();
		Thread.sleep(2000);
		WebElement element3=driver1.findElement(By.linkText("Download selenium-java-2.3.0.jar : selenium java « s « Jar File ..."));
		Thread.sleep(1000);
		element3.click();
		WebElement element4= driver1.findElement(By.xpath("/html/body/div/div/div[2]/a"));
		element4.click();
		
		Thread.sleep(1000);
		commonActions.QuitBrowser();
		
	}

}

package pack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonPack.CommonActions;

public class AlertHandling {

	WebDriver driver;
	
	CommonActions actions=new CommonActions();
	
	@Test
	public void Alerts() throws InterruptedException
	{
		actions.LaunchBrowser();
		
	// hit the url
		driver=actions.getDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		
		Thread.sleep(1000);
		
		WebElement frame=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		Thread.sleep(1000);
		
		WebElement button=driver.findElement(By.xpath("/html/body/button"));
		button.click();
		Thread.sleep(1000);
		
	//Handling alerts
		
		Alert alert =driver.switchTo().alert();		
		alert.accept();	
		
		button.click();
		Thread.sleep(1000);
		
		System.out.println(alert.getText());
		
		alert.dismiss();
		
	}

	public static void main(String[] args) throws InterruptedException {
		AlertHandling alertHandling=new AlertHandling();
		alertHandling.Alerts();
	}
	
}

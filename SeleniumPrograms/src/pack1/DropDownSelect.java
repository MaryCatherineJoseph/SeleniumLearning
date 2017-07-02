package pack1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import commonPack.CommonActions;


public class DropDownSelect {

	@Test
	public void DropDown() throws InterruptedException
	{
		
// hitting the required url
		CommonActions commonActions=new CommonActions();
		commonActions.LaunchBrowser();
		
		WebDriver driver1=commonActions.getDriver();
		
		driver1.get("http://www.guru99.com/");
		Actions hoverAction=new Actions(driver1);
		
// Mouseover action to move mouse pointer to a particular location
		
		WebElement hover= driver1.findElement(By.xpath("//*[@id='g-navigation']/div/div/div[2]/div/nav/ul/li[2]/a/span[1]/span"));
		hoverAction.moveToElement(hover).build().perform();
		Thread.sleep(1000);
// To hover and click on a particular option from dropdown list
		
		WebElement option=driver1.findElement(By.xpath("//*[@id='g-navigation']/div/div/div[2]/div/nav/ul/li[2]/ul/li/div/div[1]/ul/li[3]/a"));
		hoverAction.moveToElement(option).click().build().perform();
		Thread.sleep(1000);
		
// to check if the desired page is loaded
		
		WebElement checkPage=driver1.findElement(By.xpath("//*[@id='g-mainbar']/div/div/div/div/div/div/div[1]/h1"));
		
		if(checkPage.getText().equalsIgnoreCase("Free Selenium Tutorials"))
		{
			System.out.println("The page is loaded successfully");
		}
		else
		{
			System.out.println("Error");
		}
		
		Thread.sleep(1000);
		commonActions.QuitBrowser();
	}

}

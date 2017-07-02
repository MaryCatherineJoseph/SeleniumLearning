package pack1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import commonPack.CommonActions;


public class TextBoxFillingAndButtonCick {

@Test 
	public void TextBoxFilling() throws InterruptedException
	{
	CommonActions commonActions=new CommonActions();
	commonActions.LaunchBrowser();
	
	WebDriver driver1=commonActions.getDriver();
		driver1.get("http://www.monstergulf.com");
		
//filling the required text boxes
		
		WebElement textBox1= driver1.findElement(By.xpath("//*[@id='fts_id']"));
		textBox1.sendKeys("QA Testing");
		
		WebElement textBox2=driver1.findElement(By.xpath("//*[@id='selExp']"));
		textBox2.click();
		
		Thread.sleep(1000);
		
//selecting an option from dropdown list		
		
		Actions hoverAction=new Actions(driver1);
		WebElement option=driver1.findElement(By.xpath("//*[@id='exp_container']/div[1]/div[3]/ul/li[4]/a"));
		hoverAction.moveToElement(option).click().build().perform();
		
		WebElement textBox3=driver1.findElement(By.xpath("//*[@id='lmy']"));
		textBox3.sendKeys("Dubai");
		
		Thread.sleep(1000);
	
// clicking on the submit button
		
		WebElement button=driver1.findElement(By.xpath("//*[@id='advance_main_form']/div[2]/input"));
		button.click();
		
		Thread.sleep(1000);
		commonActions.QuitBrowser();
		
	}

}

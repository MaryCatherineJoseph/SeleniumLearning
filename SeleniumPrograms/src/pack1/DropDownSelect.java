package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DropDownSelect {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Launching chrome browser");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
// hitting the required url
		
		driver.manage().window().maximize();
		driver.get("http://www.guru99.com/");
		Actions hoverAction=new Actions(driver);
		
// Mouseover action to move mouse pointer to a particular location
		
		WebElement hover= driver.findElement(By.xpath("//*[@id='g-navigation']/div/div/div[2]/div/nav/ul/li[2]/a/span[1]/span"));
		hoverAction.moveToElement(hover).build().perform();
		Thread.sleep(1000);
// To hover and click on a particular option from dropdown list
		
		WebElement option=driver.findElement(By.xpath("//*[@id='g-navigation']/div/div/div[2]/div/nav/ul/li[2]/ul/li/div/div[1]/ul/li[3]/a"));
		hoverAction.moveToElement(option).click().build().perform();
		Thread.sleep(1000);
		
// to check if the desired page is loaded
		
		WebElement checkPage=driver.findElement(By.xpath("//*[@id='g-mainbar']/div/div/div/div/div/div/div[1]/h1"));
		
		if(checkPage.getText().equalsIgnoreCase("Free Selenium Tutorials"))
		{
			System.out.println("The page is loaded successfully");
		}
		else
		{
			System.out.println("Error");
		}
	}

}

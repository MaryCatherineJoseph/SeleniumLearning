package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextBoxFillingAndButtonCick {
static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.out.println("Launching chrome browser");
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		
// hitting the required url
		
		driver.manage().window().maximize();
		driver.get("http://www.monstergulf.com");
		
//filling the required text boxes
		
		WebElement textBox1= driver.findElement(By.xpath("//*[@id='fts_id']"));
		textBox1.sendKeys("QA Testing");
		
		WebElement textBox2=driver.findElement(By.xpath("//*[@id='selExp']"));
		textBox2.click();
		
		Thread.sleep(1000);
		
//selecting an option from dropdown list		
		
		Actions hoverAction=new Actions(driver);
		WebElement option=driver.findElement(By.xpath("//*[@id='exp_container']/div[1]/div[3]/ul/li[4]/a"));
		hoverAction.moveToElement(option).click().build().perform();
		
		WebElement textBox3=driver.findElement(By.xpath("//*[@id='lmy']"));
		textBox3.sendKeys("Dubai");
		
		Thread.sleep(1000);
	
// clicking on the submit button
		
		WebElement button=driver.findElement(By.xpath("//*[@id='advance_main_form']/div[2]/input"));
		button.click();
		
	}

}

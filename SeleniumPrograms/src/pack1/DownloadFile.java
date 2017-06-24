package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		WebElement element=driver.findElement(By.xpath("//*[@id='lst-ib']"));
		element.click();
		element.sendKeys("download selenium latest jar");
		Thread.sleep(2000);
		WebElement element2=driver.findElement(By.xpath("//*[@id='sbse0']/div[2]"));
		element2.click();
		Thread.sleep(2000);
		WebElement element3=driver.findElement(By.linkText("Download selenium-java-2.3.0.jar : selenium java « s « Jar File ..."));
		Thread.sleep(1000);
		element3.click();
		WebElement element4= driver.findElement(By.xpath("/html/body/div/div/div[2]/a"));
		element4.click();
		
	}

}

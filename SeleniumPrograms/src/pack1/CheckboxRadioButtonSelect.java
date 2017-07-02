package pack1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonPack.CommonActions;

public class CheckboxRadioButtonSelect {

	CommonActions commonActions=new CommonActions();
	
@Test(priority=0)
public void CheckBoxSelect() throws InterruptedException
{
	
	commonActions.LaunchBrowser();
	
	WebDriver driver1=commonActions.getDriver();
	driver1.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
	
	WebElement checkBox1=driver1.findElement(By.xpath("//*[@id='example']/tbody/tr[1]/td[1]"));
//To deselect a check box which is already selected
	
	if(checkBox1.isDisplayed() && checkBox1.isSelected())
	{
		System.out.println("The Check box is selected as default");
		
	}
	
	else
	{
		checkBox1.click();
		System.out.println("The Check box is selected");
	}
	
	Thread.sleep(1000);
	commonActions.QuitBrowser();
}

@Test(priority=2)
public void SelectRadioButton() throws InterruptedException
{
	commonActions.LaunchBrowser();
	WebDriver driver2=commonActions.getDriver();
	driver2.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_radio");
	
	Thread.sleep(3000);
	//WebElement radioButton1=driver2.findElement(By.xpath("/html/body/form/input[1]"));
	 WebElement e1 = driver2.findElement(By.name("iframeResult"));


     driver2.switchTo().frame(e1);

     WebElement radioButton1=driver2.findElement(By.xpath("html/body/form/input[2]"));

	//WebElement radioButton1=driver2.findElement(By.xpath("//input[@value='female']"));
	
	
	if(radioButton1.isSelected() && radioButton1.isDisplayed())
	{
		System.out.println("Radio button is already enabled");
	}
	else
	{
		radioButton1.click();
	}
	
	Thread.sleep(1000);
	commonActions.QuitBrowser();
}


//Selecting multiple checkBoxes

@Test(priority=1)
public void MultipleCheckBoxSelect() throws InterruptedException
{
commonActions.LaunchBrowser();
	
	WebDriver driver3=commonActions.getDriver();
	driver3.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
	
	WebElement checkBox1=driver3.findElement(By.xpath("//*[@id='example']/tbody/tr[1]/td[1]"));
	WebElement checkBox2=driver3.findElement(By.xpath("//*[@id='example']/tbody/tr[2]/td[1]"));
	WebElement checkBox3=driver3.findElement(By.xpath("//*[@id='example']/tbody/tr[3]/td[1]"));
	WebElement checkBox4=driver3.findElement(By.xpath("//*[@id='example']/tbody/tr[4]/td[1]"));
	
	ArrayList<WebElement> list1=new ArrayList<WebElement>();
	list1.add(checkBox1);
	list1.add(checkBox2);
	list1.add(checkBox3);
	list1.add(checkBox4);	
	
	for (WebElement webElement : list1) {
		if(!webElement.isSelected())
		{
		
		webElement.click();
		
	}
		else{
			System.out.println("CheckBox is already selected");
		}
	
	
}
	Thread.sleep(1000);
	commonActions.QuitBrowser();
		
	}

public static void main(String[] args) throws InterruptedException {
		CheckboxRadioButtonSelect checkBoxSelect=new CheckboxRadioButtonSelect();
		checkBoxSelect.CheckBoxSelect();
		CheckboxRadioButtonSelect radioButtonSelect=new CheckboxRadioButtonSelect();
		radioButtonSelect.SelectRadioButton();
		CheckboxRadioButtonSelect multipleCheckboxSelect=new CheckboxRadioButtonSelect();
		multipleCheckboxSelect.MultipleCheckBoxSelect();
}
}


package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectListBox
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/USER/Desktop/Hotel.html");
		WebElement lst = driver.findElement(By.id("cp"));
		Select s=new Select(lst);
		System.out.println("Multiple: "+s.isMultiple());
		System.out.println("First:"+s.getFirstSelectedOption().getText());
		List<WebElement> all = s.getAllSelectedOptions();
		for(WebElement e:all)
		{
		System.out.println(e.getText());
		}
		
	}
}

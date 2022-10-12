package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListBox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		WebElement dayList = driver.findElement(By.id("day"));
		WebElement monthList = driver.findElement(By.id("month"));
		WebElement yearList = driver.findElement(By.id("year"));
		
		Select s1=new Select(dayList);
		s1.selectByIndex(0);
		
		Select s2=new Select(monthList);
		s2.selectByValue("7");
		
		Select s3=new Select(yearList);
		s3.selectByVisibleText("2010");
		
		List<WebElement> mlst = s2.getOptions();
		for(WebElement e:mlst)
		{
		System.out.println(e.getText());
		}
		
		System.out.println(s1.getWrappedElement().getText());
		System.out.println(s2.isMultiple());

	}

}

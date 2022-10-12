package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Popup3 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("dob")).click();
		
		WebElement mList = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1=new Select(mList);
		s1.selectByIndex(11);
		
		WebElement yList=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s2=new Select(yList);
		s2.selectByVisibleText("1997");
		
		driver.findElement(By.linkText("28")).click();

	}

}

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenPopup 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		
		WebElement monthList = driver.findElement(By.className("ui-datepicker-month"));
		Select s1=new Select(monthList);
		s1.selectByVisibleText("Dec");
		
		WebElement yearList=driver.findElement(By.className("ui-datepicker-year"));
		Select s2=new Select(yearList);
		s2.selectByVisibleText("1997");
		
		driver.findElement(By.xpath("//a[text()='28']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("91234567890");
		driver.findElement(By.xpath("//button[text()='Lets Renew']")).click();
		
		boolean text=driver.findElement(By.id("policynumberError")).isDisplayed();
		if(text==true)
			System.out.println("Policy number error message is diplayed");
		else
			System.out.println("Policy number error message is not diplayed");

	}

}

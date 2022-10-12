package qsp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ATS1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
//		driver.get("http://192.168.132.128:8080/");
//		
				
		
//			WebDriver driver = new ChromeDriver();
//			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.get("https://demo.actitime.com/login.do");
//			driver.findElement(By.linkText("actiTIME Inc.")).click();
//			
//			Set<String> allwh = driver.getWindowHandles();
//			int count=allwh.size();
//			System.out.println("The no of tags present after clicking on actiTime link "+count);
//			driver.close();
//		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		driver.get("https://www.vtiger.com/customers/");
		
		WebElement as = driver.findElement(By.linkText("READ FULL STORY"));
		Actions a=new Actions(driver);
		a.doubleClick(as).perform();
		
		
		
		
		
		
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
//		driver.findElement(By.id("passWord")).sendKeys("123456");
//		driver.findElement(By.xpath("//input[@alt]")).click();
		
		
		
		

	}

	

}

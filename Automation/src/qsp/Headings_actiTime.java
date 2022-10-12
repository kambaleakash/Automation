package qsp;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Headings_actiTime 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		driver.findElement(By.linkText("Read Service Agreement")).click();
		
		Set<String> awh = driver.getWindowHandles();
		Iterator it=awh.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window((String) it.next());
			if(driver.getTitle().equals("actiTIME Online Terms of Service"))
			{
				List<WebElement> lstTitle = driver.findElements(By.xpath("//h2[not(@id='application-service-agreement')]"));
				for(WebElement wb:lstTitle)
				{
					String title = wb.getText();
					System.out.println(title);
				}
			}
		}

	}

}

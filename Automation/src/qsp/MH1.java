package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MH1 
{

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		
		
		
		Actions a=new Actions(driver);
		WebElement target1 = driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(target1).perform();
		WebElement target2 = driver.findElement(By.partialLinkText("Contact Us"));
		//driver.findElement(By.partialLinkText("Contact Us")).click();
		a.doubleClick(target2).perform();
		String phno=driver.findElement(By.xpath("//p[contains(text(),'Bengaluru, India')]/../p[2]")).getText();
		System.out.println(phno);
		
	}

}

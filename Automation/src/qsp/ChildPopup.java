package qsp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildPopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://secure.indeed.com/auth");
		System.out.println(driver.getWindowHandle());
		driver.findElement(By.xpath("//span[text()='Continue with Google']")).click();
		Set<String> child = driver.getWindowHandles();
		//System.out.println(child);
		List a=new ArrayList<>(child);
		System.out.println(a.get(0));
		driver.switchTo().window((String) a.get(0));
		System.out.println(driver.getWindowHandle());
		

	}

}

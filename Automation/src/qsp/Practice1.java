package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String name = driver.findElement(By.xpath("//div[text()='Login ']")).getTagName();
		System.out.println(name);
	}

}

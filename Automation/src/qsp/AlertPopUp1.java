package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("alertbtn")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		Alert b = driver.switchTo().alert();
		System.out.println(b.getText());
		b.dismiss();
	}

}

package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.linkText("Alert with Textbox ")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'demonstrate')]")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("Akash");
		a.accept();
		System.out.println(a.getText());
		
	}

}

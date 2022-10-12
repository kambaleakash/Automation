package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup1 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(2000);
		Alert alert1 = driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		alert2.accept();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])")).click();
		Thread.sleep(2000);
		Alert alert3=driver.switchTo().alert();
		System.out.println(alert3.getText());
		alert3.sendKeys("Hii hello");
		alert3.accept();
		

		

//		for (int i = 1; i < 4; i++) 
//		{
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("(//a[@class='analystic'])[i]")).click();
//			Thread.sleep(3000)
//			driver.findElement(By.xpath("(//button[contains(@class,'btn btn')])[i]")).click();
//			Thread.sleep(3000);
//			driver.switchTo().alert().accept();
//			
//		}
    }

}

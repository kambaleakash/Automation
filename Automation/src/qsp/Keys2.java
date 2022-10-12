package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys2 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("file:///C:/Users/USER/Desktop/Box.html");
		d.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(Keys.CONTROL+"ac");
		d.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(Keys.CONTROL+"av");
		
		

	}

}

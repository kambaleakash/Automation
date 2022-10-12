package qsp;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keys1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("http://demo.opensourcebilling.org/en/users/sign_in");
	    d.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		d.findElement(By.id("password")).clear();
		d.findElement(By.id("password")).sendKeys(Keys.CONTROL+"av");
		
		
	}

}

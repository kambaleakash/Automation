package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login/");
		d.findElement(By.id("email")).sendKeys("hello");
		d.findElement(By.id("pass")).sendKeys("hii");
		d.findElement(By.id("loginbutton")).click();
		String color = d.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		String fontSize = d.findElement(By.linkText("Forgotten password?")).getCssValue("font-size");
		String fontStyle = d.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
		
		System.out.println("color="+color);
		System.out.println("fontSize="+fontSize);
		System.out.println("fontStyle="+fontStyle);

	}

}

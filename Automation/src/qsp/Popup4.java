package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup4 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.remove.bg/upload");
		File f=new File("./data/download.jpeg");
		String absolute = f.getAbsolutePath();
		System.out.println(absolute);
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).sendKeys(absolute);

	}

}

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("oneplus mobile");
		d.findElement(By.xpath("//button[@type='submit']")).submit();
		String result=d.findElement(By.xpath("(//div[contains(text(),'OnePlus 10R 5G')] )[1]/../../div[2]/div[1]/div[1]")).getText();
		System.out.println(result);
	}

}

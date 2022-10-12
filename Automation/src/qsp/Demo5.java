package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
String s=driver.getTitle();
System.out.println(s);
driver.findElement(By.id("id=\"twotabsearchtextbox\"")).sendKeys("mobile");
driver.findElement(By.id("nav-search-submit-button")).click();

	}

}

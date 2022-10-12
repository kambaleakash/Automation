package qsp;

import java.io.File;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUP 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/mnjuser/profile");
		driver.findElement(By.id("usernameField")).sendKeys("kambaleakash07@gmail.com");
		driver.findElement(By.id("passwordField")).sendKeys("Akash@07");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(4000);

		File f=new File("./data/Resume.docx");
		String absolute = f.getAbsolutePath();
		driver.findElement(By.id("attachCV")).sendKeys(absolute);

	}

}

package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp1 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(3000);
		File f=new File("./data/Resume.docx");
		String aPath = f.getAbsolutePath();
		System.out.println(aPath);
		driver.findElement(By.id("input-4")).sendKeys(aPath);
		
	}

}

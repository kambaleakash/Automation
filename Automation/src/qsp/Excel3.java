package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel3 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
     	WebElement emsg = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
		
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		int rc=wb.getSheet("invalidlogin").getLastRowNum();
		
		for(int i=1; i<=rc; i++)
		{
			String un=wb.getSheet("invalidlogin").getRow(i).getCell(0).toString();
			driver.findElement(By.id("username")).sendKeys(un);
			//System.out.println(un);
			
			String pwd=wb.getSheet("invalidlogin").getRow(i).getCell(1).toString();
		//	driver.findElement(By.name("pwd")).sendKeys(pwd);
			System.out.println(pwd);
		//	driver.findElement(By.id("loginButton")).click();
			
//			if(emsg.isDisplayed()==true)
//				System.out.println("pass");
//			else
//				System.out.println("fail");
		}
		
		
		
		
		
		
		
	}

}

package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bookmyshow.com");
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
			
		

	}

}

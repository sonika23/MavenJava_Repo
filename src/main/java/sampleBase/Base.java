package sampleBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
   public static WebDriver driver;
   public WebDriver Browser()
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonika.goyal\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		 driver = new ChromeDriver();
		 return driver;
    }
}

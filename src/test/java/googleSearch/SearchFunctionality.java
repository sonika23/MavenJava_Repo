package googleSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import sampleBase.Base;

public class SearchFunctionality extends Base
{
@BeforeTest
   public void launchBrowser()
   {
	 Browser();
   }
	
@Test(priority = 1, description = "Verify search is working properly")
	public void search() 
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\sonika.goyal\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		//ChromeDriver driver = new ChromeDriver();
		 driver.get("https://google.com/");
	  WebElement e1= driver.findElement(By.name("q"));
	    e1.sendKeys("Corona Virus");
	    e1.sendKeys(Keys.ENTER);	
	}
}

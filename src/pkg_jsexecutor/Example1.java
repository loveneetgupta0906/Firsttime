package pkg_jsexecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Example1 {
	
	@Test
	public void zoho_crm_createuser()
	{
		
		
		WebDriver driver=null;

		/*user.dir get the path of working directory dymanically
		 * reason being -when the share the project with other the path/location of chromedriver can be different.
		 * need to set the driver path.
		 */
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\drivers\\Chromedriver.exe");

		driver=new ChromeDriver(); 

		//maximum the window 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/");
		
		WebElement amazonPrimeVideosElm=driver.findElement(By.xpath("//*[@id='nav-flyout-shopAll']/div[3]/div[2]/a[1]/span[1]"));
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("arguments[0].click();",amazonPrimeVideosElm);
		JS.executeScript("alert('Element find');");
		driver.quit();

}

}

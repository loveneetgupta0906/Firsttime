package pkg3_drivermethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Navigate_Example {

	@Test
	public void launch_google()
	
		{
		/*user.dir get the path of working directory dymanically
		 * reason being -when the share the project with other the path/location of chromedriver can be different.
		 * need to set the driver path.
		 */
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\drivers\\Chromedriver.exe");
		
			ChromeDriver driver=new ChromeDriver(); 
			
			//maximum the window 
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.amazon.in");
			driver.navigate().to("https://www.google.com");
			
			driver.navigate().back();
			driver.navigate().forward();
			driver.navigate().refresh();
			
			//get() method is used to navigate to url in web driver
		     driver.get("https://www.amazon.in");
		     
		    
		     driver.quit();
		}
	
}
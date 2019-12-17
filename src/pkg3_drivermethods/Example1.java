package pkg3_drivermethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {
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
			driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
			
			//get() method is used to navigate to url in web driver
		     driver.get("https://www.amazon.in");
		     
		     //To print the title
		     String act_title=driver.getTitle();
		     
		     //to print the current url of the website
		     System.out.println(driver.getCurrentUrl());
		     System.out.println(act_title);
		     driver.quit();
		}
	
}

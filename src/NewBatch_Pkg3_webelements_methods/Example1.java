package NewBatch_Pkg3_webelements_methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
			//manage the timeout of the pageload - it is defined as global setting 
			driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.zoho.com/crm/");
			driver.findElement(By.id("namefield")).sendKeys("Loveneet");
			driver.findElement(By.name("email")).sendKeys("Loveneet.gupta@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Love@9872");	
			driver.quit();

}
	}

package newbatch_pkg5_gettextgetattr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class example1 {
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
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.zoho.com/crm/");
			//get attribute 
			driver.findElement(By.xpath("//*[@id='namefield']")).getAttribute("placeholder");
			
			//get Text
			
			String val2=driver.findElement(By.xpath("//*[@id='block-system-main']/div[1]/div[1]/div[1]/h1")).getText();
			System.out.println(val2);

driver.quit();
		}
}




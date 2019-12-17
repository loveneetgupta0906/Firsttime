package newbatch_pkg14_chrome_options;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Example1 {@Test
	public void drivermethods1()
	
{
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-infobars");
	options.addArguments("--disable-notifications");
	options.addArguments("window-size=600,600");
	
	

		/*user.dir get the path of working directory dymanically
		 * reason being -when the share the project with other the path/location of chromedriver can be different.
		 * need to set the driver path.
		 */
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\drivers\\Chromedriver.exe");

		ChromeDriver driver=new ChromeDriver(options); 
		//manage the timeout of the pageload - it is defined as global setting 
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS); // for pageload
		//implicit wait are specificly for findelement
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); // For Findelement
		driver.navigate().to("https://www.myntra.com/");
		
		driver.quit();

}

}
	

package pkg1_basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Launch_google_with_Alldrivers {
	@Test
	public void launch_IE_chorme()
	
		{
		/*user.dir get the path of working directory dymanically
		 * reason being -when the share the project with other the path/location of chromedriver can be different.
		 * need to set the driver path.
		 */
			System.setProperty("webdriver.ie.driver",
					System.getProperty("user.dir")+"\\drivers\\IEDriverServer.exe");
		
			InternetExplorerDriver driver=new InternetExplorerDriver(); 
			
			//get() method is used to navigate to url in web driver
		     driver.get("https://www.google.com/");
		     
		     driver.quit();
		}
	
	
	@Test
	public void launch_Firefox_chorme()
	
	{
	/*user.dir get the path of working directory dymanically
	 * reason being -when the share the project with other the path/location of chromedriver can be different.
	 * need to set the driver path.
	 */
		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir")+"\\drivers\\geckodriver.exe");
	
		FirefoxDriver driver=new FirefoxDriver(); 
		
		//get() method is used to navigate to url in web driver
	     driver.get("https://www.google.com/");
	     
	     driver.quit();
	}
}



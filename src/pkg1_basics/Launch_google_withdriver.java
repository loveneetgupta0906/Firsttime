package pkg1_basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_google_withdriver {

	@Test
	public void launch_google_chorme()
	
		{
		/*user.dir get the path of working directory dymanically
		 * reason being -when the share the project with other the path/location of chromedriver can be different.
		 * need to set the driver path.
		 */
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\drivers\\Chromedriver.exe");
		
			ChromeDriver driver=new ChromeDriver(); 
			
			//get() method is used to navigate to url in web driver
		     driver.get("https://www.google.com/");
		     
		     driver.quit();
		}
}
		     
		  

	


package pkg2_testng_parallel_execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch_Website {
	
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
			
			//get() method is used to navigate to url in web driver
		     driver.get("https://www.google.com/");
		     String act_title=driver.getTitle();
		     System.out.println(act_title);
		     
		     //To retrieve the current url
		     System.out.println(driver.getCurrentUrl());
		     driver.quit();
		}
	
	
	@Test
	public void launch_Amazon()
	
		{
		/*user.dir get the path of working directory dymanically
		 * reason being -when the share the project with other the path/location of chromedriver can be different.
		 * need to set the driver path.
		 */
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\drivers\\Chromedriver.exe");
		
			ChromeDriver driver=new ChromeDriver(); 
			
			//get() method is used to navigate to url in web driver
		     driver.get("https://www.amazon.com/");
		     String act_title=driver.getTitle();
		     System.out.println(act_title);
		     driver.quit();
		}
	
	
	@Test
	public void launch_ebay()
	
		{
		/*user.dir get the path of working directory dymanically
		 * reason being -when the share the project with other the path/location of chromedriver can be different.
		 * need to set the driver path.
		 */
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\drivers\\Chromedriver.exe");
		
			ChromeDriver driver=new ChromeDriver(); 
			
			//get() method is used to navigate to url in web driver
		     driver.get("https://www.ebay.com/");
		     String act_title=driver.getTitle();
		     System.out.println(act_title);
		     driver.quit();
		}



}

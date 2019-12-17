package newbatch_pkg6_isdisplayed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class nosuchelement {
	ChromeDriver driver=null;
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
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS); // for pageload
		//implicit wait are specificly for findelement
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); // For Findelement

		driver.navigate().to("https://www.makemytrip.com/");
		//is enabled
		Boolean Status1= driver.findElement(By.xpath("//*[@id='searchBtn']")).isEnabled();
		System.out.println(Status1);
		
		// is displayed
		try{
			Boolean Status=driver.findElement(By.xpath("//*[@id='multicity']/label")).isDisplayed();
			System.out.println("is add city is displayed"+Status);
		}catch(Exception e)
		{
			System.out.println("Element not present in HTML/DOM itself");

		}
	}



	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}

package newbatch_pkg10_windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class jboservewindowexample {
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
		driver.navigate().to("https://www.jobserve.com/gb/en/Job-Search/");
		
		//to get the base window handle
		String baseWindowID=driver.getWindowHandle();
		System.out.println(baseWindowID);
		
		//upClick on aspire media group
		
		driver.findElement(By.xpath("//*[@id='mainfooter']/div[4]/a")).click();
		
		//get all windows
		Set<String> allWindows=driver.getWindowHandles();
		for(String w:allWindows){
			System.out.println(w);
		}
	driver.quit();
	
	}

}

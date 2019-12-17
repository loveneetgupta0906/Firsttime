package newbatch_pkg12_frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example {
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
		driver.navigate().to("http://apycom.com/website-buttons/exframe.html");
		
		//Switch to frame
		
		driver.switchTo().frame("main_wnd");
		System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td/p[1]/span")));
		driver.switchTo().defaultContent();
		
		driver.quit();
}
}

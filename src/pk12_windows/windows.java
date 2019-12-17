package pk12_windows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windows {
	@Test
	public void zoho_crm_createuser()
	{
		
		
		WebDriver driver=null;

		/*user.dir get the path of working directory dymanically
		 * reason being -when the share the project with other the path/location of chromedriver can be different.
		 * need to set the driver path.
		 */
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\drivers\\Chromedriver.exe");

		driver=new ChromeDriver(); 

		//maximum the window 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.navigate().to("https://www.jobserve.com/in/en/Job-Search/");
		
		//Get base window handle
		String baseWindowhandle=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println("all windows Count-"+allWindows.size());
		
		//Click on aspire media group
		driver.findElement(By.xpath("//*[@id='mainfooter']/div[4]/a")).click();;
		allWindows=driver.getWindowHandles();
		System.out.println("all Windows Count-"+allWindows.size());
		for(String w:allWindows)
		{
			if(!w.equals(baseWindowhandle)){
				//Shift the focus to child window
				driver.switchTo().window(w);
				System.out.println(driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/img")).isDisplayed());
				driver.close();
				}
			}
		driver.quit();
	}

}

package newbatch_pkg8_findelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class iteratealllinksExample1 {
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
		
		driver.navigate().to("https://www.ebay.com/");
	List<WebElement> alllinks=driver.findElements(By.xpath("//*[@id='destinations_list1']/ul/li/a/div/div/div"));		
// loop to click one each link
	for(int i=0;i<alllinks.size();i++){
	alllinks.get(i).click();
	System.out.println(driver.getTitle());
	driver.navigate().back();
	alllinks=driver.findElements(By.xpath("//*[@id='destinations_list1']/ul/li/a/div/div/div"));
	}
	
	
	driver.quit();
	}
}

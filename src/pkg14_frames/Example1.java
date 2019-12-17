package pkg14_frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example1 {
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
		driver.navigate().to("http://apycom.com/website-buttons/exframe.html");
		
		driver.switchTo().frame("main_wnd");
		System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/a")).isDisplayed());
driver.switchTo().defaultContent();
driver.quit();
	}
}
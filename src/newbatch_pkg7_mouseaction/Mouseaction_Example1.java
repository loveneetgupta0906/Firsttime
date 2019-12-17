package newbatch_pkg7_mouseaction;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Mouseaction_Example1 {
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

		driver.navigate().to("https://www.zoho.com/crm/");
 //mousenavigate
		Actions act =new Actions(driver);
		
		WebElement menu1=driver.findElement(By.xpath("//*[@id='block-block-3']/div/ul/li[1]/a"));
		act.moveToElement(menu1).build().perform();
		
		//Explicit Wait
		WebDriverWait dynamic_wait=new WebDriverWait(driver,30);
		dynamic_wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id='block-block-3']/div/ul/li[1]/div/div/div[8]/a/em")));
		//click on survey button
		driver.findElement(By.xpath("//*[@id='block-block-3']/div/ul/li[1]/div/div/div[8]/a/em")).click();
		driver.quit();
		
		
}
}

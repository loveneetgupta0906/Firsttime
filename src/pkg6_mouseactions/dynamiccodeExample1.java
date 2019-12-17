package pkg6_mouseactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class dynamiccodeExample1 {

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
		driver.navigate().to("https://www.zoho.com/crm/");
		
		//Mouse Actions
		Actions act=new Actions(driver);
		WebElement SalesMktElm=driver.findElement(By.xpath("//*[@id='block-block-3']/div/ul/li[1]/a"));
		
		act.moveToElement(SalesMktElm).build().perform();
		
	/**	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		**/
		
		WebDriverWait d_wait=new WebDriverWait(driver,30);
		d_wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='block-block-3']/div/ul/li[1]/div/div/div[9]/a")));
		driver.findElement(By.xpath("//*[@id='block-block-3']/div/ul/li[1]/div/div/div[9]/a")).click();;
		System.out.println(driver.getTitle());
		driver.quit();
		


	}
}


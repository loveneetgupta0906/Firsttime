package pkg4_webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sendkeys_Click_Example1 {

	//@Test
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
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

		driver.navigate().to("http:/newtours.demoaut.com");

		//Set value in user id and pwd ,click on the button.
		driver.findElement(By.name("userName")).sendKeys("cpqtp");
		driver.findElement(By.name("password")).sendKeys("cpqtp");
		driver.findElement(By.name("login")).click();		     
		System.out.println(driver.getTitle());

		driver.quit();
	}

	@Test
	public void zoho_crm_createuser()
	{
		WebDriver driver=null;
		try{
			/*user.dir get the path of working directory dymanically
			 * reason being -when the share the project with other the path/location of chromedriver can be different.
			 * need to set the driver path.
			 */
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir")+"\\drivers\\Chromedriver.exe");

			driver=new ChromeDriver(); 

			//maximum the window 
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);

			driver.navigate().to("https://www.zoho.com/crm/");

			//Set value in user id and pwd ,click on the button.
			driver.findElement(By.id("namefieldss")).sendKeys("Chetan");
			driver.findElement(By.id("email")).sendKeys("chetan@gmail.com");
			driver.findElement(By.name("password")).sendKeys("weqweqw");
System.out.println(driver.getTitle());
		}
		catch(Exception e){
			e.printStackTrace();
			Assert.fail();
		}finally{
			driver.quit();
		}
	}
}
		




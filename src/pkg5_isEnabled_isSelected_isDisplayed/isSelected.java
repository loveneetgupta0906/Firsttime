package pkg5_isEnabled_isSelected_isDisplayed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class isSelected {
	
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
		driver.manage().timeouts().pageLoadTimeout(150,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.zoho.com/crm/");

		
		//is Selected
System.out.println(driver.findElement(By.xpath("//*[@id='tos']")).isSelected());

//is Enabled

System.out.println(driver.findElement(By.xpath("//*[@id='signupbtn']")).isDisplayed());

//isDisplayed
System.out.println(driver.findElement(By.xpath("//*[@id='block-system-main']/div[4]/div/div/div/span")).isDisplayed());


		
		
}
}

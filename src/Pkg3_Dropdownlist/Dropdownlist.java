package Pkg3_Dropdownlist;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdownlist {
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
		driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.navigate().to("https://www.zoho.com/crm/");

		//Set value in user id and pwd ,click on the button.
		driver.findElement(By.id("namefield")).sendKeys("Loveneet");
		driver.findElement(By.id("email")).sendKeys("Loveneet@gmail.com");
		driver.findElement(By.name("password")).sendKeys("weqweqw");
		
		WebElement CountryName=driver.findElement(By.id("country"));
		
		Select sel=new Select(CountryName);
		sel.selectByVisibleText("Australia");
		//sel.selectByValue("AF");
		//sel.selectByIndex(9);
		
		
		System.out.println(driver.getTitle());
		driver.quit();		
	}

}

package newbatch_pkg4_dropdown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Example1 {
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
			driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
			
			driver.navigate().to("https://www.pamperedchef.com/register");
			driver.findElement(By.xpath("//input[@id='personalInfoFormTagFirstName']")).sendKeys("Loveneet");
			driver.findElement(By.xpath("//input[@id='userData.emailAddress']")).sendKeys("Loveneet.gupta@gmail.com");
			driver.findElement(By.xpath("//input[@id='confirmEmailAddress']")).sendKeys("Loveneet.gupta@gmail.com");;
			driver.findElement(By.xpath("//input[@id='personalInfoFormTagLastName']")).sendKeys("Gupta");
			driver.findElement(By.xpath("//input[@id='userData.password']")).sendKeys("love#09");
			driver.findElement(By.xpath("//input[@id='confirmPassword']")).sendKeys("love#09");
			
			// Dropdown:-
	WebElement countryDropdown=driver.findElement(By.xpath("//select[@id='registerCreateAccountFormBilling_addressFormTagStateCode']"));;

	Select sel=new Select(countryDropdown);
	sel.selectByIndex(2);
	//sel.selectByValue("AL");
	//sel.selectByVisibleText("Albania");
			
			driver.quit();


		}
}

package pkg13_alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertExample {
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
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Click on go button w/o entering uid and pwd
		driver.findElement(By.name("proceed")).click();
	/**	TakesScreenshot screenshot=(TakesScreenshot)driver;
	File f=screenshot.getScreenshotAs(OutputType.FILE);		
	*/
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		driver.close();
	}
}

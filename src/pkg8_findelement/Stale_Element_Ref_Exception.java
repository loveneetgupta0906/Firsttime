package pkg8_findelement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Stale_Element_Ref_Exception {

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
		driver.navigate().to("http://shopping.rediff.com/");
		
		List<WebElement> alllinks= driver.findElements(By.xpath("//*[@id='popular_cat']/h3/a"));
		
		System.out.println(alllinks.size());
		for(int i=0;i<alllinks.size();i++)
		{
			alllinks.get(i).click();
			System.out.println(driver.getTitle());
		    driver.navigate().back();	
		    
		    //Re-populate links collection(Slate Element)
		    alllinks= driver.findElements(By.xpath("//*[@id='popular_cat']/h3/a"));
		}
		driver.quit();
}
}

package pg9_tables;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParameterisedExample2 {

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
		driver.navigate().to("https://money.rediff.com/mutual-funds");
		
		//get the table
		WebElement table=driver.findElement(By.xpath("//*[@id='MFSearch']/table/tbody/tr/td[1]/table/tbody"));
		List<WebElement> allrows=table.findElements(By.tagName("tr"));
		for(WebElement row:allrows){
			
			//get Cols
		List<WebElement> allcols=row.findElements(By.tagName("td"));
		for(WebElement col:allcols)
		{
			System.out.println(col.getText()+"#");
			
			
		}
		
System.out.println();		
		
		
}
		driver.quit();
		}
}

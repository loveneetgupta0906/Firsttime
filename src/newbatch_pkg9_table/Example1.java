package newbatch_pkg9_table;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class Example1 {
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
		driver.navigate().to("https://money.rediff.com/mutual-funds");
		//get rows of the table
		List<WebElement>allRows=driver.findElements(By.xpath("//*[@id='MFSearch']/table/tbody/tr/td[1]/table/tbody/tr/td[1]"));
		
		for(int r=0;r<allRows.size();r++){
		String MFName=allRows.get(r).getText();
		if(MFName.trim().equals("Edelweiss Low Duration Fund - Direct Plan - Dividend")){
			//print its return value
			
			
					
		
		}
			
		}
		}

}

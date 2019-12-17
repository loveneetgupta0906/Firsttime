package pkg1_basics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchGoogle {

	//@Test
	
	public void launch_google_chorme()
	{
		System.setProperty("webdriver.chrome.driver","C:\\JARS\\chromedriver_win32\\chromedriver.exe");
		
		//launch chrome driver 
		ChromeDriver driver=new ChromeDriver(); 
	     driver.get("https://www.google.com/");
	     
	     driver.quit();
	     
	     
	     
	}
	
	
	//@Test
	public void launch_Naukri_chorme()
	{
		System.setProperty("webdriver.chrome.driver","C:\\JARS\\chromedriver_win32\\chromedriver.exe");
		
		//launch chrome driver 
		ChromeDriver driver=new ChromeDriver(); 
	     driver.get("https://www.naukri.com/");
	     
	     driver.quit();  //close all windows and kill the process
	     
	     
	     
	}
	
	
	
	@Test
	public void launch_Naukri_chorme_close()
	{
		System.setProperty("webdriver.chrome.driver","C:\\JARS\\chromedriver_win32\\chromedriver.exe");
		
		//launch chrome driver 
		ChromeDriver driver=new ChromeDriver(); 
	     driver.get("https://www.naukri.com/");
	     
	     driver.close(); //Close only the active window(base path) not the other tabs Doesn't kill the process
	     
	     
	     
	}
}

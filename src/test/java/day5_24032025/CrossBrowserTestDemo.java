package day5_24032025;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;


public class CrossBrowserTestDemo {
	
	@Parameters("Browser")
	@Test
	public void launchBrowser(@Optional("Chrome")String browser)
	{
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("InternetExplorer"))
		{
			driver=new InternetExplorerDriver();
		}
	}

}

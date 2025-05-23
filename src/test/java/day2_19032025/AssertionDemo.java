package day2_19032025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AssertionDemo {
	WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(priority = 1)
	public void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	@Test(priority = 2)
	public void verifyHomePage()
	{
		String dash=driver.findElement(By.xpath("//div[@id='app']/descendant::h6[1]")).getText();
		
		Assert.assertEquals(dash, "Dashboard");
	}
	@Test(priority = 3)
	public void logout() throws InterruptedException
	{
		driver.findElement(By.className("oxd-userdropdown-tab")).click();
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}


}

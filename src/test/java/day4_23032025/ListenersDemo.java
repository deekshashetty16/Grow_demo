package day4_23032025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(day4_23032025.ListenerTest.class)
public class ListenersDemo {
	public static WebDriver driver;
	
	@Test
	public void login() throws InterruptedException
	{
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	}
	@Test
	public void testToBeFailed()
	{
		Assert.assertTrue(false);
	}
	
	@Test
	public void testToBeSkipped()
	{
		throw new SkipException("Skipping it Deleberately");
	}

}

package day6_25032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM_Login_POM {
	WebDriver driver;
	
	
	public OrangeHRM_Login_POM(WebDriver driver)
	{
		this.driver=driver;
	}
	//Repository
	
	By userNM=By.name("username");
	By passWD=By.name("password");
	By loginBtn=By.xpath("//button[@type='submit']");
	
	public void url()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void enterUserName(String un)
	{
		driver.findElement(userNM).sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		driver.findElement(passWD).sendKeys(pw);
	}
	public void clickOnLoginBTN() throws InterruptedException
	{
		driver.findElement(loginBtn).click();
		Thread.sleep(3000);
	}

}

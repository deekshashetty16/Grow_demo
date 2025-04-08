package day6_25032025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_Login_PageFact {
	WebDriver driver;
	
	
	public OrangeHRM_Login_PageFact(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(driver, this);
	}
	//Repository
	
	@FindBy(name="username") WebElement userNM;
	@FindBy(name="password") WebElement passWD;
	@FindBy(xpath="//button[@type='submit']") WebElement loginBtn;
	
	
	//By userNM=By.name("username");
//	By passWD=By.name("password");
//	By loginBtn=By.xpath("//button[@type='submit']");

	public void url()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	public void enterUserName(String un)
	{
		userNM.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
	   passWD.sendKeys(pw);
	}
	public void clickOnLoginBTN() throws InterruptedException
	{
		loginBtn.click();
		Thread.sleep(3000);
	}

}

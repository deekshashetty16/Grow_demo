package day7_26032025;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFrameworkDemo {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		
		
		String filePath="C:\\Users\\Deeksha Shetty\\OneDrive\\Desktop\\TestingData_ORHM.xlsx";
		FileInputStream fis=new FileInputStream(filePath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		

		int rows=sheet.getLastRowNum();
		System.out.println("Total number of rows:" +rows);
		
		for(int i=1;i<=rows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			XSSFCell  userNM=row.getCell(0);
			XSSFCell pass=row.getCell(1);
			
			
			System.out.println("Username-->"+userNM+"                    Password-->"+pass);
			try {
			driver.findElement(By.name("usename")).sendKeys(userNM.toString());
			driver.findElement(By.name("password")).sendKeys(pass.toString());
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.findElement(By.className("oxd-dropdown-tab")).click();
			driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/child::li[4]/child::a")).click();
			System.out.println("Valid Data");
		    }
		catch(Exception e) 
			{
			System.out.println("Invalid Data");
		    }
	    }
		fis.close();
	}
}

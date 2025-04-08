package day4_23032025;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShots extends ListenersDemo {
	public static void  captureSS(String ssName) throws IOException 
	{
		 TakesScreenshot ts=(TakesScreenshot)driver;
	     File src=ts.getScreenshotAs(OutputType.FILE);
	     File dest=new File("E:\\Screenshots\\"+ssName+".jpeg");
	     FileHandler.copy(src, dest);
	}

}

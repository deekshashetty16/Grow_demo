package day4_23032025;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest extends CaptureScreenShots implements ITestListener{
	public void onTestStart(ITestResult result) {
	    System.out.println("On Start of Test execution:"+result.getName());
	  }

	public void onTestSuccess(ITestResult result) {
		 System.out.println("Test Case Passed :"+result.getName());
		 try {
		 captureSS(result.getName());
		 }
		 catch(IOException e) {
			 e.printStackTrace();
		 }
	  }

	  
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Case Failed :"+result.getName());
	  }

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case Skipped :"+result.getName());
	  }

	  
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	
	  public void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	
	  public void onStart(ITestContext context) {
		  System.out.println("Now The Execution Start");
	  }

	
	  public void onFinish(ITestContext context) {
		  System.out.println("Now The Execution Finished");
	  }

}

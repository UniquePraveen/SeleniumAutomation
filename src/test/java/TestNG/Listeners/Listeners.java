package TestNG.Listeners;

import org.junit.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("Test Case Passed");


    }

    @Override
    public void onTestStart(ITestResult result) {

        System.out.println("Test Case Started");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Case Failed");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Case Skipped");
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test Case Failed With Timeout");
    }

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Suite Started");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Suite Finished");
    }
}

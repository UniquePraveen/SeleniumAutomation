package TestNG.Listeners;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNG.Listeners.Listeners.class)


public class TestListeners {

    @Test
    public void test_01() {
        System.out.println("Test Case 1");

    }

    @Test(timeOut = 1000)
    public void test_02() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Test Case 2");
    }

    @Test(dependsOnMethods = {"test_01"})
    public void test_03() {
        System.out.println("Test Case 3");
    }

    @Test
    public void test_04() {
        System.out.println("Test Case 4");
        Assert.fail();
    }
}

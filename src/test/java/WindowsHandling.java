import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowsHandling {

    WebDriver driver;

    @BeforeMethod
    public void getURL() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/window.xhtml");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void WindowsHandle() throws InterruptedException {
//
//        String parentWindow = driver.getWindowHandle();
//        System.out.println(parentWindow);
//
//        Thread.sleep(5000);
//
//        driver.findElement(By.id("j_idt88:new")).click();
//
//        Set<String> windowsHandles = driver.getWindowHandles();
//
//        for (String windowHandle : windowsHandles) {
//            System.out.println(windowHandle);
//            driver.switchTo().window(windowHandle);
//            System.out.println(driver.getTitle());
//        }
//
//        Thread.sleep(5000);
//
//        driver.close();
//
//        driver.switchTo().window(parentWindow);
//
//        boolean element = driver.findElement(By.id("j_idt88:new")).isDisplayed();
//        System.out.println(element);
//
//        Thread.sleep(5000);
//
//        // Calculate number of windows
//
//        driver.findElement(By.id("j_idt88:j_idt91")).click();
//
//        Set<String> windows = driver.getWindowHandles();
//        System.out.println(windows.size());
//
//        Thread.sleep(5000);
//
//        // Close all the windows except parent window
//
//        driver.findElement(By.id("j_idt88:j_idt93")).click();
//        Set<String> windows2 = driver.getWindowHandles();
//
//        System.out.println(windows2.size());
//
//        for (String windowHandle : windows2) {
//            if (!(windowHandle.equals(parentWindow))) {
//                driver.switchTo().window(windowHandle);
//                driver.close();
//            }
//        }
//
//        Thread.sleep(5000);
//
//        driver.quit();

//        String parentWindow = driver.getWindowHandle();
//        System.out.println(parentWindow);
//
//        driver.findElement(By.xpath("//span[normalize-space()='Open']")).click();
//
//        Thread.sleep(5000);
//
//        String childWindow = driver.getWindowHandle();
//        System.out.println(childWindow);
//
//
//
//        driver.switchTo().window(parentWindow);
//
//
//        driver.findElement(By.xpath("//span[normalize-space()='Open Multiple']")).click();
//
//        Set<String> windowsHandles =  driver.getWindowHandles();
//
//        System.out.println(windowsHandles.size());
//
//        for (String handle : windowsHandles) {
//            if (!handle.equals(parentWindow)) {
//                driver.switchTo().window(handle);
//                driver.close();
//            }
//        }

        String childWindowHandler;

        String ParentHandler = driver.getWindowHandle();
        System.out.println(ParentHandler);

        driver.findElement(By.id("j_idt88:new")).click();

        Set<String> Handles = driver.getWindowHandles();

        Iterator<String> iterator =  Handles.iterator();

        iterator.next();



        System.out.println(Handles);

//        for (String handle : Handles) {
//            if (!handle.equals(ParentHandler)) {
//                childWindowHandler = handle;
//                driver.switchTo().window(childWindowHandler);
//
//
//            }
//
//        }



      driver.switchTo().window(ParentHandler);





        Thread.sleep(2000);

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            //  driver.quit();
        }
    }
}

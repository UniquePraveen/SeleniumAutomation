import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowsHandling {

    WebDriver driver;

    @BeforeMethod
    public void getURL() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/window.xhtml");
    }

    @Test
    public void WindowsHandle() {

        String parentWindow = driver.getWindowHandle();
        System.out.println(parentWindow);

        driver.findElement(By.id("j_idt88:new")).click();

        Set<String> windowsHandles = driver.getWindowHandles();

        for (String windowHandle : windowsHandles) {
            System.out.println(windowHandle);
            driver.switchTo().window(windowHandle);
            System.out.println(driver.getTitle());
        }

        driver.close();

        driver.switchTo().window(parentWindow);

        boolean element = driver.findElement(By.id("j_idt88:new")).isDisplayed();
        System.out.println(element);

        // Calculate number of windows

        driver.findElement(By.id("j_idt88:j_idt91")).click();

        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows.size());

        // Close all the windows except parent window

        driver.findElement(By.id("j_idt88:j_idt93")).click();
        Set<String> windows2 = driver.getWindowHandles();

        System.out.println(windows2.size());

        for (String windowHandle : windows2) {
            if (!(windowHandle.equals(parentWindow))) {
                driver.switchTo().window(windowHandle);
                driver.close();
            }
        }

        driver.quit();

    }
}

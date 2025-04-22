import org.openqa.selenium.Beta;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameHandling {


    WebDriver driver;

    @BeforeMethod
    public void GetURL() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/frame.xhtml");
    }
    @Test
    public void FrameHandle() {

        // Inside Frame
        driver.switchTo().frame(0);
        WebElement frameButton = driver.findElement(By.xpath("//button[@ onclick=\"change()\"]"));
        frameButton.click();
        System.out.println(frameButton.getText());

        // Nested Frame

        driver.switchTo().defaultContent();

        driver.switchTo().frame(2);

        driver.switchTo().frame(0);

        WebElement frameButton2 = driver.findElement(By.id("Click"));
        frameButton2.click();
        System.out.println(frameButton2.getText());


        // Count number of iframes

        driver.switchTo().defaultContent();

        System.out.println("Number of iframes: " + driver.findElements(By.tagName("iframe")).size());

        driver.quit();

    }


}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class BrokenImageAndDateAndTime {

    WebDriver driver;

    @BeforeMethod
    public void setDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void BrokenImage() {

        driver.get("https://the-internet.herokuapp.com/broken_images");
        List<WebElement> images = driver.findElements(By.xpath("//div[@class=\"example\"]/img"));

        int i = 1;
        for (WebElement image : images) {

            if (image.getAttribute("naturalWidth").equals("0")) {

                System.out.println("image" + i + ": " + "Broken Image");
            }

            else {

                System.out.println("image" + i + ": " + "Not Broken Image");
            }

            i++;
        }

        driver.quit();

    }
}

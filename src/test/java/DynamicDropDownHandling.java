import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DynamicDropDownHandling {

    // Global Variable
    WebDriver driver;

    @BeforeMethod
    public void driverInit() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void DynamicDropDown() throws InterruptedException {


        WebElement SearchBar = driver.findElement(By.xpath("//textarea[@jsname=\"yZiJbe\"]"));
        Thread.sleep(3000);
        SearchBar.sendKeys("Apple");
        Thread.sleep(6000);
        List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul"));

        for (WebElement el : list) {

            System.out.println(el.getText());

            if (el.getText().equals("Apple")) {
                el.click();
                break;
            }

        }
        Thread.sleep(3000);


    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class Locators {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void seleniumLocators() throws InterruptedException {

        // Classname
        driver.findElement(By.className("gLFyf")).sendKeys("Apple" + Keys.ENTER);
        Thread.sleep(5000);
        driver.navigate().back();

        // Id
        driver.findElement(By.id("APjFqb")).sendKeys("Orange" + Keys.ENTER);
        Thread.sleep(5000);
        driver.navigate().back();

        //name
        driver.findElement(By.name("q")).sendKeys("Mango" + Keys.ENTER);
        Thread.sleep(5000);
        driver.navigate().back();

        //Css-selector
        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Guava" + Keys.ENTER);
        Thread.sleep(5000);
        driver.navigate().back();

        //Link-text
        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(5000);
        driver.navigate().back();

        //Partial Link-text
        driver.findElement(By.partialLinkText("Ima")).click();




        Thread.sleep(5000);


    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}

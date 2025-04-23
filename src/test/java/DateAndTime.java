import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class DateAndTime {


    WebDriver driver;

    @BeforeMethod
    public void setDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
    }

    @Test
    public void DateAndTimehandle() throws InterruptedException {

        Actions action = new Actions(driver);

        WebElement uploadButton = driver.findElement(By.xpath("//*[@id=\"singleFileForm\"]/button"));

        action.moveToElement(uploadButton).perform();

        WebElement datePickerOption = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
        datePickerOption.click();

        Thread.sleep(2000);

        String year = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//div/span[1]")).getText();
        String month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//div/span[2]")).getText();


        while (true) {

            if (year.equals("2026") && month.equals("September")) {
                break;
            } else {
                driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
            }
        }

        List<WebElement> dates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td/a"));


        for (WebElement date : dates) {
            if (date.getText().equals("9")) {
                date.click();
                break;
            }
        }

        Thread.sleep(5000);
        driver.quit();

    }
}

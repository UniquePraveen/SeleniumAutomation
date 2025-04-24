import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableHandling {

    WebDriver driver;

    @BeforeMethod
    public void setDriver() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void tableHandlings() throws InterruptedException {

        driver.get("https://testautomationpractice.blogspot.com/");

        // How many rows in the table
        List<WebElement> Column = driver.findElements(By.xpath("//table[@id=\"productTable\"]/thead//th"));
        System.out.println("Number of Column: " + Column.size());

        // How many columns in the table
        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tbody/tr"));
        System.out.println("Number of Rows: " + Rows.size());

        // Retrieve random table resource
        String resource = driver.findElement(By.xpath("//table[@id=\"productTable\"]/tbody/tr[4]/td[2]")).getText();
        System.out.println("Resource: " + resource);

        // Retrieve all resources from the table

        for (int i = 1; i <= Rows.size(); i++) {

            for (int j = 1; j < Column.size(); j++) {
                WebElement element = driver.findElement(By.xpath("//table[@id=\"productTable\"]/tbody/tr[" + i + "]/td[" + j + "]"));
                System.out.print(element.getText() + " ");
            }

            System.out.println();
        }

        // Print ID and Name only

        for (int i = 1; i <= Rows.size(); i++) {

            String productID = driver.findElement(By.xpath("//table[@id=\"productTable\"]/tbody/tr[" + i + "]/td[1]")).getText();
            String Name = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tbody/tr[" + i + "]/td[2]")).getText();
            System.out.println("Product ID: " + productID + " Name: " + Name);

        }


        // Select all the checkboxes


        List<WebElement> numbers = driver.findElements(By.xpath("//*[@class=\"pagination\"]/li"));

        for (int i = 0; i < numbers.size(); i++) {

            numbers.get(i).click();
            Thread.sleep(5000);

            for (int j = 1; j <= Rows.size(); j++) {

                driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[" + j + "]/td[4]/input")).click();
                Thread.sleep(5000);

            }
        }

        // Select specific checkbox

//        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input"));
//
//        if (!(checkbox.isSelected())) {
//            checkbox.click();
//        }
//
//
//        Thread.sleep(5000);

        driver.quit();
    }


}


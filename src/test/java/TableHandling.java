import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TableHandling {

    WebDriver driver;

    @BeforeMethod
    public void setDriver() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void tableHandlings() {

        driver.get("https://testautomationpractice.blogspot.com/");

        // How many rows in the table
        List<WebElement> Cloums = driver.findElements(By.xpath("//table[@class=\"table table-bordered\"]/tbody/tr"));
        System.out.println("Number of Columns: " + Cloums.size());

        // How many columns in the table
        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tbody/tr"));
        System.out.println("Number of Rows: " + Rows.size());

        // Retrieve random table resource
        String resource = driver.findElement(By.xpath("//table[@id=\"productTable\"]/tbody/tr[4]/td[2]")).getText();
        System.out.println("Resource: " + resource);

        // Retrieve all resources from the table

        for (int i = 1; i <= Rows.size(); i++) {

            for (int j = 1; j < Cloums.size(); j++) {
                WebElement element = driver.findElement(By.xpath("//table[@id=\"productTable\"]/tbody/tr[" + i + "]/td[" + j + "]"));
                System.out.println(element.getText() + "/tab");
            }

            System.out.println();
        }

    }

    // Print ID and Name only


    // Select all the checkboxes
    // Select specific checkbox


}


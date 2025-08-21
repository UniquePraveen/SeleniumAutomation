import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
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
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void tableHandlings() throws InterruptedException {


//        // How many rows in the table
//        List<WebElement> Column = driver.findElements(By.xpath("//table[@id=\"productTable\"]/thead//th"));
//        System.out.println("Number of Column: " + Column.size());
//
//        // How many columns in the table
//        List<WebElement> Rows = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tbody/tr"));
//        System.out.println("Number of Rows: " + Rows.size());
//
//        // Retrieve random table resource
//        String resource = driver.findElement(By.xpath("//table[@id=\"productTable\"]/tbody/tr[4]/td[2]")).getText();
//        System.out.println("Resource: " + resource);
//
//        // Retrieve all resources from the table
//
//        for (int i = 1; i <= Rows.size(); i++) {
//
//            for (int j = 1; j < Column.size(); j++) {
//                WebElement element = driver.findElement(By.xpath("//table[@id=\"productTable\"]/tbody/tr[" + i + "]/td[" + j + "]"));
//                System.out.print(element.getText() + " ");
//            }
//
//            System.out.println();
//        }
//
//        // Print ID and Name only
//
//        for (int i = 1; i <= Rows.size(); i++) {
//
//            String productID = driver.findElement(By.xpath("//table[@id=\"productTable\"]/tbody/tr[" + i + "]/td[1]")).getText();
//            String Name = driver.findElement(By.xpath("//table[@id=\"productTable\"]//tbody/tr[" + i + "]/td[2]")).getText();
//            System.out.println("Product ID: " + productID + " Name: " + Name);
//
//        }
//
//
//        // Select all the checkboxes
//
//
//        List<WebElement> numbers = driver.findElements(By.xpath("//*[@class=\"pagination\"]/li"));
//
//        for (int i = 0; i < numbers.size(); i++) {
//
//            numbers.get(i).click();
//            Thread.sleep(5000);
//
//            for (int j = 1; j <= Rows.size(); j++) {
//
//                driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[" + j + "]/td[4]/input")).click();
//                Thread.sleep(5000);
//
//            }
//        }

        // Select specific checkbox

//        WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"productTable\"]/tbody/tr[1]/td[4]/input"));
//
//        if (!(checkbox.isSelected())) {
//            checkbox.click();
//        }
//
//
//        Thread.sleep(5000);

        Actions action = new Actions(driver);

        action.moveToElement(driver.findElement(By.xpath("//*[text() = 'Pagination Web Table']"))).perform();

        // Count of Rows
        int rowCount = driver.findElements(By.xpath("//table[@id = 'productTable']/tbody/tr")).size();

        // Count of Columns
        int columnCount = driver.findElements(By.xpath("//table[@id = 'productTable']/tbody/tr[1]/td")).size();

        System.out.println("Number of rows: " + rowCount);
        System.out.println("Number of columns: " + columnCount);

        // Retrieve Random Data From Table
        String resource = driver.findElement(By.xpath("//table[@id = 'productTable']/tbody/tr[1]/td[2]")).getText();
        System.out.println("Resource Name: " + resource);

        // Retrieve All the Data From Table

        for (int i = 1; i <= rowCount; i++) {
            for (int j = 1; j < columnCount; j++) {
                String data = driver.findElement(By.xpath("//table[@id = 'productTable']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                System.out.print(data + "\t\t");
            }

            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= rowCount; j++) {
                driver.findElement(By.xpath("//table[@id = 'productTable']/tbody/tr[" + j + "]/td[4]/input")).click();
            }

            driver.findElement(By.xpath("//ul[@class = 'pagination']/li[" + i + "]")).click();
            Thread.sleep(2000);



        }

    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


}


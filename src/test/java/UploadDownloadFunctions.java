import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;


public class UploadDownloadFunctions {

    WebDriver driver;

    @BeforeMethod
    public void getURL() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/file.xhtml");
    }


//    @Test
//    public void downloadFile() {
//
//        driver.findElement(By.id("j_idt93:j_idt95")).click();
//
//        File file = new File("/Users/praveen/Downloads");
//        File[] totalFiles = file.listFiles();
//
//        Assert.assertNotNull(totalFiles);
//        for (File findFile : totalFiles) {
//
//
//            if (findFile.getName().equals("TestLeaf Logo.png ")) {
//                System.out.println("File Found");
//                break;
//
//            }
//
//        }
//
//
//    }

    @Test
    public void uploadFile() {

        String filePath = "/Users/praveen/Downloads/ITS4202_Emerging_Technologies_assignII .pdf";

        // Step 1: Locate the input element
        // You can send file path directly using sendKeys
        driver.findElement(By.xpath("//input[@id=\"j_idt88:j_idt89_input\"]")).sendKeys(filePath);








    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

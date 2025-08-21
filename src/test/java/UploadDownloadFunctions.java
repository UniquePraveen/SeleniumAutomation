import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver.get("https://www.ilovepdf.com/pdf_to_word");
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

//    @Test
//    public void uploadFile() {
//
//        String filePath = "/Users/praveen/Downloads/ITS4202_Emerging_Technologies_assignII .pdf";
//
//        // Step 1: Locate the input element
//        // You can send file path directly using sendKeys
//        driver.findElement(By.xpath("//input[@id=\"j_idt88:j_idt89_input\"]")).sendKeys(filePath);
//
//
//    }

    @Test
    public void uploadFileUsingJSExecutor() {

        // Navigate to real website with hidden input
    //    driver.get("https://www.ilovepdf.com/pdf_to_word");

        // Step 1: Locate hidden input element
        WebElement fileInput = driver.findElement(By.xpath("//input[@type=\"file\"]"));

        // Step 2: Make hidden input visible
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.display='block';", fileInput);

        // Step 3: Upload the file using sendKeys
        fileInput.sendKeys("/Users/admin/Downloads/QA_Engineer_Cover_Letter_Praveen .pdf");

        System.out.println("✅ File uploaded successfully");




    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

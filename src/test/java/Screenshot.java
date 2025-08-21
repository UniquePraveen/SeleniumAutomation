import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Screenshot {

    WebDriver driver;

    @BeforeMethod
    public void setDriver() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }

    @Test
    public void takeScreenshot() throws IOException, AWTException, InterruptedException {

        // Take screenshot Interface and type-casting used for get screenshot.
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        File destination = new File("//Users//praveen//Documents//IntelliJ//Selenium_Automation//Screenshots//Screenshot_6.png");
//        FileUtils.copyFile(source, destination);
        //   Way -02
        // FileHandler.copy(source, destination);


//        // Method 1 - Take Full Screen Screenshot
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
//        File destination = new File("//Users//admin//IdeaProjects//SeleniumAutomation//Screenshots//Screenshot_1.png");
//        FileHandler.copy(source, destination);
//
//
//
//
//
//        // Method 2 - Take Specific Element Screenshot
//        WebElement section = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[1]"));
//        File source_1 = section.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
//        File destination_1 = new File("//Users//admin//IdeaProjects//SeleniumAutomation//Screenshots//Screenshot_2.png");
//        FileUtils.copyFile(source_1, destination_1);
//

        // Method 3 - Take a entire page screenshot

//        Robot robot = new Robot();
//        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
//        Rectangle rectangle = new Rectangle(screen);
//        BufferedImage image = robot.createScreenCapture(rectangle);
//        File outputfile = new File("//Users//admin//IdeaProjects//SeleniumAutomation//Screenshots//Screenshot_3.png");
//        ImageIO.write(image, "png", outputfile);

        WebElement googleBanner =  driver.findElement(By.xpath("//*[@class = 'lnXdpd']"));
       // TakesScreenshot ts = (TakesScreenshot) driver;
        File source = googleBanner.getScreenshotAs(OutputType.FILE);
        File dest = new File( System.getProperty("user.dir")+ "//Screenshots//GoogleBanner.png");
        FileHandler.copy(source, dest);

       Robot robot = new  Robot();
       Dimension Screensize = Toolkit.getDefaultToolkit().getScreenSize();
       Rectangle rectangle = new Rectangle(Screensize);
       BufferedImage Screen =  robot.createScreenCapture(rectangle);
       File Dest = new File(System.getProperty("user.dir")+"//Screenshots//EntireScreenshot.png");
        ImageIO.write(Screen, "png", Dest);







    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

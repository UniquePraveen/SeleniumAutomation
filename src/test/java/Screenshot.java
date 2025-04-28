import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Screenshot {

    WebDriver driver;

    @BeforeMethod
    public void setDriver() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/alert.xhtml ");
    }

    @Test
    public void takeScreenshot() throws IOException, AWTException, InterruptedException {

        // Method 1 - Take Full Screen Screenshot
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
        File destination = new File("//Users//praveen//Documents//IntelliJ//Selenium_Automation//Screenshots//Screenshot.png");
        FileHandler.copy(source, destination);


        // Method 2 - Take Specific Element Screenshot
        WebElement section = driver.findElement(By.xpath("//*[@id=\"j_idt88\"]/div/div[1]/div[1]"));
        File source_1 = section.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
        File destination_1 = new File("//Users//praveen//Documents//IntelliJ//Selenium_Automation//Screenshots//Screenshot_1.png");
        FileUtils.copyFile(source_1, destination_1);

        // Method 3 - Take a entire page screenshot

        Robot robot = new Robot();
        Dimension screen =  Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(screen);
        BufferedImage image = robot.createScreenCapture(rectangle);
        File outputfile = new File("//Users//praveen//Documents//IntelliJ//Selenium_Automation//Screenshots//Screenshot_2.png");
        ImageIO.write(image, "png", outputfile);

        Thread.sleep(4000);
        driver.quit();



    }
}

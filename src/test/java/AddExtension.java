import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class AddExtension {

    WebDriver driver;

    @Test
    public void addExtension(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        File Location = new File("/Users/praveen/Downloads/SelectorsHub.crx");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(Location);
       // driver.quit();
    }
}

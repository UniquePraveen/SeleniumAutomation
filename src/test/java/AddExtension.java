import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class AddExtension {

   static  WebDriver driver;

    @Test
    public static void addExtension(){

      File location = new File("/Users/admin/Downloads/SelectorsHub-Chrome-Web-Store.crx");
      ChromeOptions options = new ChromeOptions();
      options.addExtensions(location);
      driver = new ChromeDriver(options);
      driver.manage().window().maximize();
      driver.get("https://www.google.com");


    }
}

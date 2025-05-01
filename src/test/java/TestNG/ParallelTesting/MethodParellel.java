package TestNG.ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class MethodParellel {

    @Test
    public void method1(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }

    @Test
    public void method2(){
        WebDriver driver = new SafariDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }
}

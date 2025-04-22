import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkTest {

    WebDriver driver;

    @BeforeMethod
    public void openLink(){

        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/link.xhtml");
        driver.manage().window().maximize();
    }

    @Test
    public void linkTest(){

        //click on the link
       WebElement HomeLink =  driver.findElement(By.linkText("Go to Dashboard"));
       HomeLink.click();
       driver.navigate().back();

       //Find the URL without clicking
        WebElement destinationLink = driver.findElement(By.partialLinkText("Find the URL"));
        System.out.println(destinationLink.getAttribute("href"));

        //Am I Broken Link
        WebElement BrokenLink = driver.findElement(By.linkText("Broken?"));
        BrokenLink.click();
        String title = driver.getTitle();

        if(title.contains("404")){
            System.out.println("Am I Broken Link");
        }else{
            System.out.println("Am Not Broken Link");
        }
        driver.navigate().back();

        // Duplication Link
        WebElement HomeLink2 =  driver.findElement(By.linkText("Go to Dashboard"));
        HomeLink2.click();
        driver.navigate().back();

        // Count the number of links
        int count = driver.findElements(By.tagName("a")).size();
        System.out.println("Number of links: " + count);

        // Count the number of links with the class "link"
        WebElement LayoutElement = driver.findElement(By.className("layout-main-content"));
        int count2 = LayoutElement.findElements(By.tagName("a")).size();
        System.out.println("Number of links with class 'link': " + count2);

        driver.quit();


    }
}

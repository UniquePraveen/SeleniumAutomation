import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling {

    WebDriver driver;

    @BeforeMethod
    public void getURL() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/alert.xhtml");

    }

    @Test
    public void alertHandling() throws InterruptedException {

        // Simple Dialog
        WebElement Button = driver.findElement(By.id("j_idt88:j_idt91"));
        Button.click();
        driver.switchTo().alert().accept();

        // Confirm Alert
        WebElement Button2 = driver.findElement(By.id("j_idt88:j_idt93"));
        Button2.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        // Prompt Alert
        WebElement Button3 = driver.findElement(By.id("j_idt88:j_idt104"));
        Button3.click();
        Thread.sleep(5000);
        Alert alert2 = driver.switchTo().alert();
        alert2.sendKeys("I'm Praveen");

//        // Sweet Alert
//        WebElement Button4 = driver.findElement(By.xpath("//span[@class = \"ui-button-icon-left ui-icon ui-c pi pi-trash\"]"));
//        Button4.click();
//        Alert alert3 = driver.switchTo().alert();
//        driver.findElement(By.id("j_idt88:j_idt108")).click();



        Thread.sleep(5000);

        driver.quit();


    }
}

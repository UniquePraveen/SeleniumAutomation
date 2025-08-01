import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.lang.model.element.Name;

public class TextBoxHandling {

    WebDriver driver;

    @BeforeMethod
    public void openLink() {

        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/input.xhtml");
        driver.manage().window().maximize();
    }

    @Test
    public void textBoxHandling() throws InterruptedException {

        // Fill the text box
        WebElement name = driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Praveen");

        Thread.sleep(2000);

        // Append text to the text box
        WebElement append = driver.findElement(By.id("j_idt88:j_idt91"));
        append.sendKeys("Colombo");

        Thread.sleep(2000);

        // Disabled the text box
        boolean disabled = driver.findElement(By.id("j_idt88:j_idt93")).isDisplayed();
        System.out.println("Textbox is: " + disabled);

        Thread.sleep(2000);

        // Clear the text box
        WebElement clear = driver.findElement(By.id("j_idt88:j_idt95"));
        clear.click();

        Thread.sleep(2000);

        // Retrieve the text box value
        String value = driver.findElement(By.id("j_idt88:j_idt97")).getAttribute("value");
        System.out.println("Textbox value: " + value);

        Thread.sleep(2000);

        // Emailed the text box
        WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));
        email.sendKeys("Praveen@gmail.com" + Keys.TAB + "I'm a undergraduate");

        driver.quit();


    }
}

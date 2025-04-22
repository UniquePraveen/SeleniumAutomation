import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class KeyBoardActions {

    WebDriver driver;

    @BeforeMethod
    public void getURL() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void KeyBoardAction() throws InterruptedException {

        driver.get("https://www.leafground.com/list.xhtml");

        // Perform multiple Selection
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"pickList\"]/div[2]/ul/li"));

        System.out.println(elements.size());

        Actions action = new Actions(driver);

        action.keyDown(Keys.COMMAND).click(elements.get(0))
                .click(elements.get(1))
                .click(elements.get(2))
                .click(elements.get(3))
                .keyUp(Keys.COMMAND)
                .perform();

        Thread.sleep(5000);

        driver.quit();

    }

    @Test
    public void googleSearch() throws InterruptedException {

        // Type in Block Letter and select and CUT
        driver.get("https://www.google.com/");
        WebElement SearchBox = driver.findElement(By.name("q"));

        Actions action = new Actions(driver);

        action.keyDown(Keys.SHIFT)
                        .sendKeys("Apple")
                        .keyUp(Keys.SHIFT)
                        .perform();

        Thread.sleep(5000);

        action .keyDown(Keys.COMMAND)
                        .sendKeys("a")
                        .keyUp(Keys.COMMAND)
                        .keyDown(Keys.COMMAND)
                        .sendKeys("x")
                        .keyUp(Keys.COMMAND)
                        .perform();

        Thread.sleep(3000);

        driver.quit();
    }
}

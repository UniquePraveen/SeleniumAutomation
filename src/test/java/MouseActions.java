import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseActions {

    WebDriver driver;

    @BeforeMethod
    public void getURL() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/drag.xhtml");
    }


    @Test
    public void MouseAction() throws InterruptedException {

        // Mouse Hover Function


        WebElement element = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt37\"]/a/i[1]"));
        WebElement element2 = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt38\"]/a/i[1]"));
        WebElement element3 = driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a/i[1]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(element)
                .moveToElement(element2)
                .moveToElement(element3).perform();


        // Drag and Drop

        WebElement drag = driver.findElement(By.xpath("//div[@id=\"form:drag\"]"));
        WebElement drop = driver.findElement(By.xpath("//div[@id=\"form:drop\"]"));

        // Way - 01
      //  actions.clickAndHold(drag).moveToElement(drop).release().perform();

        //Way - 02
        actions.dragAndDrop(drop, drag).perform();


        // Slider Function

        WebElement slider = driver.findElement(By.xpath("//*[@id=\"form:j_idt125\"]/span[1]"));
        WebElement slider2 = driver.findElement(By.xpath("//*[@id=\"form:j_idt125\"]/span[2]"));

        System.out.println(slider.getLocation());

        actions.dragAndDropBy(slider, 50, 0).perform();

        System.out.println(slider.getLocation());

        Thread.sleep(3000);

        driver.quit();


    }
}

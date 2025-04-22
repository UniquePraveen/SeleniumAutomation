import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonHandling {

    WebDriver driver;

    @BeforeMethod
    public void openLink() {

        driver = new ChromeDriver();
        driver.get("https://www.leafground.com/button.xhtml");
        Dimension dimension = new Dimension(1200, 700);
        driver.manage().window().setSize(dimension);
        // driver.manage().window().maximize();

    }

    @Test
    public void ButtonHandle() {

        // Click on the button
        WebElement Button = driver.findElement(By.id("j_idt88:j_idt90"));
        Button.click();
        String ExpectedTitle = "Dashboard";
        String ActualTitle = driver.getTitle();

      /*  if(ExpectedTitle.equals(ActualTitle)){

            System.out.println("Title Matched");
        }
        else {
            System.out.println("Title Did not Matched");
        }
*/
        Assert.assertEquals(ActualTitle, ExpectedTitle, "Title Matched");

        driver.navigate().back();

        // Find Position of the button
        WebElement Button2 = driver.findElement(By.id("j_idt88:j_idt94"));
        Point Location = Button2.getLocation();
        int x = Location.getX();
        int y = Location.getY();
        System.out.println("Button Position X: " + x + " Y: " + y);

        // Find the color of the button
        WebElement Button3 = driver.findElement(By.id("j_idt88:j_idt96"));
        System.out.println("Button Color: " + Button3.getCssValue("background-color"));

        // Find Height and Width of Button
        WebElement Button4 = driver.findElement(By.id("j_idt88:j_idt98"));
        System.out.println("Button Height: " + Button4.getSize().getHeight() + " Width: " + Button4.getSize().getWidth());

        driver.quit();


    }
}

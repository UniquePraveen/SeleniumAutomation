import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class RaionAndCheckBoxHandling {

    WebDriver driver;

    @BeforeMethod
    public void getBaseUrl() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void RadioButtonHandling() throws InterruptedException {
        driver.get("https://www.leafground.com/radio.xhtml");
        // Find default selected radioButton

        List<WebElement> options = driver.findElements(By.xpath("//table[@id=\"j_idt87:console2\"]//input"));

        System.out.println(options.size());
        int i = -1;
        for (WebElement option : options) {
            i++;
            if (option.isSelected()) {
                System.out.println(driver.findElement(By.xpath("//label[@for=\"j_idt87:console2:" + i + "\"]")).getText());
                break;
            }
        }

        // Click the radio Button is not Selected

        String age = "41-60 Years";
        List<WebElement> options1 = driver.findElements(By.xpath("//div[@id=\"j_idt87:age\"]/div/div/label"));

        for (WebElement option : options1) {

            if (option.getText().equals(age)) {
                if (!(option.isSelected())) {
                    break;
                }

            }
        }

        Thread.sleep(3000);

        driver.quit();


    }

    @Test
    public void CheckboxHandling() throws InterruptedException {

        driver.get("https://www.leafground.com/checkbox.xhtml");
        List<WebElement> options = driver.findElements(By.xpath("//table[@id=\"j_idt87:basic\"]//label"));

        for (WebElement option : options) {
            if (!(option.getText().equals("Others"))) {
                option.click();
                System.out.println(option.getText());
            }
        }

        // Select method only support for <input> tag
        // Check Selected Status
        List<WebElement> options2 = driver.findElements(By.xpath("//table[@id=\"j_idt87:basic\"]//input"));


        for (WebElement option : options2) {

            System.out.println(option.isSelected());
        }

        Thread.sleep(3000);
        driver.quit();

    }
}




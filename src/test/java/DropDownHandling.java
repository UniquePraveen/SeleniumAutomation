import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class DropDownHandling {
    WebDriver driver;


    @BeforeMethod
    public void openLink() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void dropDownHandling() throws InterruptedException {

        driver.get("https://www.leafground.com/select.xhtml");

        Thread.sleep(3000);
        // Select the option from the basic dropdown
        WebElement dropDown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));

        Select select = new Select(dropDown);
        select.selectByIndex(1);
        Thread.sleep(3000);
        select.selectByVisibleText("Playwright");
        Thread.sleep(3000);


        // Get number of options in the dropdown

        List<WebElement> options = select.getOptions();
        int size = options.size();
        System.out.println("Number of options: " + size);

        for (WebElement option : options) {

            System.out.println(option.getText());

        }

        // Select by sending keys

        dropDown.sendKeys("Cypress");
        Thread.sleep(3000);

        // Select by Bootstrap Select

        driver.findElement(By.xpath("//*[@id=\"j_idt87:country\"]/div[3]")).click();
        List<WebElement> Options2 = driver.findElements(By.xpath("//*[@id=\"j_idt87:country_items\"]/li"));

        for (WebElement option : Options2) {
            String value = option.getText();

            if (value.equals("USA")) {

                option.click();
                break;
            }
        }

        Thread.sleep(3000);

        driver.quit();
    }

    @Test
    public void googleSearchAutoSuggestionDropDown() throws InterruptedException {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--headless");
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Kumara");

        Thread.sleep(3000);

        List<WebElement> DropDownOptions = driver.findElements(By.xpath("//ul[@class=\"G43f7e\"]/li//div[@class=\"wM6W7d\"]"));

        for (WebElement option : DropDownOptions) {
            System.out.println(option.getText());
        }

        driver.quit();
    }

    // Handle Auto Hide DropDown Menu

    @Test
    public void AutoHideDropDown() throws InterruptedException {

        driver.get("https://www.flipkart.com/");
        driver.findElement(By.className("Pke_EE")).sendKeys("Apple");
        Thread.sleep(10000);

        List<WebElement> options3 = driver.findElements(By.xpath("//ul[@class=\"col-12-12 bbjHWC QDWHTu\"]/li//div[@class=\"x6GwIv _2Ipp17\"]"));


        for (WebElement option : options3) {
            System.out.println(option.getText());
        }

        driver.quit();

    }

}

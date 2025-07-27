package TestNG.DataProvider;

import org.openqa.selenium.firefox.AddHasExtensions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simpleCalculatorTest.ArithmeticOperatorDataProvider;

public class DataProvider_2 {

    @Test(dataProvider = "data")
    public void addSum(int a, int b) {

        System.out.println("Sum of " + a + " and " + b + " is: a " + (a + b));
    }

    @DataProvider(name = "data")
    public Object[][] getData() {
        Object[][] val = {{10, 20}, {20, 20}, {30, 30}};
        return val;
    }

}

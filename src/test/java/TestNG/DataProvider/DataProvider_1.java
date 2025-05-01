package TestNG.DataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simpleCalculatorTest.ArithmeticOperatorDataProvider;

public class DataProvider_1 {

    @Test(dataProvider = "data")
    public void addSum(int a, int b, int expected) {
        Assert.assertEquals(ArithmeticOperatorDataProvider.addSum(a, b), expected,"Failed to Calculate the SUM");
        System.out.println(ArithmeticOperatorDataProvider.addSum(a, b));
    }

    @DataProvider(name = "data")
    public Object[][] getData() {

        Object[][] val = {
                {10, 20, 30},
                {20, 40, 60},
                {40, 70, 110}
        };

        return val;


    }


}

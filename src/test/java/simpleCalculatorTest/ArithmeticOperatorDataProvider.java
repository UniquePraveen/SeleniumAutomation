package simpleCalculatorTest;

import TestNG.DataProvider.DataProvider_1;
import org.testng.annotations.Test;

public class ArithmeticOperatorDataProvider {

    @Test(dataProvider = "data", dataProviderClass = DataProvider_1.class)
    public static int addSum(int a, int b) {

        return a + b;
    }


}

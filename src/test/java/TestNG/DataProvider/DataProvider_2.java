package TestNG.DataProvider;

import org.testng.annotations.Test;

public class DataProvider_2 {

    @Test(dataProvider = "data", dataProviderClass = DataProvider_1.class)
    public void addSum(int a, int b){

        System.out.println("Sum of " + a + " and " + b + " is: a " + (a+b));
    }



}

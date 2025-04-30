package simpleCalculatorTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import simpleCalculator.ArthmeticOperations;

public class ArthmeticOpeartionsTest {

    @Test(priority = 0)
    public void addTest(){

        // Hard Assertions

//        System.out.println("First Test Case is Running");
//        Assert.assertEquals(ArthmeticOperations.add(10, 20), 30, "Addition is working");
//
//        System.out.println("Second Test Case is Running");
//        Assert.assertEquals(ArthmeticOperations.add(20, 20), 40, "Addition is working");
//
//        System.out.println("Third Test Case is Running");
//        Assert.assertEquals(ArthmeticOperations.add(40, 20), 60, "Addition is not working");

        // Soft Assertions

        SoftAssert SF = new SoftAssert();

        System.out.println("First Test Case is Running");
        SF.assertEquals(ArthmeticOperations.add(10, 20), 30, "Addition is working");

        System.out.println("Second Test Case is Running");
        SF.assertEquals(ArthmeticOperations.add(20, 20), 40, "Addition is working");

        System.out.println("Third Test Case is Running");
        SF.assertEquals(ArthmeticOperations.add(40, 20), 60, "Addition is not working");

        SF.assertAll();
    }

    @Test(priority = 1)
    public void SubTest(){

        System.out.println("First Test Case is Running");
        Assert.assertEquals(ArthmeticOperations.sub(10, 20), -10, "Addition is working");

        System.out.println("Second Test Case is Running");
        Assert.assertEquals(ArthmeticOperations.sub(20, 20), 0, "Addition is working");

        System.out.println("Third Test Case is Running");
        Assert.assertEquals(ArthmeticOperations.sub(40, 20), 20, "Addition is not working");
    }
}

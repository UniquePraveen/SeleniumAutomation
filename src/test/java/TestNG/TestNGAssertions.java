package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {

    String actualName = "Praveen";

    // Hard Assertions

//    @Test(priority = 0)
//    public void valuesEqualCheck() {
//
//        String expectedName = "Praveen";
//        System.out.println("Before Assertion");
//        Assert.assertEquals(actualName, expectedName, "Names aren't equal");
//        System.out.println("After Assertion");
//    }
//
//    @Test(priority = 1)
//    public void valuesNotEqualCheck() {
//
//        String expectedName = "Kumar";
//        System.out.println("Before Assertion");
//        Assert.assertNotEquals(actualName, expectedName, "Names are equal");
//        System.out.println("After Assertion");
//    }
//
//    @Test(priority = 2)
//    public void trueCheck() {
//
//        System.out.println("Before Assertion");
//        Assert.assertTrue(actualName.startsWith("P"), "This is a true statement");
//        System.out.println("After Assertion");
//    }
//
//    @Test(priority = 3)
//    public void falseCheck() {
//
//        System.out.println("Before Assertion");
//        Assert.assertFalse(actualName.isBlank(), "This is a false statement");
//        System.out.println("After Assertion");
//    }


    // Soft Assertions

    SoftAssert SF = new SoftAssert();

    @Test(priority = 0)
    public void valuesEqualCheck() {

        String expectedName = "Praveen";
        System.out.println("Before Assertion");
        SF.assertEquals(actualName, expectedName, "Names are equal");
        System.out.println("After Assertion");
        SF.assertAll();
    }

    @Test(priority = 1)
    public void valuesNotEqualCheck() {

        String expectedName = "Kumar";
        System.out.println("Before Assertion");
        SF.assertNotEquals(actualName, expectedName, "Names are not equal");
        System.out.println("After Assertion");
    }

    @Test(priority = 2)
    public void trueCheck() {

        System.out.println("Before Assertion");
        SF.assertTrue(actualName.startsWith("M"), "This is a false statement");
        System.out.println("After Assertion");
        SF.assertAll();

    }

    @Test(priority = 3)
    public void falseCheck() {

        System.out.println("Before Assertion");
        SF.assertFalse(actualName.isBlank(), "This is a false statement");
        System.out.println("After Assertion");
    }

}

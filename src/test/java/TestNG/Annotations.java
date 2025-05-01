package TestNG;

import org.testng.annotations.*;

public class Annotations {

    @Test
    public void testName() {

        System.out.println("Test_01");
    }

    @Test
    public void testName2() {

        System.out.println("Test_02");
    }

    @BeforeSuite
    public void beforeSuite() {

        System.out.println("Before Suite");

    }

    @AfterSuite
    public void afterSuite() {

        System.out.println("After Suite");

    }

    @BeforeMethod
    public void beforeMethod() {

        System.out.println("Before Method");

    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }


    @BeforeClass
    public void beforeClass() {

        System.out.println("Before Class");

    }

    @AfterClass
    public void afterClass() {

        System.out.println("After Class");

    }


}

package TestNG;

import org.testng.annotations.Test;

public class TestGrouping {

    // S - Smoke Testing            // R  - Regression Testing


    @Test(groups = {"R", "S"}, priority = -1)
    public void test1() {
        System.out.println("This is a smoke and regression test case!");
    }

    @Test(groups = {"R"})
    public void test2() {
        System.out.println("This ia a regression test case");
    }

    @Test
    public void test3() {
        System.out.println("This is not a regression or smoke test case");
    }

    @Test(priority = -1, groups = {"S"})
    public void test4() {
        System.out.println("This is a smoke test case!");
    }

    @Test(groups = {"R", "S"})
    public void test5() {
        System.out.println("This is a regression and smoke test case");
    }


}


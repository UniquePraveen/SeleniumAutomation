package TestNG;

import org.testng.annotations.Test;

public class TestGrouping {

    // S - Smoke Testing            // R  - Regression Testing

    @Test(groups = {"S", "R"})
    public void test1() {
        System.out.println("This is a smoke and regression test case");
    }

    @Test(groups = {"R"}, enabled = false)
    public void test2() {
        System.out.println("This ia a regression test case");
    }

    @Test(groups = {"R"})
    public void test3() {
        System.out.println("This is not a regression or smoke test case");
    }

    @Test(groups = {"S"})
    public void test4() {
        System.out.println("This is a smoke test case");
    }

    @Test(groups = {"S"})
    public void test5() {
        System.out.println("This is a regression and smoke test case");
    }


}


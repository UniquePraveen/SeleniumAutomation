package TestNG.Parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import simpleCalculatorTest.ArithmeticOperatorDataProvider;

import java.lang.runtime.SwitchBootstraps;

public class Parameter_3 {

    @Test
    @Parameters("Browser")
    public void driverInitialize(@Optional("Safari") String Browser) {

        switch (Browser) {

            case "Chrome":
                System.out.println("Chrome driver initialized");
                break;
            case "Firefox":
                System.out.println("Firefox driver initialized");
                break;
            case "Safari":
                System.out.println("Safari driver initialized");
                break;
            case "Edge":
                System.out.println("Edge driver initialized");
                break;
            default:
                System.out.println("Chrome driver initialized");

        }


    }
}

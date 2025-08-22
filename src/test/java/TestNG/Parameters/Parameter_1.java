package TestNG.Parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_1 {

    @Parameters({"a", "b"})
    @Test
    public void addSum(@Optional("10") int a,@Optional("40") int b) {

        System.out.println("Summation Value is: " + (a + b));
    }

    @Test
    @Parameters({"a", "b"})
    public void addSubstitute(@Optional("30") int a, @Optional("10") int b) {
        System.out.println("Substitute Value is: " + (a - b));
    }
}

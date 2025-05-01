package TestNG.Parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_2 {

    @Parameters({"a", "b"})
    @Test
    public void addSub(int a, int b) {

        System.out.println("Substraction Value is: " + (a - b));
    }


}

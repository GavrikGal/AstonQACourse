import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CalculateFactorialTest {

    @DataProvider(name = "validInputs")
    public Object[][] createValidInputData() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {10, 3628800}
        };
    }

    @Test(dataProvider = "validInputs")
    public void testCalculateFactorialWithValidInputs(int input, long expected) {
        assertEquals(Main.calculateFactorial(input), expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Факториал не определен для отрицательных чисел.")
    public void testCalculateFactorialNegativeNumber() {
        Main.calculateFactorial(-1);
    }
}

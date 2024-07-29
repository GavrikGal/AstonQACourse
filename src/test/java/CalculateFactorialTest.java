import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CalculateFactorialTest {

    @ParameterizedTest
    @CsvSource({
            "0, 1",
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120",
            "10, 3628800"
    })
    void testCalculateFactorialWithValidInputs(int input, long expected) {
        assertEquals(expected, Main.calculateFactorial(input));
    }

    @Test
    void testCalculateFactorialNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Main.calculateFactorial(-1);
        });
        assertEquals("Факториал не определен для отрицательных чисел.", exception.getMessage());
    }
}
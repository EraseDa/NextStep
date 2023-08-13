package calculatorTest;

import calculator.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator cal;

    @BeforeEach
    public void setup() {
        cal = new StringCalculator();
    }
    @Test
    public void checkNull() {
        assertEquals(0, cal.add(""));
        assertEquals(0, cal.add(null));
    }

}

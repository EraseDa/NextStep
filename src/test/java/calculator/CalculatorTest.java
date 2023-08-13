package calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator cal;

    @BeforeEach
    public void setup() {
        cal = new Calculator();
        System.out.println("before");
    }
    @Test
    @DisplayName("더하기")
    public void add() {
        assertEquals(9, cal.add(3,6));
        System.out.println("add");
    }

    @Test
    @DisplayName("빼기")
    public void subtract() {
        assertEquals(6, cal.subtract(7,1));
        System.out.println("subtract");
    }

    @AfterEach
    public void teardown() {
        System.out.println("teardown");
    }
}

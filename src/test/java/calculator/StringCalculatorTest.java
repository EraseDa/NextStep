package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    private StringCalculator cal;

    @BeforeEach
    public void setup() {
        cal = new StringCalculator();
    }
    @Test
    @DisplayName("text가 null이거나 빈 문자열일 때 0으로 출력")
    public void checkNull() {
        assertEquals(0, cal.add(""));
        assertEquals(0, cal.add(null));
    }

    @Test
    @DisplayName("숫자로만 구성된 문자열일 경우 숫자가 출력")
    public void onlyNum() {
        assertEquals(51, cal.add("51"));
        assertEquals(0, cal.add("0"));
    }

}

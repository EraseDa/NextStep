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

    @Test
    @DisplayName("구분자가 ,인 경우")
    public void splitByComma() {
        assertEquals(5, cal.add("4,1"));
        assertEquals(0, cal.add("0,0"));
    }

    @Test
    @DisplayName("구분자가 ,와 :가 섞인 경우")
    public void splitByCommaAndColon() {
        assertEquals(7, cal.add("4,1:2"));
        assertEquals(0, cal.add("0,0:0"));
    }

    @Test
    @DisplayName("커스텀 구분자인 경우")
    public void splitByCustom() {
        assertEquals(8, cal.add("//;\n1;2;5"));
    }

    //Junit5 부터는 Test어노테이션 옆에 (expected = 입센션)을 사용하지 못하고 대신 아래처럼 assertThrows를 사용해야함
    @Test
    @DisplayName("음수인 경우 RuntimeException")
    public void nativeException() throws Exception {
    assertThrows(RuntimeException.class, ()-> { cal.add("-1,2,5");});
    }
}

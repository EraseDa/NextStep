package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SplitTest {

    @Test
    @DisplayName("숫자로된 문자열을 받았는데 split 메서드를 사용했을 때 배열에 숫자로된 문자열이 그대로 들어간다.")
    public void splitTest(){
        String[] str = "15".split(",");
        Assertions.assertArrayEquals(new String[]{"15"},str);

        String[] str1 = "1,5".split(",");
        Assertions.assertArrayEquals(new String[]{"1","5"},str1);
    }
}

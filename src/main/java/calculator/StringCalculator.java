package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {

    /*
    * 문자열이 있다. 숫자와 구분자로 구성되어 있다.
    * 구분자는 , 또는 : 또는 //커스텀구분자\n로 되어 있다.
    * 구분자로 구분 된 문자열을 서로 더한다. return 값으로 더한 값이 나온다.
    * ex : "7:8,1" 일 경우 7+8+1 = 16 return으로 16이 나온다.
    * 만약 0이거나 빈 문자열일 경우엔 0으로 출력된다.
    * 문자열에 음수가 들어갈 경우엔 RuntimeException으로 예외처리를 해야한다.*/
    public int add(String text) {
        if(checkBlank(text))
            return 0;
        return sum(toInts(split(text)));
    }

    private static boolean checkBlank(String text) {
        return text == null || text.isBlank();
    }

    private static String[] split(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            String customDelimeter = m.group(1);
            return m.group(2).split(customDelimeter);
        }
        return text.split(",|:");
    }

    private static int[] toInts(String[] nums) {
        int[] numbers = new int[nums.length];

        for(int i=0; i<nums.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        return numbers;
    }

    private static int sum(int[] numbers) {
        int sum=0;
        for (int value : numbers) {
                sum+=value;
        }
        return sum;
    }

}

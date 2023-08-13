package calculator;
public class StringCalculator {

    /*
    * 문자열이 있다. 숫자와 구분자로 구성되어 있다.
    * 구분자는 , 또는 : 또는 //커스텀구분자\n로 되어 있다.
    * 구분자로 구분 된 문자열을 서로 더한다. return 값으로 더한 값이 나온다.
    * ex : "7:8,1" 일 경우 7+8+1 = 16 return으로 16이 나온다.
    * 만약 0이거나 빈 문자열일 경우엔 0으로 출력된다.
    * 문자열에 음수가 들어갈 경우엔 RuntimeException으로 예외처리를 해야한다.*/
    public int add(String text) {
        if(text == null || text.isBlank())
            return 0;

        int sum=0;
        String[] nums = text.split(",");
        for (String value : nums) {
                sum+=Integer.parseInt(value);
        }

        return sum;
    }

}

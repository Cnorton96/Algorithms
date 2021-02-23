package Arrays_Strings;

//Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
public class StringConvert1 {


    public static int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int i = 0;
        int sign = 1;
        int result = 0;

        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i++) == '-') {
                sign = -1;
            } else {
                sign = 1;
            }
        }

        while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + (s.charAt(i++) - '0');
        }
        return result * sign;
    }


    public static void main(String[] args) {
        String test1 = "42";
        String test2 = " 43";
        String test3 = "4193 with words";
        String test4 = "words and 987";
    }
}

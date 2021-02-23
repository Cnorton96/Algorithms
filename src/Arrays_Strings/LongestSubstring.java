package Arrays_Strings;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s){
        Set<Character> set = new HashSet<>();
        int leftWindow = 0;
        int rightWindow = 0;
        int answer = 0;
        while(leftWindow < s.length() && rightWindow < s.length()){
            if(!set.contains(s.charAt(rightWindow))){
                set.add(s.charAt(rightWindow++));
                answer = Math.max(answer, rightWindow - leftWindow);
            }else{
                set.remove(s.charAt(leftWindow++));
            }
        }
        return answer;
    }

    public static void main(String[] args){
        String substring1 = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(substring1));
    }
}

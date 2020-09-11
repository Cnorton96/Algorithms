package Arrays_Strings;

public class OneEditAway {
    /*There are three types of edits that can be performed on strings: insert a character, remove a character, or
      replace a character. Given two strings, write a function to check if they are one edit(or zero) away.
      pale, ple -> true
      pales, pale -> true
      pale, bale -> true
      pale, bake -> false
     */

    public static boolean oneReplace(String str1, String str2){
        //Creating a boolean flag which will keep track of how many differences there are in the strings.
        boolean flag = false;
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != str2.charAt(i)){
                if(flag){
                    return false;
                }
                flag = true;
            }
        }
        return true;
    }

    public static boolean oneInsert(String str1, String str2){
        int idx1 = 0;
        int idx2 = 0;
        while(idx1 < str1.length() && idx2 < str2.length()){
            if(str1.charAt(idx1) != str2.charAt(idx2)){
                if(idx1 != idx2){
                    return false;
                }
                idx2++;
            }else{
                idx1++;
                idx2++;
            }
        }
        return false;
    }



    public static boolean oneEdit(String str1, String str2){
        if(str1.length() == str2.length()){
            return oneReplace(str1, str2);
        }else if(str1.length() + 1 == str2.length()){
            return oneInsert(str1, str2);
        }else if(str1.length() - 1 == str2.length()) {
            return oneInsert(str1, str2);
        }else{
            return false;
        }

    }

    public static void main(String[] args){
        String str1 = "Pale";
        String str2 = "Bale";
        System.out.println("Is Pale and Bale one edit away: " + oneEdit(str1,str2));
        String str3 = "Hello";
        String str4 = "Hell";
        System.out.println("Is Hello and Hell one edit away: " + oneEdit(str3, str4));
        String str5 = "What";
        String str6 = "Who";
        System.out.println("Is What and Who one edit away: " + oneEdit(str5, str6));

    }
}
